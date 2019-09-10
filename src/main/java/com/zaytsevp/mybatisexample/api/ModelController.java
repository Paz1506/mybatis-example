package com.zaytsevp.mybatisexample.api;

import com.zaytsevp.mybatisexample.model.Model;
import com.zaytsevp.mybatisexample.service.auto.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Pavel Zaytsev
 */
@RestController
@RequestMapping("/models")
public class ModelController {

    private final ModelService modelService;

    @Autowired
    public ModelController(ModelService modelService) {this.modelService = modelService;}

    @GetMapping("/all")
    public List<Model> getAll() {
        return modelService.getAll();
    }
}
