package com.project.graduates.backend.api;

import com.project.graduates.backend.domain.service.GraduateService;
import com.project.graduates.backend.mapping.GraduateMapper;
import com.project.graduates.backend.resource.graduate.GraduateResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/graduates/courses")
public class GraduateCourseController {
    @Autowired
    private GraduateService graduateService;

    @Autowired
    private GraduateMapper mapper;


    @GetMapping("courseStartWith/{course}")
    public Page<GraduateResource> getByType_of_courseStartingWith(@PathVariable("course") String course, Pageable pageable) {
        return mapper.modelListToPage(graduateService.getByType_of_courseStartingWith(course), pageable);
    }
    @GetMapping("courseEndsWith/{course}")
    public Page<GraduateResource> getByType_of_courseEndingWith(@PathVariable("course") String course,Pageable pageable) {
        return mapper.modelListToPage(graduateService.getByType_of_courseEndingWith(course), pageable);
    }
    @GetMapping("courseContaining/{course}")
    public Page<GraduateResource> getByType_of_courseContaining(@PathVariable("course") String course,Pageable pageable) {
        return mapper.modelListToPage(graduateService.getByType_of_courseContaining(course), pageable);
    }
    @GetMapping("courseNotContaining/{course}")
    public Page<GraduateResource> getByType_of_courseNotContaining(@PathVariable("course") String course,Pageable pageable) {
        return mapper.modelListToPage(graduateService.getByType_of_courseNotContaining(course), pageable);
    }

}
