package com.codealpha.app;

public class App {
    public String getGreeting() {
        return "CodeAlpha Gradle Java App";
    }

    public int add(int first, int second) {
        return first + second;
    }

    public static void main(String[] args) {
        App app = new App();
        System.out.println(app.getGreeting());
        System.out.println("10 + 5 = " + app.add(10, 5));
    }
}