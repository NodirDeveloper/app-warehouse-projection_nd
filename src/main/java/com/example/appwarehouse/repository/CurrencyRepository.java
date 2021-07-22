package com.example.appwarehouse.repository;

import com.example.appwarehouse.entity.Currency;
import com.example.appwarehouse.entity.User;
import com.example.appwarehouse.projection.CurrencyCustom;
import com.example.appwarehouse.projection.UserCustom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "currency",excerptProjection = CurrencyCustom.class)
public interface CurrencyRepository extends JpaRepository<Currency,Integer> {
}
