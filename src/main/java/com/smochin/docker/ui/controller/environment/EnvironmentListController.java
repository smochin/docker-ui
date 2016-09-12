package com.smochin.docker.ui.controller.environment;

import com.smochin.docker.ui.controller.DefaultController;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;

public class EnvironmentListController extends DefaultController implements Initializable {
    
    @FXML
    private TableView imagesTable;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
}
