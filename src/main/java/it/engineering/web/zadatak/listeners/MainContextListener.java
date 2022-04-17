package it.engineering.web.zadatak.listeners;

import java.util.ArrayList;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import it.engineering.web.zadatak.dto.UserDTO;

/**
 * Application Lifecycle Listener implementation class MainContextListener
 *
 */
public class MainContextListener implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public MainContextListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce)  { 
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  { 
         sce.getServletContext().setAttribute("loggedInUsers", new ArrayList<UserDTO>());
    }
    
    
	
}
