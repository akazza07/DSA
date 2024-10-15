package Arrays;

public class kadanas {
    public static void kadanas(int number[]){
        int maxsum = Integer.MIN_VALUE;
        int currsum = 0 ;

        for(int i = 0 ; i < number.length ; i++){
            currsum = currsum + number[i];
            if(currsum<0){
                currsum = 0;
            }
            maxsum = Math.max(currsum,maxsum);    
        }
       System.out.println("Our Max subarray sum is = "+maxsum);    
    }
    public static void main(String[]args){
        int number[] = { 1 , -2 , 6 , -1 , 3 };
        kadanas(number);
    }
    
}
