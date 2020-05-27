package br.com.caelum.gerenciador.servlet;

import java.io.IOException;
import java.text.ParseException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.caelum.gerenciador.acao.EmpresaAcao;


@WebServlet("/entrada")
public class UnicaEntradaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
		EmpresaAcao acao = new EmpresaAcao();
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String paramAcao = request.getParameter("acao");
		
		if(paramAcao.equals("ListaEmpresas")) {
			
			acao.lista(request, response);
			
		} else if(paramAcao.equals("RemoveEmpresa")) {
			System.out.println("removendo empresa");
			acao.remove(request, response);
			
		} else if(paramAcao.equals("MostraEmpresa")) {
			System.out.println("mostando dados da empresa");
			
			acao.mostra(request,response);
		} else if(paramAcao.equals("AlteraEmpresa")) {
			System.out.println("alterando dados da empresa");
			
			try {
				acao.altera(request,response);
			} catch (IOException | ParseException e) {
				e.printStackTrace();
			}
		} else if(paramAcao.equals("NovaEmpresa")) {
			System.out.println("criando nova empresa");
			
			acao.nova(request,response);
		}
		
		
		
		
	}

}
