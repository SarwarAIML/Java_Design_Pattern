package com.gs.v1.creational.builder;

public class Car {

    private final String engine;
    private final int wheels;
    private final boolean sunroof;

    public Car(CarBuilder carBuilder) {
        this.engine = carBuilder.engine;
        this.wheels = carBuilder.wheels;
        this.sunroof = carBuilder.sunroof;
    }
    //
    public String getEngine() {
        return engine;
    }

    public int getWheels() {
        return wheels;
    }

    public boolean isSunroof() {
        return sunroof;
    }
    @Override
    public String toString() {
        return "Car [engine=" + engine + ", wheels=" + wheels + ", sunroof=" + sunroof + "]";
    }

    // Builder Class
    public static class CarBuilder{
        private String engine;
        private int wheels;
        private boolean sunroof;

        public CarBuilder setEngine(String engine) {
            this.engine = engine;
            return this;
        }

        public CarBuilder setWheels(int wheels) {
            this.wheels = wheels;
            return this;
        }

        public CarBuilder setSunroof(boolean sunroof) {
            this.sunroof = sunroof;
            return this;
        }
        // Build method to create Car object
        public Car build() {
            return new Car(this);
        }
    }

    public static void main(String[] args) {

        Car car = new Car.CarBuilder()
                .setEngine("V8")
                .setWheels(4)
                .setSunroof(true)
                .build();

        System.out.println(car);

    }

}
