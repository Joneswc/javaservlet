package mvc.regrasdenegocio;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javadb.dao.ClienteDAO;
import javadb.modelo.Cliente;

public class RegraInsereCliente implements Regra {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String nome = request.getParameter("nome");
		System.out.println(nome);
		String email = request.getParameter("email");
		System.out.println(email);
		String endereco = request.getParameter("endereco");
		System.out.println(endereco);

		Cliente cliente = new Cliente();
		cliente.setNome(nome);
		cliente.setEmail(email);
		cliente.setEndereco(endereco);

		ClienteDAO dao = new ClienteDAO();
		dao.inserir(cliente);

		System.out.println("Cliente inserido com sucesso.");
		List<Cliente> clientes = new ClienteDAO().getClientes();
		request.setAttribute("clientes", clientes);
		return "testejstl3.jsp";
//		return "/WEB-INF/pages/testejstl3.jsp";
	}

}
