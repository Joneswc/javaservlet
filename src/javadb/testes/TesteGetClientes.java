package javadb.testes;

import java.util.List;

import javadb.dao.ClienteDAO;
import javadb.modelo.Cliente;

public class TesteGetClientes {
	public static void main(String[] args) {
		ClienteDAO dao = new ClienteDAO();
		List<Cliente> clientes = dao.getClientes();
		for (Cliente cliente : clientes) {
			System.out.println("ID: " + cliente.getId());
			System.out.println("Nome: " + cliente.getNome());
			System.out.println("Email: " + cliente.getEmail());
			System.out.println("Endere�o: " + cliente.getEndereco());
			System.out.println("-------------------------------------");
		}
		dao.fecharConexao();
	}

}
