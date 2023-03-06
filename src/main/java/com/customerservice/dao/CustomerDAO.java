package com.customerservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.customerservice.entity.Customer;

public interface CustomerDAO extends JpaRepository<Customer,Integer> {

}
