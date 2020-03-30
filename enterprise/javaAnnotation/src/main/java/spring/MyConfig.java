package spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean (name ="dog")
    public Dog beanDog(){
        return new Dog();
    }
}
