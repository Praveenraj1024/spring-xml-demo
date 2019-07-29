package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet called...");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy called...");
    }

    @Override
    public String toString() {
        return "BeanLifecycleDemoBean{}";
    }

    public void customInit() {
        System.out.println("customInt called...");
    }

    public void customDestroy() {
        System.out.println("customDestroy called..");
    }
}
