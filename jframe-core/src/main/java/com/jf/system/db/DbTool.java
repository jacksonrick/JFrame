package com.jf.system.db;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class DbTool {

	private static Properties pros = getPprVue();
	
	/**读取properties 配置文件
	 * @return
	 * @throws IOException
	 */
	public static Properties getPprVue() {
		Properties p = new Properties();
		try {
			p.load(DbTool.class.getResourceAsStream("/jdbc.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return p;
	}
	
	/**
	 * @return 获取conn对象
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public static Connection getConn() throws ClassNotFoundException, SQLException{
		String username = pros.getProperty("username");			//用户名
		String password = pros.getProperty("password");			//密码
		String address = pros.getProperty("url");			//数据库连接地址
		return DbTool.getCon(username,password,address);
	}
	
	/**
	 * 
	 * @param username
	 * @param password
	 * @param dburl
	 * @return
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */
	public static Connection getCon(String username,String password,String dburl) throws SQLException, ClassNotFoundException{
		Class.forName("com.mysql.jdbc.Driver");
		return DriverManager.getConnection(dburl,username,password);
	}
	
	/**字段名列表
	 * @param conn
	 * @param table
	 * @return
	 * @throws SQLException
	 */
	public static List<String> getFieldLsit(Connection conn, String table) throws SQLException{
		PreparedStatement pstmt = conn.prepareStatement(table);
		pstmt.execute();  									
		List<String> columnList = new ArrayList<String>();	//存放字段
		ResultSetMetaData rsmd = pstmt.getMetaData();
		for (int i = 1; i < rsmd.getColumnCount() + 1; i++) {
			columnList.add(rsmd.getColumnName(i));			//把字段名放list里
		}	
		return columnList;
	}
}
