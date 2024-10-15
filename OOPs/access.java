package OOPs;

public class access { 
    public static void main(String[]args){
        BankAccount myacc = new BankAccount();
        myacc.username = ("Akazza");
        System.out.println(myacc.username);
        myacc.setpassword("huhjk");   // password has been set not accessable
    }   
}
class BankAccount {
    public String username ;
    private String password ;
    public void setpassword(String pwd){
        password = pwd ;
    }
}
