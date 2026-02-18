package com.auca.restfulapi.ecommerce.controller;

import com.auca.restfulapi.ecommerce.model.Product;
import com.auca.restfulapi.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    
    @Autowired
    private ProductService productService;

    @GetMapping
    public ResponseEntity<List<Product>> getAllProducts() {
        return ResponseEntity.ok(productService.getAllProducts());
    }

    @GetMapping("/{productId}")
    public ResponseEntity<Product> getProductById(@PathVariable Long productId) {
        return productService.getProductById(productId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/category/{category}")
    public ResponseEntity<List<Product>> getProductsByCategory(@PathVariable String category) {
        return ResponseEntity.ok(productService.getProductsByCategory(category));
    }

    @GetMapping("/brand/{brand}")
    public ResponseEntity<List<Product>> getProductsByBrand(@PathVariable String brand) {
        return ResponseEntity.ok(productService.getProductsByBrand(brand));
    }

    @GetMapping("/search")
    public ResponseEntity<List<Product>> searchProducts(
            @RequestParam(required = false) String keyword,
            @RequestParam(required = false) String category,
            @RequestParam(required = false) String brand,
            @RequestParam(required = false) Double minPrice,
            @RequestParam(required = false) Double maxPrice) {
        if (brand != null && minPrice != null && maxPrice != null) {
            return ResponseEntity.ok(productService.getProductsByBrandAndPriceRange(brand, minPrice, maxPrice));
        }
        if (category != null && brand != null) {
            return ResponseEntity.ok(productService.getProductsByCategoryAndBrand(category, brand));
        }
        if (keyword != null) {
            return ResponseEntity.ok(productService.searchProducts(keyword));
        }
        return ResponseEntity.ok(productService.getAllProducts());
    }

    @GetMapping("/price-range")
    public ResponseEntity<List<Product>> getProductsByPriceRange(
            @RequestParam Double min, 
            @RequestParam Double max) {
        return ResponseEntity.ok(productService.getProductsByPriceRange(min, max));
    }

    @GetMapping("/in-stock")
    public ResponseEntity<List<Product>> getInStockProducts() {
        return ResponseEntity.ok(productService.getProductsInStock());
    }

    @GetMapping("/brand-price")
    public ResponseEntity<List<Product>> getProductsByBrandAndPrice(
            @RequestParam String brand,
            @RequestParam Double minPrice,
            @RequestParam Double maxPrice) {
        return ResponseEntity.ok(productService.getProductsByBrandAndPriceRange(brand, minPrice, maxPrice));
    }

    @PostMapping
    public ResponseEntity<Product> addProduct(@RequestBody Product product) {
        Product saved = productService.createProduct(product);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @PutMapping("/{productId}")
    public ResponseEntity<Product> updateProduct(
            @PathVariable Long productId, 
            @RequestBody Product product) {
        Product updated = productService.updateProduct(productId, product);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{productId}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Long productId) {
        productService.deleteProduct(productId);
        return ResponseEntity.noContent().build();
    }
}
