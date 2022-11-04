package com.project.graduates.backend.service;

import com.project.graduates.backend.domain.model.entity.Graduate;
import com.project.graduates.backend.domain.persistence.GraduateRepository;
import com.project.graduates.backend.domain.service.GraduateService;
import com.project.graduates.shared.execption.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GraduateServiceImpl implements GraduateService {

    private static final String ENTITY = "Graduate";
    @Autowired
    private GraduateRepository graduateRepository;


    @Override
    public List<Graduate> getAll() {
        return graduateRepository.findAll();
    }

    @Override
    public Page<Graduate> getAll(Pageable pageable) {
        return graduateRepository.findAll(pageable);
    }

    @Override
    public Graduate getById(Long graduateId) {
        return graduateRepository.findById(graduateId)
                .orElseThrow(() -> new ResourceNotFoundException(ENTITY, graduateId));
    }

    @Override
    public Graduate update(Long graduateId, Graduate request) {
        return null;
    }

    @Override
    public ResponseEntity<?> delete(Long graduateId) {
        return graduateRepository.findById(graduateId).map(graduate -> {
            graduateRepository.delete(graduate);
            return ResponseEntity.ok().build();
        }).orElseThrow(() -> new ResourceNotFoundException(ENTITY, graduateId));
    }




}
