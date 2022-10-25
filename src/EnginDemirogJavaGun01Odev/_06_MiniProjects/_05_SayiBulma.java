package EnginDemirogJavaGun01Odev._06_MiniProjects;

public class _05_SayiBulma {
    public static void main(String[] args) {
        int[] sayilar=new int[]{1,2,5,7,9,0};
        int aranacak=5;

        boolean varMi=false;
        for (int sayi: sayilar){
            if (sayi==aranacak){
                varMi=true;
                break;
            }

        }
        if (varMi){

            System.out.println("Sayı mevcuttur");
        }else {
            System.out.println("Sayı mevcut değildir.");
        }
    }
}
