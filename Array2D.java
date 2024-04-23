/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array2d;

import java.util.Scanner;
public class Array2D {
//Array assignment
    public static void main(String[] args) {
       Scanner Sc=new Scanner(System.in);
       //Q1
       int max = Integer.MIN_VALUE;
       int sum=0;
       int average=0;
      
        System.out.println("Enter the length of the rows");
        int rows = Sc.nextInt();
        System.out.println("Enter  the length of the columns");
        int columns = Sc.nextInt();
        int [][]matrix= new int [rows][columns];
         for (int i = 0; i < rows; i++) {
             for (int j = 0; j < columns; j++) {
                 System.out.println("enter the value of the element[" +(i+ 1)+"],[" +(j+1)+"]");
                 matrix [i][j]=Sc.nextInt();
                 sum+=matrix[i][j];
                 average=sum/rows;
          
        //a) find the maximum of all elements of the array
            
            if(  matrix[i][j] >0){ 
                max=matrix [i][j];
            
                 }   
              }
             System.out.println(" the sum of row"+(i+1)+" = " +sum+  " and the average =  " + average );
             sum=0;
             average=0;
            
     
     
            System.out.println("");
            
         }     
            System.out.println("the max value ="+max);
    }
    
}
