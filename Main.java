package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("What number do you want to check up to for prime numbers?");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int i = 0;
        int num = 0;

        String pNumbers = "";

        for (i = 1; i <= x; i++) {
            int count = 0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) { count = count + 1;
                }
            }
            if (count == 2) {
                pNumbers = pNumbers + i + " ";
                }

            }
            System.out.print("The following numbers from 1 to ");
            System.out.print(x);
            System.out.println(" are prime numbers :");
            System.out.println(pNumbers);


        }

}

