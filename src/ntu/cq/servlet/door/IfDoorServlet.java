package ntu.cq.servlet.door;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ntu.cq.bean.Door;
import ntu.cq.bean.Mess;
import ntu.cq.servive.DoorService;
import ntu.cq.servive.impl.DoorServiceImpl;

import com.google.gson.Gson;

public class IfDoorServlet extends HttpServlet {


	private DoorService ds = new DoorServiceImpl();
	/**
	 * Constructor of the object.
	 */
	public IfDoorServlet() {
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
		String str = request.getParameter("Dno");
		Door door = new Door();
		try {
			door = ds.getDoor(str);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String m=new String();
		
		if (door.getDid() >0) {
			m="该门禁已存在";
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
