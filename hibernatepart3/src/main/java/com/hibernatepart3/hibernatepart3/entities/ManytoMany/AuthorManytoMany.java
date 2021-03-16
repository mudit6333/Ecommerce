package com.hibernatepart3.hibernatepart3.entities.ManytoMany;

import javax.persistence.*;
import java.util.Set;

@Entity
public class AuthorManytoMany {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String firstName;
    private String lastName;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "AuthorBook",
            joinColumns = @JoinColumn(name = "Author_Id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "Book_id", referencedColumnName = "id"))
    private Set<BookManytoMany> books;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Set<BookManytoMany> getBooks() {
        return books;
    }

    public void setBooks(Set<BookManytoMany> books) {
        this.books = books;
    }
}
