package EnginDemirogJavaGun03Odev._02_Odev._17_Interfaces;
//
public class MySqlCustomerDal implements ICustomerDal,IRepository{//MySql için add operasyonu
    @Override
    public void add() {
        System.out.println("My Sql eklendi");
    }
}
