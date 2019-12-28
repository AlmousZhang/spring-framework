package org.springframework.myTest.tx;

import org.springframework.tests.sample.beans.TestBean;

import javax.transaction.Transactional;

public class TestBean2 extends TestBean {

    @Override
    @Transactional // <2>
    public Object returnsThis() {
        return super.returnsThis();
    }

}