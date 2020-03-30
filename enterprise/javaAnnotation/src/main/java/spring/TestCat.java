package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCat {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext();
        ((AnnotationConfigApplicationContext) context).scan("spring");
        ((AnnotationConfigApplicationContext) context).refresh();//когда что-то изменяется
        Cat cat = context.getBean(Cat.class);
        System.out.println(cat.getKind() + ' '+ cat.getName());
        //((AnnotationConfigApplicationContext) context).close();

        AnnotationConfigApplicationContext contextDog = new AnnotationConfigApplicationContext(MyConfig.class);
        Dog dog = contextDog.getBean("dog",Dog.class);
        System.out.println(dog.getKind() + ' ' + dog.getName());
        //contextDog.close();

        ClassPathXmlApplicationContext contextTiger = new ClassPathXmlApplicationContext("config.xml");
        Tiger tiger = contextTiger.getBean("tiger",Tiger.class);
        System.out.println(tiger.getAction());
        //contextTiger.close();
    }
}
