package Arrays2D;

public class transpose { 
    public static void printmatrix(int matrix[][]){
        System.out.println("The matrix is = ")
;
        for(int i = 0 ; i < matrix.length ; i++){
            for(int j = 0 ; j < matrix[0].length ; j++){
                System.out.print(matrix[i][j] + " ");
            }
        } System.out.println();

    }
    public static void main(String[]args){
        int rows = 2 , colm = 3;
        int matrix[][] = { {1,2,3},
                           {4,5,6} };

         printmatrix(matrix);
         
         int transpose[][] = new int[colm][rows];
            for(int i = 0 ; i < rows ; i++){
                for(int j = 0 ; j < colm ; j++){
                    transpose[j][i]=matrix[i][j];
                }
            }
        printmatrix(transpose);
    }
    
}
