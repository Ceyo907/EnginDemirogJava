package EnginDemiroğJavaGun01._05_StringsDemo;

public class _02_String {
    public static void main(String[] args) {
        String mesaj="Bugün hava çok güzel.";
        System.out.println(mesaj);

        //Replace
        String yeniMesaj=mesaj.replace(' ','-');
        System.out.println(yeniMesaj);
        //Substring
        System.out.println(mesaj.substring(2,4)); //  4.indexi dahil etmeden kes
        //Split
        for (String kelime : mesaj.split(" ")) { // Boşluğa göre kelimeleri tek tek yazdırır
            System.out.println(kelime);
        }
        //LowerCase
        System.out.println(mesaj.toLowerCase());//Veri tabanlarında arama ifadesi için kullanılır.
        System.out.println(mesaj.toUpperCase());
        //trim
        System.out.println(mesaj.trim());

    }
}
