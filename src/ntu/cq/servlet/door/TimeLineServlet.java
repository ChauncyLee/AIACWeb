package ntu.cq.servlet.door;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ntu.cq.bean.Record;
import ntu.cq.servive.DoorService;
import ntu.cq.servive.impl.DoorServiceImpl;

import com.google.gson.Gson;

public class TimeLineServlet extends HttpServlet {
	
	private DoorService ds=new DoorServiceImpl();
	private List<Record> list=new ArrayList<Record>();

	/**
	 * Constructor of the object.
	 */
	public TimeLineServlet() {
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
		int Rid=Integer.parseInt(request.getParameter("Rid"));
		String start=request.getParameter("start");
		String end=request.getParameter("end");
		try {
			list=ds.getRecords(Rid,start,end);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			// 使用第三方JAR包，将Java集合，转成JSON字符串
			Gson gson = new Gson();
			String jsonString = gson.toJson(list);
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
