package br.com.alura.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.thoughtworks.xstream.XStream;

import br.com.alura.gerenciador.modelo.Banco;
import br.com.alura.gerenciador.modelo.Empresa;

@WebServlet("/empresas")
public class EmpresasService extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String header = request.getHeader("Accept");
		
		System.out.println(header);
			
		if(header.contains("xml")) {
			 XStream xstream = new XStream();
			 xstream.alias("empresa",Empresa.class);
			 
			 String xml = xstream.toXML(new Banco().getEmpresas());
		
			response.setContentType("application/xml");
			response.getWriter().println(xml);
		} else if (header.contains("json")) {
			String json = new Gson().toJson(new Banco().getEmpresas());
			
			response.setContentType("application/json");
			response.getWriter().println(json);
		} else {
			response.setContentType("application/json");
			response.getWriter().println("{'message:' 'no content'}");
		}
		


	}

}
