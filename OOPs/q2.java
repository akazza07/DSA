package OOPs;

public class q2 {
    public static void main(String []args){
            Car car = new electricCar();
            System.out.println(car.drive());
    }
}
class automobile {
    private String drive (){
        return "Driving vehicle";
    }
}
class Car extends automobile{
    protected String drive(){
        return "Driving car ";
    }
}
class electricCar extends Car {
    public String drive (){
        return "Driving Electric Car ";
    }
}
