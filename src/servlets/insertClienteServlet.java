package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javadb.dao.ClienteDAO;
import javadb.modelo.Cliente;

@SuppressWarnings("serial")
@WebServlet("/insertCliente")
public class insertClienteServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		String nome = request.getParameter("nome");
		String endereco = request.getParameter("endereco");
		String email = request.getParameter("email");

		Cliente cliente = new Cliente();
		cliente.setNome(nome);
		cliente.setEmail(email);
		cliente.setEndereco(endereco);

		ClienteDAO dao = new ClienteDAO();
		dao.inserir(cliente);

		out.println("<html>");
		out.println("<body>");
		out.println("Cliente " + cliente.getNome() + " salvo com sucesso.");
		out.println("</body>");
		out.println("</html>");

	}
}
