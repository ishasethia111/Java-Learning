package org.product.service;

import org.product.model.Product;

import java.util.List;

/*
 * @author Isha Sethia
 * */


public interface ProductService {

    List<Product> getAllProducts();

    Product getProductById(Long id);

    Product createProduct(Product product);

    Product updateProduct(Long id, Product product);

    void deleteProduct(Long id);
}

