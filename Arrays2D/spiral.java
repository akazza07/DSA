package Arrays2D;

public class spiral {
    public static void spiral(int num[][]){

        int startrows = 0 ;
        int startcolm = 0 ;
        int endrows = num.length-1;
        int endcolm = num[0].length-1;

        // loops 

        while( startrows <= endrows && startcolm <= endcolm ){

            // top line horizontal row

            for( int j = startcolm ; j <= endcolm ; j++){
                System.out.print(num[startrows][j]+" ");
            }
            
            // right side vertical column

            for ( int i = startrows + 1 ; i <= endrows ; i++){
                System.out.print(num[i][endcolm]+" ");
            }

            // bottom side horizontal rows , who is really really down 

            for ( int j = endcolm - 1 ; j <= startcolm ; j--){
                if(startrows==endrows){
                    break;
                }
                System.out.print(num[endrows][j]+" ");
            }
            
            // left side , downward vertical column 

            for ( int i = endrows - 1 ; i>= startrows + 1 ; i--){
                if(startcolm==endcolm){
                    break;
                }
                System.out.print(num[i][startcolm]+" ");
            }
            startrows++;
            startcolm++;
            endrows--;
            endcolm--;
        }
        System.out.println();

    }
    public static void main(String[]args){
         int num[][] = {{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};

         spiral(num);
    }
    
}
