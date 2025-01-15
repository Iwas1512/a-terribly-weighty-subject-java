package org.example;

public class Converter {

  String toPounds(double oz) {
      double lbs = oz / 16;
      
      return String.format("%.4f lbs", lbs);
  }

  
  String toPoundsAndOunces(double oz) {
      int lbs = (int) (oz / 16); 
      int remainingOunces = (int) (oz % 16); // Remaining ounces
      return lbs + " lbs " + remainingOunces + " oz"; 
  }
}
