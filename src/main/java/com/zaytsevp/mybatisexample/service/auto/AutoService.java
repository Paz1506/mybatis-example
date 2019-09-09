package com.zaytsevp.mybatisexample.service.auto;

import com.zaytsevp.mybatisexample.model.Auto;

import java.util.UUID;

/**
 * Created by Pavel Zaytsev
 */
public interface AutoService {

    Auto getById(UUID id);
}
