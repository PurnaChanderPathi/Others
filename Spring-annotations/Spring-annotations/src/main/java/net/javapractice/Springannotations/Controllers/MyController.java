package net.javapractice.Springannotations.Controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public String Hello()
    {
        return "Hello Controller";
    }
}
