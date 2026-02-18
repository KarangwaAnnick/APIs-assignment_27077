package com.auca.restfulapi.ecommerce.repository;

import com.auca.restfulapi.ecommerce.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByCategory(String category);
    List<Product> findByBrand(String brand);
    List<Product> findByNameContainingIgnoreCase(String keyword);
    List<Product> findByPriceBetween(Double min, Double max);
    List<Product> findByStockQuantityGreaterThan(int quantity);
    List<Product> findByCategoryAndBrand(String category, String brand);
    List<Product> findByBrandAndPriceBetween(String brand, Double minPrice, Double maxPrice);
    List<Product> findByPriceLessThanEqual(Double maxPrice);
    List<Product> findByPriceGreaterThanEqual(Double minPrice);
}
