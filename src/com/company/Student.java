package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Student extends Person {



    Scanner studentInput = new Scanner(System.in);

    public void StudentLogin() {

        boolean running = true;

        System.out.println("-----------------------------------------------");
        System.out.println("choose an option");
        System.out.println("1. See all books");
        System.out.println("2. Lend book");
        System.out.println("3. Return book ");
        System.out.println("4. Exit");
        System.out.println("write a number please");

        while (running){
            int studentOption = studentInput.nextInt();
            switch (studentOption){
                case 1:
                    System.out.println("See all books");
                    
                    break;
                case 2:
                    System.out.println("Lend book");
                    break;
                case 3:
                    System.out.println("Return book");
                    break;
                case 4:
                    System.out.println("Exiting");
                    running=false;
                    break;

            }
        }

    }

}
