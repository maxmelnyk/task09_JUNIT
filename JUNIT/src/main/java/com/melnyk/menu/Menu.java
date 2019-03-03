package com.melnyk.menu;

import com.melnyk.tasks.Calculator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Menu {

  private Calculator calculator;
  private Map<String, String> menu;
  private Map<String, Printable> menuMethods;

  public void myMenu() {
    calculator = new Calculator();
    menu = new LinkedHashMap<>();
    menuMethods = new LinkedHashMap<>();

    menu.put("1", "1 - Add two numbers");
    menu.put("2", "2 - Sub two numbers");
    menu.put("3", "3 - Multiply two numbers");
    menu.put("4", "4 - Divide two numbers");
    menu.put("Q", "Q - Exit");

    menuMethods.put("1", calculator::add);
    menuMethods.put("2", calculator::sub);
    menuMethods.put("3", calculator::mul);
    menuMethods.put("4", calculator::div);
    showMenu();
  }

  private void outputMenu() {
    System.out.println("////////////MENU////////////");
    for (String command : menu.values()) {
      System.out.println(command);
    }
  }

  private void showMenu() {
    Scanner scannerKey = new Scanner(System.in);
    Scanner scannerNumber = new Scanner(System.in);
    double a, b;
    String key;
    for (; ; ) {
      outputMenu();
      System.out.print("Select menu point: ");
      key = scannerKey.nextLine().toUpperCase();
      if (key.equals("Q")) {
        break;
      }
      System.out.println("Enter two numbers:");
      System.out.print("Number 1 = ");
      a = scannerNumber.nextDouble();
      System.out.print("Number 2 = ");
      b = scannerNumber.nextDouble();
      try {
        menuMethods.get(key).print(a, b);
      } catch (ArithmeticException e) {
        e.getStackTrace();
      }
    }
  }
}
