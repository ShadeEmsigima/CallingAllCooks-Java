package ingredients;
import enumerators.*;
import tools.ICuttable;

public class Beef implements ICuttable{
    String name = "beef";
    public String description = "a succulent bit of moo moo meat.";
    public EType type = EType.MEAT;
    public EForm form = EForm.CHUNK;

    public Beef(){
        System.out.println("Using beef");
    }

    @Override //from interface ICuttable
    public void Cut() {
        System.out.println("Beef - Cutting a " + form.toString().toLowerCase() + " of beef...");
        this.form = EForm.SLICED;
        System.out.println("Beef - ...beef is now " + this.form.toString().toLowerCase() + "!");
    }
}
