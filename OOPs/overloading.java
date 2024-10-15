package OOPs;

public class overloading {
    public static void main(String []args){
        Calculator calc = new Calculator();
        System.out.println(calc.sum(4,6));
        System.out.println(calc.sum((float)3.6,(float)6.4));
        System.out.println(calc.sum(7,3,5));

    }
}
class Calculator{
    int sum(int a , int b){
        return a + b ;
    }
    float sum (float a , float b ){
        return a + b ;
    }
    int sum (int a , int b , int c){
        return a + b + c ;
    }
}
