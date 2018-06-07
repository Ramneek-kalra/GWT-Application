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
import com.google.gwt.user.client.ui.RootPanel;
import javax.swing.JOptionPane;

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
        
        final Button button = new Button("Click Me!");
        
        button.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                Window.alert("You are in GWT Application");
            }
        });
        RootPanel.get().add(button);
        
    }
}
