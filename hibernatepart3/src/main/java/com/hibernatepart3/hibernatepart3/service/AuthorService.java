package com.hibernatepart3.hibernatepart3.service;

import com.hibernatepart3.hibernatepart3.entities.Address;
import com.hibernatepart3.hibernatepart3.entities.Author;
import com.hibernatepart3.hibernatepart3.entities.Subject;
import com.hibernatepart3.hibernatepart3.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {
    @Autowired
    AuthorRepository authorRepository;

    public void saveAuthor(){
        Author author =new Author();
        author.setFirstName("vinay");
        author.setLastName("pratap");

        Address address=new Address();
        address.setStreetNumber(6);
        address.setLocation("Mahipalpur");
        address.setState("Delhi");

        author.setAddress(address);

        Subject s1=new Subject();
        s1.setSubjectName("Java");
        Subject s2=new Subject();
        s2.setSubjectName("Cpp");
        Subject s3=new Subject();
        s3.setSubjectName("html");

        author.setSubjectList(List.of(s1,s2,s3));

        authorRepository.save(author);

    }

}
