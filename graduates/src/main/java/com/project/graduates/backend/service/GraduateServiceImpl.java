package com.project.graduates.backend.service;

import com.project.graduates.backend.domain.model.entity.Graduate;
import com.project.graduates.backend.domain.model.enumaration.Sex;
import com.project.graduates.backend.domain.persistence.GraduateRepository;
import com.project.graduates.backend.domain.service.GraduateService;
import com.project.graduates.shared.execption.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
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
        return graduateRepository.findById(graduateId).map(graduate -> {


            graduate.setSex(request.getSex());
            graduate.setYear(request.getYear());
            graduate.setTypeOfCourse(request.getTypeOfCourse());
            graduate.setNoOfGraduates(request.getNoOfGraduates());

            graduateRepository.save(graduate);
            return graduate;
        }).orElseThrow(() -> new ResourceNotFoundException(ENTITY, graduateId));
    }

    @Override
    public Graduate create(Graduate graduate) {
        return graduateRepository.save(graduate);
    }

    @Override
    public ResponseEntity<?> delete(Long graduateId) {
        return graduateRepository.findById(graduateId).map(graduate -> {
            graduateRepository.delete(graduate);
            return ResponseEntity.ok().build();
        }).orElseThrow(() -> new ResourceNotFoundException(ENTITY, graduateId));
    }

    @Override
    public List<Graduate> getBySex(String sex) {
        return graduateRepository.findBySex(Enum.valueOf(Sex.class,sex));
    }

    @Override
    public List<Graduate> getByYear(String year) {
        return graduateRepository.findByYear(year);
    }

    @Override
    public List<Graduate> getByYearBetween(String year1, String year2) {
        return graduateRepository.findByYearBetween(year1,year2);
    }

    @Override
    public List<Graduate> getByYearBefore(String year) {
        return graduateRepository.findByYearBefore(year);
    }

    @Override
    public List<Graduate> getByYearAfter(String year) {


        return graduateRepository.findByYearAfter(year);
    }

    @Override
    public List<Graduate> getByType_of_courseStartingWith(String word) {
        return graduateRepository.findByTypeOfCourseStartingWith(word);
    }

    @Override
    public List<Graduate> getByType_of_courseEndingWith(String word) {
        return graduateRepository.findByTypeOfCourseEndingWith(word);
    }

    @Override
    public List<Graduate> getByType_of_courseContaining(String word) {
        return graduateRepository.findByTypeOfCourseContaining(word);
    }

    @Override
    public List<Graduate> getByType_of_courseNotContaining(String word) {
        return graduateRepository.findByTypeOfCourseNotContaining(word);
    }

    @Override
    public List<Graduate> getByNo_of_graduates(Long number) {
        return graduateRepository.findByNoOfGraduates(number);
    }

    @Override
    public List<Graduate> getByNo_of_graduatesLessThan(Long number) {
        return graduateRepository.findByNoOfGraduatesLessThan(number);
    }

    @Override
    public List<Graduate> getByNo_of_graduatesGreaterThan(Long number) {
        return graduateRepository.findByNoOfGraduatesGreaterThan(number);
    }

    @Override
    public List<Graduate> getBySexAndYear(String sex, String year) {
        return graduateRepository.findBySexAndYear(Enum.valueOf(Sex.class,sex),year);
    }

    @Override
    public List<Graduate> getBySexAndAndType_of_course(String sex, String course) {
        return graduateRepository.findBySexAndAndTypeOfCourse(Enum.valueOf(Sex.class,sex),course);
    }

    @Override
    public List<Graduate> getBySexAndAndNo_of_graduates(String sex, Long number) {
        return graduateRepository.findBySexAndAndNoOfGraduates(Enum.valueOf(Sex.class,sex),number);
    }

    @Override
    public List<Graduate> getByYearAndType_of_course(String year, String course) {
        return graduateRepository.findByYearAndTypeOfCourse(year,course);
    }


}
