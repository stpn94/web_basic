package web_basic.jsp_10;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 * Servlet implementation class PartUploadPro1Servlet
 */
@WebServlet("/jsp_10/partUploadPro1")
@MultipartConfig(fileSizeThreshold = 0, location = "D:/upload")

public class PartUploadPro1Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public PartUploadPro1Servlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");// 인코딩
		String writer = request.getParameter("writer");// 파라미터에서 name이 writer인 것 String형식으로 선언
		Part part = request.getPart("partFile1");// 파일 첨부가져오기

		response.setContentType("text/html;charset=UTF-8");// 응답해 줄 때 인코딩
		PrintWriter out = response.getWriter();// 클라이언트에 문자 데이터를 반환할 수 있는 PrintWriter 개체
		System.out.println("out" + out);
		String contentDisposition = part.getHeader("content-disposition");// 요청한 헤더의 값을 포함하는 문자열 또는 부품에 해당 이름의 헤더가 없는 경우
																			// null입니다.
		System.out.println("contentDisposition" + contentDisposition);
		// #Disposition=처분
		String uploadFileName = getUploadFileName(contentDisposition);// 파일 이름 가져오기
		part.write(uploadFileName);
		out.println("작성자 " + writer + "님이" + uploadFileName + "파일을 업로드 하였습니다");

	}
// IE
//	private String getUploadFileName(String contentDisposition) {
//		// TODO Auto-generated method stub
//		String uploadFileName =null; //파일이름 null
//		String[] contentSplitStr = contentDisposition.split(";"); //주소를 ";"로 나눈걸 String 배열에 넣는다
//		int lastPathSeparatorIndex = contentSplitStr[2].lastIndexOf("\\");
//		int lastQutosIndex = contentSplitStr[2].lastIndexOf("\"");
//		uploadFileName =contentSplitStr[2].substring(lastPathSeparatorIndex +1,lastQutosIndex);
//		return uploadFileName;
//		
//	}
//chrome
	private String getUploadFileName(String contentDisposition) {
		// TODO Auto-generated method stub
		String uploadFileName =null; //파일이름 null
		String[] contentSplitStr = contentDisposition.split(";"); //주소를 ";"로 나눈걸 String 배열에 넣는다
		int firstQutosIndex = contentSplitStr[2].indexOf("\"");
		int lastQutosIndex = contentSplitStr[2].lastIndexOf("\"");
		uploadFileName =contentSplitStr[2].substring(firstQutosIndex +1,lastQutosIndex);
		return uploadFileName;
		
	}

}
