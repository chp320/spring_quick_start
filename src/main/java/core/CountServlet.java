package core;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 목적: HttpSession 객체를 사용해서 상태 정보 유지하는 방법을 학습한다.
 */
@WebServlet("/countServlet")
public class CountServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html; charset=utf-8");
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession();   // request 에서 HttpSession 객체를 추출하거나 생성한다.

        if (session.getAttribute("cnt") == null) {
            session.setAttribute("cnt", new int[1]);
        }
        int[] count = (int[])session.getAttribute("cnt");
        count[0]++;
        out.print("<h3>당신은 " + count[0] + "번째 방문입니다.</h3>");
        out.close();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
