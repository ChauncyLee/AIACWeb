package ntu.cq.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class CheckUserFilter implements Filter {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		HttpSession session = ((HttpServletRequest) request).getSession(); 
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		
		
		String basePath = req.getScheme()+"://"+req.getServerName()+":"+req.getServerPort()+req.getContextPath()+"/";
		String url = req.getRequestURL().toString();
		String str = (String) req.getSession().getAttribute("userName");

		String username=(String)session.getAttribute("username");
		
		if (username != null  //����ѵ�¼��������ǵ�¼�����Դ������У�����ת��¼ҳ��
				|| url.equals(basePath+"login.jsp")
				|| url.equals(basePath+"servlet/LoginServlet")
				|| url.equals(basePath+"register.jsp")
				) { 
			chain.doFilter(request, response);

		} else {
			//����������Ի�׼��ַ��URLһ�£�ע�⣬�����õ�����Ŀ��·����/��;
			//���������������·�������󣬷�����Щ������ת����¼ҳ�档
			res.sendRedirect("/AIAC/login.jsp");
		}			
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
