package com.melnyk.tasks;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class MyLaptopTest {

  @BeforeEach
  void before() {
    System.out.println("@BeforeEach");
  }

  @AfterEach
  void after() {
    System.out.println("@AfterEach");
  }

  @DisplayName("Count Price")
  @Test
  public void test1CountPrice() throws Exception {
    MyLaptop myLaptop = new MyLaptop("HP", "8570w", 2, 2011);
    assertEquals(myLaptop.countPrice(), (10 - 2) * 2011);
    System.out.println(MyLaptop.SHOP1);
    System.out.println("Test 1 is complete");
  }

  @Test
  public void test2SetYear() throws Exception {
    MyLaptop laptop = new MyLaptop("Lenovo", "p508", 1, 2016);
    laptop.setYear(2015);
    assertTrue(laptop.getYear() == 2015);
    System.out.println(MyLaptop.SHOP2);
    laptop.laptopInfo();
  }

  @Test
  public void test3CountPrice() {
    MyLaptop laptop = new  MyLaptop("Lenovo", "p508", 1, 2016);
    laptop.setAge(11);
    assertThrows(Exception.class, laptop::countPrice);
  }
}
