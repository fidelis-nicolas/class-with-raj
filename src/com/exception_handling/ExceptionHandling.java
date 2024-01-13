package com.exception_handling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        //createFile();

        try{
            checkAge(13);
        }catch (CustomException e){
            System.out.println("You are not eligible");
        }

        try{
            checkNationality("Nigeria");
        }catch (RuntimeException exception){
            System.out.println("You need to change your country to Australia");
            exception.printStackTrace();
        }


        try {
            System.out.print("Enter your age: ");
            int age = input.nextInt();
            System.out.println(age);
            System.out.println(5 / 0);

        }
       catch (ArithmeticException ex){
           System.out.println("You cannot divide by zero");
        }catch (InputMismatchException ex){
            System.out.println("You're only allowed to enter a number");
        } finally {
            //The code here gets executed whether an exception occur or not
            System.out.println("Hello");
        }




    }

    public static void checkNationality(String country){
        if(!country.equalsIgnoreCase("Australia")){
            throw new RuntimeException("You are not from australia");
        }
        else {
            System.out.println("Welcome to " + country);
        }
    }
    public static void createFile() throws IOException{
        File file = new File("C:\\Users\\USER\\Document\\name.txt");
        file.createNewFile();

    }
    public static void checkAge(int age) throws CustomException {
        if(age<18){
            throw new CustomException("You need to grow more");
        }
        else {
            System.out.println("You are eligible");
        }
    }
}
