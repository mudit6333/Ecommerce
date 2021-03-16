package com.hibernatepart3.hibernatepart3.service;

import com.hibernatepart3.hibernatepart3.entities.Address;
import com.hibernatepart3.hibernatepart3.entities.Author;
import com.hibernatepart3.hibernatepart3.entities.ManytoMany.AuthorManytoMany;
import com.hibernatepart3.hibernatepart3.entities.ManytoMany.BookManytoMany;
import com.hibernatepart3.hibernatepart3.entities.OnetoMany.AuthorOnetoMany;
import com.hibernatepart3.hibernatepart3.entities.OnetoMany.BookOnetoMany;
import com.hibernatepart3.hibernatepart3.entities.OnetoOne.AuthorOnetoOne;
import com.hibernatepart3.hibernatepart3.entities.OnetoOne.BookOnetoOne;
import com.hibernatepart3.hibernatepart3.entities.Subject;
import com.hibernatepart3.hibernatepart3.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class AuthorService {
    @Autowired
    AuthorRepository authorRepository;
    @Autowired
    AuthorOnetoOneRepository authorOnetoOneRepository;
    @Autowired
    AuthorManytoManyrepository authorManytoManyrepository;
    @Autowired
    AuthorOnetoManyRepository authorOnetoManyRepository;
    @Autowired
    OnetoManyBidirectionalRepository onetoManyBidirectionalRepository;


    public void saveAuthor() {
        Author author = new Author();
        author.setFirstName("vinay");
        author.setLastName("pratap");

        Address address = new Address();
        address.setStreetNumber(6);
        address.setLocation("Mahipalpur");
        address.setState("Delhi");

        author.setAddress(address);

        Subject s1 = new Subject();
        s1.setSubjectName("Java");
        Subject s2 = new Subject();
        s2.setSubjectName("Cpp");
        Subject s3 = new Subject();
        s3.setSubjectName("html");

        author.setSubjectList(List.of(s1, s2, s3));

        authorRepository.save(author);

    }

    public void saveAuthorOnetoOne() {
        AuthorOnetoOne authorOnetoOne = new AuthorOnetoOne();
        authorOnetoOne.setFirstName("joe");
        authorOnetoOne.setLastName("root");

        BookOnetoOne bookOnetoOne = new BookOnetoOne();
        bookOnetoOne.setName("History of cricket");

        authorOnetoOne.setBookOnetoOne(bookOnetoOne);

        authorOnetoOneRepository.save(authorOnetoOne);

    }

    public void saveAuthorManytoMany() {
        AuthorManytoMany authorManytoMany = new AuthorManytoMany();
        authorManytoMany.setFirstName("Dan");
        authorManytoMany.setLastName("Brown");

        BookManytoMany book1 = new BookManytoMany();
        book1.setBookName("Beheive");
        BookManytoMany book2 = new BookManytoMany();
        book2.setBookName("moments");

        authorManytoMany.setBooks(Set.of(book1, book2));

        authorManytoManyrepository.save(authorManytoMany);
    }

//    public void saveAuthorOnetoMany() {
//        AuthorOnetoMany authorOnetoMany = new AuthorOnetoMany();
//        authorOnetoMany.setFirstName("Zakir");
//        authorOnetoMany.setFirstName("Khan");
//
//        BookOnetoMany book1 = new BookOnetoMany();
//        book1.setBookName("flamingo");
//        BookOnetoMany book2 = new BookOnetoMany();
//        book2.setBookName("History");
//
//        authorOnetoMany.setBookSet(Set.of(book1,book2));
//
//        authorOnetoManyRepository.save(authorOnetoMany);
//    }

    public void saveOtoMBidirectional(){
        AuthorOnetoMany authorOnetoMany =new AuthorOnetoMany();
        authorOnetoMany.setFirstName("abc");
        authorOnetoMany.setLastName("xyz");

        BookOnetoMany book1=new BookOnetoMany();
        book1.setBookName("pqr");
        BookOnetoMany book2=new BookOnetoMany();
        book2.setBookName("efg");

        book1.setAuthorOnetoMany(authorOnetoMany);
        book2.setAuthorOnetoMany(authorOnetoMany);

        onetoManyBidirectionalRepository.save(book1);
        onetoManyBidirectionalRepository.save(book2);
    }
}
