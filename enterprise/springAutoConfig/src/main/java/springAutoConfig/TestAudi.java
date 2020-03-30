package springAutoConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAudi {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("springAutoConfig");
        Audi audi = context.getBean(Audi.class);
        System.out.println(audi.getModel());
        ((AnnotationConfigApplicationContext) context).close();
    }
}
