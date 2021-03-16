package com.hibernatepart3.hibernatepart3.repository;

import com.hibernatepart3.hibernatepart3.entities.ManytoMany.AuthorManytoMany;
import org.springframework.data.repository.CrudRepository;

public interface AuthorManytoManyrepository extends CrudRepository<AuthorManytoMany,Integer> {
}
