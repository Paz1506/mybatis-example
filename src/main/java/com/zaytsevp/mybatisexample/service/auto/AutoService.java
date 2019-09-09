package com.zaytsevp.mybatisexample.service.auto;

import com.zaytsevp.mybatisexample.model.Auto;

import java.util.List;
import java.util.UUID;

/**
 * Created by Pavel Zaytsev
 */
public interface AutoService {

    Auto getById(UUID id);

    List<Auto> getAll();

    void deleteById(UUID id);
}
