package org.product.repository;

import org.product.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/*
 * @author Isha Sethia
 * */


public interface ProductRepository extends JpaRepository<Product, Long> {
}


