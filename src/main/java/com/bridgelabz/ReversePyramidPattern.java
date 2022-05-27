package com.bridgelabz;
import java.util.Scanner;
public class ReversePyramidPattern {
    public static void main(String[] args){
        //using scanner class and creating object to get inputs from user
        Scanner sc = new Scanner(System.in);

        //Getting inputs from user
        System.out.println("Enter the number of lines for pyramid: ");

        //Storing inputs into variable "n"
        int n= sc.nextInt();

        //Creating pyramid by using for loop
        for (int i= 0; i<= n-1; i++)
        {
            for (int j=0; j<=i; j++)
            {
                System.out.print(" ");
            }
            for (int k=0; k<=n-1-i; k++)
            {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
//Reversed Pyramid Star Pattern
//   * * * * *
//    * * * *
//     * * *
//      * *
//       *
