package ntu.cq.testservlet;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.Properties;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import ntu.cq.servive.UploadService;
import ntu.cq.servive.impl.UploadServiceImpl;

import org.python.util.PythonInterpreter;

@WebServlet("/servlet/UploadServlet")
@MultipartConfig
public class UploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UploadService up=new UploadServiceImpl();
	private static int wy=0;
	
	public UploadServlet() {
		super();
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
	}

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");

		String flag = request.getParameter("flag");
		int id =Integer.parseInt(request.getParameter("id"));
		String uname = request.getParameter("uname");
		System.out.println("uname:" + uname);
		InputStream proIn = getClass().getClassLoader().getResourceAsStream(
				"uploadConfig.properties");
		Properties properties = new Properties();
		properties.load(proIn);

		String fileSystemPath = properties.getProperty("fileSystemPath");// 系统根路径

		String savePath = fileSystemPath + "/" + uname;

		// 创建文件夹
		File saveDir = new File(savePath);
		if (!saveDir.exists()) {
			saveDir.mkdirs();
		}
		Collection<Part> parts = request.getParts();
		for (Part part : parts) {
			String contentDisposition = part.getHeader("content-disposition");
			String fileName = getFileName(contentDisposition);
			if (fileName.equals("")) {
				continue;
			} else {
				String pureFileName = fileName.substring(0,
						fileName.lastIndexOf("."));
				String suffix = fileName
						.substring(fileName.lastIndexOf(".") + 1);
				SimpleDateFormat sdf1 = new SimpleDateFormat("yyyyMMddhhmmss");
				String saveFileName = pureFileName + "-"
						+ sdf1.format(new Date()) + "-"
						+ new Random().nextInt(1000) + "." + suffix;
				part.write(savePath + "/" + saveFileName);
			}
		}
		wy++;
		if(wy>=10){
			prun(uname, flag, id);
			wy=0;
		}
		
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	public String getFileName(String contentDisposition) {
		String[] strArr1 = contentDisposition.split(";");
		if (strArr1.length < 3) {
			return "";
		} else {
			String[] strArr2 = strArr1[2].split("=");
			String fileName = strArr2[1];
			fileName = fileName.replaceAll("\"", "");// 把双引号去除掉
			return fileName;
		}

	}

	public void prun(String uname, String flag, int id) {
        String[] cmdArray = new String[6];
        cmdArray[0] = "python";
        cmdArray[1] = "Extract_Feature_Server.py";
		 cmdArray[2] = "./train_dir/";
		 cmdArray[3] = uname;
		 cmdArray[4] = flag;
		 cmdArray[5] = id+"";
        File dir = new File("d:/AIAC/FeatureExtraction");

		 try{  
	         Process process = Runtime.getRuntime().exec(cmdArray, null, dir);
	        }catch(Exception ex){  
	            System.out.println(ex);  
	            System.out.println("执行命令：" + cmdArray + "错误");  
	        }  
	}

}
