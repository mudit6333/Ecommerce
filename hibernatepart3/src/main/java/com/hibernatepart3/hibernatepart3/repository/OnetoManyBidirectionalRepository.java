package com.hibernatepart3.hibernatepart3.repository;

import com.hibernatepart3.hibernatepart3.entities.OnetoMany.BookOnetoMany;
import org.springframework.data.repository.CrudRepository;

public interface OnetoManyBidirectionalRepository extends CrudRepository<BookOnetoMany,Integer> {
}
