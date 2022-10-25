package EnginDemirogJavaGun03Odev._02_Odev._17_Interfaces;

public class _01_Interfaces {
    //Classlar birden fazla interface i implemente edebilir.Fakat bir tane class ı extend edebilir.
    //Interfacelerde inheritance yerine implements kabul edilir.
    //Abstractlar gibi newlenemezler.
    //Operasyonu implemente edilmesi gereken durumlarda kullanılır.
    public static void main(String[] args) {
        ICustomerDal customerDal=new OracleCustomerDal(); //Interfaceler onu implement eden classın referansını tutabilir.

        CustomerManager customerManager=new CustomerManager(new MySqlCustomerDal());
 //     customerManager.customerDal=new OracleCustomerDal();//Customer Manager Oracle ile çalışacak
 //     customerManager.customerDal=new MySqlCustomerDal();
        customerManager.add();
    }
}
