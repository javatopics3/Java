public class Main {
    static {
         System.out.println("Message");
         System.exit(0);
    } 
}
/*
 * The System.exit(0) lets the program exit before the JVM is looking for the
 * main method, otherwise the following error will be thrown:
 * 
 * Exception in thread "main" java.lang.NoSuchMethodError: main
 */

