package net.javapractice.Springannotations.Service;

public class VegPizza implements Pizza {
    @Override
    public String getPizza()
    {
        return "VegPizza";
    }
}
