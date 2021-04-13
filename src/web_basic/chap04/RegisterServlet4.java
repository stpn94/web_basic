package web_basic.chap04;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/chap04/RegisterServlet4")
public class RegisterServlet4 extends HttpServlet {
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
		
//		class=archi  &grade=mid  &subjcet=grammar  &intro=안녕
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		
		String classes =request.getParameter("classes");
		String grade =request.getParameter("grade");
		String subjcet =request.getParameter("subjcet");
		String intro =request.getParameter("intro");
		String subs = intro.replace("\r\n","<br>");
		
		PrintWriter out = response.getWriter();
		
		out.println("<html><br>");
		out.println("<h4>수강신청인</h4>"+classes);
		out.println("<h4>등급</h4>"+grade);
		out.println("<h4>과목</h4>"+subjcet);
		out.println("<h4>intro</h4>"+subs);
		
//		out.println("<br>");
//		out.println(week);
//		out.println("<br>");
//		out.println(time);
//		
//		out.println("<br>");
//		out.println("<br>");
//		out.println(id);
//		out.println(pw);
//		out.println(hidden);
//		out.println(text);
//		out.println(search);

//		out.println("<h2>수강분야</h2>");
//		String t = null;
//		if (subject.equals("eng")) {
//			t = "영어";
//		} else if (subject.equals("ch")) {
//			t = "중국어";
//		} else {
//			t = "일본어";
//		}
//		out.println("subject = " + t + "<br>");
//
//		out.println("<h1>수강분야</h1>  <br>");
//		for (String gubun : gubuns) {
//			if (gubun.equals("grm")) {
//				out.printf("분야 = 문법");
//			}
//			if (gubun.equals("wr")) {
//				out.printf("분야 = 작문");
//			}
//			if (gubun.equals("rd")) {
//				out.printf("분야 = 독해");
//			}
//		}
//		out.println("</html>");

	}
}
