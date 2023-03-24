package com.osfocus.springbootreadwritesegregation.repository;

import com.osfocus.springbootreadwritesegregation.entity.Customers;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends CrudRepository<Customers, Long> {
    @Query(value = "select * from CUSTOMERS")
    List<Customers> getRecords();
}
