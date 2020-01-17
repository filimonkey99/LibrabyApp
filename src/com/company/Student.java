package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Student extends Person  {

    Library library =new Library();
    Scanner studentInput= new Scanner(System.in);

    public void StudentLogin(){

        System.out.println("-----------------------------------------------");
        System.out.println("choose an option");
        System.out.println("1. Student login");
        System.out.println("2. librarian login");
        System.out.println("3. Exit");

    }

}
