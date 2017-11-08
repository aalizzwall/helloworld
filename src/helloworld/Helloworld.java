package helloworld;

public class Helloworld {
    public static void main(String[] args) throws InterruptedException {
        // Prints "Hello, World" to the terminal window.
        while (true) {
          System.out.println("Hello, World");
          Thread.sleep(10000);
        }
    }
}
