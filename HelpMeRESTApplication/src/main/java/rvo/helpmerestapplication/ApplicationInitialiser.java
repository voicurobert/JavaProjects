/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rvo.helpmerestapplication;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 *
 * @author Robert
 */

@WebListener
public class ApplicationInitialiser implements ServletContextListener{

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println( "Application started..." );
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println( "Application ended..." );
    }
    
}
