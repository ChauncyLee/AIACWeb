package ntu.cq.servlet.user;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ntu.cq.bean.Record;
import ntu.cq.bean.Resident;
import ntu.cq.bean.Visitor;
import ntu.cq.servive.DoorService;
import ntu.cq.servive.HouseService;
import ntu.cq.servive.ResidentService;
import ntu.cq.servive.StrangerService;
import ntu.cq.servive.VisitorService;
import ntu.cq.servive.impl.DoorServiceImpl;
import ntu.cq.servive.impl.HouseServiceImpl;
import ntu.cq.servive.impl.ResidentServiceImpl;
import ntu.cq.servive.impl.StrangerServiceImpl;
import ntu.cq.servive.impl.VisitorServiceImpl;

public class ToIndex extends HttpServlet {
	
	private ResidentService rs=new ResidentServiceImpl();
	private VisitorService vs=new VisitorServiceImpl();
	private StrangerService ss=new StrangerServiceImpl();
	private HouseService hs=new HouseServiceImpl();
	private List<Record> rlist=new ArrayList<Record>();
	private List<Record> vlist=new ArrayList<Record>();
	private DoorService ds=new DoorServiceImpl();
	/**
	 * Constructor of the object.
	 */
	public ToIndex() {
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
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		Date date=new Date();
		String startTime=df.format(getStartTime());
		String endTime=df.format(getEndTime());
		
//		 * ResidentDoor 住户出入记录数
//		 * select count(*) from dbo.ResidentDoor where Did in(select Did from Door where Cid=1)
		int reRecords=rs.getRecords(startTime,endTime,cid);
//		 * VisitDoor 访客出入记录数
//		 * select count(*) from dbo.VisitDoor where Did in(select Did from Door where Cid=1)
		int viRecords=vs.getRecords(startTime,endTime,cid);
//		 * Visitor 访客人数
//		 * select count(*) from dbo.Visitor where Vstatus='Y'
		int viCount=vs.getCount();
//		 * Resident Visitor Rstatus 和Vstatus为N的总数 待审核
//		 *  select count(*) from dbo.Resident where Rstatus = 'N'
//		 *   select count(*) from dbo.Visitor where Vstatus = 'N'
		int rApplyCount=rs.getApplyCount();
		int vApplyCount=vs.getApplyCount();
		int applyCount=rApplyCount+vApplyCount;
//		 * House 中住户数 租户数select count(*) from dbo.House where Hstatus='L'/R
		int liveResident=rs.getCount("L");
		int rentResident=rs.getCount("R");
		int houseCount=hs.getCount(cid);
		float live=((float)liveResident)/((float)houseCount);
		Integer l=Math.round(live*100);
		float rent=((float)rentResident)/((float)houseCount);
		Integer r=Math.round(rent*100);
//		 * UnpermittedPerson 中的记录数 select count(*) from dbo.UnpermittedPerson where UPPicLocation IS NOT NULL
		int unpermit=ss.getCount();
//		 * 访客进出
//		 * select * from dbo.VisitDoor;只显示4条
//		 * 住户进出
//		 * select * from dbo.VisitDoor;
//		 * 陌生人进出
//		 * 
//		rlist=ds.getResidentRecord(Did);
		request.setAttribute("r", r);
		request.setAttribute("l", l);
		request.setAttribute("reRecords", reRecords);
		request.setAttribute("viRecords", viRecords);
		request.setAttribute("viCount", viCount);
		request.setAttribute("applyCount", applyCount);
		request.setAttribute("liveResident", liveResident);
		request.setAttribute("rentResident", rentResident);
		request.setAttribute("unpermit", unpermit);
		request.getRequestDispatcher("/index_v3.jsp").forward(request,
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
	
	 private static Date getStartTime() {  
	        Calendar todayStart = Calendar.getInstance();  
	        todayStart.set(Calendar.HOUR, 0);  
	        todayStart.set(Calendar.MINUTE, 0);  
	        todayStart.set(Calendar.SECOND, 0);  
	        todayStart.set(Calendar.MILLISECOND, 0);  
	        return todayStart.getTime();  
	    }  
	  
	    private static Date getEndTime() {  
	        Calendar todayEnd = Calendar.getInstance();  
	        todayEnd.set(Calendar.HOUR, 23);  
	        todayEnd.set(Calendar.MINUTE, 59);  
	        todayEnd.set(Calendar.SECOND, 59);  
	        todayEnd.set(Calendar.MILLISECOND, 999);  
	        return todayEnd.getTime();  
	    }  

}
