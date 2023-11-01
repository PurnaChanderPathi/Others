package net.javapractice.Springannotations.Config;

import net.javapractice.Springannotations.Controllers.PizzaController;
import net.javapractice.Springannotations.Service.NonVegPizza;
import net.javapractice.Springannotations.Service.Pizza;
import net.javapractice.Springannotations.Service.VegPizza;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
@Lazy
public class AppConfig {
    @Bean()
    public Pizza vegPizza()
    {
        return new VegPizza();
    }
@Bean
    public Pizza NonVegPizza()
    {
        return new NonVegPizza();
    }
@Bean(initMethod = "inti" , destroyMethod = "destroy")
    public PizzaController pizzaController()
    {
        return new PizzaController(NonVegPizza());
    }
}
