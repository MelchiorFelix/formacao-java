package br.com.caelum.gerenciador.acao;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.caelum.gerenciador.modelo.Banco;
import br.com.caelum.gerenciador.modelo.Empresa;

public class EmpresaAcao {

	public void lista(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("listando empresa");
		Banco banco = new Banco();
		List<Empresa> lista = banco.getLista();

		request.setAttribute("empresas", lista);
		RequestDispatcher rd = request.getRequestDispatcher("/listaEmpresas.jsp");
		rd.forward(request, response);
	}

	public void remove(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);

		Banco banco = new Banco();
		banco.remove(id);

		response.sendRedirect("entrada?acao=ListaEmpresas");
	}

	public void mostra(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);

		Banco banco = new Banco();
		Empresa empresa = banco.buscaEmpresaPelaId(id);

		System.out.println(empresa.getNome());

		request.setAttribute("empresa", empresa);
		RequestDispatcher rd = request.getRequestDispatcher("/formAlteraEmpresa.jsp");
		rd.forward(request, response);

	}

	public void altera(HttpServletRequest request, HttpServletResponse response) throws IOException, ParseException {
		System.out.println("Alterando empresa");

		String nomeEmpresa = request.getParameter("nome");
		String paramDataEmpresa = request.getParameter("data");
		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);

		Date dataAbertura = null;

		SimpleDateFormat sdf = new SimpleDateFormat(paramDataEmpresa);
		dataAbertura = sdf.parse(paramDataEmpresa);

		System.out.println(id);

		Banco banco = new Banco();
		Empresa empresa = banco.buscaEmpresaPelaId(id);
		empresa.setNome(nomeEmpresa);
		empresa.setDataAbertura(dataAbertura);

		response.sendRedirect("entrada?acao=ListaEmpresas");

	}

	public void nova(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
System.out.println("Cadastrando nova empresa");
		
		String nomeEmpresa = request.getParameter("nome");
		String paramDataEmpresa = request.getParameter("data");
		
		Date dataAbertura = null;
		
		try {
			SimpleDateFormat sdf = new SimpleDateFormat(paramDataEmpresa);
			dataAbertura = sdf.parse(paramDataEmpresa);
		} catch (ParseException e) {
			throw new ServletException(e);
		}
		
		Empresa empresa = new Empresa();
		empresa.setNome(nomeEmpresa);
		empresa.setDataAbertura(dataAbertura);
		
		
		Banco banco = new Banco();
		banco.adiciona(empresa);
		
		request.setAttribute("empresa", empresa.getNome());
		
		response.sendRedirect("entrada?acao=ListaEmpresas");
		
	}

}
