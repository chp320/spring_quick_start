package core;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

/**
 * 목적: HttpSession 객체의 생성, 삭제, 세션ID 부여 및 Cookie 기술을 이용한 브라우저 저장 기능을 확인한다.
 */
@WebServlet("/sessiontest")
public class SessionTestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html; charset=utf-8");
        PrintWriter out = response.getWriter();
        String command = request.getParameter("comm");   // HttpServletRequest에서 comm 이름의 파라미터의 값을 추출한다.
        HttpSession session = request.getSession();   // HttpSession 객체를 추출하거나 생성
        String msg = "";
        long time = session.getCreationTime();  // HttpSession 객체가 생성된 시간을 추출
        String id = session.getId();    // HttpSession 객체의 세션ID 추출

        if (command.equals("view")) {
            if (session.isNew()) {
                msg = "세션 객체 생성";
            } else {
                msg = "세션 객체 추출";
            }
            msg += "<br>id : " + id + " <br>time: " + new Date(time);
        } else if (command.equals("delete")) {
            session.invalidate();   // HttpSession 객체를 삭제
            msg += id + "을 id로 갖는 세션 객체 삭제!!";
        } else {
            msg = "요청 시 Query 문자열로 comm=view 또는 comm=delete 를 " + "전달해주세요!!";
        }
        out.print("<h2>" + msg + "</h2>");
        out.close();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
