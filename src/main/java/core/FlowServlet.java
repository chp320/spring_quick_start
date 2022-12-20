package core;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "FlowServlet", value = "/FlowServlet")
public class FlowServlet extends HttpServlet {

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("init() 메서드 호출!");
    }

    @Override
    public void destroy() {
        System.out.println("destroy() 메서드 호출!");
    }

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("service() 메서드 호출!");
    }
}
