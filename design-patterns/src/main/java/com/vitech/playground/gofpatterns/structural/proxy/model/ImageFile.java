package com.vitech.playground.gofpatterns.structural.proxy.model;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageFile implements DisplayObject {

    private BufferedImage image;

    public ImageFile(String path) {
        image = load(path);
    }

    @Override
    public void display() {
        ImageIcon icon = new ImageIcon(image);
        JLabel label = new JLabel(icon);
        JOptionPane.showMessageDialog(null, label);
    }

    private static BufferedImage load(String path) {
        BufferedImage image = null;
        try {
            image = ImageIO.read(new File(path));
        } catch (IOException e) {
            System.err.println("Can't load image: ");
            e.printStackTrace();
        }
        return image;
    }
}
