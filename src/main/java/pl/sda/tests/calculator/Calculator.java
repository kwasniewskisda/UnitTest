package pl.sda.tests.calculator;

public class Calculator {

   public int add(int a, int b){
       return Math.addExact(a,b);
   }

    public int substract(int a, int b){
        return Math.subtractExact(a,b);
    }

    public int multiply(int a, int b){
        return Math.multiplyExact(a,b);
    }

    public int divide(int a, int b){
        return Math.floorDiv(a,b);
    }
}
