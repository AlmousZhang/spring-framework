/*
 * Copyright 2019 Zhongan All right reserved. This software is the
 * confidential and proprietary information of Zhongan  ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Zhongan.
 */
package org.springframework.myTest.event;

import org.springframework.context.ApplicationEvent;

/**
 * CustomApplicationEvent
 *
 * @author dahe
 * @date 2019/12/22
 */
public class CustomApplicationEvent extends ApplicationEvent {

	private String msg;

	/**
	 * Create a new ApplicationEvent.
	 *
	 * @param source the object on which the event initially occurred (never {@code null})
	 */
	public CustomApplicationEvent(Object source, final String msg) {
		super(source);
		this.msg = msg;
	}
}
