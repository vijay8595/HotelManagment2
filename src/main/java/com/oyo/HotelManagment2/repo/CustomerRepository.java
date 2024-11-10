package com.oyo.HotelManagment2.repo;

import com.oyo.HotelManagment2.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository  extends JpaRepository<Customer,Integer> {


//     @Query(value = "select c from Customer c where c.email =:email",nativeQuery = false)
     List<Customer> findByEmail(String email);

//    findByAgeGreaterThanAndLessThan(Integer age1 ,Integer age2);

}
