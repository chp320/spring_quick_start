package core;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.*;

/**
 * 응답처리 : 웹 클라이언트에서 보내온 다양한 타입의 요청을 웹서버가 받아서 처리한 후 그 결과를 다시 클라이언트로 보내는 것.
 * 응답처리 순서
 * 1) 응답하려는 콘텐츠 종류에 따른 MIME Type 정보와 문자 세트 정보를 '응답 헤더'에 설정 -> HttpServletResponse 객체의 setContentType() 사용
 * 2) 응답용 출력 스트림 객체 생성
 *    텍스트 형식 : HttpServletResponse 객체의 getWriter() 로 PrintWriter 객체 생성
 *    바이너리 형식 : HttpServletResponse 객체의 getOutputStream() 로 OutputStream 객체 생성
 */

@WebServlet({ "/getHTML", "/getXML", "/getJSON", "/getImage" })      // 하나의 Servlet 클래스에 대해 여러 개의 URL mapping 패스명 설정 가능
public class ResponseServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uri = request.getRequestURI();
        String filename = "";
        String contentType = "";

        if (uri.endsWith("getHTML")) {
            filename = "/Users/leo/Downloads/4장소스/sample.html";
            contentType = "text/html; charset=utf-8";
        } else if (uri.endsWith("getXML")) {
            filename = "/Users/leo/Downloads/4장소스/sample.xml";
            contentType = "application/xml; charset=utf-8";
        } else if (uri.endsWith("getJSON")) {
            filename = "/Users/leo/Downloads/4장소스/sample.json";
            contentType = "application/json; charset=utf-8";
        } else {
            filename = "/Users/leo/Downloads/4장소스/trans_duke.png";
            contentType = "image/png";
        }

        File f = new File(filename);
        FileInputStream fis = new FileInputStream(f);
        response.setContentType(contentType);

        if (contentType.startsWith("image")) {
            byte[] content = new byte[(int) f.length()];
            ServletOutputStream sos = response.getOutputStream();
            fis.read(content);
            sos.write(content);
            sos.close();
        } else {
            InputStreamReader isr = new InputStreamReader(fis, "utf-8");
            BufferedReader br = new BufferedReader(isr);
            PrintWriter out = response.getWriter();
            String line = null;
            while ((line = br.readLine()) != null) {
                out.println(line);
            }
            out.close();
            br.close();
            isr.close();
        }
        fis.close();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
