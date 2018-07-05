package ntu.cq.servlet.door;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ntu.cq.bean.Building;
import ntu.cq.bean.Door;
import ntu.cq.bean.House;
import ntu.cq.servive.DoorService;
import ntu.cq.servive.impl.DoorServiceImpl;

public class AddDoor extends HttpServlet {

	
	private DoorService ds=new DoorServiceImpl();
	/**
	 * Constructor of the object.
	 */
	public AddDoor() {
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

		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String Dno = request.getParameter("Dno");
		String Ddir = request.getParameter("Ddir");
		String Dstatus ="offline";
		HttpSession session = request.getSession();
		int cid = (Integer) session.getAttribute("cid");
		Door door = new Door();
		Door addDoor = new Door();
		try {
			door = ds.getDoor(Dno);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String msg = new String();

		if (door.getDid() > 0) {
			msg = "该门禁已存在";
			request.setAttribute("msg", msg);
			request.getRequestDispatcher("/adddoor.jsp").forward(request,
					response);
		} else {
			List<Door> list = new ArrayList<Door>();
			addDoor.setDno(Dno);
			addDoor.setDir(Ddir);
			addDoor.setDstatus(Dstatus);
			addDoor.setCid(cid);
			int dflag = ds.addDoor(addDoor);
			if (dflag > 0) {
					msg = "添加成功！";
					request.setAttribute("result", msg);
			}else {
				msg = "添加失败！";
				request.setAttribute("result", msg);
			}
		
			request.getRequestDispatcher("/adddoor.jsp").forward(request,
					response);
		}
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

		doGet(request, response);
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
