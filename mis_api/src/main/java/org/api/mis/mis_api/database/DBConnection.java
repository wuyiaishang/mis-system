package org.api.mis.mis_api.database;

import java.sql.*;

import javax.ws.rs.GET;

public class DBConnection {
     
	private static Connection mysqlConn;
	private static Statement myStatement;
	
	public static void getConnection(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			mysqlConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/MIS_DB?useSSL=false", "root", null);
			myStatement = mysqlConn.createStatement();
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block	
			e.printStackTrace();
		}
	}
	
	
	public static ResultSet queryData(String sqlString) {
		
		try {
			ResultSet myRs = myStatement.executeQuery(sqlString);
			return myRs;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return null;
	}
	
	public static int upindeData(String sqlString){
		try {
			int rows = myStatement.executeUpdate(sqlString);
			return rows;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return -1;
	}

	
}
