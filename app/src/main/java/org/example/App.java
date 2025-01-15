package org.example;

import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    //Author @Anlil Iwas
    System.out.println("Hello! Welcome to my CodeSpace, This is my Simple converter Code which converts oz to lbs");


//driver starts here for lab
    Converter converter = new Converter();
    Scanner scanner = new Scanner(System.in);

    System.out.println("How many ounces do you have?");

    double oz = scanner.nextDouble();
    System.out.println("Thank you! Converting ounces to pounds. ");

    System.out.println( converter.toPoundsAndOunces(oz));


    System.out.println("in just lbs, we have..." + converter.toPounds(oz) );

    scanner.close(); //i did not know we had to close a scanner in Java, we never had to do this back then.
    System.out.println("And thats all for this lab! goodbye now and have an amazing rest of your day!");


  }
}
