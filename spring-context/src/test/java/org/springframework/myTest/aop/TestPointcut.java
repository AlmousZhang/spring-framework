package org.springframework.myTest.aop;

import java.lang.reflect.Method;
import org.springframework.aop.ClassFilter;
import org.springframework.aop.MethodMatcher;
import org.springframework.aop.Pointcut;

public class TestPointcut implements Pointcut {

    @Override
    public ClassFilter getClassFilter() {
        return ClassFilter.TRUE;
    }

    @Override
    public MethodMatcher getMethodMatcher() {
        return new MethodMatcher() {

            public boolean matches(Method method, Class<?> targetClass, Object[] args) {
                if (method.getName().equals("test")) {
                    return true;
                }
                return false;
            }

            public boolean matches(Method method, Class<?> targetClass) {
                if (method.getName().equals("test")) {
                    return true;
                }
                return false;
            }

            public boolean isRuntime() {
                return true;
            }
        };
    }

}
