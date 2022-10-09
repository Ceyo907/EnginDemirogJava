package EnginDemiroğJavaGun03Odev._02_Odev._13_PolymorphismDemo;

public class DatabaseLogger extends BaseLogger{
    //Override

    public void log(String message){
        System.out.println("Logged to database: " + message);

    }

}
