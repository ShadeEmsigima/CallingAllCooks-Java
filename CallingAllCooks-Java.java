import ingredients.*;
class RunCAC{

    public static void main(String[] args) {
        Start();

        System.out.println("Welcome to Calling all Cooks!" + "\n");
        Beef b = new Beef();
        
        Stop();
    }

    static void Start(){
        System.out.println("======================= \n");
    }

    static void Stop(){
        System.out.println("\n" + "=======================");
    }

}