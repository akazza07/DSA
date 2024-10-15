package Arrays;

import java.util.HashSet;

public class q1 {
    public static boolean containdupilicate(int num[]){

        for( int i=0 ; i<num.length ; i++){
            for( int j = 1 ; j < num.length ; j++){
                if( num[i]==num[j]){
                      return true ;
                }
            }
        } return false ;
    }
    public static boolean containsDuplicate(int nums[]) {

          HashSet<Integer> set = new HashSet<>();
          
             for(int i=0; i<nums.length; i++) {
               if(set.contains(nums[i])) {
                 return true;
                  } else {
                    set.add(nums[i]);
                       }
                    }
                 return false;
                     }
    public static void main(String []args){
        int nums[] = { 1 , 2 , 3 , 1};
        int num[] =  { 1 , 2 , 3 , 4 };
        System.out.println(containdupilicate(nums));
         

    }
    
}
