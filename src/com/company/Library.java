package com.company;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Library {
    private ArrayList<Book> books=new ArrayList<>();
    Scanner input= new Scanner(System.in);

   public void ShowOptions(){

        boolean running = true;


            System.out.println("welcome to Florinds library");
            System.out.println("-----------------------------------------------");
            System.out.println("choose an option");
            System.out.println("1. Student login");
            System.out.println("2. librarian login");
            System.out.println("3. Exit");


        while (running) {
            String option= input.nextLine();

            switch (option){
                case "1":
                    System.out.println("welcome student what would you like to do");

                    break;
                case "2":
                    System.out.println("welcome librarian what would you like to do");

                    break;
                case "3":
                    System.out.println("Thank you come again");
                    running=false;
                    break;

            }
        }


    }


}
