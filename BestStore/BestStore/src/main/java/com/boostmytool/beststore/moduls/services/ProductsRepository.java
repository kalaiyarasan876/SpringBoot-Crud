package com.boostmytool.beststore.moduls.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boostmytool.beststore.moduls.Product;

public interface ProductsRepository extends JpaRepository<Product, Integer> {

	
	
}
