package com.hibernatepart3.hibernatepart3.repository;

import com.hibernatepart3.hibernatepart3.entities.OnetoMany.AuthorOnetoMany;
import org.springframework.data.repository.CrudRepository;

public interface AuthorOnetoManyRepository extends CrudRepository<AuthorOnetoMany,Integer> {
}
