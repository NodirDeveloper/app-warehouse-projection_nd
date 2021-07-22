package com.example.appwarehouse.repository;

import com.example.appwarehouse.entity.Output;
import com.example.appwarehouse.entity.User;
import com.example.appwarehouse.projection.OutputCustom;
import com.example.appwarehouse.projection.UserCustom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "output",excerptProjection = OutputCustom.class)
public interface OutputRepository extends JpaRepository<Output,Integer> {
}
