package com.hibernatepart3.hibernatepart3;

import com.hibernatepart3.hibernatepart3.service.AuthorService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Hibernatepart3Application {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(Hibernatepart3Application.class, args);

        AuthorService authorService = applicationContext.getBean(AuthorService.class);
        //	authorService.saveAuthor();
        //authorService.saveAuthorOnetoOne();
       // authorService.saveAuthorManytoMany();
      //  authorService.saveAuthorOnetoMany();
        authorService.saveOtoMBidirectional();
    }

}
