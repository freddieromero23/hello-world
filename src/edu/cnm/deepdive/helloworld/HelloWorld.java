/**
 * 
 */
package edu.cnm.deepdive.helloworld;

/**
 * Simple class that displays the "Hello World!" message.
 */
public class HelloWorld {

  public static void main(String[] args) {
    String target = ((args.length > 0) ? args[0] : "World");
    String message = String.format("Hello %s!", target);
    
    emitMessage(message);
    
  }
  
  private static void emitMessage(String message) {
    System.out.println(message);
  }
  
}
