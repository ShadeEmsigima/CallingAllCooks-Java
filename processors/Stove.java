package processors;

import enumerators.EHeat;
import processors.processorModules.ProcessorModule;

public class Stove extends Processor {
    String name = "Stove";
    String description = "Select a pan or pot to cook in!";
    EHeat heat;

    private ProcessorModule module;

    public void Setmodule(ProcessorModule m){
        
        // check if the stove is vacant
        if(module == null){
            module = m;
            System.out.println("Stove - A " + module.getClass().getSimpleName() + " has been placed on the stove");
        } else {
            System.out.println("Stove - Stove is already occupied!");
        }
        }
        

    public void PrintModule(){
        System.out.println(module.getClass().getSimpleName());
    }

}
