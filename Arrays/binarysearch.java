package Arrays;

import java.util.*;

public class binarysearch {
    public static int binarysearch( int number[] , int key ){
        int start = 0 , end = number.length - 1 ;

        while(start<=end){
            int mid = (start + end ) / 2 ;
        // compression

        if(number[mid]==key){ //found
            return mid ;
        }
        if(number[mid]<key){ //right 
            start = mid + 1 ;    
        }else{  // left 
            end = mid - 1;
        } 
    }
        return - 1;
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int number[] = { 1 , 4 , 7 , 2 , 5 , 8 ,3 ,6 ,9 };
        System.out.print(" Enter ur key = ");
        int key = sc.nextInt();
        System.out.println(" Index for key is = " +binarysearch(number, key));
    }
    
}
