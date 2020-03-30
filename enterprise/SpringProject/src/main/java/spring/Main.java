package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        /*ApplicationContext context = new AnnotationConfigApplicationContext("java.spring");
        Audi audi = context.getBean(Audi.class);
        Bmw bmw = context.getBean(Bmw.class);
        Fiat fiat = context.getBean("fiat",Fiat.class);
        audi.getNameAudi();
        bmw.getName();
        fiat.getName();*/
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);
        Audi audi = context.getBean(Audi.class);
        audi.getNameAudi();
    }
}
