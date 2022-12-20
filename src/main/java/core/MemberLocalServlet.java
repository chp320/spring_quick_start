package core;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 목적:
 * 1) Servlet 클래스의 객체는 한 번 생성되면 객체 상태를 계속 유지한다는 것을 확인한다.
 * 2) 여러 브라우저에서 요청이 전달되면 하나의 Servlet 객체를 공유하여 수행한다는 것을 확인한다.
 */
@WebServlet(name = "MemberLocalServlet", value = "/MemberLocalServlet")
public class MemberLocalServlet extends HttpServlet {

    // 멤버변수 -> MemberLocalServlet 객체가 생성될 때 메모리에 할당되며, 여러 클라이언트에 의해 공유됨
    int member_v = 0;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=utf-8");
        PrintWriter out = response.getWriter();

        // 지역변수 -> doGet() 메서드가 호출될 때마다 메모리 영역을 할당하고 수행이 끝나면 메모리 영역이 해제됨. 각 브라우저 요청에 대해 메모리 영역을 개별적으로 할당하여 사용함.
        int local_v = 0;
        member_v++;
        local_v++;
        out.print("<h2>member_v(멤버변수) : " + member_v + "</h2>");
        out.print("<h2>local_v(지역변수) : " + local_v + "</h2>");
        out.close();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
