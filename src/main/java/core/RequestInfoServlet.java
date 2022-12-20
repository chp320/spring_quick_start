package core;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Pattern;

/**
 * 목적:
 * 1) Servlet 요청 시 클라이언트로부터 전달되는 request 정보를 추출할 수 있다.
 * 2) 요청한 클라이언트가 모바일인지 PC인지 체크, 브라우저 종류 체크, 요청한 페이지(referer) 정보 체크할 수 있다.
 */
@WebServlet(name = "RequestInfoServlet", value = "/RequestInfoServlet")
public class RequestInfoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String contextPath = request.getContextPath();  // 요청된 자원이 존재하는 컨텍스트(정의: 웹 컨테이너 구동 시 인식되는 단위)경로 추출
        String method = request.getMethod();    // 요청 방식(GET, POST 등)에 대한 정보 추출
        String protocol = request.getProtocol();    // 요청 프로토콜 정보 추출
        String remoteAddr = request.getRemoteAddr();    // 요청 보낸 클라이언트 IP주소 추출
        String requestURI = request.getRequestURI();    // 요청 URI 추출
        String requestURL = new String(request.getRequestURL());    // 요청 URL 추출
        String serverName = request.getServerName();    // 요청이 전달된 서버의 도메인명을 추출
        String userAgent = request.getHeader("user-agent"); // 요청 헤더 메시지에서 name명으로 전달되는 value를 추출
        String referer = request.getHeader("referer");  // 요청 헤더 메시지에서 name명으로 전달되는 value를 추출
        String clientMachine = "";
        boolean result = Pattern.matches(".*[win16|win32|linux|win64|mac].*", userAgent.toLowerCase());
        if (result) {
            clientMachine = "PC";
        } else {
            clientMachine = "모바일";
        }
        String browser = "";
        if (userAgent.indexOf("Trident") > 0 || userAgent.indexOf("MSIE") > 0) {
            browser = "IE";
        } else if (userAgent.indexOf("Opera") > 0) {
            browser = "Opera";
        } else if (userAgent.indexOf("Firefox") > 0) {
            browser = "Firefox";
        } else if (userAgent.indexOf("Safari") > 0) {
            if (userAgent.indexOf("Edge") > 0) {
                browser = "Edge";
            } else if (userAgent.indexOf("Chrome") > 0) {
                browser = "Chrome";
            } else {
                browser = "Safari";
            }
        }
        response.setContentType("text/html; charset=utf-8");
        PrintWriter out = response.getWriter();
        out.println("<h3>요청 정보를 통해서 추출한 내용</h3>");
        out.println("<ul>");
        out.println("<li>요청 컨텍스트 패스: " + contextPath + "</li>");
        out.println("<li>요청 방식: " + method + "</li>");
        out.println("<li>요청 프로토콜: " + protocol + "</li>");
        out.println("<li>요청 클라이언트 주소: " + remoteAddr + "</li>");
        out.println("<li>요청 URI: " + requestURI + "</li>");
        out.println("<li>요청 URL: " + requestURL + "</li>");
        out.println("<li>요청 서버명: " + serverName + "</li>");
        out.println("<li>요청 클라이언트 시스템 종류: " + clientMachine + "</li>");
        out.println("<li>요청 브라우저 종류: " + browser + "</li>");
        out.println("<li>이 콘텐츠를 요청한 웹 페이지: " + referer + "</li>");
        out.println("</ul>");
        out.close();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
