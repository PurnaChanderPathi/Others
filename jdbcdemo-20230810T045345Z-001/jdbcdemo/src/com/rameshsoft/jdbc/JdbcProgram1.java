package com.rameshsoft.jdbc;
import java.sql.*;
public class JdbcProgram1 {

	public static void main(String[] args) throws SQLException {
		
	Driver d = new  oracle.jdbc.driver.OracleDriver();
	DriverManager.registerDriver(d);
	Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger"); 
	//Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
	Statement st = con.createStatement();
	//st.executeUpdate("create table  Student(sno number(3), sname varchar2(20))");
	//st.executeUpdate("INSERT INTO Student (sno, sname) VALUES ('800', 'KAJ')");
	//st.executeUpdate("UPDATE Student SET sname='956'  WHERE sno='22'   ");
	//st.executeUpdate("DELETE FR0OM Student WHERE sno='22' ");
	ResultSet rs=st.executeQuery("select * from Student");
	while(rs.next())
	{
		//System.out.println(rs.getInt(1)+".."+rs.getString(2)+".."+rs.getDouble(3)+".."+rs.getString(4));
		System.out.println(rs.getInt(1)+" "+rs.getString(2));

	}
	

	System.out.println("Table is created");
	con.close();
	}

}
