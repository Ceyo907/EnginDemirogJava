package EnginDemiroğJavaGun02Odev._13_PolymorphismDemo;

public class _01_PolymorphismDemo {
    public static void main(String[] args) {
        //FileLogger,EmailLogger,DatabaseLogger hepsi birer BaseLogger olduğundan int string hepsini verebiliriz.

//       BaseLogger[]loggers=new BaseLogger[]{new FileLogger(),new EmailLogger(),new DatabaseLogger(),new ConsoleLogger()};
//
//       for (BaseLogger logger:loggers){
//        logger.Log("Log mesajı");
//
//       }

        CustomerManager customerManager=new CustomerManager(new FileLogger()); //Polymorphism
        customerManager.add();
    }
}
