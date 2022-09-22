package EnginDemiroğJavaGun01Odev._01_Variables;

public class _01_Variables {
    //Re-usability --> tekrar kullanılabilirlik.Bir kere yaz heryerde kullan
    public static void main(String[] args) {

        // Java case sensitive bir dildir.
        //Bir veri kaynağından bu datayı almak için 4 kere veritabanına gitmek gerekir. Bunun için değişkenler kullanılır
        int sayi=11;        // tamsayılar int kısayolu ile tanımlanır.Tuttuğumuz herbir data için değişken tanımlarız.
        int ogrenciSayisi=12;   // camelcase yazılır.
        String mesaj="Ögrenci sayısı : ";


        //Değişkenleri çalıştığımız blokta tekrar tekrar kullanabilmek ve bellek tasarrufu için kullanırız.
        System.out.println(mesaj + ogrenciSayisi);
        System.out.println(mesaj + ogrenciSayisi);
        System.out.println("Öğrenci sayısı : " + ogrenciSayisi);
        System.out.println("Öğrenci sayısı : " + ogrenciSayisi);
        System.out.println("Öğrenci sayısı : " + ogrenciSayisi);



    }
}
