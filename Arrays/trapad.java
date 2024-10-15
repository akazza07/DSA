package Arrays;

public class trapad {
    public static int trap(int height[]){

        int n = height.length ;

        int trap = 0 ;
        int left = 0 ;
        int right = n - 1 ;
        int leftmax = height[left];
        int rightmax = height[right];

        // loops
        while(left<right){
            if(leftmax<rightmax){
            leftmax = Math.max(leftmax , height[left]);
            trap += leftmax - height[left];
            left++;

        }else{
            rightmax =Math.max(rightmax ,height[right]);
            trap += rightmax - height[right];
            right-- ;
        }
    } return trap ;
    }
    public static void main(String[]args){
        int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println("The trappped water is = "+trap(height));
    }
    
}
