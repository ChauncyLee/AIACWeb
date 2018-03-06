package ntu.cq.testservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ntu.cq.bean.Mess;
import ntu.cq.bean.PropertyStaff;

import com.google.gson.Gson;

public class LoginTest extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public LoginTest() {
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
		doPost(request,response);
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
		  	response.setContentType("text/html");  
	        PrintWriter out = response.getWriter();  
	        String username=request.getParameter("username");  
	        String password=request.getParameter("password");  
	  
	        System.out.println("UserName:"+username+";"+"PassWord:"+password);  
	  
	        Mess mess=new Mess();
	        Gson gson=new Gson();  
//	        ArrayList<User> arraylistUsers = new ArrayList<User>();  
	        PropertyStaff user1=new PropertyStaff();  
	        user1.setUsername(username);  
	        user1.setPassword(password);  
	        if(user1.getUsername().equals("admin")&&user1.getPassword().equals("123")){
	        	mess.setMessage("ok");
	        }else{
	        	mess.setMessage("error");
	        }
	          
	       /* User user2=new User();  
	        user2.setUsername(username);  
	        user2.setPassword(password);  */
	          
	        //arraylistUsers.add(user1);  
	        
	  
	  
	          
	        String info=gson.toJson(mess);  
	        System.out.println(info);  
	          
	        out.write(info);  
	
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
