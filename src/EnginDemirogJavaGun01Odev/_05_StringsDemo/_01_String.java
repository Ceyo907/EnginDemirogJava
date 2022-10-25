package EnginDemirogJavaGun01Odev._05_StringsDemo;

public class _01_String {
    //Stringler bir char dizisidir.
    public static void main(String[] args) {

        String mesaj = "Bugün hava çok güzel.";

        System.out.println(mesaj);
        System.out.println("Eleman sayısı : " + mesaj.length()); // char sayısını verir
        System.out.println("5. eleman : " + mesaj.charAt(4));
        System.out.println(mesaj.concat(" Yaşasın!"));//Yeni string oluşturur.Daha sonra kullanmak için
        //string e atamak gerekir
        System.out.println(mesaj);
        System.out.println(mesaj.startsWith("b")); // boolean ifade döndürür--True or False
        //Case Sensitive olduğundan false döner
        System.out.println(mesaj.endsWith(".")); // boolean ifade döndürür--True or False
        char[] karakterler = new char[5];
        mesaj.getChars(0, 4, karakterler, 0);//Karakterleri 0. indexten itibaren aktar
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf('a')); // Mesajın içinde kaçıncı karakter olduğunu bulur
        System.out.println(mesaj.indexOf("av"));
        System.out.println(mesaj.lastIndexOf("a"));//Aramaya sağdan başlar


    }
}
