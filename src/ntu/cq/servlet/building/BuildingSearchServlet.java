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
import ntu.cq.servive.BuildingService;
import ntu.cq.servive.impl.BuildingServiceImpl;

public class BuildingSearchServlet extends HttpServlet {

	
	private BuildingService bs=new BuildingServiceImpl();
	private List<Building> list=new ArrayList<Building>();
	/**
	 * Constructor of the object.
	 */
	public BuildingSearchServlet() {
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
		int cid=(Integer) session.getAttribute("cid");
		int bCount=bs.getBuildingCount(cid);
		for(int i=0;i<bCount;i++){
			String str=(i+1)+"��¥";
			Building building = new Building();
			try {
				building = bs.getBuilding(str);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			list.add(building);
		}
		request.setAttribute("list", list);
		request.setAttribute("bCount", bCount);
		request.getRequestDispatcher("/builds.jsp").forward(request,
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
