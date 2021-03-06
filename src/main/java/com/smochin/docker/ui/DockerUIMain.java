package com.smochin.docker.ui;

import com.smochin.docker.ui.controller.ScreensManager;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import static javafx.application.Application.launch;
import javafx.scene.Node;
import static javafx.application.Application.launch;


public class DockerUIMain extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        ScreenLoader loader = ScreenLoader.getInstance();
        loader.load();
        
        ScreensManager manager = loader.getManager();
        
        manager.setContainerCooserFromScreen(Screens.MAIN.id, "#container");
        
        
        Parent main = manager.getScreen(Screens.MAIN.id);
        
        Scene scene = new Scene(main);
        
        stage.setTitle("Docker ui");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
