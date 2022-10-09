package EnginDemiroğJavaGun03Odev._02_Odev._14_Overiding;

public class BaseKrediManager {
    public double hesapla(double tutar){
//OgrenciKrediManagerdeki hesapla methodu final dediğimizde override edilemez.
        return tutar * 1.18;
    }



}
