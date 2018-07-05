package ntu.cq.servlet.resident;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ntu.cq.bean.Resident;
import ntu.cq.bean.Visitor;
import ntu.cq.servive.ResidentService;
import ntu.cq.servive.impl.ResidentServiceImpl;

public class Rinfo extends HttpServlet {

	private ResidentService rs=new ResidentServiceImpl();
	/**
	 * Constructor of the object.
	 */
	public Rinfo() {
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
		int Did=Integer.parseInt(request.getParameter("id"));
		String info=request.getParameter("info");
		if(info.equals("R")){
			Resident r=new Resident();
			try {
				r=rs.getResident(Did);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			request.setAttribute("r", r);
			request.getRequestDispatcher("/rinfo.jsp").forward(request,
					response);
		}else if(info.equals("V")){
			Visitor v=new Visitor();
			try {
				v=rs.getVisitor(Did);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			request.setAttribute("v", v);
			request.getRequestDispatcher("/vinfo.jsp").forward(request,
					response);
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
