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
@RequestMapping("/api/v1/graduates/numbers")
public class GraduateNumberController {

    @Autowired
    private GraduateService graduateService;

    @Autowired
    private GraduateMapper mapper;

    @GetMapping("noGraduates/{number}")
    public Page<GraduateResource> getByNo_of_graduates(@PathVariable("number") Long number, Pageable pageable) {
        return mapper.modelListToPage(graduateService.getByNo_of_graduates(number), pageable);
    }

    @GetMapping("noGraduatesLess/{number}")
    public Page<GraduateResource> getByNo_of_graduatesLessThan(@PathVariable("number") Long number,Pageable pageable) {
        return mapper.modelListToPage(graduateService.getByNo_of_graduatesLessThan(number), pageable);
    }

    @GetMapping("noGraduatesGreather/{number}")
    public Page<GraduateResource> getByNo_of_graduatesGreaterThan(@PathVariable("number") Long number,Pageable pageable) {
        return mapper.modelListToPage(graduateService.getByNo_of_graduatesGreaterThan(number), pageable);
    }



}
