package ntu.cq.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ntu.cq.bean.PropertyStaff;
import ntu.cq.bean.User;
import ntu.cq.servive.UserService;
import ntu.cq.servive.impl.UserServiceImpl;
import ntu.cq.utils.MD5Tools;

public class RegisterServlet extends HttpServlet {


	// 创建一个UserService
	private UserService userService = new UserServiceImpl();
	/**
	 * Constructor of the object.
	 */
	public RegisterServlet() {
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

		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println("UserName:" + username + ";" + "PassWord:"
				+ password);
		User user = new User(username, password);
		PropertyStaff propertyStaff=new PropertyStaff();
		propertyStaff.setUsername(username);
		propertyStaff.setPassword(MD5Tools.getPwd(password));
		 boolean RegisterUser = userService.regist(propertyStaff);
		 System.out.println("RegisterUser:"+RegisterUser);
		if (RegisterUser) {
			response.sendRedirect(request.getContextPath() + "/login.jsp");
		} else {
			// 登录失败，设置一个错误消息，用户名和密码错误
			request.setAttribute("msg", "注册失败，重新注册");
			request.getRequestDispatcher("/register.jsp").forward(request,
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
