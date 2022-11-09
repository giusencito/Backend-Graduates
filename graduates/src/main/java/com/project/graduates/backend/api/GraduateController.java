package com.project.graduates.backend.api;


import com.project.graduates.backend.domain.service.GraduateService;
import com.project.graduates.backend.mapping.GraduateMapper;
import com.project.graduates.backend.resource.graduate.CreateGraduateResource;
import com.project.graduates.backend.resource.graduate.GraduateResource;
import com.project.graduates.backend.resource.graduate.UpdateGraduateResource;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.data.domain.Pageable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/graduatesCrud")
public class GraduateController {

    @Autowired
    private GraduateService graduateService;

    @Autowired
    private GraduateMapper mapper;

    @GetMapping
    public Page<GraduateResource> getAll(Pageable pageable) {
        return mapper.modelListToPage(graduateService.getAll(), pageable);
    }
    @GetMapping("{graduateId}")
    public GraduateResource getById(@PathVariable("graduateId") Long graduateId) {
        return mapper.toResource(graduateService.getById(graduateId));
    }
    @GetMapping("sex/{sexName}")
    public Page<GraduateResource> getBySex(@PathVariable("sexName") String sexName,Pageable pageable) {
        return mapper.modelListToPage(graduateService.getBySex(sexName), pageable);
    }


    @GetMapping("getSexAndYear/{sex}/{year}")
    public Page<GraduateResource> getBySexAndYear(@PathVariable("sex") String sex,@PathVariable("year") String year,Pageable pageable) {
        return mapper.modelListToPage(graduateService.getBySexAndYear(sex, year), pageable);
    }
    @GetMapping("getSexAndCourse/{sex}/{course}")
    public Page<GraduateResource> getBySexAndAndType_of_course(@PathVariable("sex") String sex,@PathVariable("course") String course,Pageable pageable) {
        return mapper.modelListToPage(graduateService.getBySexAndAndType_of_course(sex, course), pageable);
    }
    @GetMapping("getSexAndNumber/{sex}/{number}")
    public Page<GraduateResource> getBySexAndAndNo_of_graduates(@PathVariable("sex") String sex,@PathVariable("number") Long number,Pageable pageable) {
        return mapper.modelListToPage(graduateService.getBySexAndAndNo_of_graduates(sex, number), pageable);
    }
    @GetMapping("getSeYearAndCourse/{year}/{course}")
    public Page<GraduateResource> getByYearAndType_of_course(@PathVariable("year") String year,@PathVariable("course") String course,Pageable pageable) {
        return mapper.modelListToPage(graduateService.getByYearAndType_of_course(year, course), pageable);
    }
    @PostMapping
    public GraduateResource create(@RequestBody CreateGraduateResource request) {

        return mapper.toResource(graduateService.create(mapper.toModel(request)));
    }
    @PutMapping("{graduateId}")
    public GraduateResource update(@PathVariable Long graduateId, @RequestBody UpdateGraduateResource request) {
        return mapper.toResource(graduateService.update(graduateId, mapper.toModel(request)));
    }
    @DeleteMapping("{graduateId}")
    public ResponseEntity<?> delete(@PathVariable Long graduateId) {
        return graduateService.delete(graduateId);
    }


}
