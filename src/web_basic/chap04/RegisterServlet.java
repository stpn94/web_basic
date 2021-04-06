package web_basic.chap04;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/chap04/Register")
public class RegisterServlet extends HttpServlet {
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
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
//		hidden=Y&text=텍스트&search=검색aa&tel=전화번호&url=https%3A%2F%2Fwww.naver.com%2F&email=stpn94%40gmail.com&
//		password=&month=2021-11&week=2021-W09&time=15%3A37&member=5&stuffs=4&satis=3&subject=grammer&mailing2=dialog&id=&passwd=
		String hidden = request.getParameter("hidden");
		String text = request.getParameter("text");
		String search = request.getParameter("search");

		String id = request.getParameter("id");
		String pw = request.getParameter("passwd");
		String tel = request.getParameter("tel");
		String email = request.getParameter("email");
		String month = request.getParameter("month");
		String week = request.getParameter("week");
		String time = request.getParameter("time");
		
		SimpleDateFormat newdate= new SimpleDateFormat("yyyy-M-D(E)");
		SimpleDateFormat time3= new SimpleDateFormat("hh:mm");
		
		try {
			Date date=newdate.parse(month);
			Date week1=newdate.parse(week);
			Date time2=time3.parse(time);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		String subject = request.getParameter("subject");
		String[] gubuns = request.getParameterValues("gubun");
		
		
		PrintWriter out = response.getWriter();

		
		out.println("<html>");
	
		out.println("<h2>Date</h2>");
		out.println("<br>");
		out.println(month);
		out.println("<br>");
		out.println(week);
		out.println("<br>");
		out.println(time);
		
		out.println("<br>");
		out.println("<br>");
		out.println(id);
		out.println(pw);
		out.println(hidden);
		out.println(text);
		out.println(search);

		out.println("<h2>수강분야</h2>");
		String t = null;
		if (subject.equals("eng")) {
			t = "영어";
		} else if (subject.equals("ch")) {
			t = "중국어";
		} else {
			t = "일본어";
		}
		out.println("subject = " + t + "<br>");

		out.println("<h1>수강분야</h1>  <br>");
		for (String gubun : gubuns) {
			if (gubun.equals("grm")) {
				out.printf("분야 = 문법");
			}
			if (gubun.equals("wr")) {
				out.printf("분야 = 작문");
			}
			if (gubun.equals("rd")) {
				out.printf("분야 = 독해");
			}
		}
		out.println("</html>");

//		      RequestDispatcher dispatcher = request.getRequestDispatcher("withlabel_result.jsp");
//		      dispatcher.forward(request, response);

	}

}
