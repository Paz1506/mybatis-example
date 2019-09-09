package com.zaytsevp.mybatisexample.mapper.auto;

import com.zaytsevp.mybatisexample.config.handlers.UUIDTypeHandler;
import com.zaytsevp.mybatisexample.model.Auto;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;
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

    @Select("SELECT * FROM AUTO")
    List<Auto> getAll();

    @Delete("DELETE FROM AUTO WHERE id = #{id}")
    void deleteById(@Param("id") String id);
}
