package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan({"com.oldwu.dao","com.oldwu.mapper","com.netmusic.dao","com.miyoushe.mapper"})
public class AutoPlanApplication {

    public static void main(String[] args) {
        SpringApplication.run(AutoPlanApplication.class, args);
    }

}
