package org.springframework.transaction.dahe;

import org.springframework.tests.sample.beans.TestBean;
import org.springframework.transaction.annotation.Transactional;

public class TestBean2 extends TestBean {

    @Override
    @Transactional // <2>
    public Object returnsThis() {
        return super.returnsThis();
    }

}