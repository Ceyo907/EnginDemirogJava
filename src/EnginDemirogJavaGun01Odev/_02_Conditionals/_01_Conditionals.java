package EnginDemirogJavaGun01Odev._02_Conditionals;

public class _01_Conditionals {
    public static void main(String[] args) {
        int sayi=24;
        if (sayi<20){       //Sart bloğu geçerli ise parantez içini çalıştır.
            System.out.println("Sayı 20 den küçüktür");

        }
        if (sayi<15){
            System.out.println("Sayı 15 ten küçüktür");

        }else {             //Şart bloğunun dışındaki durumda
            System.out.println("Sayı 20 den küçük değildir.");
        }


        //Defensive Programming (Bütün olasılıkları kaçırmama)
        int sayi2=24;
        if (sayi2<20){       //Sart bloğu geçerli ise parantez içini çalıştır.
            System.out.println("Sayı 20 den küçüktür");

        }else if(sayi2==20) {     //Tek eşittir değer atama ,Çift eşittir if operatörü
            System.out.println("Sayı 20 den küçük değildir.");
        }else {     //Bütün bbu durumların dışında

            System.out.println("Sayı 20'den büyüktür.");

        }






    }
}
