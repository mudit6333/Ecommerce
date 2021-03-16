package com.hibernatepart3.hibernatepart3.entities.OnetoOne;

import javax.persistence.*;

@Entity
public class AuthorOnetoOne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String firstName;
    private String lastName;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "bookId")
    private BookOnetoOne bookOnetoOne;

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

    public BookOnetoOne getBookOnetoOne() {
        return bookOnetoOne;
    }

    public void setBookOnetoOne(BookOnetoOne bookOnetoOne) {
        this.bookOnetoOne = bookOnetoOne;
    }
}
