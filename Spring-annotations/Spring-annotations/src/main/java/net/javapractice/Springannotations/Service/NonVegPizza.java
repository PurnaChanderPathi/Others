package net.javapractice.Springannotations.Service;

public class NonVegPizza implements  Pizza{
    @Override
    public String getPizza()
    {
        return "NonVegPizza!";
    }

}
