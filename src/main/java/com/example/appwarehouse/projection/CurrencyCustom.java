package com.example.appwarehouse.projection;

import com.example.appwarehouse.entity.Currency;
import com.example.appwarehouse.entity.User;
import com.example.appwarehouse.entity.WareHouse;
import org.springframework.data.rest.core.config.Projection;

import java.util.Set;

@Projection(types = Currency.class)
public interface CurrencyCustom {
    Integer getId();
    String getName();
    boolean isActive();

}
