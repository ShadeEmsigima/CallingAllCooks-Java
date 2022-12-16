import ingredients.*;

class RunCAC{

    public static void main(String[] args) {
        Start();

        Beef beef = new Beef();
        beef.Cut();
        
        Stop();
    }

    static void Start(){
        System.out.println("======================= \n");
        
        System.out.println("Welcome to Calling all Cooks!" + "\n");
    }
    static void Stop(){
        // functionality when closing the program. Remember to close things like scanners here too
        System.out.println("\n" + "=======================");
    }

}