package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("Math.pow(3,5) = " + Math.pow(3,5));
        System.out.println( 10.0 / 7);
        System.out.println("5 * Math.pow(2,5) - 4 = " + (5 * Math.pow(2,5) - 4));
        System.out.println("10.3 % 5 = " + 10.3 % 5);
        System.out.println(5536253 % 6);

        System.out.println("Math.random() Examples: ");
        System.out.println("Math.random() * 10 = " + Math.random() * 10 );
        System.out.println("Math.random() * 60.1 = " + Math.random() * 60.1 );

        System.out.println("Math.ceil() examples: ");
        System.out.println("Math.ceil(Math.random() * 10 = " + Math.ceil(Math.random() * 10));

        System.out.println("Math.floor() examples: ");
        System.out.println("Math.floor(10.3 * 5) = " + Math.floor(10.3*5));

        System.out.println("Math.round(4.5) = " + Math.round(4.5));
        System.out.println("Math.round(4.4) = " + Math.round(4.4));
        System.out.println("Math.round(Math.random() * 10) = " + (Math.random() * 10));

    }
}
