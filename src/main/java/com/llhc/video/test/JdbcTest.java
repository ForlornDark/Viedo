package com.llhc.video.test;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;

public class JdbcTest {

	@Test
	public void test() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://120.25.94.199:3306/video","vps","123");
//		DatabaseMetaData m=connection.getMetaData();
//		System.out.println(m.getDatabaseProductName()+" "+m.getDatabaseProductVersion());
		PreparedStatement pStatement=connection.prepareStatement("select * from user");
		ResultSet rSet=pStatement.executeQuery();
		while (rSet.next()) {
			System.out.println(rSet.getString(2));
			
		}
	}

}
