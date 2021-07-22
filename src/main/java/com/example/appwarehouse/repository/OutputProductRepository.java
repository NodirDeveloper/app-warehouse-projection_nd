package com.example.appwarehouse.repository;

import com.example.appwarehouse.entity.OutputProduct;
import com.example.appwarehouse.entity.User;
import com.example.appwarehouse.projection.UserCustom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//@RepositoryRestResource(path = "outputProduct",excerptProjection = OutputProductRepository.class)
public interface OutputProductRepository extends JpaRepository<OutputProduct,Integer> {
}
