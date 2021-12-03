package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.DB;
import db.DbIntegrityException;

public class Program {

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement prepst = null;
		
		try {
			conn = DB.getConnection();
			
			prepst = conn.prepareStatement(
					"DELETE FROM seller WHERE Id = ?");
			
			prepst.setInt(1,7);
			
			int linhasAfetadas = prepst.executeUpdate();
			
			System.out.println("Linhas afetadas no update: "+ linhasAfetadas);
							
		}catch (SQLException e) {
			throw new DbIntegrityException(e.getMessage());
		}finally {
			DB.closeStatement(prepst);
			DB.closeConnection();
		}
	}

}
