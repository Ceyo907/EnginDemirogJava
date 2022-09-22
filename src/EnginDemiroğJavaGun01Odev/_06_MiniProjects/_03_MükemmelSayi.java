package EnginDemiroğJavaGun01Odev._06_MiniProjects;

public class _03_MükemmelSayi {
    public static void main(String[] args) {
        //Kendinden başka pozitif tüm bölenlerinin sayılarının toplamı kendine eşit olan sayıya denir.
        //6-->1,2,3
        //28-->1,2,3,4,7,14
        int number=28;

        int total=0;

        for (int i=1; i<number;i++){
            if (number% i==0){
             total+=i;

            }
        }
        if (total==number){
            System.out.println("Mükemmel sayıdır");
        }else {
            System.out.println("Mükemmel sayı değildir.");
        }
    }
}
