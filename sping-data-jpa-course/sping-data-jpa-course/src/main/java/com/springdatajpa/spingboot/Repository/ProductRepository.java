package com.springdatajpa.spingboot.Repository;

import com.springdatajpa.spingboot.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByDateCreatedBetween(LocalDateTime startDate, LocalDateTime endDate);
}
