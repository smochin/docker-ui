package com.smochin.docker.ui;

import com.smochin.docker.ui.controller.ScreensManager;
import java.io.IOException;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;

public class ScreenLoader {
    private static ScreenLoader instance = null;

    private ScreenLoader() {
    }

    public static ScreenLoader getInstance() {
        if(Objects.isNull(instance)) {
            instance = new ScreenLoader();
        }
        return instance;
    }
    
    public ScreensManager getManager() {
        return ScreensManager.getInstance();
    }
    
    public void load() {
        
        Screens[] screens = Screens.values();
        for(Screens sc : screens) {
            try {
                Parent parent = FXMLLoader.load(getClass().getResource(sc.fxml));
                getManager().addScreen(sc.id, parent);
                
            } catch (IOException ex) {
                Logger.getLogger(ScreenLoader.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
