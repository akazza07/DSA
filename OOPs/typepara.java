package OOPs;

public class typepara {
    public static void main(String[]args){
         //Player jorden = new Player();
        Player curry = new Player(7);


    }
}
class Player {
    
    String name ;
    int jerseynumber ;

    Player(){
        System.out.println("New player is added in NBA");
    }
  
    Player(int jerseynumber ){
        this.jerseynumber = jerseynumber;
    }
    

}
         


