package com.example.appwarehouse.projection;

import com.example.appwarehouse.entity.Attachment;
import com.example.appwarehouse.entity.AttachmentContent;
import com.example.appwarehouse.entity.User;
import com.example.appwarehouse.entity.WareHouse;
import org.springframework.data.rest.core.config.Projection;

import java.util.Set;

@Projection(types = AttachmentContent.class)
public interface AttachmentContentCustom {
    Integer getId();
    byte[] getBytes();
    Attachment getAttachment();
}
