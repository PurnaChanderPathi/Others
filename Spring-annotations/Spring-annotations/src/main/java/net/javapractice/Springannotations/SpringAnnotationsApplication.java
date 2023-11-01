package net.javapractice.Springannotations;

import net.javapractice.Springannotations.Controllers.MyController;
import net.javapractice.Springannotations.Controllers.PizzaController;
import net.javapractice.Springannotations.Lazy.LazyLoader;
import net.javapractice.Springannotations.Repository.MyRepository;
import net.javapractice.Springannotations.Service.MyService;
import net.javapractice.Springannotations.Service.VegPizza;
import net.javapractice.Springannotations.propertySource.PropertySourceDemo;
import net.javapractice.Springannotations.scope.ProtoTypeBean;
import net.javapractice.Springannotations.scope.SingletonBean;
import net.javapractice.Springannotations.value.ValueAnnotation;
import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.xml.namespace.QName;


@SpringBootApplication
public class SpringAnnotationsApplication {

	public static void main(String[] args) {

		var context= SpringApplication.run(SpringAnnotationsApplication.class, args);
//		PizzaController pizzaController= (PizzaController) context.getBean("pizzaController");
//		System.out.println(pizzaController.getPizza());

		PropertySourceDemo propertySourceDemo=context.getBean(PropertySourceDemo.class);
		System.out.println(propertySourceDemo.getHost());
		System.out.println(propertySourceDemo.getEmail());
		System.out.println(propertySourceDemo.getPassword());
		System.out.println(propertySourceDemo.getDescription());
		System.out.println(propertySourceDemo.getName());



//		SingletonBean singletonBean1=context.getBean(SingletonBean.class);
//			System.out.println(singletonBean1.hashCode());
//
//
//		ProtoTypeBean protoTypeBean1=context.getBean(ProtoTypeBean.class);
//		System.out.println(protoTypeBean1.hashCode());
//
//		ProtoTypeBean protoTypeBean2=context.getBean(ProtoTypeBean.class);
//		System.out.println(protoTypeBean2.hashCode());
//
//		ProtoTypeBean protoTypeBean3=context.getBean(ProtoTypeBean.class);
//		System.out.println(protoTypeBean3.hashCode());
//
//		ValueAnnotation valueAnnotation=context.getBean(ValueAnnotation.class);
//		System.out.println(valueAnnotation.getDefaultName());
//		System.out.println(valueAnnotation.getHost());
//		System.out.println(valueAnnotation.getEmail());
//		System.out.println(valueAnnotation.getPassword());
//		System.out.println(valueAnnotation.getJavaHome());








//		MyController myController=context.getBean(MyController.class);
//		System.out.println(myController.Hello());
//
//		MyService myService=context.getBean(MyService.class);
//		System.out.println(myService.Hello());
//
//		MyRepository myRepository=context.getBean(MyRepository.class);
//		System.out.println(myRepository.hello());
//
//		LazyLoader lazyLoader=context.getBean(LazyLoader.class);


//		VegPizza vegPizza= (VegPizza) context.getBean("vegPizza");
//		System.out.println(vegPizza.getPizza());
	}

}


