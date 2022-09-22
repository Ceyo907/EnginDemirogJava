package EnginDemiroğJavaGun02Odev._07_Methods;

public class _02_MethodsVariableArguments {
    public static void main(String[] args) {
        String mesaj="Bugün hava çok güzel.";    //String olan bir değere void olan bir operasyon atayamayız
        String yeniMesaj=sehirVer();
        System.out.println(yeniMesaj);
        int sayi=topla(15,7);
        System.out.println(sayi);
        int toplam=topla2(2,3,4);
        System.out.println(toplam);
    }

    public static void ekle(){
        System.out.println("Eklendi");

    }
    public static void sil(){
        System.out.println("Eklendi");

    }
    public static void guncelle(){
        System.out.println("Eklendi");

    }

    public static int topla(int sayi1,int sayi2){  //Bu fonksiyon integer türünde bir değer döndürür.
        return sayi1+sayi2;

    }
    
    public static int topla2(int... sayilar){//Variable arguments: Integer array gibi çalışır
        int toplam=0;
        for (int sayi : sayilar) {
            toplam+=sayi;
        }
        return toplam;
    }
    public static String sehirVer(){
        return "Ankara";
    }
}
