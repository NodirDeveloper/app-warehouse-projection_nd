package com.example.appwarehouse.projection;

import com.example.appwarehouse.entity.*;
import org.springframework.data.rest.core.config.Projection;

import java.util.Set;

@Projection(types = Product.class)
public interface ProductCustom {
    Integer getId();
    String getName();
    String getCode();
    boolean isActive();
    Category getCategory();
    Attachment getPhoto();
    Measurement getMeasurement();
}
