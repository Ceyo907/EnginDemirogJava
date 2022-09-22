package EnginDemiroğJavaGun01Odev._02_Conditionals;

public class _02_RecapDemo1 {
    public static void main(String[] args) {
        //En büyük sayı hangisi?

        int sayi1=246;
        int sayi2=25;
        int sayi3=26;

        int enBuyuk=sayi1;

        if (enBuyuk<sayi2){
            enBuyuk=sayi2;
        }
        if (enBuyuk < sayi3){

            enBuyuk=sayi3;
        }

        System.out.println("En büyük =" + enBuyuk);

    }
}
