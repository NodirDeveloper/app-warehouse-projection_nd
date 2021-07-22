package com.example.appwarehouse.repository;

import com.example.appwarehouse.entity.InputProduct;
import com.example.appwarehouse.entity.User;
import com.example.appwarehouse.projection.UserCustom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//@RepositoryRestResource(path = "users",excerptProjection = UserCustom.class)
public interface InputProductRepository extends JpaRepository<InputProduct,Integer> {
}
