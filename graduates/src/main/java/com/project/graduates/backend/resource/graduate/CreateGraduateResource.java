package com.project.graduates.backend.resource.graduate;

import com.project.graduates.backend.domain.model.enumaration.Sex;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;

@Getter
@Setter
public class CreateGraduateResource {

    private String year;


    private String typeOfCourse;


    private Long noOfGraduates;

    private Sex sex;

}
