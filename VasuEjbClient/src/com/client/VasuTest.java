package com.client;

import java.util.*;
import javax.naming.*;
import javax.ejb.*;
import com.vasu.HelloWorld;
import com.vasu.HelloWorldBean;

public class VasuTest {

	public static void main(String[] args) {           
		try{   
			System.out.println("Hello From EJB Client...");
		    Properties props = new Properties();
	        props.put("java.naming.factory.url.pkgs","org.jboss.ejb.client.naming");
	        InitialContext context = new InitialContext(props);
 
	        String appName = "";        	 
	        String moduleName = "VasuEjbProject";
	        String distinctName = "";        	 
	        String beanName = HelloWorldBean.class.getSimpleName();        	 
	        String interfaceName = HelloWorld.class.getName();
	        String name = "ejb:" + appName + "/" + moduleName + "/" +  distinctName    + "/" + beanName + "!" + interfaceName;
	        System.out.println(name);
	        HelloWorld bean = (HelloWorld)context.lookup(name);
	        String result=bean.sayHello();
	        System.out.println("Result From EJB is :"+result); 	        
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
