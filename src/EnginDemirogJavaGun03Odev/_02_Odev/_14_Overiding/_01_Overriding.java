package EnginDemirogJavaGun03Odev._02_Odev._14_Overiding;

public class _01_Overriding {
    public static void main(String[] args) {
        BaseKrediManager[] krediManagers=new BaseKrediManager[]{new OgretmenKrediManager(),new TarımKrediManager(),new OgrenciKrediManager()};
        //Dizide 3 tane kredi manager var

        for (BaseKrediManager krediManager : krediManagers) {
            System.out.println(krediManager.hesapla(1000)); //Ögretmen ve tarım için hesaplayacak

        }

    }
}
