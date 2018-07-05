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
		
		int width = 60;						//ָ��������֤��Ŀ�� 		
		int height = 20;					//ָ��������֤��ĸ߶�
		int fontHeight = height - 2;		//�����и�
		int red = 0, green = 0, blue = 0;
		int codeCount = 4;					//��֤���ַ�����
		int codeX = width / (codeCount + 1);
		int codeY = height - 4;
		char[] codeSequence = 
			{ 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J','K', 'L', 'M', 'N', 
			  'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W','X', 'Y', 'Z', '0', '1',
			  '2', '3', '4', '5', '6', '7', '8', '9' };	
		
		Random random = new Random();			//����һ���������������
		Font font = new Font("Fixedsys", Font.PLAIN, fontHeight); //����������ʽ
		
		//����BufferedImage����,����Graphics2D����,�������൱�ڻ���
		BufferedImage buffImg = new BufferedImage(width, height,BufferedImage.TYPE_INT_RGB);		
		Graphics2D g = buffImg.createGraphics();
		
		g.setFont(font);						//��������
		
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, width, height);		//���Ʊ���
		
		g.setColor(Color.BLACK); 		
		g.drawRect(0, 0, width - 1, height - 1);//���ƾ��α߿�
		
		g.setColor(getRandColor(160, 200)); 	//�������������ɫ
		for (int i = 0; i < 10; i++) {			// �������10�������ߡ�        
            int x = random.nextInt(width);        
            int y = random.nextInt(height);        
            int xl = random.nextInt(12);        
            int yl = random.nextInt(12);        
            g.drawLine(x, y, x + xl, y + yl);    //��������    
        }
		
		StringBuffer randomCode = new StringBuffer();	//����4λ������ַ���
		for (int i = 0; i < codeCount; i++) { 
			String strRand = String.valueOf(codeSequence[random.nextInt(36)]);        
            red = random.nextInt(255);        
            green = random.nextInt(255);        
            blue = random.nextInt(255);        
            g.setColor(new Color(red, green, blue));	//�������������ɫ        
            g.drawString(strRand, (i)*codeX, codeY);	//ʹ�õ�ǰ�������ɫ����ָ���ı�        
            randomCode.append(strRand); 
		}
		
		HttpSession session = request.getSession();        
        session.setAttribute("validateCode", randomCode.toString());//����֤�����session
        
        //���ò�����ͼƬ
        response.setHeader("Pragma", "no-cache");        
        response.setHeader("Cache-Control", "no-cache");        
        response.setDateHeader("Expires", 0); 
        
        //ָ�����ɵ���ӦͼƬ��
        response.setContentType("image/jpeg");
        
        //���ͼ��ҳ��
        ServletOutputStream sos = response.getOutputStream();        
        ImageIO.write(buffImg, "jpeg", sos);        
        sos.close(); 
	}

	Color getRandColor(int fc, int bc) {// ������Χ��������ɫ
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
