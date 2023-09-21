package me.abratuhi.demo;

import org.testcontainers.containers.GenericContainer;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world from Java!");
        System.out.println("===");
        try (
                GenericContainer<?> helloWorldContainer = new GenericContainer<>("hello-world")) {
            helloWorldContainer.start();
            System.out.println("Container logs: " + helloWorldContainer.getLogs());
            helloWorldContainer.stop();
        }
    }
}