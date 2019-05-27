package mvc.regrasdenegocio;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javadb.dao.ClienteDAO;
import javadb.modelo.Cliente;

public class RegraGetClientes implements Regra {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		List<Cliente> clientes = new ClienteDAO().getClientes();
		request.setAttribute("clientes", clientes);
		return "testejstl3.jsp";
	}

}
