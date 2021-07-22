package com.example.appwarehouse.repository;

import com.example.appwarehouse.entity.Input;
import com.example.appwarehouse.entity.User;
import com.example.appwarehouse.projection.InputCustom;
import com.example.appwarehouse.projection.UserCustom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "input",excerptProjection = InputCustom.class)
public interface InputRepository extends JpaRepository<Input,Integer> {
}
