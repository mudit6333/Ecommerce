package com.hibernatepart3.hibernatepart3.entities.OnetoMany;

import javax.persistence.*;
import java.util.Set;

@Entity
public class AuthorOnetoMany {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String firstName;
    private String lastName;
    @OneToMany(mappedBy = "authorOnetoMany")
  //  @JoinColumn(name = "authorId")
    private Set<BookOnetoMany> bookSet;

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

    public Set<BookOnetoMany> getBookSet() {
        return bookSet;
    }

    public void setBookSet(Set<BookOnetoMany> bookSet) {
        this.bookSet = bookSet;
    }
}
