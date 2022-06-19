package com.atguigu.boot;

import com.atguigu.boot.bean.Pet;
import com.atguigu.boot.bean.User;
import com.atguigu.boot.config.MyConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Configuration;

import java.beans.Encoder;


@SpringBootApplication
public class MainApplication {
    public static void main(String[] args){
        // 1. return IoC container
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class,args);

        // 2. 查看容器中的组件
        String[] names = run.getBeanDefinitionNames();
        for(String name:names){
            System.out.println("--"   + name);
        }

        // 3. 从容器中获取组件，组件是单实例的
//        Pet tom01 = run.getBean("tom", Pet.class);
//        Pet tom02 = run.getBean("tom", Pet.class);
//        System.out.println("beans " + (tom01 == tom02));
//
//        // 4. 获取的本身是代理对象
//        // com.atguigu.boot.config.MyConfig$$EnhancerBySpringCGLIB$$7e6d878@574b7f4a
//        MyConfig bean = run.getBean(MyConfig.class);
//        System.out.println(bean);
//
//        // 如果@Configuration(proxyBeanMethods = true)，获取的就是代理对象
//        //外部无论对配置类中的这个组件注册方法调用多少次，获取的都是之前注册容器中的单实例对象，
//        // spring boot 总会检查这个组件在容器中是否有，保持组件单实例（有就不会新创）
//        User user1 = bean.user01();
//        User user2 = bean.user01();
//        System.out.println(user1 == user2);   //return true;
//
//        User user01 = run.getBean("user01",User.class);
//        Pet tom = run.getBean("tom", Pet.class);
//        System.out.println("user's pet " + (user01.getPet() == tom));
//
//        // 获取组件
//
//        String[] beanNamesForType = run.getBeanNamesForType(User.class);
//        System.out.println("======");
//        for(String name: beanNamesForType){
//            System.out.println(name);
//        }
//
//        Encoder bean1 = run.getBean(Encoder.class);
//        System.out.println(bean1);

        boolean tom = run.containsBean("tom");
        System.out.println("contains bean: " + tom);

        boolean user = run.containsBean("user01");
        System.out.println("contains bean: " + user);
    }
}
