package Arrays;

import java.util.*;

public class largest {
    public static int getlargest(int number[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for( int i = 0 ; i<number.length ; i++){
            if( largest < number[i] ){
                largest=number[i];
            } 
            if(smallest>number[i]){
                smallest = number[i];
            }
        } 
        System.out.println("The Smallest number is = " +smallest);
        return largest;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int number [] = { 3 , 9 , 4 , 1 , 5 };
        System.out.println("The Largest number is = "+getlargest(number));
    }
    
}
