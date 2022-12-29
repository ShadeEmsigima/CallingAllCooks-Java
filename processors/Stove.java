package processors;

import javax.management.RuntimeErrorException;

import enumerators.EHeat;
import processors.processorModules.ProcessorModule;

public class Stove extends Processor {
    String name = "Stove";
    String description = "Select a pan or pot to cook in!";
    EHeat heat = EHeat.OFF;

    private ProcessorModule module;


    public Stove(){
        System.out.println("Stove - stove ready");
    }

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

    public void SetHeat(String s){
        s.toLowerCase();
        s.trim();
        switch (s) {
            case "off":
                heat = EHeat.OFF;
                break;
            case "low":
                heat = EHeat.LOW;
                break;
            case "medium":
                heat = EHeat.MEDIUM;
                break;
            case "high":
                heat = EHeat.HIGH;
                break;   
            default :throw new RuntimeErrorException(null, "No matching heat name. View available options in Stove.SetHeat()");             
        }
    }
}
