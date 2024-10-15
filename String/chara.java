package String;

public class chara {
    public static void printletter(String str){

        for(int i = 0 ; i < str.length() ; i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
    public static void main(String[]args){
        String s1 = "akash";
        String s2 = "Rai";
        String fullname = s1 + " " + s2;

        printletter(fullname);
    }
    
}
