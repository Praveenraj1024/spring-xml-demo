package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.Arrays;

public class Movie implements ApplicationContextAware, BeanFactoryAware, BeanNameAware {
    private Actor actor;

    public Movie() {

    }

    public Movie(Actor actor) {
        this.actor = actor;
    }


    @Override
    public String toString() {
        return "Movie{" +
                "actor=" + actor +
                '}';
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("setApplicationContext is called: " + Arrays.toString(applicationContext.getBeanDefinitionNames()));
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("setBeanFactory called: " + beanFactory.isSingleton("movie"));
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("setBeanName Called: "+ s);
    }
}
