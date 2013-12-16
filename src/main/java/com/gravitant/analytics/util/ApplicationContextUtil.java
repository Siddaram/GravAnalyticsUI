package com.gravitant.analytics.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component("appContextUtil")
public class ApplicationContextUtil {

	@Autowired
	private ApplicationContext appContext;

	public Object getBean(String beanName) {
		return appContext.getBean(beanName);
	}

}
