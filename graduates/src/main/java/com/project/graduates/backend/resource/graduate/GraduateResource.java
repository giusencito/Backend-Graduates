package com.project.graduates.backend.resource.graduate;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.project.graduates.backend.domain.model.enumaration.Sex;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Getter
@Setter
public class GraduateResource {


    private Long id;


    private String year;


    private Sex sex;


    private String type_of_course;


    private Long no_of_graduates;

}
