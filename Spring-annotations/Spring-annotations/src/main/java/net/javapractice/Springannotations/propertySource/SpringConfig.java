package net.javapractice.Springannotations.propertySource;

import jakarta.annotation.Resource;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

import java.nio.file.Path;

@Configuration
//@PropertySource("classpath:mail.properties")
//@PropertySource("classpath:message.properties")
@PropertySources({
      @PropertySource("classpath:mail.properties") ,
      @PropertySource("classpath:message.properties")
})
public class SpringConfig {

}
