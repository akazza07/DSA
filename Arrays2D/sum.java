package Arrays2D;

public class sum {
    public static void main(String[]args){
        int arr[][] = { {1,4,9},
                        {11,4,3},
                        {2,2,3} };
        int sum = 0 ;
         
        // print sum of second rows
        for(int j = 0 ; j < arr[0].length ;j++){
            sum += arr[1][j];
        }
        System.out.println("Sum of Second row is = " + sum);
    }
}
