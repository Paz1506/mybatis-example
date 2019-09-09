package com.zaytsevp.mybatisexample.config;

import com.zaytsevp.mybatisexample.service.auto.AutoMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.mapper.MapperFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Pavel Zaytsev
 */
@Configuration
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
}
