package com.bl.java.functional_interface;

@FunctionalInterface
interface IMathFunction{
    int calculate(int a, int b);
    static void printResult(int a, int b, String function, IMathFunction fobj){
        System.out.println("Result of "+function+" is "+ fobj.calculate(a,b));
    }
}

public class MathOpertations {
    public static void main(String[] args) {
        IMathFunction add = Integer::sum;
        IMathFunction sub = (a,b) -> a-b;
        IMathFunction mul = (a,b) -> a*b;
        IMathFunction div = (int a, int b) -> a/b;

//        System.out.println("Addition is " + add.calculate(6,3));
//        System.out.println("Subtraction is " + sub.calculate(6,3));
//        System.out.println("Multiplication is " + mul.calculate(6,3));
//        System.out.println("Division is " + div.calculate(6,3));

        IMathFunction.printResult(6,3,"Addition",add);
        IMathFunction.printResult(6,3,"Subtraction",sub);
        IMathFunction.printResult(6,3,"Multiplication",mul);
        IMathFunction.printResult(6,3,"Division",div);
    }
}
