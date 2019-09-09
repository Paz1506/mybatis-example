package com.zaytsevp.mybatisexample.config;

import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * Created by Pavel Zaytsev
 */
@Configuration
public class MyBatisConfig {

    @Value("${spring.datasource.hikari.username}")
    private String username;

    @Value("${spring.datasource.hikari.password}")
    private String password;

    @Value("${spring.datasource.hikari.jdbc-url}")
    private String url;

    @Value("${spring.datasource.hikari.driver-class-name}")
    private String driver;

    @Bean
    public DataSource dataSource() {
        return new PooledDataSource(driver, url, username, password);
    }

    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(dataSource());
        return factoryBean.getObject();
    }
}