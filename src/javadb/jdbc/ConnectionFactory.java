package javadb.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public Connection getConnection() {
		try {
			DriverManager.deregisterDriver(new org.mariadb.jdbc.Driver()); // linha obrigatório para uso no tomcat
			return DriverManager.getConnection("jdbc:mysql://127.0.0.1/test", "root", "1234");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
