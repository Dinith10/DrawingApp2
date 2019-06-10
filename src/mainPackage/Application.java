package mainPackage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        context.registerShutdownHook();
//        Triangle triangle = (Triangle) context.getBean("triangle");
//
//        triangle.draw();

        Shape shape = (Shape) context.getBean("circle");
        shape.draw(); System.out.println(shape.getClass());


    }



    }







