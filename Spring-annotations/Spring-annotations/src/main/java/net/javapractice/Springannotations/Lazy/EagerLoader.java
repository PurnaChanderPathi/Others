package net.javapractice.Springannotations.Lazy;

import org.springframework.stereotype.Component;

@Component
public class EagerLoader {
    public EagerLoader()
    {
        System.out.println("EagerLoader");
    }
}
