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
        System.out.println("\n" + "=======================");
    }

}