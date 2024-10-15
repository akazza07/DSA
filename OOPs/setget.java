package OOPs;

public class setget {
    public static void main(String[]args){
            Pen p1 =new Pen();
            p1.setcolor("blue");
            System.out.println(p1.getcolor());
            p1.settip(5);
            System.out.println(p1.gettip());

            // student object create
            Student s1 = new Student();
            s1.calPencentage(56, 68,78);
            System.out.println(s1.pencentage);
     

    }
}

class Pen {
    private String color ;
    private int tip ;

    // getter access specfier 
    String getcolor(){
        return this.color;
    }
    int gettip(){
        return this.tip;
    }

    /// setter access specfier 

    void setcolor(String newcolor){
        this.color = newcolor;
        }
    void settip(int newtip){
        this.tip  = newtip ;
    }    
}

class Student {
    String name;
    int age ;
    float pencentage ;

    void calPencentage(int phy , int chem , int maths){
        pencentage = ( phy + chem + maths) / 3 ;

    }
}
