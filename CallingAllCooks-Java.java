import ingredients.*;
import processors.Stove;
import processors.processorModules.Pan;
import tools.*;

class RunCAC{

    public static void main(String[] args) {
        
        Start();
        Knife knife = new Knife();
        Beef beef = new Beef();
        Stove stove = new Stove();
        Pan pan = new Pan();
        
        System.out.println("-------------------");

        knife.Slice(beef);
        stove.Setmodule(pan);
        
        stove.Setmodule(pan);
        

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