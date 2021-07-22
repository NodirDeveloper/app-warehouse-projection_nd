package com.example.appwarehouse.projection;

import com.example.appwarehouse.entity.*;
import org.springframework.data.rest.core.config.Projection;

import java.sql.Date;
import java.util.Set;

@Projection(types = Input.class)
public interface InputCustom {
    Integer getId();
    Date getDate();
    String getCode();
    String getFactureNumber();
    WareHouse getWareHouse();
    Currency getCurrency();
    Supplier getSupplier();

}
