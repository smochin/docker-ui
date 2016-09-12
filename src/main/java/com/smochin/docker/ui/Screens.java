package com.smochin.docker.ui;

public enum Screens {
    MAIN("main", "/fxml/MainPanel.fxml"),
    
    IMAGE_LIST("image-list", "/fxml/image/ImageList.fxml"),
    IMAGE_CREATE("image-create", "/fxml/image/ImageList.fxml"),
    IMAGE_HUB("image-hub", "/fxml/image/ImageList.fxml");
    
    public String id = null;
    public String fxml = null;
    private Screens(String id, String fxml) {
        this.id = id;
        this.fxml = fxml;
    }
}
