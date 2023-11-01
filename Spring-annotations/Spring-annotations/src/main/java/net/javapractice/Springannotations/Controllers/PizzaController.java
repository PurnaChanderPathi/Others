package net.javapractice.Springannotations.Controllers;

import net.javapractice.Springannotations.Service.Pizza;
import net.javapractice.Springannotations.Service.VegPizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class PizzaController {

    public Pizza pizza;
//@Autowired
    public PizzaController(Pizza pizza)
    {
        this.pizza=pizza;
    }

//@Autowired
//    public void setVegPizza(VegPizza vegPizza) {
//        this.vegPizza = vegPizza;
//    }

    public String getPizza()
    {
        return  pizza.getPizza();
    }

    public void inti()
    {
        System.out.println("System Initialization");
    }

    public void destroy()
    {
        System.out.println("System Destroy");
    }
}
