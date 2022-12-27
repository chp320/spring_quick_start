package core;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

/**
 * 목적: 요청 재지정 2가지 방식(forward, redirect) 중 '동일 웹 애플리케이션에 존재하는 자원으로만 재지정'할 수 있는 forward 방식을 사용한다.
 */
@WebServlet("/forward")
public class ForwardServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("ForwardServlet 수행!");
        /*
            - Forward 기능 사용을 위해서 RequestDispatcher 객체의 forward() 메서드를 사용한다. 컨택스트 패스는 자동으로 add되기 때문에 생략한다.
            ※ 컨텍스트 패스(Context Path)란? - 웹 어플리케이션 서버(Web Application Server, WAS // 여기서는 tomcat)에서 웹 상의 어플리케이션을 구분하기 위한 Path. 즉, 프로젝트명이라고 보면 된다.
            - Forward 는 동일한 웹 어플리케이션 범위 내로 제한하기 때문에 서블릿에서 대상 URI 앞에 "무조건" 컨텍스트 패스를 붙힌다.
        */
        RequestDispatcher rd = request.getRequestDispatcher("/servletexam/output.html");
        rd.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
