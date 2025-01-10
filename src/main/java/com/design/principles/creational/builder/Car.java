package com.design.principles.creational.builder;

public class Car {
    private String engine;
    private String wheels;
    private String color;
    private String seats;

    // Private constructor to force use of Builder
    private Car(CarBuilder builder) {
        this.engine = builder.engine;
        this.wheels = builder.wheels;
        this.color = builder.color;
        this.seats = builder.seats;
    }

    public String getEngine() {
        return engine;
    }

    public String getWheels() {
        return wheels;
    }

    public String getColor() {
        return color;
    }

    public String getSeats() {
        return seats;
    }

    // Static nested Builder class
    public static class CarBuilder {
        private String engine;
        private String wheels;
        private String color;
        private String seats;

        // Setters for each parameter
        public CarBuilder setEngine(String engine) {
            this.engine = engine;
            return this;
        }

        public CarBuilder setWheels(String wheels) {
            this.wheels = wheels;
            return this;
        }

        public CarBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public CarBuilder setSeats(String seats) {
            this.seats = seats;
            return this;
        }

        // Build method to construct the final Car object
        public Car build() {
            return new Car(this);
        }
    }
}
