package com.project.graduates.backend.domain.model.entity;

import com.project.graduates.backend.domain.model.enumaration.Sex;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;


@Getter
@Setter
@Entity
@Table(name = "graduates")
public class Graduate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String year;

    @Enumerated(EnumType.STRING)
    private Sex sex;

    @NotNull
    private String typeOfCourse;

    @NotNull
    private Long noOfGraduates;
}
