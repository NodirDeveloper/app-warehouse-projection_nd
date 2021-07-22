package com.example.appwarehouse.repository;

import com.example.appwarehouse.entity.Measurement;
import com.example.appwarehouse.entity.User;
import com.example.appwarehouse.projection.MeasurementCustom;
import com.example.appwarehouse.projection.UserCustom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "measurement",excerptProjection = MeasurementCustom.class)
public interface MeasurementRepository extends JpaRepository<Measurement,Integer> {
}
