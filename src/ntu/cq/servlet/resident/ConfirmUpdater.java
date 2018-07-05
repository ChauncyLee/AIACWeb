package ntu.cq.servlet.resident;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ntu.cq.bean.Resident;
import ntu.cq.servive.ResidentService;
import ntu.cq.servive.impl.ResidentServiceImpl;

public class ConfirmUpdater extends HttpServlet {

	private ResidentService rs = new ResidentServiceImpl();
	/**
	 * Constructor of the object.
	 */
	public ConfirmUpdater() {
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
		int Rid = Integer.parseInt(request.getParameter("Rid"));
		String role=request.getParameter("role");
		String tel=request.getParameter("tel");
		String password=request.getParameter("password");
		String bname=request.getParameter("bname");
		String haddr=request.getParameter("haddr");
		Resident resident = new Resident();
		Resident r = new Resident();
		resident.setRid(Rid);
		if(role.trim().equals("户主")){
			resident.setRRole("H");
		}else if(role.trim().equals("家人")){
			resident.setRRole("F");
		}else if(role.trim().equals("租户")){
			resident.setRRole("R");
		}
		resident.setRtel(tel);
		resident.setRusername(tel);
		resident.setRpassword(password);
		resident.setBname(bname);
		resident.setHaddr(haddr);
		int flag=0;
		try {
			flag = rs.updateResident(resident);
			r=rs.getResident(Rid);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(flag>=2){
			request.setAttribute("resident", r);
			request.setAttribute("msg", "修改成功");
			request.getRequestDispatcher("/rupdate.jsp").forward(request, response);
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
		doGet(request, response);
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
