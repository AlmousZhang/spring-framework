/*
 * Copyright 2019 Zhongan All right reserved. This software is the
 * confidential and proprietary information of Zhongan  ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Zhongan.
 */
package org.springframework.myTest.tx;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.tests.sample.beans.ITestBean;

/**
 * TestTx
 *
 * @author dahe
 * @date 2019/12/23
 */
public class TestTx {

	private ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/org/springframework/myTest/tx/txNamespaceHandlerTests.xml");

	@Test
	public void invokeTransactional2() {
		ITestBean bean = getTestBean2();
		bean.returnsThis(); // 测试，我们对 @Transactional 注解的效果
//        bean.getAge(); // 测试，原有 xml 配置的事务的效果
	}

	// add by 芋艿
	private ITestBean getTestBean2() {
		return (ITestBean) applicationContext.getBean("testBean2");
	}
}
