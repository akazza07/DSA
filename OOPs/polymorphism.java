package OOPs;

public class polymorphism {
    public static void main (String []args){
            Calculator calc = new Calculator();
            System.out.println("Total = "+calc.sum(1,2));
            System.out.println("Total = "+calc.sum((float)1.5,(float)2.5));
            System.out.println("Total = "+calc.sum(1,2,3));
            
            human aka = new human();
            aka.eat();

        }
} 
// Methods Overloading 

class Calculator {
    int sum ( int a , int b ){
        return a + b ;
    }
    float sum ( float a , float b ){
        return a + b ;
    }
    int sum ( int a , int b , int c){
        return a + b + c ;
    }
}
class human {
    void eat(){
        System.out.println("eats anything");
    }

}
class Akaza extends human {
    void eat(){
        System.out.println("only eat as they like it ");
    }
}
