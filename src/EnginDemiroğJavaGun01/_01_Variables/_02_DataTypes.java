package EnginDemiroğJavaGun01._01_Variables;

public class _02_DataTypes {
    public static void main(String[] args) {
        // Java tip güvenli bir dildir.Değişken tanımladığımızda değişkenin türünün ne olduğunu bilmek ister.
        byte sayi=12;       //Bellekte 1 byte yer tutar
        sayi=127;
        sayi=-128;

        short sayi1=32767;      // 2 byte
        sayi1=-32768;

        int sayi2=12;           // 4 byte
        sayi2 = 2147483647;     // 8 byte lık veri tuttuğundan herşeye long yazamayız
        sayi2=-2147483648;

        // int sayi3=12.5; // Ondalık sayıların default u double
        double sayi3=12.5;

        //TC kimlik numaraları üzerinde matematiksel işlem yapılmadığından bestpractice olarak metinsel tutulabilir

        //sayi ="Ankara";   sayı tamsayı ifade olduğundan daha sonra metinsel ifade olarak Ankara yazamayız.

        // isimlendirmelerde camelCase kullanılır.
        //Kodun okunabilirliği için her şeyi açık açık yazmak gerekir.

        int not=55;         //Değişken uygulamanın akışı içerisinde tekrar tekrar kullanabileceğimiz verileri içerir.

        int kredi=100000;   // int tamsayı türünde not 55 tir.

        double notOrtalamasi=50.5; //int ile ondalıklı sayı tutamazken double ile ondalıklı sayi tutulur.
        float notOrtalaması=50.6f;
        char karakter ='A';    //Çift tırnak yazdığımızda string olarak agılar.Tek karaktarler tek tırnakla yazılır


        String isim="Ceyhun";  //Metinsel veri tipleri s si büyük yazılır.

        boolean dogruMu=false;
        boolean sistemeGirisYapmismi=true;  // Doğru ya da yanlış cevaptan birini döndürür.


        System.out.println(not);

    }
}
