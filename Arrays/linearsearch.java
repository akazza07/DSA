package Arrays;

import java.util.*;

public class linearsearch {
    // linear Search
    public static int linearSearch(int number[], int key ){
         
        for( int i = 0 ; i < number.length ; i++){
            if( number[i]== key){
                return i ;
            }
        } return -1 ;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int number[] = { 2 , 4 , 6 , 3 , 9 };
        System.out.print("Enter your key = ");
        int key = sc.nextInt() ;

        int index = linearSearch(number, key);
        if(index==-1){
            System.out.println(" NOT FOUND");
        }else{
        System.out.println("FOUND = " +index);
        }
    }
    
}
