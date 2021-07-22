package com.example.appwarehouse.repository;

import com.example.appwarehouse.entity.Client;
import com.example.appwarehouse.entity.User;
import com.example.appwarehouse.projection.ClientCustom;
import com.example.appwarehouse.projection.UserCustom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "client",excerptProjection = ClientCustom.class)
public interface ClientRepository extends JpaRepository<Client,Integer> {
}
