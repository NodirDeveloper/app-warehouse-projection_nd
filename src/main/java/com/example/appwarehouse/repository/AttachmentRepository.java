package com.example.appwarehouse.repository;

import com.example.appwarehouse.entity.Attachment;
import com.example.appwarehouse.entity.AttachmentContent;
import com.example.appwarehouse.projection.AttachmentContentCustom;
import com.example.appwarehouse.projection.AttachmentCustom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "attachment",excerptProjection = AttachmentCustom.class)
public interface AttachmentRepository extends JpaRepository<Attachment,Integer> {
}
