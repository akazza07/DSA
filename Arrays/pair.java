package Arrays;

public class pair {
    public static void printpair(int number[]){
        int totalpair = 0 ;

        for(int i = 0 ; i<number.length ; i++){
            int current = number[i];
            for(int j = i + 1 ; j<number.length ; j++){
                System.out.print("(" + current + "," + number[j] + ")");
              totalpair++;
            }
            System.out.println();
        }
              System.out.println("Total Pair is = " +totalpair);

    }
    public static void main(String[]args){
        int number[] = { 2 , 4 , 6 , 8 , 10 };
        printpair(number);

    }
    
}
