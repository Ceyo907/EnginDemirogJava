package EnginDemirogJavaGun03Odev._02_Odev._14_Overiding;

public class OgrenciKrediManager extends BaseKrediManager{
    //BaseKrediManagerin referansı var ama hesapla fonksiyonunu öğrenci için uyarladık.
    public double hesapla(double tutar){

        return tutar * 1.10;

    }

}
