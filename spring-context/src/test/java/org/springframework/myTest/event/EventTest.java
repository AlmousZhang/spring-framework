/*
 * Copyright 2019 Zhongan All right reserved. This software is the
 * confidential and proprietary information of Zhongan  ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Zhongan.
 */
package org.springframework.myTest.event;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * EventTest
 *
 * @author dahe
 * @date 2019/12/22
 */
public class EventTest {
	@Test
	public void applicationEventTest() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/org/springframework/myTest/MyTest-bean.xml");
		// 创建 CustomApplicationEvent 事件
		CustomApplicationEvent customEvent = new CustomApplicationEvent(applicationContext, "Test message");

		// 发布事件
		applicationContext.publishEvent(customEvent);
	}
}
