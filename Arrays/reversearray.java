package Arrays;

public class reversearray { 
    public static void reversearray(int number[]){
        int start = 0 , last = number.length-1;

        while(start<last){
             // swap
             int temp = number[last];
             number[last] = number[start];
             number[start] = temp;

             start ++ ;
             last -- ;
        }
    }
    public static void main(String[]args){
        int number[] = { 1 , 6 , 8 , 7 , 6 , 8 , 0 };
        reversearray(number);

        // print 
        for(int i = 0 ; i < number.length ; i++){
            System.out.print(number[i] +" ");
        }
    }
    
}
