package com.hibernatepart3.hibernatepart3.entities.OnetoOne;

import javax.persistence.*;

@Entity
public class BookOnetoOne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String bookName;


    @OneToOne(mappedBy = "bookOnetoOne")
    private AuthorOnetoOne authorOnetoOne;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return bookName;
    }

    public void setName(String name) {
        this.bookName = name;
    }

    public AuthorOnetoOne getAuthorOnetoOne() {
        return authorOnetoOne;
    }

    public void setAuthorOnetoOne(AuthorOnetoOne authorOnetoOne) {
        this.authorOnetoOne = authorOnetoOne;
    }
}
