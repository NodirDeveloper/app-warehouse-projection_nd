package com.example.appwarehouse.repository;

import com.example.appwarehouse.entity.Product;
import com.example.appwarehouse.entity.User;
import com.example.appwarehouse.projection.ProductCustom;
import com.example.appwarehouse.projection.UserCustom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "product",excerptProjection = ProductCustom.class)
public interface ProductRepository extends JpaRepository<Product,Integer> {
}
