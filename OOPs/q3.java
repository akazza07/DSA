package OOPs;

public class q3 {
    public static void main(String[]args){
                    shape sc = new circle();
                    sc.display();
    }
}
 class shape{
    protected void display(){
        System.out.println("Display-base");
    }
}
class circle extends shape {
    public void display(){
        System.out.println("Display-derived");
    }
}