package org.example.switch_funciones;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Scanner;

public class HelloApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        printAnyString("HELLO YOU ARE IN THE BEST PROGRAM");
        printAnyString("Please type any option");
        String readingString = scanner.nextLine();
        switch (readingString.toLowerCase()){
            case "a":

                printAnyString("NOW YOU ARE IN THE SUM PROGRAM");
                printAnyString("Type de first number");
                int numberOne = scanner.nextInt();
                printAnyString("Type de second number");
                int numberTwo = scanner.nextInt();
                printAnyString("Type de first number");
                int sumResult = sumNumbers(numberOne,numberTwo);
                printAnyString("The result of your sumatory is");
                break;

            case "b":

                printAnyString ("Please type a string");
                String IdkString = scanner.nextLine();
                String Yeah = Returnnothing (IdkString);
                printAnyString("You string is:" + Yeah);
                break;

            case "c":

                printAnyString("Now you are in cos fuctiopn to print the cos of a degree");
                printAnyString("Please type a value to calculate");
                int normal = scanner.nextInt();
                double cosenResult = Coseno(normal);
                printAnyString("The result of your cosen is" + cosenResult);
                break;


        }
    }
    public static void printAnyString( String message){
        System.out.println(message);
    }

    public static int sumNumbers(int numberOne,int numberTwo){
        int result = numberOne + numberTwo;
        return result;
    }

    public static String Returnnothing(String IdkString){
        System.out.println(IdkString);
        return IdkString;
    }

    public static double Coseno(int normal) {
        double cosValue = Math.cos(normal);
        return cosValue;
    }

}