package com.klef.jfsd.farmtoglobal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.klef.jfsd.farmtoglobal.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
