package com.mycompany.mavenproject1;
import java.util.Scanner;
import java.util.Random;

public class Guessing_game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        int number_to_guess = ran.nextInt(100) +1;
        int guess ;
        do{
            System.out.println("Guess a no =");
            guess = sc.nextInt();
            if(number_to_guess == guess){
                System.out.println("Congratulation you won");
                break;
            }else if(guess< number_to_guess){
                System.out.println("too low");

            }else if(guess>number_to_guess){
                System.out.println("too high");
            }
        }
        while(true);
        sc.close();
    }}
        
    


