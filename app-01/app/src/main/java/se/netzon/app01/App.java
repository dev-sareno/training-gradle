/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package se.netzon.app01;

import se.netzon.api.Library;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        System.out.println("Imported from separate module. value=" + new Library().someLibraryMethod());
    }
}
