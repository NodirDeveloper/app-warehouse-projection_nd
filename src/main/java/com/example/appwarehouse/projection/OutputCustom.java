package com.example.appwarehouse.projection;

import com.example.appwarehouse.entity.*;
import org.springframework.data.rest.core.config.Projection;

import java.sql.Date;
import java.util.Set;

@Projection(types = Output.class)
public interface OutputCustom {
    Integer getId();
    Date getDate();
    String getCode();
    String getFactureNumber();
    WareHouse getWareHouse();
    Currency getCurrency();
    Client getClient();


}
