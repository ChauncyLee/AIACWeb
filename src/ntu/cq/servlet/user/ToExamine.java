package ntu.cq.servlet.user;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ntu.cq.bean.Resident;
import ntu.cq.bean.Visitor;
import ntu.cq.servive.ResidentService;
import ntu.cq.servive.VisitorService;
import ntu.cq.servive.impl.ResidentServiceImpl;
import ntu.cq.servive.impl.VisitorServiceImpl;

public class ToExamine extends HttpServlet {

	
	private ResidentService rs=new ResidentServiceImpl();
	private VisitorService vs=new VisitorServiceImpl();
	private List<Resident> residentList=new ArrayList<Resident>();
	private List<Visitor> visitorList=new ArrayList<Visitor>();
	
	/**
	 * Constructor of the object.
	 */
	public ToExamine() {
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
		HttpSession session = request.getSession();
		Integer cid=(Integer) session.getAttribute("cid");
		try {
			residentList=rs.getReUnExamine(cid);
			visitorList=vs.getViUnExamine(cid);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		request.setAttribute("residentList", residentList);
		request.setAttribute("visitorList", visitorList);
			request.getRequestDispatcher("/apply.jsp").forward(request,
					response);
	
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
