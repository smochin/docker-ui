package com.smochin.docker.ui.controller;

import com.smochin.docker.ui.ScreenChooser;

public abstract class DefaultController {

    public DefaultController() {
        
    }
    
    public ScreenChooser getScreenChooser() {
        return (ScreenChooser)ScreensManager.getInstance();
    }
    
}
