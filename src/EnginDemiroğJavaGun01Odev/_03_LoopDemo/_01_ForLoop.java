package EnginDemiroğJavaGun01Odev._03_LoopDemo;

public class _01_ForLoop {
    public static void main(String[] args) {
        // Döngü : Bir programda birbirine benzeyen işlemleri tekrarlamaya yarar
        //Veritabanından bir öğrenci listesini yazdırmak için döngülerden yararlanırız.

        //For
        //i=1 --> sayaç tanımı
        //i<10 -->şart
        //i++ --> sayacın kaçar arttığını gösterir.

        for (int i = 2; i <= 10; i+=2) {  //11'de içeri girmek yerine döngüden çıkarak for'un altındaki coları çalıştırır
            System.out.println(i);
        }
        System.out.println("Döngü bitti");
    }
}
