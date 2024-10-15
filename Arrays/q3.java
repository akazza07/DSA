package Arrays;

public class q3 {
    public static int buyandsell(int prices[]){
        int buysell =Integer.MAX_VALUE;
         int maxprofit = 0 ; 

        for( int i =0 ; i < prices.length ; i++){
            if(buysell < prices[i]){
                int profit = prices[i] - buysell ;
                maxprofit = Math.max(maxprofit , profit );
            } else {
                buysell = prices[i];
            }
        } return maxprofit ;
    }
    public static void main(String[]args){
        int prices[] = { 7 , 6 , 4 , 3 , 1 };
        System.out.println(buyandsell(prices));
    }
}
