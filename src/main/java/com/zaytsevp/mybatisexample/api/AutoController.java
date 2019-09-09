package com.zaytsevp.mybatisexample.api;

import com.zaytsevp.mybatisexample.model.Auto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * Created by Pavel Zaytsev
 */
@RestController
@RequestMapping("/autos")
public class AutoController {

    @GetMapping("/{id}")
    public Auto getById(@PathVariable("id") UUID id) {
        return null;
    }
}
