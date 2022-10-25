package EnginDemirogJavaGun03Odev._01_Odev;

public class TeacherCreditManager extends BaseCreditManager implements ICreditManager{
//BaseCreditManagerdaki calculate i kullanıyoruz.Abstract classlarda tamamlanmamış operasyon yazabiliriz


    @Override
    public void calculate() {
        System.out.println("Öğretmen Kredisi Hesaplandı");
    }

}
