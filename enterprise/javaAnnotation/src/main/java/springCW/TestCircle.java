package springCW;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCircle {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("configCircle.xml");
        Circle circle = context.getBean("circle", Circle.class);
        Hourse hourse = context.getBean("house", Hourse.class);
        circle.perfomance();
    }
}
