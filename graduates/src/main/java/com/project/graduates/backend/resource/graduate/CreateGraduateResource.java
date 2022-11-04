package com.project.graduates.backend.resource.graduate;

import com.project.graduates.backend.domain.model.enumaration.Sex;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class CreateGraduateResource {

    private Date year;


    private String type_of_course;


    private Long no_of_graduates;

}
