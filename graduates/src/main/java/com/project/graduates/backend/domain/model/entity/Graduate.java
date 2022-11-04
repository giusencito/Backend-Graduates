package com.project.graduates.backend.domain.model.entity;

import com.project.graduates.backend.domain.model.enumaration.Sex;
import lombok.Getter;
import lombok.Setter;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import javax.persistence.*;
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
    @Temporal(TemporalType.DATE)
    private Date year;

    @Enumerated(EnumType.STRING)
    private Sex sex;

    @NotNull
    @Column(unique = true)
    private String type_of_course;

    @NotNull
    private Long no_of_graduates;
}
