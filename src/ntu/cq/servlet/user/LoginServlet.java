package ntu.cq.servlet.user;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ntu.cq.bean.PropertyStaff;
import ntu.cq.bean.User;
import ntu.cq.servive.UserService;
import ntu.cq.servive.impl.UserServiceImpl;
import ntu.cq.utils.MD5Tools;

public class LoginServlet extends HttpServlet {

	// 创建一个UserService
	private UserService userService = new UserServiceImpl();

	/**
	 * Constructor of the object.
	 */
	public LoginServlet() {
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
	 * @param request
	 *            the request send by the client to the server
	 * @param response
	 *            the response send by the server to the client
	 * @throws ServletException
	 *             if an error occurred
	 * @throws IOException
	 *             if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to
	 * post.
	 * 
	 * @param request
	 *            the request send by the client to the server
	 * @param response
	 *            the response send by the server to the client
	 * @throws ServletException
	 *             if an error occurred
	 * @throws IOException
	 *             if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		User user = new User(username, password);
		boolean loginUser = userService.login(username,
				MD5Tools.getPwd(password));

		if (loginUser) {
			PropertyStaff p = null;
			try {
				p = userService.getCid(username);
				if (!p.equals(null)) {
					session.setAttribute("username", username);
					session.setAttribute("cid", p.getCid());
					session.setAttribute("Pname", p.getPname());
					session.setAttribute("RRid", p.getRRid());
					response.sendRedirect(request.getContextPath() + "/index.jsp");
				}else{
					// 登录失败，设置一个错误消息，用户名和密码错误
					request.setAttribute("msg", "您的账号出现异常，请联系管理员进行处理");
					request.getRequestDispatcher("/login.jsp").forward(request,
							response);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			

		} else {
			// 登录失败，设置一个错误消息，用户名和密码错误
			request.setAttribute("msg", "用户名或密码错误");
			request.getRequestDispatcher("/login.jsp").forward(request,
					response);
		}

	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException
	 *             if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
