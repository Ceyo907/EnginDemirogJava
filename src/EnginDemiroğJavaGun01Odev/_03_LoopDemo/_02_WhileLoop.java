package EnginDemiroğJavaGun01Odev._03_LoopDemo;

public class _02_WhileLoop {
    //For döngüsüyle yaptığımız şeyleri while ile de yapabiliriz.

    public static void main(String[] args) {
        //For
        for (int i = 2; i <= 10; i += 2) {
            System.out.println(i);
        }
        System.out.println("Döngü bitti");

        int i = 1;
        // While
        while (i < 10) {
            System.out.println(i);
            i+=2;
        }
        System.out.println("While Döngüsü Bitti");

    }
}