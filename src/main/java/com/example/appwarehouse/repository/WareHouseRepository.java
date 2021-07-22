package com.example.appwarehouse.repository;

import com.example.appwarehouse.entity.User;
import com.example.appwarehouse.entity.WareHouse;
import com.example.appwarehouse.projection.UserCustom;
import com.example.appwarehouse.projection.WareHouseCustom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "warehouse",excerptProjection = WareHouseCustom.class)
public interface WareHouseRepository extends JpaRepository<WareHouse,Integer> {
}
