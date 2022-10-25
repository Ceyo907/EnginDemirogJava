package EnginDemirogJavaGun03Odev._02_Odev._13_PolymorphismDemo;

public class EmailLogger extends BaseLogger{
    //Overrride

    public void log(String message){
        System.out.println("Logged to email: " + message);

    }
}
