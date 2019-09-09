package com.zaytsevp.mybatisexample.api;

import com.zaytsevp.mybatisexample.model.Auto;
import com.zaytsevp.mybatisexample.service.auto.AutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

/**
 * Created by Pavel Zaytsev
 */
@RestController
@RequestMapping("/autos")
public class AutoController {

    private final AutoService autoService;

    @Autowired
    public AutoController(AutoService autoService) {this.autoService = autoService;}

    @GetMapping("/{id}")
    public Auto getById(@PathVariable("id") UUID id) {
        return autoService.getById(id);
    }

    @GetMapping("/all")
    public List<Auto> getAll() {
        return autoService.getAll();
    }

    @PostMapping("delete/{id}")
    public void deleteById(@PathVariable("id") UUID id) {
        autoService.deleteById(id);
    }
}
