package com.jf.service;

import org.springframework.beans.factory.annotation.Value;

import java.text.MessageFormat;
import java.util.Properties;
import java.util.UUID;

/**
 * service基类
 * 
 * @author rick
 */
public class BaseService {

	/**
	 * 获取UUID
	 * 
	 * @return
	 */
	@Deprecated
	public String uuid() {
		return UUID.randomUUID().toString();
	}

	/**
	 * config.properties
	 */
	@Value("#{cfg}")
	private Properties config;

	/**
	 * conf/message.properties
	 */
	// @Value("#{msg}")
	// private Properties msg;

	/**
	 * 获取config.properties配置
	 * 
	 * @param key
	 * @return String
	 */
	public String getString(String key) {
		return config.getProperty(key);
	}

	/**
	 * 获取config.properties配置
	 * 
	 * @param key
	 * @return Double
	 */
	public Double getDouble(String key) {
		return Double.parseDouble(config.getProperty(key));
	}

	/**
	 * 获取config.properties配置
	 * 
	 * @param key
	 * @return Integer
	 */
	public Integer getInteger(String key) {
		return Integer.parseInt(config.getProperty(key));
	}

	/**
	 * 获取消息配置
	 * 
	 * @param key
	 * @return String
	 * @throws UnsupportedEncodingException
	 */
	/*public String getMessage(String key) {
		try {
			return new String(msg.getProperty(key).getBytes("ISO-8859-1"), "UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			return "";
		}
	}*/

	/**
	 * 格式化消息配置
	 * 
	 * @param message
	 * @param objects
	 * @return
	 */
	public String messageFormat(String message, Object... objects) {
		return MessageFormat.format(message, objects);
	}
}
