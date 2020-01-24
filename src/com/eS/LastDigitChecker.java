package com.eS;

public class LastDigitChecker {

    public static boolean hasSameLastDigit(int firstNumber, int secondNumber, int thirdNumber){
        int firstNumberLastDigit = firstNumber % 10;
        int secondNumberLastDigit = secondNumber % 10;
        int thirdNumberLastDigit = thirdNumber % 10;

        if ((firstNumber < 10 || firstNumber > 1000) || (secondNumber < 10 || secondNumber > 1000) || (thirdNumber < 10 || thirdNumber > 1000)){
            return false;
        }

        if (firstNumberLastDigit == secondNumberLastDigit || secondNumberLastDigit == thirdNumberLastDigit || thirdNumberLastDigit == firstNumberLastDigit){
            return true;
        }

        return false;
    }

    public static boolean isValid(int number){
        if (number < 10 || number > 1000){
            return false;
        }
        return true;
    }


    public static void main(String[] args) {
	// write your code here

        System.out.println(hasSameLastDigit(222, 223, 224));
        System.out.println(hasSameLastDigit(1222, 223, 224));
        System.out.println(hasSameLastDigit(222, 223, 1224));
        System.out.println(hasSameLastDigit(222, 1223, 224));
        System.out.println(hasSameLastDigit(223, 223, 224));
        System.out.println(hasSameLastDigit(222, 224, 224));
        System.out.println(hasSameLastDigit(2, 223, 224));
        System.out.println("**********");
        System.out.println(isValid(9));
        System.out.println(isValid(900));
        System.out.println(isValid(-9));
        System.out.println(isValid(90));
        System.out.println(isValid(9000));

    }
}
