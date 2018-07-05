package ntu.cq.servlet.door;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ntu.cq.bean.Door;
import ntu.cq.bean.Mess;
import ntu.cq.servive.DoorService;
import ntu.cq.servive.impl.DoorServiceImpl;

import com.google.gson.Gson;

public class ChangeDoorStatus extends HttpServlet {

	List<Mess> list=new ArrayList<Mess>();
	private DoorService ds = new DoorServiceImpl();
	/**
	 * Constructor of the object.
	 */
	public ChangeDoorStatus() {
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
		String id = request.getParameter("Did");
		String Dstatus = request.getParameter("Dstatus");
		String sta = null;
		Mess open=new Mess();
		open.setMessage("label label-primary pull-right");
		Mess close=new Mess();
		close.setMessage("label label-danger pull-right");
		Mess result=new Mess();
		String te=new String();
		if(Dstatus.equals("offline")){
			sta="online";
			result.setMessage("label label-primary pull-right");
			te="OPEN";
		}else if(Dstatus.equals("online")){
			sta="offline";
			result.setMessage("label label-danger pull-right");
			te="CLOSE";
		}
		int Did = Integer.parseInt(id);
		Door door=new Door();
		door.setDid(Did);
		door.setDstatus(sta);
		int flag=ds.changeDoorStatus(door);
		if(flag>0){
			list.clear();
			Mess mess=new Mess();
			mess.setMessage("门禁状态切换成功");
			list.add(mess);
			Mess tet=new Mess();
			tet.setMessage(te);
			list.add(tet);
			Mess stat=new Mess();
			stat.setMessage(sta);
			list.add(stat);
			list.add(result);
			// 使用第三方JAR包，将Java集合，转成JSON字符串
			Gson gson = new Gson();
			String jsonString = gson.toJson(list);
			// 将JSON字符串输出到AJAX引擎
			response.getWriter().write(jsonString);
		}else{
			Mess mess=new Mess();
			mess.setMessage("门禁状态切换失败");
			list.add(mess);
			mess.setMessage(te);
			list.add(mess);
			if(Dstatus.equals("offline   ")){
				list.add(close);
			}else{
				list.add(open);
			}
			// 使用第三方JAR包，将Java集合，转成JSON字符串
			Gson gson = new Gson();
			String jsonString = gson.toJson(list);
			// 将JSON字符串输出到AJAX引擎
			response.getWriter().write(jsonString);
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
