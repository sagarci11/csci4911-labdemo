import java.util.Scanner;

public class hello {
    
    

    public static void main(String args[]){
        //System.out.println("hello");
        greeting("hello");
    }

    public static void greeting2(){
        Scanner input = new Scanner (System.in);
        String msg = input.nextLine();
        System.out.println(msg);
        input.close();
        
    }
    public static void greeting(String msg){
        System.out.println(msg);
    }
}