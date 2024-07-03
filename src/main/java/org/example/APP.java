package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class APP {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calculator calculator = new Calculator();
        boolean next = true;
        String end = "end";

        while(next == true) {
            System.out.println("Input calculation");
            System.out.println("e = end");
            System.out.println("c = clear");
            String opt = input.nextLine();
            int temp = 0;
            String ope = "";
            if (opt.equals("e")){
                next = false;
            }else if (opt.equals("c")){
                calculator = new Calculator();
            }

            List<Integer> nums = new ArrayList<>();
            List<String> opts = new ArrayList<>();
            for (int i = 0; i < opt.length(); i++) {
                char c = opt.charAt(i);
                if (Character.isDigit(c)) {

                    int cNum = Integer.parseInt(c + "");
                    temp = (temp * 10) + cNum;
                } else {
                    nums.add(temp);
                    temp = 0;
                    ope = c + "";
                    opts.add(ope);
                }

            }
            nums.add(temp);
            int idx = 0;

            int num = calculator.calculate(nums.get(0), "+");
            for (int i = 1; i < nums.size(); i++) {
                num = calculator.calculate(nums.get(i), opts.get(idx));
                idx++;
            }
            System.out.println(num);
        }



//
//        Calculator calculator = new Calculator();
//        int add = calculator.addToNumber(6);
//        System.out.println(add);
    }
}