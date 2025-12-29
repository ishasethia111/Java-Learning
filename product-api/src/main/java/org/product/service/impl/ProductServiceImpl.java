package org.product.service.impl;

import org.product.exception.ResourceNotFoundException;
import org.product.model.Product;
import org.product.repository.ProductRepository;
import org.product.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

/*
 * @author Isha Sethia
 * */


@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository repository;
    private static final Logger log = LoggerFactory.getLogger(ProductServiceImpl.class);

    public ProductServiceImpl(ProductRepository repository) {
        log.info("ProductServiceImpl initialized with ProductRepository");
        this.repository = repository;
    }

    @Override
    public List<Product> getAllProducts() {
        log.info("Retrieving all products");
        return repository.findAll();
    }

    @Override
    public Product getProductById(Long id) {
        log.info("Retrieving product with id: {}", id);
        return repository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Product not found with id: " + id));
    }

    @Override
    public Product createProduct(Product product) {
        log.info("Creating product: {}", product);
        return repository.save(product);
    }

    @Override
    public Product updateProduct(Long id, Product product) {
        log.info("Updating product with id: {}", id);
        Product existing = getProductById(id);
        existing.setName(product.getName());
        existing.setDescription(product.getDescription());
        existing.setPrice(product.getPrice());
        return repository.save(existing);
    }

    @Override
    public void deleteProduct(Long id) {
        log.info("Deleting product with id: {}", id);
        Product product = getProductById(id);
        repository.delete(product);
    }
}

