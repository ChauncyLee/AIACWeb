package ntu.cq.servlet.user;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ntu.cq.bean.Resident;
import ntu.cq.bean.Visitor;
import ntu.cq.servive.UserService;
import ntu.cq.servive.impl.UserServiceImpl;

public class AddPeople extends HttpServlet {

	
	private UserService us=new UserServiceImpl();
	/**
	 * Constructor of the object.
	 */
	public AddPeople() {
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
		String tel=request.getParameter("tel");
		String name=request.getParameter("name");
		String uname=request.getParameter("Uname");
		String gender=request.getParameter("gender");
		String dob=request.getParameter("dob");
		String role=request.getParameter("role");
		String bid=request.getParameter("Bname");
		String hid=request.getParameter("houseno");
		String password="";
		String idc="";
		String vdate="";
		String edate="";
		
		if(role.equals("V")){
			vdate=request.getParameter("vdate");
			edate=request.getParameter("edate");
		}else{
			password=request.getParameter("password");
			idc=request.getParameter("idc");
		}
		int result=0;
		String flag="";
		int id=0;
		if(role.equals("V")){
			Visitor v=new Visitor();
			v.setVtel(tel);
			v.setVname(name);
			v.setUname(uname);
			v.setVdob(dob);
			v.setVgender(gender);
			v.setBid(Integer.parseInt(bid));
			v.setHid(Integer.parseInt(hid));
			v.setVstatus("N");
			v.setVpic("N");
			v.setVdate(vdate);
			v.setEdate(edate);
			try {
				id=us.registVisitor(v);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			flag="V";
		}else{
			Resident r=new Resident();
			r.setRusername(tel);
			r.setRtel(tel);
			r.setRpassword(password);
			r.setRidc(idc);
			r.setRname(name);
			r.setUname(uname);
			r.setRgender(gender);
			r.setRdob(dob);
			r.setRRole(role);
			r.setBid(Integer.parseInt(bid));
			r.setHid(Integer.parseInt(hid));
			r.setRpic("N");
			r.setRstatus("N");
			try {
				id=us.registResident(r);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			flag="R";
		}
		if(id>0){
			request.setAttribute("flag", flag);
			request.setAttribute("id", id);
			request.setAttribute("uname", uname);
			request.getRequestDispatcher("/uploadphoto.jsp").forward(request, response);
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
