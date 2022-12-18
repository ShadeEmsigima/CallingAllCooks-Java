// this is the parent class of all ingredients: toppings, meats, fish, vegetables etc.
package ingredients;
// Parent class of any ingredient
import enumerators.*;

public abstract class Ingredient {
    String name;
    public String description = "This ingredient can be used as a component in a dish.";
    EType type;
    EForm form;
}
