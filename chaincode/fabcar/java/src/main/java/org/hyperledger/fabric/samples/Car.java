package org.hyperledger.fabric.samples;

public class Car {

  private String make;
  private String model;
  private String color;
  private String owner;

  public Car(String make, String model, String color, String owner) {
    this.make = make;
    this.model = model;
    this.color = color;
    this.owner = owner;
  }

  public String getMake() {
    return make;
  }

  public String getModel() {
    return model;
  }

  public String getColor() {
    return color;
  }

  public String getOwner() {
    return owner;
  }
}
