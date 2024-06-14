package org.example;

public class Calculator {

    //Properties

    private int number;


    //Constructor
    public Calculator() {
        this.number = 0;
    }

    public int calculate(int num, String operator){
        switch (operator){
            case("+"):
                number += num;
                break;
            case ("-"):
                number -= num;
                break;
            case ("/"):
                number /= num;
                break;
            case("*"):
                number *= num;
                break;
        }
        return number;
    }

    //Getters and Setters
//    public String getMath() {
//        return math;
//    }

//    public int getNumber() {
//        return number;
//    }
//
//
//
//    public int addToNumber(int num) {
//        this.number += num;
//        return number;
//    }
}