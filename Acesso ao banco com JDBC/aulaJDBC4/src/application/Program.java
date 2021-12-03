package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.DB;

public class Program {

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement prepst = null;
		
		try {
			conn = DB.getConnection();
			
			prepst = conn.prepareStatement(
					"UPDATE seller SET BaseSalary = BaseSalary+?"
					+"WHERE (DepartmentId = ?)");
			prepst.setDouble(1, 200);
			prepst.setInt(2, 2);
			
			int linhasAfetadas = prepst.executeUpdate();
			
			System.out.println("Linhas afetadas no update: "+ linhasAfetadas);
							
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DB.closeStatement(prepst);
			DB.closeConnection();
		}
	}

}
