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
@RequestMapping("/api/v1/graduates/years")
public class GraduateYearController {
    @Autowired
    private GraduateService graduateService;

    @Autowired
    private GraduateMapper mapper;

    @GetMapping("{year}")
    public Page<GraduateResource> getByYear(@PathVariable("year") String year, Pageable pageable) {
        return mapper.modelListToPage(graduateService.getByYear(year), pageable);
    }
    @GetMapping("betweenYear/{year1}/{year2}")
    public Page<GraduateResource> getByBetweenYear(@PathVariable("year1") String year1,@PathVariable("year2") String year2,Pageable pageable) {
        return mapper.modelListToPage(graduateService.getByYearBetween(year1,year2), pageable);
    }
    @GetMapping("beforeYear/{year}")
    public Page<GraduateResource> getByBeforeYear(@PathVariable("year") String year,Pageable pageable) {
        return mapper.modelListToPage(graduateService.getByYearBefore(year), pageable);
    }
    @GetMapping("afterYear/{year}")
    public Page<GraduateResource> getByAfterYear(@PathVariable("year") String year,Pageable pageable) {
        return mapper.modelListToPage(graduateService.getByYearAfter(year), pageable);
    }




}
