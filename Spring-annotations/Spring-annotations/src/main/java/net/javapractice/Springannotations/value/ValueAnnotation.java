package net.javapractice.Springannotations.value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ValueAnnotation {
    @Value("Purnachander")
    private String defaultName;
    @Value("${mail.host}")
    private String host;
    @Value("${mail.email}")
    private  String email;
    @Value("${mail.password}")
    private String password;
    @Value("${java.home}")
    private String javaHome;

    public String getHost() {
        return host;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getJavaHome() {
        return javaHome;
    }


    public String getDefaultName() {
        return defaultName;


    }
}
