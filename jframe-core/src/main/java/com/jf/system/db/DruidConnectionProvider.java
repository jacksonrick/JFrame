package com.jf.system.db;

import com.alibaba.druid.pool.DruidDataSource;
import org.quartz.utils.ConnectionProvider;

import java.sql.SQLException;

/**
 * 
 * @author rick
 */
public class DruidConnectionProvider extends DruidDataSource implements ConnectionProvider {

	private static final long serialVersionUID = 1L;

	public void shutdown() throws SQLException {
		this.close();
	}

	public void initialize() throws SQLException {
		this.init();
	}

}
