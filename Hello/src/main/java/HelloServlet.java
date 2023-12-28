import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	
    	doGet(request, response);
    	    	
    	String name = request.getParameter("Name");
        String number = request.getParameter("Number");
        String uni = request.getParameter("Subuni");

        String clientAddress = request.getRemoteAddr();
        int contentLength = request.getContentLength();
        String method = request.getMethod();
        String requestURL = request.getRequestURL().toString();
  
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();


        out.println("[Requset Object Info]"+ "<br>");
        out.println("- 클라이언트 주소: " + clientAddress + "<br>");
        out.println("- 요청 정보 길이: " + contentLength + "<br>");
        out.println("- 전송 방식: " + method + "<br>");
        out.println("- 요청 URL: " + requestURL + "<br>");
        out.println("[Requset Parameter Info]"+ "<br>");
        out.println("- 성명: " + name + "<br>");
        out.println("- 학번: " + number + "<br>");
        out.println("- 지역대학: " + uni + "<br>");

        out.close();
        
        
    }
}    