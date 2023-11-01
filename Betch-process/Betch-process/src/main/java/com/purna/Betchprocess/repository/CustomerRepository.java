package com.purna.Betchprocess.repository;

import com.purna.Betchprocess.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
