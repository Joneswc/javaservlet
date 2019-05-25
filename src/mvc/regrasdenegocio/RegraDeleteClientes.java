package mvc.regrasdenegocio;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javadb.dao.ClienteDAO;
import javadb.modelo.Cliente;

public class RegraDeleteClientes implements Regra {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		Long id = Long.parseLong(request.getParameter("id"));
		Cliente cliente = new Cliente();
		cliente.setId(id);

		ClienteDAO dao = new ClienteDAO();
		dao.excluir(cliente);

		System.out.println("Deletando cliente");

		return "testejstl2.jsp";
	}

}
// http://localhost:8080/javaweb/mvc?regra=RegraDeleteClientes&id=10