package com.example.appwarehouse.repository;

import com.example.appwarehouse.entity.AttachmentContent;
import com.example.appwarehouse.entity.User;
import com.example.appwarehouse.projection.AttachmentContentCustom;
import com.example.appwarehouse.projection.UserCustom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "attachmentContent",excerptProjection = AttachmentContentCustom.class)
public interface AttachmentContentRepository extends JpaRepository<AttachmentContent,Integer> {
}
