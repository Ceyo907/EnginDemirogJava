package EnginDemirogJavaGun01Odev._03_LoopDemo;

public class _03_DoWhileLoop {
    public static void main(String[] args) {
        //While döngüsünden farkı şart sağlanmasa bile (while şartı) kod çalışır.
        //Veritabanına log atmak için , döngüye girildiğine dair

        //DoWhile Döngüsü:
        int i=100;      //10'dan küçük olduğu sürece çalıştır
        do {
            System.out.println("Loglandı");
            if (i<10){
            System.out.println(i);
            i+=2;}
        }while (i < 10);
        System.out.println("Do-While Döngüsü Bitti");

    }
}
