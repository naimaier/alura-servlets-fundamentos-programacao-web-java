package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/editaEmpresa")
public class EditaEmpresaServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String paramIdEmpresa = request.getParameter("id");
		int idEmpresa = Integer.parseInt(paramIdEmpresa);
		
		Banco banco = new Banco();
		Empresa empresa = banco.getEmpresaById(idEmpresa);
		
		request.setAttribute("empresa", empresa);
		RequestDispatcher rd = request.getRequestDispatcher("/formEditaEmpresa.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String paramIdEmpresa = request.getParameter("id");
		String nomeEmpresa = request.getParameter("nome");
		String paramDataEmpresa = request.getParameter("data");
		
		int idEmpresa = Integer.parseInt(paramIdEmpresa);
		
		Date dataAbertura = null;
	
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			dataAbertura = sdf.parse(paramDataEmpresa);
		} catch (ParseException e) {
			throw new ServletException(e);
		}
		
		Banco banco = new Banco();
		Empresa empresa = banco.getEmpresaById(idEmpresa);
		empresa.setNome(nomeEmpresa);
		empresa.setDataAbertura(dataAbertura);
		
		response.sendRedirect("listaEmpresas");
	}

}
