package br.com.caelum.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
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

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String paramAcao = request.getParameter("acao");

		String nome = null;
		if (paramAcao.equals("ListaEmpresas")) {
			nome = acao.lista(request, response);
		} else if (paramAcao.equals("RemoveEmpresa")) {
			nome = acao.remove(request, response);
		} else if (paramAcao.equals("MostraEmpresa")) {
			nome = acao.mostra(request, response);
		} else if (paramAcao.equals("AlteraEmpresa")) {
			nome = acao.altera(request, response);
		} else if (paramAcao.equals("NovaEmpresa")) {
			nome = acao.nova(request, response);
		} else if (paramAcao.equals("NovaEmpresaForm")) {
			nome = acao.formNovaEmpresa(request, response);
		}

		String[] tipoEEndereco = nome.split(":");

		if (tipoEEndereco[0].equals("forward")) {
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/" + tipoEEndereco[1]);
			rd.forward(request, response);
		} else {
			response.sendRedirect(tipoEEndereco[1]);
		}

	}

}
