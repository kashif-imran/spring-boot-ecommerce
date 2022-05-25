package com.kashif.ecommerce.dao;

import com.kashif.ecommerce.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;

@CrossOrigin("http://localhost:4200")
public interface ProductRepository extends JpaRepository<Product, Integer> {

    //internally spring data REST will expose a API api/products/search/findByCategoryId?id=
    Page<Product> findByCategoryId(@RequestParam("id") Integer id, Pageable pageable);

    //internally spring data REST will expose a API api/products/search/findByNameContaining?name=, this is for like functionality os SQL
    Page<Product> findByNameContainingIgnoreCase(@RequestParam("name") String name, Pageable pageable);
}
