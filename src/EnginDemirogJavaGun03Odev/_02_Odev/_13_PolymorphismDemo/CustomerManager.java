package EnginDemirogJavaGun03Odev._02_Odev._13_PolymorphismDemo;

public class CustomerManager {
    private BaseLogger logger; //base nesne ile çalıştık

    public CustomerManager(BaseLogger logger){ //Burda aslında database logger var
        this.logger=logger;

    }

    public void add(){
        System.out.println("Müşteri Eklendi"); //Bir classı başka bir clasın içinde newlemek o class a bağımlılığı arttırır.
            this.logger.log("log mesajı");
  //      DatabaseLogger logger=new DatabaseLogger();
  //      logger.log("Log mesajı");

    }
}
