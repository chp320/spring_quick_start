package core;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;

/**
 * 목적: multipart/form-data 형식으로 전달되는 데이터에서 업로드된 파일을 서버의 정해진 폴더에 저장할 수 있다.
 */
@WebServlet("/upload")
@MultipartConfig(location = "/Users/leo/Downloads/temp", maxFileSize = 1024 * 1024 * 5, maxRequestSize = 1024 * 1024 * 5 * 5)
public class UploadServlet extends HttpServlet {
    // 파일 전송은 POST 방식으로 전송된다.
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html; charset=utf-8");
        PrintWriter out = response.getWriter();
        request.setCharacterEncoding("utf-8");
        String path = "/Users/leo/Downloads/temp";
        File isDir = new File(path);
        if (!isDir.isDirectory()) {
            isDir.mkdirs();
        }

        Collection<Part> parts = request.getParts();
        for (Part part : parts) {
            if (part.getContentType() != null) {
                String fileName = part.getSubmittedFileName();  // 업로드된 파일의 파일명을 추출
                if (fileName != null) {
                    part.write(fileName.substring(0, fileName.lastIndexOf(".")) + "_" + System.currentTimeMillis() + fileName.substring(fileName.lastIndexOf(".")));
                    out.print("<br>업로드한 파일 이름: " + fileName);
                    out.print("<br>크기: " + part.getSize());
                }
            } else {
                String partName = part.getName();
                String fieldValue = request.getParameter(partName);
                out.print("<br>" + partName + ": " + fieldValue);
            }
        }
        out.close();
    }
}
