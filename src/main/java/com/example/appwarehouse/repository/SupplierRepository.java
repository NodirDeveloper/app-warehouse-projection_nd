package com.example.appwarehouse.repository;

import com.example.appwarehouse.entity.Supplier;
import com.example.appwarehouse.entity.User;
import com.example.appwarehouse.projection.SupplierCustom;
import com.example.appwarehouse.projection.UserCustom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "supplier",excerptProjection = SupplierCustom.class)
public interface SupplierRepository extends JpaRepository<Supplier,Integer> {
}
