package ntu.cq.servlet.arcfeature;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import ntu.cq.bean.Mess;
import ntu.cq.servive.UserService;
import ntu.cq.servive.impl.UserServiceImpl;

public class GetUnameRe extends HttpServlet {

	
	private UserService us=new UserServiceImpl();
	
	/**
	 * Constructor of the object.
	 */
	public GetUnameRe() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String uname=request.getParameter("uname");
		int uid=0;
		String m="";
		try {
			uid=us.getUid(uname);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (uid>0) {
			m="该昵称已存在";
		} else {
			m="";
		}
		Mess mess=new Mess();
		mess.setMessage(m);
		// 使用第三方JAR包，将Java集合，转成JSON字符串
		Gson gson = new Gson();
		String jsonString = gson.toJson(mess);
		// 将JSON字符串输出到AJAX引擎
		response.getWriter().write(jsonString);
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request,response);
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
