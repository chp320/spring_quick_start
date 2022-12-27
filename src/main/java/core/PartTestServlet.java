package core;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Collection;

/**
 * 목적: 멀티파트(multipart/form-data) 형식ㅇ로 전달되는 데이터 점검을 한다.
 */
@WebServlet("/part")
@MultipartConfig    // multipart/form-data 형식으로 전달되는 요청 body 정보 추출을 위해 정의!
public class PartTestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    // 파일 업로드는 POST 방식으로 전달된다.
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Collection<Part> parts = request.getParts();    // @MultipartConfig 애너테이션이 정의된 servlet에서만 호출 가능
        System.out.println("================= 요청 받음 =================");

        for (Part part : parts) {
            System.out.print("name: ");
            System.out.println(part.getName()); // 파일 이름을 추출
            System.out.println("[ 헤더 정보 ]");
            for (String headerName : part.getHeaderNames()) {   // 멀티파트로 전송되는 파일들의 각 파트별 전송되는 헤더 정보를 반복 추출
                System.out.print(headerName + " : ");
                System.out.println(part.getHeader(headerName));
            }
            System.out.print("size: ");
            System.out.println(part.getSize()); // 업로드되는 파일의 사이즈 정보 추출
            System.out.println("--------------------------------------------");
        }
    }
}
