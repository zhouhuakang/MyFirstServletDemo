package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("处理Get()请求....");// 给后台输出内容
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html;charset=utf-8"); // 设置输出格式
		out.println("<strong>Hello Servlet</strong><br>"); // 给浏览器输出
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("处理Post()请求....");// 给后台输出内容
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html;charset=utf-8"); // 设置输出格式
		out.println("<strong>Hello Servlet</strong><br>"); // 给浏览器输出
	}

}
