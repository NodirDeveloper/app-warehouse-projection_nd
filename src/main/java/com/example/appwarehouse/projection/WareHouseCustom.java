package com.example.appwarehouse.projection;

import com.example.appwarehouse.entity.User;
import com.example.appwarehouse.entity.WareHouse;
import org.springframework.data.rest.core.config.Projection;

import java.util.Set;

@Projection(types = WareHouse.class)
public interface WareHouseCustom {
    Integer getId();
    String getName();
    boolean isActive();
}
