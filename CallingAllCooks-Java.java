import java.time.LocalTime;
import java.util.Scanner;

import javax.management.StringValueExp;

import gameManagers.GameManager;
import gameManagers.StandardGM;
import ingredients.*;
import processors.Stove;
import processors.processorModules.Pan;
import tools.*;

class RunCAC{

    public static void main(String[] args) {
        GameManager gm = new StandardGM();
        gm.Start();
        
        String reply = gm.reply;


        Knife knife = ((StandardGM) gm).gmknife;
        System.out.println("using " + knife.getClass().getSimpleName());
        Beef beef = new Beef();
        Stove stove = new Stove();
        Pan pan = new Pan();
        
        System.out.println("-------------------");

        knife.Slice(beef);
        stove.Setmodule(pan);
        
        stove.Setmodule(pan);


        System.out.println("Type anything to start cooking");
        reply = gm.sc.nextLine();
        LocalTime y = LocalTime.now();
        System.out.println("Cooking has started, type anything to stop");
        reply = gm.sc.nextLine();
        beef.Cook(y.toString());

        
       
        gm.Stop();
    }

    static void Stop(){
        System.out.println("\n" + "=======================");
    }

}