package EnginDemirogJavaGun03Odev._01_Odev;

public class _01_YoutubeEğitim {

    public static void main(String[] args) {

        int sayi1=10;       //Sayısal veriler değer tiptir.Belleğin stack kısmında tutulur.
        int sayi2=20;
        sayi1=sayi2;        //Sayı1'in değeri = Sayı2'nin değeri. Atama değer üzerinden olur
        sayi2=100;          //Sayı2'nin değeri =100

        System.out.println(sayi1);

        //Diziler(Arrays) referans tiptir.new demek sayılar1'in bir örneğini heapte oluşturmaktır.
        //Saylar1'in referans numarası=Sayilar2'nin referans numarası
        //Sayılar1'in referans numarası garbage collector ile bellekten atıldı.

        int[] sayilar1=new int[]{1,2,3};
        int[] sayilar2=new int[]{10,20,30};

        sayilar1=sayilar2;
        sayilar2[0]=1000;
        System.out.println(sayilar1[0]);

    }

}
