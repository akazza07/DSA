package Recursion;

public class q2 {
    static String digit[] = { "Zero","One","Two","Three","Four","Five","Six","Seven","Eight",
    "Nine"};
    public static void printdigit(int num){
        if(num==0){
            return;
        }
        int lastdigit = num % 10 ;
        printdigit(num/10);
        System.out.print(digit[lastdigit]+" ");
    }
    public static void main(String[]args){
        printdigit(2024);
        System.out.println();
    }
}
