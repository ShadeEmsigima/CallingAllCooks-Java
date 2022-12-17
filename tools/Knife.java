package tools;


public class Knife { // insert methods with actions you can do with a knife on ingredients
    public void Slice(ISliceable slicable){
        System.out.println("Knife - Preparing the knife to slice");
        slicable.Slice();
    }
    
    /*
    *   void Dice(IDiceable dicable){}
    *   etc.
    */

}
