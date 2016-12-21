package com.tacademy.sam.controller;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;


@WebListener
public class MySessionListener implements HttpSessionListener {


    public void sessionCreated(HttpSessionEvent event)  { 
         String id = event.getSession().getId();
         System.out.println("세션 시작 id : " + id);
    }


    public void sessionDestroyed(HttpSessionEvent event)  { 
        String id = event.getSession().getId();
        System.out.println("세션 종료 id : " + id);
    }
	
}
