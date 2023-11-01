package net.javapractice.Springannotations.Service;

import org.springframework.stereotype.Service;

@Service
public class MyService {
    public String Hello()
    {
        return "Hello Service";
    }
}
