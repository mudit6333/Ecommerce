package com.hibernatepart3.hibernatepart3.repository;

import com.hibernatepart3.hibernatepart3.entities.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Integer> {
}
