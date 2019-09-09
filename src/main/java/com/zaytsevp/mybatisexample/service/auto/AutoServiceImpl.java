package com.zaytsevp.mybatisexample.service.auto;

import com.zaytsevp.mybatisexample.mapper.auto.AutoMapper;
import com.zaytsevp.mybatisexample.model.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

/**
 * Created by Pavel Zaytsev
 */
@Service
public class AutoServiceImpl implements AutoService {

    private final AutoMapper autoMapper;

    @Autowired
    public AutoServiceImpl(AutoMapper autoMapper) {this.autoMapper = autoMapper;}

    @Override
    @Transactional(readOnly = true)
    public Auto getById(UUID id) {
        return autoMapper.getById(id.toString());
    }

    @Override
    @Transactional(readOnly = true)
    public List<Auto> getAll() {
        return autoMapper.getAll();
    }

    @Override
    @Transactional(isolation = Isolation.SERIALIZABLE)
    public void deleteById(UUID id) {
        autoMapper.deleteById(id.toString());

        // для демонстрации транзакционности\
        throw new RuntimeException("Проверяем транзакционность!");
    }
}
