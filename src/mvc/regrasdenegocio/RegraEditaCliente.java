package mvc.regrasdenegocio;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javadb.dao.ClienteDAO;
import javadb.modelo.Cliente;

public class RegraEditaCliente implements Regra {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String id = request.getParameter("id");
		System.out.println(id);
		String nome = request.getParameter("nome");
		System.out.println(nome);
		String email = request.getParameter("email");
		System.out.println(email);
		String endereco = request.getParameter("endereco");
		System.out.println(endereco);

		Cliente cliente = new Cliente();
		
		cliente.setId(Long.valueOf(id));
		cliente.setNome(nome);
		cliente.setEmail(email);
		cliente.setEndereco(endereco);

		ClienteDAO dao = new ClienteDAO();
		dao.editar(cliente);

		System.out.println("Cliente editado com sucesso.");
		return "/mvc?regra=RegraGetClientes";
	}

}
