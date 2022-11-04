package com.project.graduates.backend.mapping;

import com.project.graduates.backend.domain.model.entity.Graduate;
import com.project.graduates.backend.resource.graduate.CreateGraduateResource;
import com.project.graduates.backend.resource.graduate.GraduateResource;
import com.project.graduates.backend.resource.graduate.UpdateGraduateResource;
import com.project.graduates.shared.mapping.EnhancedModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import java.util.List;
public class GraduateMapper {

    EnhancedModelMapper mapper;

    public GraduateResource toResource(Graduate model) {
        return mapper.map(model, GraduateResource.class);
    }

    public Page<GraduateResource> modelListToPage(List<Graduate> modelList, Pageable pageable) {
        return new PageImpl<>(mapper.mapList(modelList, GraduateResource.class), pageable, modelList.size());
    }
    public Graduate toModel(CreateGraduateResource resource) {
        return mapper.map(resource, Graduate.class);
    }

    public Graduate toModel(UpdateGraduateResource resource) {
        return mapper.map(resource, Graduate.class);
    }

}
