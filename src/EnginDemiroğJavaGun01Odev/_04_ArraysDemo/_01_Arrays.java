package EnginDemiroğJavaGun01Odev._04_ArraysDemo;

public class _01_Arrays {
    public static void main(String[] args) {
        //Öğrenci listesini ekrana yazdırmak için hepsini aynı yazmak gerekir.

        String ogrenci1="Engin";
        String ogrenci2="Derin";
        String ogrenci3="Salih";
        String ogrenci4="Ahmet";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);

        System.out.println("-----------------");

        String[] ogrenciler = new String[4];    //Index sıfırla başlar 0. 1. 2. --> 3tane
        ogrenciler[0]="Engin";
        ogrenciler[1]="Derin";
        ogrenciler[2]="Salih";
        ogrenciler[3]="Ahmet";
        //ogrenciler[4]="Ali";      // Bu durumda ArrayIndexOutOfBoundsException hatası fırlatır.
                                    // Sınırın dışında hatası verir.


        for (int i = 0; i < ogrenciler.length; i++) {
            System.out.println(ogrenciler[i]);
        }

        System.out.println("");
        //Reverse Engineering için okunakli yazmak gerekir.
        for (String ogrenci : ogrenciler) { // Öğrenciler dizisindeki her elemanı gez. O anki eleman=ogrenci
            System.out.println(ogrenci);
        }
    }
}
