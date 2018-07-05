package ntu.cq.servlet.resident;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import ntu.cq.bean.Resident;
import ntu.cq.servive.ResidentService;
import ntu.cq.servive.impl.ResidentServiceImpl;

public class ViewResidentServlet extends HttpServlet {

	
	private ResidentService bs=new ResidentServiceImpl();
	private List<Resident> list=new ArrayList<Resident>();
	/**
	 * Constructor of the object.
	 */
	public ViewResidentServlet() {
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
		String hid=request.getParameter("hid");
		String flag=request.getParameter("flag");
		try {
			list=bs.getResidents(Integer.parseInt(hid));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(flag.equals("db")){
			request.setAttribute("hid", hid);
			request.setAttribute("list", list);
			request.getRequestDispatcher("/care.jsp").forward(request,
					response);
		}else if(flag.equals("tl")){
			// 使用第三方JAR包，将Java集合，转成JSON字符串
			Gson gson = new Gson();
			String jsonString = gson.toJson(list);
			// 将JSON字符串输出到AJAX引擎
			response.getWriter().write(jsonString);
		}
		
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
