package application;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;
import db.DbException;

public class Program {

	public static void main(String[] args) {

		Connection conn = null;
		Statement st = null;
		
		try {
			conn = DB.getConnection();
			
			conn.setAutoCommit(false);
			
			st = conn.createStatement();
			
			int linhas1 = st.executeUpdate("UPDATE seller SET BaseSalary = 2090 WHERE DepartmentId =1");
			/*
			//Para simular um erro de integridade
			int x =1;
			if(x<2) {
				throw new SQLException("Fake error");
			}
			//----------------------------------------
			*/
			int linhas2 = st.executeUpdate("UPDATE seller SET BaseSalary = 3090 WHERE DepartmentId =2");
			
			conn.commit();
			
			System.out.println("Linha 1: "+linhas1);
			System.out.println("Linha 2: "+linhas2);
										
		}catch (SQLException e) {
			
			try {
				conn.rollback();
				throw new DbException("Transação não ocorreu: "+ e.getMessage());
			} catch (SQLException e1) {
				
				throw new DbException("Erro ao tentar utilizar o rollback: "+ e1.getMessage());
			}
			
		}finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}
	}

}
