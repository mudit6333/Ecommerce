package com.hibernatepart3.hibernatepart3.entities.ManytoMany;

import javax.persistence.*;
import java.util.Set;

@Entity
public class BookManytoMany {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String bookName;
    @ManyToMany(mappedBy = "books")
    private Set<AuthorManytoMany> authorManytoMany;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Set<AuthorManytoMany> getAuthorManytoMany() {
        return authorManytoMany;
    }

    public void setAuthorManytoMany(Set<AuthorManytoMany> authorManytoMany) {
        this.authorManytoMany = authorManytoMany;
    }
}
