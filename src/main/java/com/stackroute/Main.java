package com.stackroute;


import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Movie movie = applicationContext.getBean("movie", Movie.class);
        Movie Siva = applicationContext.getBean("SivaMovie", Movie.class);


        System.out.println(movie);
        System.out.println(Siva);
    }
}
