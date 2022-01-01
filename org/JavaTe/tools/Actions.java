package org.JavaTe.tools;

public class Actions {
    /**
     * What does the function below do?:
     * -> It print a thing into your IDE console
     * How can it make my coding easier?:
     * -> by making u type "print("<what u wanna print>);" instead of
     * "System.out.println("<what u wanna print>");"
     */
    public static void print(String message) {
        System.out.println(message);
    }

    /**
     * What does the function below do?:
     * -> It loads a file
     * How can it make my coding easier?:
     * -> by making u type "load("<file u wanna load>");" instead of
     * "System.load("<file u wanna load>");"
     */
    public static void load(String filename) {
        System.load(filename);
    }
}