package core;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 목적: name과 value 쌍으로 구성되는 Query String을 추출할 수 있다.
 */
@WebServlet(name = "QueryServlet", value = "/QueryServlet")
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

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
