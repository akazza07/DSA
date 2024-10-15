package Arrays2D;

public class sevens{
    public static void main(String[]args){
        int arr[][] = {{4,7,8},
                       {8,8,7}};

          int sum =0 ;
          
          for(int i = 0 ; i < arr.length ;i++){
            for(int j = 0 ; j < arr[0].length ;j++){
                if(arr[i][j]==7){
                    sum++;
                }
            }
          }
          System.out.println("The number of 7s = "+sum);
    }
}