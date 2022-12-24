import java.time.LocalTime;
import java.util.Scanner;

import javax.management.StringValueExp;

import ingredients.*;
import processors.Stove;
import processors.processorModules.Pan;
import tools.*;

class RunCAC{

    public static void main(String[] args) {
        
        Start();
        Scanner sc = new Scanner(System.in);
        String reply;

        Knife knife = new Knife();
        Beef beef = new Beef();
        Stove stove = new Stove();
        Pan pan = new Pan();
        
        System.out.println("-------------------");

        knife.Slice(beef);
        stove.Setmodule(pan);
        
        stove.Setmodule(pan);


        LocalTime y = LocalTime.now();
        reply = sc.nextLine();
        System.out.println("You typed: " + reply);
        beef.Cook(y.toString());

        
        sc.close();
        Stop();
    }

    static void Start(){

        System.out.println("======================= \n");
        
        System.out.println("Welcome to Calling all Cooks!" + "\n \n" + "---Preparing kitchen...---");
    }
    static void Stop(){
        System.out.println("\n" + "=======================");
    }

}