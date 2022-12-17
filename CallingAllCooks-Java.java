import ingredients.*;
import tools.*;

class RunCAC{

    public static void main(String[] args) {
        
        Start();
        Knife knife = new Knife();
        Beef beef = new Beef();
        
        knife.Slice(beef);
        
        Stop();
    }

    static void Start(){

        
        System.out.println("======================= \n");
        
        System.out.println("Welcome to Calling all Cooks!" + "\n");
    }
    static void Stop(){
        // functionality when closing the program. Remember to close things like scanners here too
        System.out.println("\n" + "=======================");
    }

}