package com.zaytsevp.mybatisexample.service.auto;

import com.zaytsevp.mybatisexample.config.handlers.UUIDTypeHandler;
import com.zaytsevp.mybatisexample.model.Auto;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

import java.util.UUID;

/**
 * Created by Pavel Zaytsev
 */
public interface AutoMapper {

    @Select("SELECT * FROM AUTO WHERE id = #{id}")
    @Results({
                     @Result(column = "id", property = "id", jdbcType = JdbcType.VARCHAR, javaType = UUID.class, typeHandler = UUIDTypeHandler.class)
             })
    Auto getById(@Param("id") String id);
}
