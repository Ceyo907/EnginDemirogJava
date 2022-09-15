package EnginDemiroğJavaGun01._04_ArraysDemo;

public class _03_MultiDimensionalDemo {
    public static void main(String[] args) {
        //  Çok boyutlu diziler (Örn: 3 satır, 3 sütun) için kullanılır.
        //Dama tahtasındaki hücreleri bulabiliriz.

        //Türkiye'deki bölgeleri ve şehirleri içeren dizi
        String[][] sehirler = new String[3][3]; // 3 bölge ve 3 şehirden oluşan dizi

        sehirler[0][0] = "İstanbul";
        sehirler[0][1] = "Bursa";
        sehirler[0][2] = "Bilecik";
        sehirler[1][0] = "Ankara";
        sehirler[1][1] = "Konya";
        sehirler[1][2] = "Kayseri";
        sehirler[2][0] = "Diyarbakır";
        sehirler[2][1] = "Şanlıurfa";
        sehirler[2][2] = "Gaziantep";

        for (int i=0; i<=2;i++){    //Nested Loop
            System.out.println("-------------");
            for (int j=0;j<=2;j++){
                System.out.println(sehirler[i][j]);
            }
        }

    }
}
