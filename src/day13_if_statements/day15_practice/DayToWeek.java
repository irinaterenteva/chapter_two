package day13_if_statements.day15_practice;

import java.util.Scanner;

public class DayToWeek {
     /*
        Given a day number, find and print the day related to the number

        1- Monday
        2- Tuesday

        6- Saturday
        7- Sunday
     */
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Enter a day number: 1-7");
         int num = input.nextInt();
         String day = "";

         switch (num){

             case 1:
                day = "Monday"; // System.out.println("Monday")
                 break;
             case 2:
                day = "Tuesday";
                break;
             case 3:
                day = "Wednesday";
                break;
             case 4:
                 day = "Thursday";
                 break;
             case 5:
                 day = "Friday";
                 break;
             case 6:
                 day = "Saturday";
                 break;
             case 7:
                 day = "Sunday";
             default:
                 day = "Invalid day";

         }
         System.out.println(day);
     }
}
