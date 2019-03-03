package com.melnyk.tasks;

public class MyLaptop {

  private String name;
  private String model;
  private int age;
  private int year;

  static final String SHOP1 = "LvivLaptop";
  protected static final String SHOP2 = "MyLaptop";

  public MyLaptop(String name, String model, int age, int year) {
    this.name = name;
    this.model = model;
    this.age = age;
    this.year = year;
  }

  public void laptopInfo() throws Exception {
    System.out.println("Name: " + name + ", model: " + model
        + ", age: " + age + ", year: " + year + ", price: " + countPrice());
  }

  public int countPrice() throws Exception {
    int price = year * (10 -age);
    if (price > 0) {
      return price;
    }
    throw new Exception("Price is less then zero!!!");
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public void turnOnOrOff(int key) throws Exception {
    if (key == 1) {
      System.out.println("On!!!");

    } else if (key == 0) {
      System.out.println("Off!!!");
    } else {
      throw new Exception("It's not a key");
    }
  }
}
