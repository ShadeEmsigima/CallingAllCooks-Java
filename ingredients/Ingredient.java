// this is the parent class of all ingredients: toppings, meats, fish, vegetables etc.
package ingredients;
// Parent class of any ingredient
import enumerators.*;

public abstract class Ingredient {
    public String name;
    public String description;
    public EType type;
    public EForm form;
}
