package com.math.springframework;

import com.math.springframework.config.ConstructorPropertiesConfig;
import com.math.springframework.config.PropertiesConfig;
import com.math.springframework.controllers.*;
import com.math.springframework.prop.Property;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringFrameworkApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringFrameworkApplication.class, args);

//		MyController myController = (MyController) ctx.getBean("myController");
//
//		System.out.println(myController.getGreeting());

		PropertyInjector propertyInjected = (PropertyInjector) ctx.getBean("propertyInjector");

		System.out.println(propertyInjected.getGreeting());

		System.out.println("-------Setter---------");

		SetterInjector setterInjector = (SetterInjector) ctx.getBean("setterInjector");

		System.out.println(setterInjector.getGreeting());

		System.out.println("-------Constructor---------");

		ConstructorInjector constructorInjector = (ConstructorInjector) ctx.getBean("constructorInjector");

		System.out.println(constructorInjector.getGreeting());

		PrimaryController primaryController = (PrimaryController) ctx.getBean("primaryController");

		System.out.println(primaryController.getGreeting());

		I8NController i8NController = (I8NController) ctx.getBean("i8NController");

		System.out.println(i8NController.getGreeting());

		Property property = (Property) ctx.getBean("property");

		System.out.println(property.getName() + "-" + property.getPassword() + "-" + property.getPermission());

		System.out.println("-----------Properties binding--------------");

		PropertiesConfig propertiesConfig = ctx.getBean(PropertiesConfig.class);

		System.out.println(propertiesConfig.getUsername());
		System.out.println(propertiesConfig.getPassword());
		System.out.println(propertiesConfig.getPermission());

		System.out.println("-----------Constructor Properties binding--------------");

		ConstructorPropertiesConfig constructorPropertiesConfig = ctx.getBean(ConstructorPropertiesConfig.class);

		System.out.println(constructorPropertiesConfig.getUsername());
		System.out.println(constructorPropertiesConfig.getPassword());
		System.out.println(constructorPropertiesConfig.getPermission());
	}

}
