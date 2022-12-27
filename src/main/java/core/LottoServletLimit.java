package core;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 목적: HttpSession 객체를 이용해서 이용 횟수 제한하는 기능을 확인한다.
 */
@WebServlet("/lottoLimit")
public class LottoServletLimit extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession();
        if (session.getAttribute("lottocnt") == null) {
            session.setAttribute("lottocnt", new int[1]);
        }
        int[] count = (int[])session.getAttribute("lottocnt");
        String msg = "";
        if (++count[0] > 3) {
            msg = "<h3>더이상 응모할 수 없습니다.</h3><h3>브라우저를 재시작하여 응모하세요.</h3>";
        } else {
            int answer = (int) (Math.random() * 10) + 1;
            int input = Integer.parseInt(request.getParameter("guess"));
            if (answer == input) {
                msg = "<h3>축하합니다!! 당첨되었어요!! </h3>";
                count[0] = 4;   // 당첨된 이후 다시 수행하지 못하도록 횟수를 변경한다.
            } else {
                msg = "<h3>다음 기회를... </h3><a href='" + request.getHeader("referer") + "'>재도전</a>";
            }
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
