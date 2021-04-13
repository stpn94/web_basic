package web_basic.jsp_10;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

@WebServlet("/jsp_10/fileUploadServlet")
public class FileUploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	} 

	@SuppressWarnings("unchecked")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = response.getWriter();
        // 여기를 바꿔주면 다운받는 경로가 바뀜
        String savePath = "upload";
        // 최대 업로드 파일 크기 10MB로 제한
        int uploadFileSizeLimit = 10 * 1024 * 1024;
        String encType = "UTF-8";
        
        ServletContext context = getServletContext();
        String uploadFilePath = context.getRealPath(savePath);
        out.printf("서버상의 실제 디렉토리 : %s<br>", uploadFilePath);
       
        try {
            MultipartRequest multi = new MultipartRequest(
                    request, // request 객체
                    uploadFilePath, // 서버상의 실제 디렉토리
                    uploadFileSizeLimit, // 최대 업로드 파일 크기
                    encType, // 인코딩 방법
                    // 동일한 이름이 존재하면 새로운 이름이 부여됨
                    new DefaultFileRenamePolicy());
            
            String name = multi.getParameter("name");
            String subject = multi.getParameter("subject");
            out.printf("올린 사람 : %s<br>", name);
            out.printf("제목 : %s<br>", subject);
            // 업로드된 파일의 이름 얻기
            
            Enumeration<String> files= multi.getFileNames();
    		
    		String file1 = files.nextElement();
    		String filename1 = multi.getFilesystemName(file1);
    		String origfilename1 = multi.getOriginalFileName(file1);
//    		out.printf("파일명 : %s-%s<br>" , filename1, origfilename1);
    		
    		String file2 = files.nextElement();
    		String filename2 = multi.getFilesystemName(file2);
    		String origfilename2 = multi.getOriginalFileName(file2);
//    		out.printf("파일명 : %s-%s<br>" , filename2, origfilename2);
    		
    		request.setAttribute("name", name);
    		request.setAttribute("subject", subject);
    		request.setAttribute("filename1", filename1);
    		request.setAttribute("filename2", filename2);
    		request.setAttribute("origfilename1", origfilename1);
    		request.setAttribute("origfilename2", origfilename2);

        } catch (Exception e) {
            System.out.print("예외 발생 : " + e);
        }// catch
        
        request.getRequestDispatcher("fileCheck.jsp").forward(request, response);
	}

}
