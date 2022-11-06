package com.project.graduates.backend.domain.service;

import com.project.graduates.backend.domain.model.entity.Graduate;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;
public interface GraduateService {
    List<Graduate> getAll();
    Page<Graduate> getAll(Pageable pageable);
    Graduate getById(Long graduateId);
    Graduate update(Long graduateId, Graduate request);
    Graduate create(Graduate graduate);
    ResponseEntity<?> delete(Long graduateId);
}
