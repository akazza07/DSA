package OOPs;

public class copyconstructor {
    public static void main (String []args){
        Student s1 = new Student();
        s1.name = ("aka");
        s1.roll = (5);
        s1.password = "abc";
        s1.marks[0] = 100;
        s1.marks[1] = 78;
        s1.marks[2] = 86;

        Student s2 = new Student(s1);
        s2.marks[0] = 69;
        for(int i = 0 ; i<3 ;i++){
            System.out.println(s2.marks[i]);
        }
    }
} 
class Student {
    String name;
    int roll;
    String password;
    int marks[];

    // shallow copy
    /*  Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        this.marks = s1.marks;
    }
      */

     // deeep copy
     Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;

        for(int i = 0 ; i < marks.length ; i++){
           this.marks[i] = s1.marks[i] ;
        }
     } 
    Student(){
        marks = new int[3];
         System.out.println("Constructor is called...");
    }
    Student(String name , int roll){
        marks = new int[3];
        this.name = name ;
        this.roll = roll ;
    }
    
}
