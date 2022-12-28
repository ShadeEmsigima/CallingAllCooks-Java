//the standard game manager as of dec 28 2022
package gameManagers;
import ingredients.*;
import tools.*;
import processors.*;
import processors.processorModules.*;

public class StandardGM extends GameManager{

    String welcomeMsg = "Welcome to calling all cooks!";
    String loadingMsg = "Preparing kitchen..." ;

    //store players' custom items here
    public Knife gmknife = new Knife();
    public Beef gmbeef = new Beef();
    public Stove gmstove = new Stove();
    public Pan gmpan = new Pan();

}
