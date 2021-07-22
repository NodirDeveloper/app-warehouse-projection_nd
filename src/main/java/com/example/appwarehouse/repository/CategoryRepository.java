package com.example.appwarehouse.repository;

import com.example.appwarehouse.entity.Category;
import com.example.appwarehouse.entity.User;
import com.example.appwarehouse.projection.CategoryCustom;
import com.example.appwarehouse.projection.UserCustom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "category",excerptProjection = CategoryCustom.class)
public interface CategoryRepository extends JpaRepository<Category,Integer> {
}
