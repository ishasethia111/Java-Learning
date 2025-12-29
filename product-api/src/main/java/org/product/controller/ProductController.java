package org.product.controller;

import jakarta.validation.Valid;
import org.product.model.Product;
import org.product.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/*
 * @author Isha Sethia
 * */

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService service;
    private static final Logger log = LoggerFactory.getLogger(ProductController.class);

    public ProductController(ProductService service) {
        log.info("ProductController initialized with ProductServiceImpl");
        this.service = service;
    }

    @GetMapping
    public List<Product> getAllProducts() {
        log.info("Fetching all products");
        return service.getAllProducts();
    }

    @GetMapping("/{id}")
    public Product getProduct(@PathVariable Long id) {
        log.info("Fetching product with id: {}", id);
        return service.getProductById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Product createProduct(@Valid @RequestBody Product product) {
        log.info("Creating new product: {}", product);
        return service.createProduct(product);
    }

    @PutMapping("/{id}")
    public Product updateProduct(
            @PathVariable Long id,
            @Valid @RequestBody Product product) {
        log.info("Updating product with id: {}", id);
        return service.updateProduct(id, product);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteProduct(@PathVariable Long id) {
        log.info("Deleting product with id: {}", id);
        service.deleteProduct(id);
    }
}

