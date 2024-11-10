package com.oyo.HotelManagment2.controller;


import com.oyo.HotelManagment2.entity.Customer;
import com.oyo.HotelManagment2.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v1/customer")
@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;


    @PostMapping("/create")
    public Boolean createCustomer(@RequestBody Customer customer){
        return customerService.createCustomer(customer);

    }

    @GetMapping("/")
    public Customer getCustomer(@RequestParam Integer customerId){
        return customerService.getCustomerDetails(customerId);

    }

    @GetMapping("/getByEmail")
    public List<Customer> getCustomerByEmail(@RequestParam("email") String email)
    {

        return customerService.findByEmail(email);



    }

}
