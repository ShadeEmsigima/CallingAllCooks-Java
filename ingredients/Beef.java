package ingredients;
import enumerators.*;

public class Beef {
    String name = "beef";
    public String description = "a succulent bit of cow-meat.";
    public EType type = EType.MEAT;
    public EForm form = EForm.CHUNK;

    public Beef(){
        System.out.println("Using beef");
    }
}
