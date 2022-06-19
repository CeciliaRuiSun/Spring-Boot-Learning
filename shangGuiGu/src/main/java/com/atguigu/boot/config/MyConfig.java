package com.atguigu.boot.config;

import com.atguigu.boot.bean.Car;
import com.atguigu.boot.bean.Pet;
import com.atguigu.boot.bean.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import java.beans.Encoder;

/**
1.配置类上用@bean标注在方法上给容器配置组件，默认也是单实例的
2.配置类本身也是一个组件
3.proxyBeanMethods: 代理@bean的方法
    Full(proxyBeanMethods = true)
    Lite(proxyBeanMethods = false)
    组件依赖
 4. @Import({User.class, Encoder.class})
    给容器中自动创建出这两个类型的组件，默认组件的名字为全类名 com.atguigu.boot.bean.User
 5. @ImportResource("classpath:beans.xml")导入spring的配置文件

 */

@Import({User.class, Encoder.class})
@Configuration (proxyBeanMethods = false) //告诉spring boot这是一个配置类 == 配置文件
@EnableConfigurationProperties(Car.class)
// 开启Car配置绑定功能
// 把Car这个组件自动注册到容器中
public class MyConfig {
    /*
      only valid(create user bean) when there is a "tom" bean,
      can also be placed on top of the class
     */
    @ConditionalOnBean(name = "tom")
    @Bean  //给容器中添加组件。以方法名为组件的id。返回类型就是组件类型，返回值为组件在容器中的实例
    public User user01(){
        User zhangSan =  new User("Zhangshan", 18);
        //user组件依赖了pet组件
        zhangSan.setPet(tomcatPet());
        return zhangSan;
    }

//    @Bean ("tom")  // 给组件自定义名字为tom，取代tomcatPet
    public Pet tomcatPet(){
        return new Pet("Tom");
    }


}
