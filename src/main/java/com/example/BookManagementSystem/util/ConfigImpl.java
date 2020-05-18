package com.example.BookManagementSystem.util;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.springframework.stereotype.Component;

@Component
public class ConfigImpl implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("Start Initialization");
		Config.getInstance();
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("Start Destroyed");
	}

}
