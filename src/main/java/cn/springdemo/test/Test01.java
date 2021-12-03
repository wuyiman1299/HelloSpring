package cn.springdemo.test;

import cn.springdemo.HelloSpring;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "context.xml");
        // 通过ApplicationContext的getBean()方法，根据id来获取bean的实例
        HelloSpring helloSpring = (HelloSpring) context.getBean("helloSpring");
        // 执行print()方法
        helloSpring.print();

    }
}
