package spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value="spring")
public class MyConfiguration {

    @Bean
    public Audi beanAudi(){
        return new Audi();
    }
    @Bean
    public Bmw beanBmw(){
        return new Bmw();
    }
    @Bean
    public Fiat beanFiat(){
        return new Fiat();
    }
}
