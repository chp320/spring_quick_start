package core;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

/**
 * 목적: 요청 재지정 방식 중 Redirect 를 사용한 요청 재지정 방식을 구현한다.
 */
@WebServlet("/redirect")
public class RedirectServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("RedirectServlet 수행!");
        /*
            - redirect 기능으로 요청 재지정하는 경우, HttpServletResponse 객체의 sendRedirect() 메서드를 사용한다.
            - redirect 시, 클라이언트에 302 응답코드와 함께 재요청할 자원에 대한 URL/URI 를 응답한다.
            - 요청 재지정 대상에 제한이 없고, 따라서 URL 및 URI 어떤 설정이던 가능하다.
         */
//        response.sendRedirect("/core/servletexam/output.html");
        response.sendRedirect("http://www.naver.com");
    }
}
