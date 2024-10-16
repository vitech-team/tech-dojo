package com.vitech.playground.gofpatterns.structural.proxy.model;

import lombok.extern.slf4j.Slf4j;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

@Slf4j
public class ImageFile implements DisplayObject {

    private BufferedImage image;

    public ImageFile(String path) {
        image = load(path);
    }

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
            log.error("Can't load image", e);
        }
        return image;
    }


}
