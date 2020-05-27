package br.com.caelum.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet(urlPatterns = "/oi", loadOnStartup=1)
public class OiMundoServlet extends HttpServlet{
	
	public OiMundoServlet() {
		System.out.println("Criando Servlet");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("oi mundo, parabens vc escreveu a primeira servlet.");
		out.println("</body>");
		out.println("</html>");
		
		System.out.println("A classe OiMundoServlet foi invocada");
	}
}
