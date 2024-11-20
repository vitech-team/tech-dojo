package com.vitech.playground.gofpatterns.structural.proxy.model;

public class ProxyImageFile implements DisplayObject {

    private ImageFile imageFile;
    private final String path;

    public ProxyImageFile(String path) {
        this.path = path;
    }

    @Override
    public void display() {
        if (imageFile == null) {
            imageFile = new ImageFile(path);
        }
        imageFile.display();
    }
}
