/*
 * Copyright 2019 Zhongan All right reserved. This software is the
 * confidential and proprietary information of Zhongan  ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Zhongan.
 */
package org.springframework.myTest.bean;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * FactoryBeanTest
 *
 * @author dahe
 * @date 2019/12/21
 */
public class FactoryBeanTest {
	@Test
	public void ApplicationContextTest(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/org/springframework/myTest/MyTest-bean.xml");
		User user = applicationContext.getBean(User.class);
		System.out.println(user.getId());
	}
}
