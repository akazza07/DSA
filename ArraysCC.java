import java.util.*;
// largest number in array

public class ArraysCC {
    public static int getlargest(int number[]){

        int largest = Integer.MIN_VALUE; //-infinity  // these are utility pakages
        int smallest = Integer.MAX_VALUE; //+infinity

        for(int i = 0 ; i <  number.length ; i++){

            if(largest < number[i]){
                largest = number[i];
            } if( smallest > number[i]){
                smallest = number[i];
            } 
            
        } System.out.println("Smallest value is " + smallest);
        return largest ;
    }
    public static void main (String args[]) {
        int number[] = { 2 , 76 , 7 , 8 , 1 };
        System.out.println("Largest value is = " + getlargest(number));  
    
    }
}
