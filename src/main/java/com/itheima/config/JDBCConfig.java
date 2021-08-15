package com.itheima.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class JDBCConfig {
    /*提供datasource对象*/
    /*下面这个注解 他就变成了bean   注解开发*/
    @Bean("dataSource")
    public static DruidDataSource getDataSource(){
        DruidDataSource ds = new DruidDataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/spring_db");
        ds.setUsername("root");
        ds.setPassword("root");
        return ds;
    }
}
