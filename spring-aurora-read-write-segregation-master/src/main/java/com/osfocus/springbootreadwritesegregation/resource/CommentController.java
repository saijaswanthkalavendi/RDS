package com.osfocus.springbootreadwritesegregation.resource;

import com.osfocus.springbootreadwritesegregation.service.CustomerService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CommentController {

    private CustomerService customerService;
    ;

    public CommentController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/customers")
    public ResponseEntity comments() {
        return ResponseEntity.ok(customerService.list());
    }
}