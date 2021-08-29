package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/removeEmpresa")
public class RemoveEmpresaServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String paramIdEmpresa = request.getParameter("id");
		int idEmpresa = Integer.parseInt(paramIdEmpresa);
		
		Banco banco = new Banco();
		banco.removeEmpresa(idEmpresa);
		
		response.sendRedirect("listaEmpresas");
	}

}
