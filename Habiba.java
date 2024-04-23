/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package habiba;

import java.util.Scanner;

/**
 *
 * @author hossa
 */
public class Habiba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Scanner Sc=new Scanner (System.in); 
        int sum=0;
        int max=0;
       
        System.out.println(" please enter the number of rows");
        int nrows =Sc.nextInt();
         System.out.println(" please enter the number of cols");
         int ncols =Sc.nextInt();
         int arr[][] = new int [nrows][ncols];
         for (int i = 0; i < nrows; i++) {
            
             
              for (int j = 0; j < ncols; j++) {
                  
               System.out.println(" Enter elements [" +i+ "]"+","+"["+j+"] ");
                   arr[i][j] = Sc.nextInt();
                
               if(max<arr[i][j])
               max = arr[i][j];
               if (i==j)
               sum=sum+1;
                
             }
                
            
          
        }
       
        for (int i = 0; i < nrows; i++) {
            for (int j = 0; j < ncols; j++) {
                System.out.print(arr[i][j] +  " ");
               
            }
            System.out.println();
          
         
          
        }
 
         System.out.println("max ="+max);
         System.out.println("sum ="+sum);
    }
    
}
