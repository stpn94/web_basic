package web_basic.jsp_13.erp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/titleServlet")
public class TitleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private TitleService service;

	public TitleServlet() {
		service = new TitleService();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		List<Title> list = service.showTitles();
		System.out.println(list);
//		PrintWriter out = response.getWriter();
//
//		for (Title t : list) {
//			out.printf("%s - %s<br>", t.gettNo(), t.gettName());
//		}
		request.setAttribute("list", list); // 리퀘스트에 담았다.
		request.getRequestDispatcher("jsp_13/titleList.jsp").forward(request,response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
