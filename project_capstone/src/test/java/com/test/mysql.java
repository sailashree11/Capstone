package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class mysql {

	public mysql() {
		super();
		// TODO Auto-generated constructor stub
	}

	static Connection conn;
	public static String[] main() {
		String conn_url = "jdbc:mysql://localhost:3306/flyaway";
		String UN = "root";
		String PWD = "root";
		String str[] = new String[5];

		conn = null;
		try {

			String qry = "Select * from f_user where name ='sailsiva'";

			conn = DriverManager.getConnection(conn_url, UN, PWD);
			Statement statement = conn.createStatement();
			ResultSet resultSet = statement.executeQuery(qry);

			while (resultSet.next()) {
				String name = (resultSet.getString("name"));
				String city = (resultSet.getString("city"));
				String email = (resultSet.getString("email"));
				String id = (resultSet.getString("ID"));
				String date = (resultSet.getString("date_signup"));
				String pwd = (resultSet.getString("pwd"));
				String adress = (resultSet.getString("address"));
				System.out.println(name);
				System.out.println(city);
				System.out.println(email);
				System.out.println(id);
				System.out.println(date);
				System.out.println(pwd);
				System.out.println(adress);

				str[0] = name;
				str[1] = city;
				str[2] = email;
				str[3] = adress;
				str[4] = pwd;

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("done");
		return str;

	}

}		
