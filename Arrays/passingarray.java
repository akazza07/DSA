package Arrays;

import java.util.*;

public class passingarray {
    public static void update(int marks[] , int nonchangeable ){
      nonchangeable = 5 ;
        for(int i = 0 ; i<marks.length;i++){
            marks[i] = marks[i] +1 ;
        }
    }
    public static void main (String[]args){
        int marks[] = { 78 , 37 ,83 };
        int nonchangeable = 10 ;
        update(marks ,nonchangeable);

        System.out.println(nonchangeable);

        // to print own marks
        for(int i = 0 ; i<marks.length ;i++){
            System.out.println(marks[i] +" ");
        }
        System.out.println();
    }
    
} 
