package com.project.graduates.backend.resource.graduate;


import com.project.graduates.backend.domain.model.enumaration.Sex;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateGraduateResource {

    private String year;


    private String typeOfCourse;


    private Long noOfGraduates;

    private Sex sex;

}
