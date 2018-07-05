package ntu.cq.testservlet;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class VerifyCodeServlet extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int width = 60;						//指定生成验证码的宽度 		
		int height = 20;					//指定生成验证码的高度
		int fontHeight = height - 2;		//字体行高
		int red = 0, green = 0, blue = 0;
		int codeCount = 4;					//验证码字符个数
		int codeX = width / (codeCount + 1);
		int codeY = height - 4;
		char[] codeSequence = 
			{ 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J','K', 'L', 'M', 'N', 
			  'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W','X', 'Y', 'Z', '0', '1',
			  '2', '3', '4', '5', '6', '7', '8', '9' };	
		
		Random random = new Random();			//创建一个随机数生成器类
		Font font = new Font("Fixedsys", Font.PLAIN, fontHeight); //定义字体样式
		
		//创建BufferedImage对象,创建Graphics2D对象,其作用相当于画笔
		BufferedImage buffImg = new BufferedImage(width, height,BufferedImage.TYPE_INT_RGB);		
		Graphics2D g = buffImg.createGraphics();
		
		g.setFont(font);						//设置字体
		
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, width, height);		//绘制背景
		
		g.setColor(Color.BLACK); 		
		g.drawRect(0, 0, width - 1, height - 1);//绘制矩形边框
		
		g.setColor(getRandColor(160, 200)); 	//给画笔设置随机色
		for (int i = 0; i < 10; i++) {			// 随机产生10条干扰线。        
            int x = random.nextInt(width);        
            int y = random.nextInt(height);        
            int xl = random.nextInt(12);        
            int yl = random.nextInt(12);        
            g.drawLine(x, y, x + xl, y + yl);    //绘制线条    
        }
		
		StringBuffer randomCode = new StringBuffer();	//生成4位随机码字符串
		for (int i = 0; i < codeCount; i++) { 
			String strRand = String.valueOf(codeSequence[random.nextInt(36)]);        
            red = random.nextInt(255);        
            green = random.nextInt(255);        
            blue = random.nextInt(255);        
            g.setColor(new Color(red, green, blue));	//给画笔设置随机色        
            g.drawString(strRand, (i)*codeX, codeY);	//使用当前字体和颜色绘制指定文本        
            randomCode.append(strRand); 
		}
		
		HttpSession session = request.getSession();        
        session.setAttribute("validateCode", randomCode.toString());//将验证码存入session
        
        //设置不缓存图片
        response.setHeader("Pragma", "no-cache");        
        response.setHeader("Cache-Control", "no-cache");        
        response.setDateHeader("Expires", 0); 
        
        //指定生成的响应图片。
        response.setContentType("image/jpeg");
        
        //输出图象到页面
        ServletOutputStream sos = response.getOutputStream();        
        ImageIO.write(buffImg, "jpeg", sos);        
        sos.close(); 
	}

	Color getRandColor(int fc, int bc) {// 给定范围获得随机颜色
		Random random = new Random();
		if (fc > 255)
			fc = 255;
		if (bc > 255)
			bc = 255;
		int r = fc + random.nextInt(bc - fc);
		int g = fc + random.nextInt(bc - fc);
		int b = fc + random.nextInt(bc - fc);
		return new Color(r, g, b);
	}
	
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.service(arg0, arg1);
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

	public VerifyCodeServlet() {
		super();
	}
	
}
