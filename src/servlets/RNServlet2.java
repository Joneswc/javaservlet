package servlets;

import java.io.IOException;
//import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javadb.dao.ClienteDAO;
import javadb.modelo.Cliente;

@SuppressWarnings("serial")
@WebServlet("/rnservletadiciona2")
public class RNServlet2 extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		PrintWriter out = response.getWriter();

		String action = request.getParameter("regra");

		ClienteDAO dao = null;
		try {
			dao = new ClienteDAO();	
		} catch (Exception e) {
		}

		if (action.equals("InserirCliente")) {
//			regra de negócio para inserir cliente - pode extrair o código, daqui de dentro,
//			para outro método (extract method - sr - single responsability) ou ainda extraí-lo
//			para outra classe (extract class - srp - single responsability principle - que é o S do SOLID)
			Cliente cliente = new Cliente();
			cliente.setNome(request.getParameter("nome"));
			cliente.setEndereco(request.getParameter("endereco"));
			cliente.setEmail(request.getParameter("email"));
			dao.inserir(cliente);
			RequestDispatcher rd = request.getRequestDispatcher("/insertClienteok.jsp");
			rd.forward(request, response);
		} else if (action.equals("GetClientes")) {
//			Implementação para listagem de clientes
			List<Cliente> clientes = dao.getClientes();
			RequestDispatcher rd = request.getRequestDispatcher("/insertClienteok.jsp");
		} else if (action.equals("DeleteCliente")) {
//			Implementação para excluir um cliente
			Cliente cliente = dao.pesquisaClientePorID(7);
			dao.excluir(cliente);
			RequestDispatcher rd = request.getRequestDispatcher("/insertClienteok.jsp");
		}

//		mesmo código do if, mas extraíndo para outra classe
//		if (action.equals("InserirCliente")) {
//			new InsertCliente().execute(request, response);
//		} else if (action.equals("GetClientes")) {
//			new GetCliente().execute(request, response);
//		} else if (action.equals("DeleteCliente")) {
//			new DeleteCliente().execute(request, response);
//		}
//		dao.fecharConexao();
		

//		String nome = request.getParameter("nome");
//		String endereco = request.getParameter("endereco");
//		String email = request.getParameter("email");
//
//		Cliente cliente = new Cliente();
//		cliente.setNome(nome);
//		cliente.setEmail(email);
//		cliente.setEndereco(endereco);
//
//		ClienteDAO dao = new ClienteDAO();
//		dao.inserir(cliente);
//
//		RequestDispatcher rd = request.getRequestDispatcher("insertClienteok.jsp");
////		RequestDispatcher rd = request.getRequestDispatcher("testejstl.jsp");
//		rd.forward(request, response);

	}
}
