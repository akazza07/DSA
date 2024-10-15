package Recursion;

public class problem {
    // print number from n to 1 ( Decresing order )
    public static void printDec(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }
    // print number from 1 to n ( incresing order )
    public static void printInc( int n){
        if(n == 1){
            System.out.print(1);
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");
    }
    // print factorial of a number n
    public static int fact(int n){
        if( n == 0 ){
            return 1 ;
        }
        int fnm1 = fact(n-1);
        int fn = n * fact(n-1);
        return fn;
    } 
    // print sum of first n natural number 
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        int Snm1 = sum(n-1);
        int Sn = n + Snm1;
        return Sn ; 
    }
    // print nth fibonacci number 
    public static int fib(int n){
        if( n == 0 || n == 1){
            return n ;
        }
        int fnm1 = fib(n-1);
        int fnm2 = fib(n-2);
        int fn = fnm1 + fnm2;
        return fn ;
    }
    // check is array is sorted or not 
    public static boolean isSorted(int arr[], int i){
        if (i==arr.length-1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }
    // WAF to find the first occurence of an element in an array
    public static int firstoccurence(int arr[],int key , int i){
        if(i==arr.length){
            return -1;        }
    
    if(arr[i]==key){
        return i;
    }
    return firstoccurence(arr,key,i+1);
      }
     //WAF to find that lastoccurence of an element in an array
     
     public static int lastoccurence(int arr[], int key , int i){
     
        if(i==arr.length){
            return -1;
        }
        int isfound = lastoccurence(arr,key,i+1);

        if(isfound==-1 && arr[i]==key){
            return i ;
        }
        return isfound;
     }
     // print x^n 
     public static int power ( int x , int n){
        if(n==0){
            return 1;
        }
        int xnm1 =power(x,n-1);
        int xn = x * xnm1;
        return xn;
     }
     //print x^n but optimized code in 0(logn)
     public static int opti(int a , int n){
        if(n == 0){
            return 1;
        }
        
        //int halfpowersq = opti(a , n/2) * opti(a, n/2);
         
        int halfpower = opti(a,n/2);
         int halfpowersq = halfpower * halfpower ; 

         if(n%2!=0){
            halfpowersq = a * halfpowersq ;
         }
         return halfpowersq ; 
     }
     //tiling problem 
     /*
     Given a "2*n" board and tiles of size "2*1", count the number of ways to tile the given board using the 2*1 tiles.
     ( A tile can either be placed horizontally or vertically) 
      */
       public static int tiling(int n){
       //base case
       if(n == 0 || n == 1){
        return 1 ;
       }
       // kaam 
       // vertical 
        int fnm1 = tiling(n-1);

        // horizontal 
        int fnm2 = tiling(n-2);
       // call inner fx
        int totalways = fnm1 + fnm2 ; 
        return totalways ; 
        
         }

     // Remove duplicate in a string --> "appnnacollege"

     // Friends pairing problem 
     /*
     Given n friends, each person can remain single or can be paired up with some other person.
     Each friend can be paired only once.
     find out the total number of ways in which friends can remain single or can be placed up.
    */
    
    public static int friendspairing(int n){
        if (n==1 || n==2 ){
            return n ;
        }
        // choice 
        // single 
        int fnm1 = friendspairing(n-1);
        //pair
        int fnm2 = friendspairing(n-2);
        int pairways = (n-1)*fnm2;
        // totalways
        int totalways = fnm1 + pairways ;
        return totalways ;
    }

    /*  Binary strings problem 
     Print all binany strings of size N without consecutive ones.
    */ 
    public static void binarystring(int n , int lastplace , String str){
        // base case 
         if(n==0){
            System.out.println(str);
            return ;
         }
         // kaam
          binarystring(n-1,0,str+"0");
          if(lastplace==0){
            binarystring(n-1,1,str+"1");
          }
    }
     public static void main (String []args){
       // int n = 5;
      //System.out.println(sum(n));
      
      //int arr[] = {20,10,30,40,50,10,90};
      //System.out.println(lastoccurence(arr, 50, 0));
      //int a = 2 ; 
      //int n = 5;
      //System.out.println(opti(a,n));
      
     binarystring(3,0,"") ;
    }
    
}
