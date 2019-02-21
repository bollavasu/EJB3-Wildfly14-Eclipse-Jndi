package com.vasu;

import javax.ejb.Stateless;

/**
 * Session Bean implementation class HelloWorldBean
 */
@Stateless
public class HelloWorldBean implements HelloWorld {

    /**
     * Default constructor. 
     */
    public HelloWorldBean() {
        // TODO Auto-generated constructor stub
    }
    
    public String sayHello() {
    	
    	return "HELLO VASU, HOW ARE YOU ? ";
    }

}
