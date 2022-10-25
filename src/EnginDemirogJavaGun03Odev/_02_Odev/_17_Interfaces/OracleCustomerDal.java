package EnginDemirogJavaGun03Odev._02_Odev._17_Interfaces;

public class OracleCustomerDal implements ICustomerDal{//Oracle için add operasyonu
    @Override
    public void add() {
        System.out.println("Oracle eklendi");
    }
}
