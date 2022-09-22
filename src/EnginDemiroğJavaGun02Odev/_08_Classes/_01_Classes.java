package EnginDemiroğJavaGun02Odev._08_Classes;

public class _01_Classes {
    public static void main(String[] args) {
        //Classların temel özelliği metodları gruplama yapmaktır.
        //reference type

        _02_CustomerManager customerManager=new _02_CustomerManager();//Bellekte customerManager türünde nesne ürettik
        _02_CustomerManager customerManager2=new _02_CustomerManager();//Heap'te nesne için yer ayırdık

        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();

        //Value ,değer tip tanımladığımızda stackte oluşur.
        int sayi1=10;
        int sayi2=20;
        sayi2=sayi1;
        sayi1=30;
        System.out.println(sayi2);

        //int,double,boolean sayısal veriler değer tiptir(value type).
        //array,class,abstract,interface veriler referans tiptir.(Reference Types)
        //Değer tipler stackte olur. Sadece değer atar.

        int[] sayilar1=new int[]{1,2,3};
        int[] sayilar2=new int[]{4,5,6};
        sayilar2=sayilar1;
        sayilar1[0]=10;
        System.out.println(sayilar2[0]);



    }

}
