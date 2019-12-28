/*
 * Copyright 2019 Zhongan All right reserved. This software is the
 * confidential and proprietary information of Zhongan  ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Zhongan.
 */
package org.springframework.myTest.aop;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * AopTest
 *
 * @author dahe
 * @date 2019/12/22
 */
public class AopTest {
	@Test
	public void test() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/org/springframework/myTest/aop/myAdvice.xml");
		TestTarget target = (TestTarget) applicationContext.getBean("testAOP");
		target.test();
		System.out.println("----------------");
		target.test2();
	}

	@Test
	public void testAop() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("/org/springframework/myTest/aop/myAdvice.xml");

		Dao dao = (Dao)ac.getBean("daoImpl");
		dao.select();
	}
}
