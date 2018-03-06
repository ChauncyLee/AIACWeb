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

		String basePath = req.getScheme() + "://" + req.getServerName() + ":"
				+ req.getServerPort() + req.getContextPath() + "/";
		String url = req.getRequestURL().toString();

		String username = (String) session.getAttribute("username");

		if (username != null // 如果已登录或请求的是登录相关资源，则放行，否则，转登录页面
				|| url.equals(basePath + "login.jsp")
				|| url.equals(basePath + "register.jsp")
				|| url.equals(basePath + "servlet/LoginServlet")
				|| url.equals(basePath + "servlet/RegisterServlet")
				) {
			chain.doFilter(request, response);

		} else if (url.contains(".css") || url.contains(".js")//如果是相关资源文件则放行，否则转登陆页面
				|| url.contains(".jpg") || url.contains(".png")
				|| url.contains(".gif") || url.contains("docs/")
				|| url.contains("fonts/") || url.contains("fonts/")
				|| url.contains("wait/")) {
			chain.doFilter(request, response);
		} else {
			// 过滤器的相对基准地址与URL一致，注意，这里用的是项目根路径“/”;
			// 这样适用来自如何路径的请求，否则，有些请求不能转到登录页面。
			res.sendRedirect("/AIAC/login.jsp");
		}
	}
	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

}
