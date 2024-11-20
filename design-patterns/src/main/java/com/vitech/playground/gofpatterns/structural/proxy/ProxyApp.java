package com.vitech.playground.gofpatterns.structural.proxy;

import com.vitech.playground.gofpatterns.structural.proxy.model.DisplayObject;
import com.vitech.playground.gofpatterns.structural.proxy.model.ImageFile;
import com.vitech.playground.gofpatterns.structural.proxy.model.ProxyImageFile;

import java.util.List;

public class ProxyApp {

    public static void main(String[] args) {
        // Given an app which displays images like a slideshow, refactor using the Proxy Pattern.
        // We have the interface called DisplayObject which holds the display() method,
        // and the class ImageFile implementing it.
        // In ProxyApp we call these methods to display images from the resources folder.
        //
        // The load() method in ImageFile is an expensive process consuming memory & time, and it's our refactoring goal.
        // We want load() method to be invoked only when image is about to be displayed,
        // but we're not allowed to modify internal ImageFile implementation.
        //
        // Apply Proxy pattern to achieve defined goal.

        List<DisplayObject> images = List.of(
                new ProxyImageFile("design-patterns/src/main/resources/gofpatterns/structural/proxy/image1.jpeg"),
                new ProxyImageFile("design-patterns/src/main/resources/gofpatterns/structural/proxy/image2.jpeg"),
                new ProxyImageFile("design-patterns/src/main/resources/gofpatterns/structural/proxy/image3.jpeg"),
                new ProxyImageFile("design-patterns/src/main/resources/gofpatterns/structural/proxy/image4.jpeg"),
                new ProxyImageFile("design-patterns/src/main/resources/gofpatterns/structural/proxy/image5.jpeg"),
                new ProxyImageFile("design-patterns/src/main/resources/gofpatterns/structural/proxy/image6.jpeg"),
                new ProxyImageFile("design-patterns/src/main/resources/gofpatterns/structural/proxy/image7.jpeg"),
                new ProxyImageFile("design-patterns/src/main/resources/gofpatterns/structural/proxy/image8.jpeg"),
                new ProxyImageFile("design-patterns/src/main/resources/gofpatterns/structural/proxy/image9.jpeg"),
                new ProxyImageFile("design-patterns/src/main/resources/gofpatterns/structural/proxy/image10.jpeg")
        );

        images.forEach(DisplayObject::display);
    }
}
