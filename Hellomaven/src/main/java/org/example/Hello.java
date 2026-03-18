package org.example;

public class Hello {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            String separator = "";
            System.out.print("Hello, ");
            for (String name : args) {
                System.out.print(separator + name);
                separator = " ";
            }
            System.out.println("!");
        }
    }
}