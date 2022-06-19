package com.atguigu.boot.bean;

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data    //getter(), setter()
@ToString
@Component   //把Car加在容器中
@ConfigurationProperties(prefix = "mycar")
public class Car {
    private String brand;
    private Integer price;


}
