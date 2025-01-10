package com.design.principles.creational.singleton;

public class LazyInitialization {
    // Instance is declared but not initialized
    private static LazyInitialization instance;

    // Private constructor to prevent instantiation
    private LazyInitialization() {}

    // Thread-safe method to provide access to the instance
    public static synchronized LazyInitialization getInstance() {
        if (instance == null) {
            instance = new LazyInitialization(); // Instance is created only when needed
        }
        return instance;
    }
}