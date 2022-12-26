package core;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/lotto")
public class LottoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int answer = (int) (Math.random() * 10) + 1;    // 1~10 사이의 정수를 난수로 추출
        int input = Integer.parseInt(request.getParameter("guess"));
        String msg = "";

        if (answer == input) {
            msg = "<h3>축하합니다!! 당첨되었어요!!</h3>";
        } else {
            msg = "<h3>다음 기회를...</h3><a href='" + request.getHeader("referer") + "'>재도전</a>";
        }

        response.setContentType("text/html; charset=utf-8");
        PrintWriter out = response.getWriter();
        out.println(msg);
        out.close();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
