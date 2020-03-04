import java.util.Scanner;

/**
 * This program generates and prints 10 random numbers from 1 and 100
 * and identify's the max and min. 
 * 
 * @author Nick P-A
 * @since 2020/3/3 feb 27 2020
 * @version 1.0
 */
 
 
public class Minmaxnumb {
  static int randomInt;
  static int randomInt2;
  static int randomInt3;
  static int randomInt4;
  static int randomInt5;
  static int randomInt6;
  static int randomInt7;
  static int randomInt8;
  static int randomInt9;
  static int randomInt10;
  
  /**
  * This class generates and prints 10 random numbers from 1 and 100 and 
  * identify's the max and min.
  */
 
  public static void main(String[] args) {
    usingMathClass();
  }
 
  /**
   * This class generates and prints 10 random numbers from 1 and 100 and 
   * identify's the max and min.
  */
  public static void usingMathClass() {
    double randomDouble = Math.random();
    randomDouble = randomDouble * 100 + 1;
    int randomInt = (int) randomDouble;
    System.out.println(randomInt);
    
    double randomDouble2 = Math.random();
    randomDouble2 = randomDouble2 * 100 + 1;
    int randomInt2 = (int) randomDouble2;
    System.out.println(randomInt2);
    
    double randomDouble3 = Math.random();
    randomDouble3 = randomDouble3 * 100 + 1;
    int randomInt3 = (int) randomDouble3;
    System.out.println(randomInt3);
    
    double randomDouble4 = Math.random();
    randomDouble4 = randomDouble4 * 100 + 1;
    int randomInt4 = (int) randomDouble4;
    System.out.println(randomInt4);
    
    double randomDouble5 = Math.random();
    randomDouble5 = randomDouble5 * 100 + 1;
    int randomInt5 = (int) randomDouble5;
    System.out.println(randomInt5);
    
    double randomDouble6 = Math.random();
    randomDouble6 = randomDouble6 * 100 + 1;
    int randomInt6 = (int) randomDouble6;
    System.out.println(randomInt6);
    
    double randomDouble7 = Math.random();
    randomDouble7 = randomDouble7 * 100 + 1;
    int randomInt7 = (int) randomDouble7;
    System.out.println(randomInt7);
    
    double randomDouble8 = Math.random();
    randomDouble8 = randomDouble8 * 100 + 1;
    int randomInt8 = (int) randomDouble8;
    System.out.println(randomInt8);
    
    double randomDouble9 = Math.random();
    randomDouble9 = randomDouble9 * 100 + 1;
    int randomInt9 = (int) randomDouble9;
    System.out.println(randomInt9);
    
    double randomDouble10 = Math.random();
    randomDouble10 = randomDouble10 * 100 + 1;
    int randomInt10 = (int) randomDouble10;
    System.out.println(randomInt10);
    
    
    if (randomInt > randomInt2 && randomInt > randomInt3 && randomInt > randomInt4 
        && randomInt > randomInt5 && randomInt > randomInt6 && randomInt > randomInt7 
        && randomInt > randomInt8 && randomInt > randomInt9 && randomInt > randomInt10) {
      System.out.println("the max is " + randomInt);
      
    }
    
    if (randomInt2 > randomInt && randomInt2 > randomInt3 && randomInt2 > randomInt4 
        && randomInt2 > randomInt5 && randomInt2 > randomInt6 && randomInt2 > randomInt7 
        && randomInt2 > randomInt8 && randomInt2 > randomInt9 && randomInt2 > randomInt10) {
      System.out.println("the max is " + randomInt2);
      
    }
    if (randomInt3 > randomInt2 && randomInt3 > randomInt && randomInt3 > randomInt4 
        && randomInt3 > randomInt5 && randomInt3 > randomInt6 && randomInt3 > randomInt7 
        && randomInt3 > randomInt8 && randomInt3 > randomInt9 && randomInt3 > randomInt10) {
      System.out.println("the max is " + randomInt3);
      
    }
    
    if (randomInt4 > randomInt && randomInt4 > randomInt2 && randomInt4 > randomInt3 
        && randomInt4 > randomInt5 && randomInt4 > randomInt6 && randomInt4 > randomInt7 
        && randomInt4 > randomInt8 && randomInt4 > randomInt9 && randomInt4 > randomInt10) {
      System.out.println("the max is " + randomInt4);
      
    }
    if (randomInt5 > randomInt2 && randomInt5 > randomInt3 && randomInt5 > randomInt4 
        && randomInt5 > randomInt && randomInt5 > randomInt6 && randomInt5 > randomInt7 
        && randomInt5 > randomInt8 && randomInt5 > randomInt9 && randomInt5 > randomInt10) {
      System.out.println("the max is " + randomInt5);
      
    }
    
    if (randomInt6 > randomInt && randomInt6 > randomInt3 && randomInt6 > randomInt3 
        && randomInt6 > randomInt4 && randomInt6 > randomInt5 && randomInt6 > randomInt7 
        && randomInt6 > randomInt8 && randomInt6 > randomInt9 && randomInt6 > randomInt10) {
      System.out.println("the max is " + randomInt6);
      
    }
    if (randomInt7 > randomInt && randomInt7 > randomInt2 && randomInt7 > randomInt3 
        && randomInt7 > randomInt4 && randomInt7 > randomInt5 && randomInt7 > randomInt6 
        && randomInt7 > randomInt8 && randomInt7 > randomInt9 && randomInt7 > randomInt10) {
      System.out.println("the max is " + randomInt7);
      
    }
    
    if (randomInt8 > randomInt && randomInt8 > randomInt2 && randomInt8 > randomInt3 
        && randomInt8 > randomInt4 && randomInt8 > randomInt5 && randomInt8 > randomInt6 
        && randomInt8 > randomInt7 && randomInt8 > randomInt9 && randomInt8 > randomInt10) {
      System.out.println("the max is " + randomInt8);
      
    }
    if (randomInt9 > randomInt && randomInt9 > randomInt2 && randomInt9 > randomInt3 
        && randomInt9 > randomInt4 && randomInt9 > randomInt5 && randomInt9 > randomInt6 
        && randomInt9 > randomInt7 && randomInt9 > randomInt8 && randomInt9 > randomInt10) {
      System.out.println("the max is " + randomInt9);
      
    }
    
    if (randomInt10 > randomInt && randomInt10 > randomInt2 && randomInt10 > randomInt3 
        && randomInt10 > randomInt4 && randomInt10 > randomInt5 && randomInt10 > randomInt6 
        && randomInt10 > randomInt7 && randomInt10 > randomInt8 && randomInt10 > randomInt9) {
      System.out.println("the max is " + randomInt10);
    }
    


    
    if (randomInt < randomInt2 && randomInt < randomInt3 && randomInt < randomInt4 
        && randomInt < randomInt5 && randomInt < randomInt6 && randomInt < randomInt7 
        && randomInt < randomInt8 && randomInt < randomInt9 && randomInt < randomInt10) {
      System.out.println("the min is " + randomInt);
      
    }
    
    if (randomInt2 < randomInt && randomInt2 < randomInt3 && randomInt2 < randomInt4 
        && randomInt2 < randomInt5 && randomInt2 < randomInt6 && randomInt2 < randomInt7 
        && randomInt2 < randomInt8 && randomInt2 < randomInt9 && randomInt2 < randomInt10) {
      System.out.println("the min is " + randomInt2);
      
    }
    if (randomInt3 < randomInt2 && randomInt3 < randomInt && randomInt3 < randomInt4 
        && randomInt3 < randomInt5 && randomInt3 < randomInt6 && randomInt3 < randomInt7 
        && randomInt3 < randomInt8 && randomInt3 < randomInt9 && randomInt3 < randomInt10) {
      System.out.println("the min is " + randomInt3);
      
    }
    
    if (randomInt4 < randomInt && randomInt4 < randomInt2 && randomInt4 < randomInt3 
        && randomInt4 < randomInt5 && randomInt4 < randomInt6 && randomInt4 < randomInt7 
        && randomInt4 < randomInt8 && randomInt4 < randomInt9 && randomInt4 < randomInt10) {
      System.out.println("the min is " + randomInt4);
      
    }
    if (randomInt5 < randomInt2 && randomInt5 < randomInt3 && randomInt5 < randomInt4 
        && randomInt5 < randomInt && randomInt5 < randomInt6 && randomInt5 < randomInt7 
        && randomInt5 < randomInt8 && randomInt5 < randomInt9 && randomInt5 < randomInt10) {
      System.out.println("the min is " + randomInt5);
      
    }
    
    if (randomInt6 < randomInt && randomInt6 < randomInt3 && randomInt6 < randomInt3 
        && randomInt6 < randomInt4 && randomInt6 < randomInt5 && randomInt6 < randomInt7 
        && randomInt6 < randomInt8 && randomInt6 < randomInt9 && randomInt6 < randomInt10) {
      System.out.println("the min is " + randomInt6);
      
    }
    if (randomInt7 < randomInt && randomInt7 < randomInt2 && randomInt7 < randomInt3 
        && randomInt7 < randomInt4 && randomInt7 < randomInt5 && randomInt7 < randomInt6 
        && randomInt7 < randomInt8 && randomInt7 < randomInt9 && randomInt7 < randomInt10) {
      System.out.println("the min is " + randomInt7);
      
    }
    
    if (randomInt8 < randomInt && randomInt8 < randomInt2 && randomInt8 < randomInt3 
        && randomInt8 < randomInt4 && randomInt8 < randomInt5 && randomInt8 < randomInt6 
        && randomInt8 < randomInt7 && randomInt8 < randomInt9 && randomInt8 < randomInt10) {
      System.out.println("the min is " + randomInt8);
      
    }
    if (randomInt9 < randomInt && randomInt9 < randomInt2 && randomInt9 < randomInt3 
         && randomInt9 < randomInt4 && randomInt9 < randomInt5 && randomInt9 < randomInt6 
         && randomInt9 < randomInt7 && randomInt9 < randomInt8 && randomInt9 < randomInt10) {
      System.out.println("the min is " + randomInt9);
      
    }
    
    if (randomInt10 < randomInt && randomInt10 < randomInt2 && randomInt10 < randomInt3 
        && randomInt10 < randomInt4 && randomInt10 < randomInt5 && randomInt10 < randomInt6 
        && randomInt10 < randomInt7 && randomInt10 < randomInt8 && randomInt10 < randomInt9) {
      System.out.println("the min is " + randomInt10);
      
    }
  }
}
