package com.stackroute;


import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Movie movie1 = applicationContext.getBean("movie1", Movie.class);
        Movie Siva = applicationContext.getBean("SivaMovie", Movie.class);
        Movie SK = applicationContext.getBean("SKMovie", Movie.class);
        Movie movie2 = applicationContext.getBean("movie2", Movie.class);


        System.out.println(movie1);
        System.out.println(Siva);
        System.out.println(SK);
        System.out.println(movie1 == movie2);
    }
}
