package OOPs;

public class inheritance {
    public static void main(String []args){
       /*  fish shark = new fish();
        shark.eat();
        shark.swim();
        
       */
        

       /*  Dog luffy = new Dog();
        luffy.eat();
        luffy.legs = 5 ;
          System.out.println("Having another legs that u cant imagine = "+luffy.legs);

       */

       Parrot pintu = new Parrot();
       pintu.eat();
       pintu.fly();
       pintu.breate();
       pintu.legs = 2 ;
       System.out.println("Agr mera per h to ? = "+pintu.legs);

    }
    
}
/*
      // Single level inheritance 

// Base class
class Animal{
    String color;
    void eat(){
        System.out.println("can meat");
    }
    void breate(){
        System.out.println("breate vape");
    }
}
// Derived class / sub-class 
class fish extends Animal {
    void swim(){
        System.out.println("can't swim bcoz i.e water is icing me ");
    }
}


 */
 
  // Multi level inheritance  

 /* 
 class Animal{
    String color;
    void eat(){
        System.out.println("can meat");
    }
    void breate(){
        System.out.println("breate vape");
    }
}

 class Mammal extends Animal{
    int legs ;
 } 
  
  class Dog extends Mammal{
    String breed ;
  } 
  
  */

  // heirarchial inheritance / Hybrid inheritance 

  class Animal{
    String color;
    void eat(){
        System.out.println("EAT = can meat");
    }
    void breate(){
        System.out.println("BREATE = breate vape");
    }
}

   class Mammal extends Animal{
    void walk(){
        System.out.println("WALK = 1600m ho gya sahab");
    }
    }
   
   class Fish extends Animal {
    void swim(){
        System.out.println("SWIM = Can't swim");
    }
   }

   // derived classs of Animal class
   class Bird extends Animal{
    void fly(){
        System.out.println("FLY = agr maan hu to !!!");
    }
    int legs;


   }
 // derived class of Bird class
   class Parrot extends Bird{
    void sing(){
        System.out.println(" SING = Meri marziiiii");
    }
   }
