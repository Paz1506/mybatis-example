package com.zaytsevp.mybatisexample.config;

import com.zaytsevp.mybatisexample.mapper.auto.AutoMapper;
import com.zaytsevp.mybatisexample.mapper.auto.ModelMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.mapper.MapperFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Pavel Zaytsev
 */
@Configuration
@MapperScan("com.zaytsevp.mybatisexample.mapper.*")
public class MapperConfig {

    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    @Bean
    public MapperFactoryBean autoMapper() {
        MapperFactoryBean<AutoMapper> autoMapperFactoryBean = new MapperFactoryBean<>();
        autoMapperFactoryBean.setSqlSessionFactory(sqlSessionFactory);
        autoMapperFactoryBean.setMapperInterface(AutoMapper.class);

        return autoMapperFactoryBean;
    }

    @Bean
    public MapperFactoryBean modelMapper() {
        MapperFactoryBean<ModelMapper> modelMapperFactoryBean = new MapperFactoryBean<>();
        modelMapperFactoryBean.setSqlSessionFactory(sqlSessionFactory);
        modelMapperFactoryBean.setMapperInterface(ModelMapper.class);

        return modelMapperFactoryBean;
    }
}
