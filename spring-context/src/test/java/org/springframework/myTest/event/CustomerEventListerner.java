/*
 * Copyright 2019 Zhongan All right reserved. This software is the
 * confidential and proprietary information of Zhongan  ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Zhongan.
 */
package org.springframework.myTest.event;

import org.springframework.context.ApplicationListener;

/**
 * CustomerEventListerner
 *
 * @author dahe
 * @date 2019/12/22
 */
public class CustomerEventListerner implements ApplicationListener<CustomApplicationEvent> {
	@Override
	public void onApplicationEvent(CustomApplicationEvent event) {
		System.out.println(event.getSource());
	}
}
