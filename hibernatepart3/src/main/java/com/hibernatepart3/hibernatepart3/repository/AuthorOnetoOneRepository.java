package com.hibernatepart3.hibernatepart3.repository;

import com.hibernatepart3.hibernatepart3.entities.OnetoOne.AuthorOnetoOne;
import com.hibernatepart3.hibernatepart3.entities.OnetoOne.BookOnetoOne;
import org.springframework.data.repository.CrudRepository;

public interface AuthorOnetoOneRepository extends CrudRepository<AuthorOnetoOne,Integer> {
}
