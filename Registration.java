package com.assignment;

import java.util.Scanner;
import java.util.regex.Pattern;


public class Registration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first name : ");
        String fname = sc.nextLine();
        System.out.print("Enter last name : ");
        String lname = sc.nextLine();
        System.out.print("Enter Phone no with this formate (91 1234567890) : ");
        String no = sc.nextLine();
        System.out.print("Enter Email : ");
        String email = sc.nextLine();
        System.out.print("Enter Password : ");
        String password = sc.nextLine();

        if(Pattern.matches("[A-Z]{1}[a-z]{2,}",fname)){}
            else{
            System.out.println("Wrong first name");
        }
        if(Pattern.matches("[A-Z]{1}[a-z]{2,}",lname)){}
        else{
            System.out.println("Wrong last name");
        }
        if(Pattern.matches("[9]{1}[1]{1}[ ]{1}[0-9]{10}",no)){}
        else{
            System.out.println("Wrong Mobile no");
        }
        if(Pattern.matches("[a-zA-Z0-9.*#+=;]{1,}[@]{1}[a-zA-Z]{1,}[.]{1}[a-z]{1,}",email)){}
        else{
            System.out.println("Wrong Email");
        }
        if(Pattern.matches("^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$",password)){}
        else{
            System.out.println("Wrong Password");
        }
    }
}
