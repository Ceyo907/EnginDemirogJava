package EnginDemiroğJavaGun03Odev._02_Odev._12_InheritanceDemo;

public class _01_InheritanceDemo {
    public static void main(String[] args) {
        KrediUI krediUI=new KrediUI();
        //Polimorphism
        krediUI.KrediHesapla(new AskerKrediManager());//OgretmenKrediManager'ın  içindeki kod burada da çalışır
                                        //BaseKrediManager , ogretmenin de tarımın da referansını tutabilir(referans tip)
    }
}
