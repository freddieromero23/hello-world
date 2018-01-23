/**
 * 
 */
package edu.cnm.deepdive.helloworld;

/**
 * Simple class that displays the "Hello World!" message.
 */
public class HelloWorld {

  public static void main(String[] args) {
    emitMessage("Hello World!");
  }
  
  private static void emitMessage(String message) {
    System.out.println(message);
  }
  
}
