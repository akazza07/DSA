package Arrays;

public class maxSA1ad {
    public static void maxSumarray(int number[]){
        int currsum = 0 ;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[number.length];
        prefix[0] =  number[0];
        // calculate prefix arrays
        for(int i = 1 ; i < number.length ; i++){
            prefix[i] = prefix[i-1] + number[i];
        }

        // nested loops

        for(int i = 0 ; i<number.length;i++){
            int start = i ;
            for(int j = i ; j<number.length ;j++){
                int end = j ;
                 currsum = start==0 ? prefix[end] : prefix[end] - prefix[start-1];
            
                if( maxSum < currsum){
                    maxSum = currsum ;
                }
            }
        }
      System.out.println("Max subarray is = "+maxSum);

    }
    public static void main(String[]args){
        int number[] = { 1 , -2 , 6 , -1 , 3 };
        maxSumarray(number);
    }
    
}
