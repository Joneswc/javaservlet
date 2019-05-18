package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/hello2")
//@WebServlet(name = "helloServlet2", urlPatterns = {"/hello3", "/hello4"}) // mesmo servlet acessado por 2 diferentes urls
public class HelloServlet2 extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>Testando meu Hello Servlet 2</h1>");
		out.println("</body>");
		out.println("</html>");
	}
}
