package com.example.myfirstclass;

/* This is my first class in Java */
public class MyFirstClass extends Object{

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    // this is an instance field
    private int myInstanceField = 10;

    // this is a class field
    public static double myClassField = 5.0;

    // this is an instance method
    public int myInstanceMethod() {
        return myInstanceField;
    }

    // this is a class method that computes the average of the two inputs
    public static double average(int input1, int input2) {
        return (input1 + input2) / 2.0;
    }
}
