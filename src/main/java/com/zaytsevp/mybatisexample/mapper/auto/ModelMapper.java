package com.zaytsevp.mybatisexample.mapper.auto;

import com.zaytsevp.mybatisexample.config.handlers.UUIDTypeHandler;
import com.zaytsevp.mybatisexample.model.Auto;
import com.zaytsevp.mybatisexample.model.Model;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

import java.util.List;
import java.util.UUID;

/**
 * Created by Pavel Zaytsev
 */
public interface ModelMapper {

    @Select("SELECT * FROM MODEL")
    @Results({
                     @Result(column = "id", property = "id", jdbcType = JdbcType.VARCHAR, javaType = UUID.class, typeHandler = UUIDTypeHandler.class),
                     @Result(property = "auto", column = "auto_id", one = @One(select = "getAutoById"))
             })
    List<Model> getAll();

    @Select("SELECT * FROM AUTO WHERE id = #{id}")
    @Results({
                     @Result(column = "id", property = "id", jdbcType = JdbcType.VARCHAR, javaType = UUID.class, typeHandler = UUIDTypeHandler.class)
             })
    Auto getAutoById(String id);

}
