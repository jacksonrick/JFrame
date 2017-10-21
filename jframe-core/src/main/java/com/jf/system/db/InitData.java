package com.jf.system.db;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.web.context.ServletContextAware;

import javax.servlet.ServletContext;

/**
 * 数据初始化
 * 
 * @author rick
 * @date
 * @version
 */
public class InitData implements ServletContextAware, InitializingBean {

	/*@Resource
	private SystemService systemService;*/

	@Override
	public void setServletContext(ServletContext sc) {
		try {
            //
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void afterPropertiesSet() throws Exception {
	}
}
