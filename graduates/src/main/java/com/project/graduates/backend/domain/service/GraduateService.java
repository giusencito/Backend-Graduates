package com.project.graduates.backend.domain.service;

import com.project.graduates.backend.domain.model.entity.Graduate;
import com.project.graduates.backend.domain.model.enumaration.Sex;
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
    List<Graduate> getBySex(String sex);
    List<Graduate> getByYear(String year);
    List<Graduate> getByYearBetween(String year1,String year2);
    List<Graduate>getByYearBefore(String year);
    List<Graduate>getByYearAfter(String year);
    List<Graduate> getByType_of_courseStartingWith(String word);
    List<Graduate> getByType_of_courseEndingWith(String word);
    List<Graduate> getByType_of_courseContaining(String word);
    List<Graduate> getByType_of_courseNotContaining(String word);
    List<Graduate>getByNo_of_graduates(Long number);
    List<Graduate>getByNo_of_graduatesLessThan(Long number);
    List<Graduate>getByNo_of_graduatesGreaterThan(Long number);
    List<Graduate>getBySexAndYear(String sex, String year);
    List<Graduate>getBySexAndAndType_of_course(String sex,String course);
    List<Graduate>getBySexAndAndNo_of_graduates(String sex,Long number);
    List<Graduate>getByYearAndType_of_course(String year,String course);
}
