package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /**
   * Greating 
   * @param someone - String
   * @return String
   */
  final public String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
