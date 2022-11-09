package com.project.graduates.backend.domain.persistence;

import com.project.graduates.backend.domain.model.entity.Graduate;
import com.project.graduates.backend.domain.model.enumaration.Sex;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface GraduateRepository extends JpaRepository<Graduate,Long> {

    List<Graduate> findBySex(Sex sex);
    List<Graduate> findByYear(String year);
    List<Graduate> findByYearBetween(String year1,String year2);
    List<Graduate>findByYearBefore(String year);
    List<Graduate>findByYearAfter(String year);
    List<Graduate> findByTypeOfCourseStartingWith(String word);
    List<Graduate> findByTypeOfCourseEndingWith(String word);
    List<Graduate> findByTypeOfCourseContaining(String word);
    List<Graduate> findByTypeOfCourseNotContaining(String word);

    List<Graduate>findByNoOfGraduates(Long number);
    List<Graduate>findByNoOfGraduatesLessThan(Long number);
    List<Graduate>findByNoOfGraduatesGreaterThan(Long number);

    List<Graduate>findBySexAndYear(Sex sex,String year);
    List<Graduate>findBySexAndAndTypeOfCourse(Sex sex,String course);
    List<Graduate>findBySexAndAndNoOfGraduates(Sex sex,Long number);
    List<Graduate>findByYearAndTypeOfCourse(String year,String course);


}
