package web_basic.chap04;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/chap04/RegisterServlet3")
public class RegisterServlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		process(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		process(request, response);
	}

	private void process(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		
		String uname =request.getParameter("uname");
		String tel1 =request.getParameter("tel1");
		String addr =request.getParameter("addr");
		String tel2 =request.getParameter("tel2");
		String memo = request.getParameter("comment");
		
		System.out.println(tel1);
		PrintWriter out = response.getWriter();
		
		out.printf("<html>상품주문정보<br>");
		out.printf("이름 %s<br>", uname);
		out.printf("전화번호 %s<br>", tel1);
		out.printf("주소 %s<br>", addr);
	}
}
