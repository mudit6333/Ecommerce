package com.hibernatepart3.hibernatepart3.entities.OnetoMany;

import javax.persistence.*;

@Entity
public class BookOnetoMany {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String bookName;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "authorId")
    AuthorOnetoMany authorOnetoMany;

    public AuthorOnetoMany getAuthorOnetoMany() {
        return authorOnetoMany;
    }

    public void setAuthorOnetoMany(AuthorOnetoMany authorOnetoMany) {
        this.authorOnetoMany = authorOnetoMany;
    }

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
}
