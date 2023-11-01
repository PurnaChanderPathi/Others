package com.rameshsoft.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectAllRowsDemo {

	public static void main(String[] args) throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
		Statement st = con.createStatement();
		ResultSet rs=st.executeQuery("select * from emp");
		while(rs.next())
		{
			//System.out.println(rs.getInt(1)+".."+rs.getString(2)+".."+rs.getDouble(3)+".."+rs.getString(4));
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+"      "+rs.getString(3)+"     "+rs.getInt(4)+"   "+rs.getDate(5)+"    "+rs.getInt(6)+"    "+rs.getInt(7)+"    "+rs.getInt(8));

		}
		con.close();
	}
}
