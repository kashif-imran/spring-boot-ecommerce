package com.kashif.ecommerce.dao;

import com.kashif.ecommerce.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.RequestParam;

@RepositoryRestResource
public interface ProductRepository extends JpaRepository<Product, Integer> {

    //internally spring data REST will expose a API api/products/search/findByCategoryId?id=
    Page<Product> findByCategoryId(@RequestParam("id") Integer id, Pageable pageable);

    //internally spring data REST will expose a API api/products/search/findByNameContaining?name=, this is for like functionality os SQL
    Page<Product> findByNameContainingIgnoreCase(@RequestParam("name") String name, Pageable pageable);


}
