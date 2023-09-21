package org.shameenakoodan.LoginHibernateDemo;

import java.util.List;

import com.shameenakoodan.LoginHibernateDemo.controller.LoginController;
import com.shameenakoodan.LoginHibernateDemo.model.User;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        LoginController loginController = new LoginController();
        if(loginController.login("haseeb@gmail.com", "has123"))
        	System.out.println("Email and password  present");
        else {
			System.out.println("No matching fields present");
		}
        User user = loginController.findByEmail("haseeb@gmail.com");
        System.out.println(user.getAddress()+" | "+ user.getEmail() + " | " + 
        user.getState() + " | ");
        List<User> resultList = loginController.findUsersByZipcode("75068");
        System.out.println(resultList.size());
        //loginController.createTable();
        
    }
}
