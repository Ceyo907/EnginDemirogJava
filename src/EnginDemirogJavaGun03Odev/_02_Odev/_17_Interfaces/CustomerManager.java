package EnginDemirogJavaGun03Odev._02_Odev._17_Interfaces;

public class CustomerManager {
    private ICustomerDal customerDal;

    public CustomerManager(ICustomerDal customerDal){
        this.customerDal=customerDal;//CustomerManager'ın constructorunda birtane customerDal istiyoruz.

    }
    public void add(){
      //İş kodları yazılır.
      //OracleCustomerDal oracleCustomerDal=new OracleCustomerDal(); -->Geçmiş olsun bağımlıyız.Sadece Oracle'da çalışır.

        customerDal.add();


    }
}
