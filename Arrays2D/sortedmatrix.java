package Arrays2D;

import java.util.*;

public class sortedmatrix {
    
    // By using linaer search sorting
    public static int linearsorting(int nums[][] , int key){

        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                if(nums[i][j]==key){
                    System.out.print("found at cell ("+i+","+j+")");
                    return i ;
                }
            }
        } return -1; 
    }

    // i.e left to bottom condition 
    public static boolean staircaseSearch(int matrix[][] , int key){
        int rows = 0 , colm = matrix[0].length-1;

        while(rows < matrix.length && colm >= 0 ){
            if(matrix[rows][colm]==key){
                System.out.println("Found key at (" + rows + "," + colm + ")");
                return true ;
            } else if ( key < matrix[rows][colm]){
                colm--;
            }else{
                rows++;
            }
        } 
        System.out.println("Key not Found");
        return false;
    }

    // i.e top to right condition 
    public static boolean ToptoRight(int matrix[][] , int key ){
         int rows = matrix.length-1 , colm = 0 ;

         while( rows < matrix.length && colm >= 0){
            if(matrix[rows][colm]==key){
                System.out.println(" Found key at ("+rows+","+colm+")");
                return true;
            } else if ( key < matrix[rows][colm]){
                rows--;
            }else{
                colm++;
            }
         }
         System.out.println("Key not Found");
         return false;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int nums[][] = {  {10,20,30,40},
                          {15,25,35,45},
                          {27,29,37,48},
                          {32,33,39,50}  };
        System.out.print("Enter your key = ");
        int key = sc.nextInt();
              ToptoRight(nums, key);
    
         } 
         } 
       
