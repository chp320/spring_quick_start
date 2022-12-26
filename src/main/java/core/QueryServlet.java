package core;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 목적: name과 value 쌍으로 구성되는 Query String을 추출할 수 있다.
 */
@WebServlet( {"/queryget", "/querypost"} )
public class QueryServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html; charset=utf-8");
        PrintWriter out = response.getWriter();
        String userName = request.getParameter("guestName");
        int number = Integer.parseInt(request.getParameter("num"));

        out.print("<h2>요청 방식: " + request.getMethod() + "</h2>");
        out.print("<h2>요청 URI: " + request.getRequestURI() + "</h2>");
        out.print("<h2>당신의 이름은 " + userName + "이군요!</h2>");
        out.print("<h2>당신이 좋아하는 숫자는 " + number + "이군요!</h2>");
        out.print("<a href= '" + request.getHeader("referer") + "'>입력화면으로 가기</a>");
        out.close();
    }

    /**
     * POST 방식으로 전달되는 Query String 추출 기능의 doPost() 메서드 추가
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        /* POST 방식은 query string 추출 시 한글이 깨지기 때문에, 반드시 아래 방법으로 한글 처리 필수!
           -> HttpServletRequest 에서 제공하는 setCharacterEncoding("utf-8") 호출!
         */
        request.setCharacterEncoding("utf-8");
        doGet(request, response);   // 본래 POST 방식으로 요청 시 doPost()가 호출되지만, 한글 처리 후 바로 doGet()을 호출하면 GET/POST 방식 구분하지 않고 지원 가능!
    }
}
