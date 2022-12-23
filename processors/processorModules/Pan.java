package processors.processorModules;

import ingredients.Ingredient;

public class Pan extends ProcessorModule {
    Ingredient contents; //not sure wheter this should sit on parent instead

    public Pan(){
        System.out.println("Pan - pan ready");
    }
}
