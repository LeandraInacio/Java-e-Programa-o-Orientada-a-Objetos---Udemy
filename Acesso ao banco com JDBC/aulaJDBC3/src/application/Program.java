package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import db.DB;

public class Program {

	public static void main(String[] args) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Connection conn = null;
		PreparedStatement prepSt = null;

		try {
			conn = DB.getConnection();

			prepSt = conn.prepareStatement("INSERT INTO seller " 
					+ "(Name, Email, BirthDate, BaseSalary, DepartmentId)"
					+ "VALUES" + "(?,?,?,?,?)",
					 Statement.RETURN_GENERATED_KEYS);
			
			prepSt.setString(1, "Leandra Inacio");
			prepSt.setString(2, "leandra@gmail.com");
			prepSt.setDate(3, new java.sql.Date(sdf.parse("19/03/1996").getTime()));
			prepSt.setDouble(4, 3000);
			prepSt.setInt(5, 4);

			int linhasAlteradas = prepSt.executeUpdate();

			if(linhasAlteradas > 0) {
				
				ResultSet rs = prepSt.getGeneratedKeys();
				while(rs.next()) {
					int id = rs.getInt(1);
					System.out.println("Pronto: ID: "+id);
				}
				
			}else {
				System.out.println("Banco não alterado!");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}finally {
			//DB.closeResultSet(rs);
			DB.closeStatement(prepSt);
			DB.closeConnection();
		}

	}

}
