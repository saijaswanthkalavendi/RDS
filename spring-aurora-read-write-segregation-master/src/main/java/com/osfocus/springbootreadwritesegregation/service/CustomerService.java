package com.osfocus.springbootreadwritesegregation.service;

import com.osfocus.springbootreadwritesegregation.entity.Customers;
import com.osfocus.springbootreadwritesegregation.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    private CommentRepository commentRepository;

    public CustomerService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }
    public List<Customers> list() {
        return commentRepository.getRecords();
    }
}
