package com.smochin.docker.ui.controller;

import com.smochin.docker.ui.ScreenChooser;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import javafx.scene.Node;
import javafx.scene.Parent;

public class ScreensManager implements ScreenChooser {
    private static ScreensManager instance = null;
    private Map<String, Parent> screens = null;
    private Parent containerChooser = null;
    

    private ScreensManager() {
        screens = new HashMap<>();
    }

    public static ScreensManager getInstance() {
        if(Objects.isNull(instance)) {
            instance = new ScreensManager();
        }
        return instance;
    }
    
    public void addScreen(String name, Parent screen) {
        screens.put(name, screen);
    }

    @Override
    public void choose(String id) {
        
    }

    public void setContainerCooserFromScreen(String id, String seletor) {
        Node node = screens.get(id);
        
        containerChooser = (Parent) node.lookup(seletor);
        //containerChooser.setStyle("-fx-background-color: #FF0000");
    }

    public Parent getScreen(String id) {
        return screens.get(id);
    }
}
