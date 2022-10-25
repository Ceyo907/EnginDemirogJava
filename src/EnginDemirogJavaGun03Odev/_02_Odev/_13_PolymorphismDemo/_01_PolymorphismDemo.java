package EnginDemirogJavaGun03Odev._02_Odev._13_PolymorphismDemo;
//Loglama: Sistemin davranışlarını kayıtl altına,alma kontrol etme sistemidir.
public class _01_PolymorphismDemo {
    public static void main(String[] args) {
        //FileLogger,EmailLogger,DatabaseLogger hepsi birer BaseLogger olduğundan int string hepsini verebiliriz.

 //      BaseLogger[]loggers=new BaseLogger[]{new FileLogger(),new EmailLogger(),new DatabaseLogger(),new ConsoleLogger()};

 //      for (BaseLogger logger:loggers){
 //       logger.log("Log mesajı");

        System.out.println("-------------");
        CustomerManager customerManager=new CustomerManager(new FileLogger()); //Polymorphism
        customerManager.add();
    }
}
