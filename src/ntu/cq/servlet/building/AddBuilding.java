package ntu.cq.servlet.building;

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
import ntu.cq.bean.House;
import ntu.cq.servive.BuildingService;
import ntu.cq.servive.impl.BuildingServiceImpl;

public class AddBuilding extends HttpServlet {

	private BuildingService bs = new BuildingServiceImpl();

	/**
	 * Constructor of the object.
	 */
	public AddBuilding() {
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
		String Bname = request.getParameter("Bname");
		String Bfloor = request.getParameter("Bfloor");
		String Fnum = request.getParameter("fnum");
		HttpSession session = request.getSession();
		int cid = (Integer) session.getAttribute("cid");
		Building building = new Building();
		Building addBuilding = new Building();
		try {
			building = bs.getBuilding(Bname);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String msg = new String();

		if (building.getBid() > 0) {
			msg = "该楼栋已存在";
			request.setAttribute("msg", msg);
			request.getRequestDispatcher("/addbuild.jsp").forward(request,
					response);
		} else {
			List<House> list = new ArrayList<House>();
			int bfloor = Integer.parseInt(Bfloor);
			int fnum = Integer.parseInt(Fnum);
			int count = bfloor * fnum;
			addBuilding.setBfloor(bfloor);
			addBuilding.setBname(Bname);
			addBuilding.setCount(count);
			addBuilding.setCid(cid);
			int bflag = bs.addBuilding(addBuilding);
			if (bflag > 0) {
				Building b;
				try {
					b = bs.getBuilding(Bname);
					for (int i = 1; i <= bfloor; i++) {
						for (int j = 1; j <= fnum; j++) {
							House h = new House();
							h.setHaddr(i + "0" + j + "室");
							h.setHstatus("U");
							h.setBid(b.getBid());
							list.add(h);
						}
					}
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
				int hflag = bs.addHouse(list);
				
				if(hflag==count){
					msg = "添加成功！";
					request.setAttribute("result", msg);
				}else {
					msg = "添加失败！";
					request.setAttribute("result", msg);
				}
				
			}else {
				msg = "添加失败！";
				request.setAttribute("result", msg);
			}
		
			request.getRequestDispatcher("/addbuild.jsp").forward(request,
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
