/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ramneek.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;



/**
 * Main entry point.
 *
 * @author kalra
 */
public class mainEntryPoint implements EntryPoint {

    /**
     * Creates a new instance of mainEntryPoint
     */
    public mainEntryPoint() {
    }

    /**
     * The entry point method, called automatically by loading a module that
     * declares an implementing class as an entry-point
     */
    public void onModuleLoad() {
        
        final Button button = new Button("Submit Details");
        final TextBox text = new TextBox();
        final TextBox text1 = new TextBox();
        
        text.setFocus(true);
        
        final Label l = new Label("Enter your Name:");
        final Label l1 = new Label("Enter your Class:");
        final Label ld = new Label();
        final Label ld1 = new Label();
        
        final DialogBox d = new DialogBox();
        d.setAnimationEnabled(true);
        
        
        button.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                String name = text.getText();
                String className = text1.getText();
                ld.setText(name);
                d.add(ld);
                ld1.setText(className);
                d.add(ld1);
                d.show();
                
            }
        });
        
        RootPanel.get().add(l);
        RootPanel.get().add(text);
        RootPanel.get().add(l1);
        RootPanel.get().add(text1);
        
        RootPanel.get().add(button);
        
        
    }
}
