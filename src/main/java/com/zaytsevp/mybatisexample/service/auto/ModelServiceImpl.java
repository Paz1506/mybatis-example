package com.zaytsevp.mybatisexample.service.auto;

import com.zaytsevp.mybatisexample.mapper.auto.ModelMapper;
import com.zaytsevp.mybatisexample.model.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Pavel Zaytsev
 */
@Service
public class ModelServiceImpl implements ModelService {

    private final ModelMapper modelMapper;

    @Autowired
    public ModelServiceImpl(ModelMapper modelMapper) {this.modelMapper = modelMapper;}

    @Override
    @Transactional(readOnly = true)
    public List<Model> getAll() {
        return modelMapper.getAll();
    }
}
