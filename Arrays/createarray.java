package Arrays;

import java.util.*;

public class createarray {
    public static void main(String []args){
        
        int marks[] = new int[50];
        int number[] = { 1 ,2 ,3 };

        try (Scanner sc = new Scanner (System.in)) {
            System.out.print("Enter the physics marks = ");
            marks[0] = sc.nextInt();
            System.out.print("Enter the chemistry marks = ");
            marks[1] = sc.nextInt();
            System.out.print("Enter the maths marks = ");
            marks[2] = sc.nextInt();
        }
 
        System.out.println(" Physics = " +marks[0]);
        System.out.println(" Chemistry = " +marks[1]);
        System.out.println(" Maths = " +marks[2]);

        int pencentage = ( marks[0] + marks[1] + marks[2]) / 3 ;

        System.out.println(" Total Pencentage = " +pencentage+" %");
    }
    
}