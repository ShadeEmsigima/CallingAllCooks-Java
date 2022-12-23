package ingredients;
import enumerators.*;
import tools.ISliceable;

public class Beef implements ISliceable{
    String name = "beef";
    public String description = "a succulent bit of moo moo meat.";
    public EType type = EType.MEAT;
    public EForm form = EForm.CHUNK;

    public Beef(){
        System.out.println("Beef - beef ready");
    }

    @Override //from interface ICuttable
    public void Slice() {
        System.out.println("Beef - Slicing a: " + form.toString().toLowerCase() + " of beef...");
        this.form = EForm.SLICED;
        System.out.println("Beef - ...beef is now: " + this.form.toString().toLowerCase() + "!");
    }
}
