package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String type = GetSquareType();

        switch(type){
            case "empty":
                DrawEmptySquare(8, 5);
                break;
            case "full":
                DrawFullSquare(8, 5);
                break;
            default:
                DrawFullSquare(1, 1);
        }

    }

    public static String GetSquareType(){

        System.out.println("Please enter square type \"empty\" or \"full\"");

        Scanner scanner = new Scanner(System.in);

        String Type = scanner.nextLine();

        return Type;
    }

    public static void DrawFullSquare(int Width, int Height){

        for(int i = 0; i < Height; i++){

            for(int j = 0; j < Width; j++){

                System.out.print("*");

            }

            System.out.print("\n");
        }

    }

    public static void DrawEmptySquare(int Width, int Height){

        for (int a = 1; a <= Height; a++) {

            for (int b = 1; b <= Width; b++) {

                if (a == 1 || a == Height || b == 1 || b == Width){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }


    }
}
