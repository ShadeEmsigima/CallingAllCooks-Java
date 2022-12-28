// this is a class in which game-global values are stored.
package gameManagers;
import java.util.Scanner;

import tools.Knife;

public abstract class GameManager {
    public final static Scanner sc = new Scanner(System.in);
    public static String reply;

    String welcomeMsg = "GameManager - Welcome to Caling all Cooks!";
    String loadingMsg = "GameManager - Loading game";
    String seperator = "GameManager - =======================";

    public void Start(){
        System.out.println(seperator);
        System.out.println(welcomeMsg + "\n \n" + loadingMsg);
     }

    public void Stop(){
        sc.close();
        System.out.println("End of game");
    }
}
