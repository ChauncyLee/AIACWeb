package ntu.cq.servlet.user;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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


@MultipartConfig
public class FileUpload  extends HttpServlet {
    private static final long serialVersionUID = 1L;
       
    public FileUpload() {
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



    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        request.setCharacterEncoding("UTF-8");
        
        InputStream proIn = getClass().getClassLoader().getResourceAsStream("uploadConfig.properties");
        Properties properties = new Properties();
        properties.load(proIn);
        
        String fileSystemPath = properties.getProperty("fileSystemPath");//ϵͳ��·��
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        String ymd = sdf.format(new Date());
        
        String filePath = "upload" + "/" + ymd;
        String savePath = fileSystemPath + "/" + filePath;
        
        //�����ļ���
        File saveDir = new File(savePath);
        if(!saveDir.exists()){
            saveDir.mkdirs();
        }
        Collection<Part> parts = request.getParts();
        for(Part part : parts){
            String contentDisposition = part.getHeader("content-disposition");
            String fileName = getFileName(contentDisposition);
            if(fileName.equals("")){
                continue;
            }else{
                String pureFileName = fileName.substring(0, fileName.lastIndexOf("."));
                String suffix = fileName.substring(fileName.lastIndexOf(".")+1);
                SimpleDateFormat sdf1 = new SimpleDateFormat("yyyyMMddhhmmss");
                String saveFileName = pureFileName + "-" + sdf1.format(new Date()) + "-" + new Random().nextInt(1000) + "." + suffix;
                part.write(savePath + "/" + saveFileName);
            }
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    public String getFileName(String contentDisposition){
        String[] strArr1 = contentDisposition.split(";");
        if(strArr1.length < 3){
            return "";
        }else{
            String[] strArr2 = strArr1[2].split("=");
            String fileName = strArr2[1];
            fileName = fileName.replaceAll("\"", "");//��˫����ȥ����
            return fileName;
         }
        
    } 
}