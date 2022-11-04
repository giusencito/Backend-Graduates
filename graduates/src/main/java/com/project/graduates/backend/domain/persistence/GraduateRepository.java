package com.project.graduates.backend.domain.persistence;

import com.project.graduates.backend.domain.model.entity.Graduate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface GraduateRepository extends JpaRepository<Graduate,Long> {

    List<Graduate> findBySex(String sex);
    List<Graduate> findByYear(Date year);






}
