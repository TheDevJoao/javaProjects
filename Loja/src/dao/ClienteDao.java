package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;

import model.Cliente;

public class ClienteDao {

	public void create(Cliente cliente) {
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement ps;
		
		try {
			ps = con.prepareStatement("INSERT INTO Cliente(CLI_ID, CLI_NOME) VALUES(?, ?);");
			ps.setInt(1, cliente.getId());
			ps.setString(2, cliente.getNome());
			
			ps.executeUpdate();
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
}