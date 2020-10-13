package com.oy.kevin.config;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Kevin on 2020/9/28
 */

/**
 * @Description: implements TypeHandler 顶级接口
 * @Param:
 * @Author: Kevin
 * @Date: 2020/9/28
 */
public class MybatisTypeHandler extends BaseTypeHandler<Boolean> {
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, Boolean aBoolean, JdbcType jdbcType) throws SQLException {
        if (aBoolean) {
            preparedStatement.setInt(i, 1);
        } else {
            preparedStatement.setInt(i, 0);
        }
    }

    public Boolean getNullableResult(ResultSet resultSet, String s) throws SQLException {
        int anInt = resultSet.getInt(s);
        return anInt == 1 ? true : false;
    }

    public Boolean getNullableResult(ResultSet resultSet, int i) throws SQLException {
        int anInt = resultSet.getInt(i);
        return anInt == 1 ? true : false;
    }

    /**
     * @Description: 存储过程获取
     * @Param:
     * @Author: Kevin
     * @Date: 2020/9/28 
     */
    public Boolean getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        int anInt = callableStatement.getInt(i);
        return anInt == 1 ? true : false;
    }
}
