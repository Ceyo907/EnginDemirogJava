package EnginDemiroğJavaGun01Odev._02_Conditionals;

public class _03_Switch {
    public static void main(String[] args) {
        //  If bloklarına göre çok daha az kullanılır. Dallandırma için kullanırız.

        char grade = 'C';

        switch (grade) { //Şartımızın öznesi
            //A durumunda
            case 'A':
                System.out.print("Mükemmel : Geçtiniz");
                break;

            case 'B':   //Aynı sonucu vermek için
            case 'C':
                System.out.println("İyi : Geçtiniz");
                break;
            case 'D':
                System.out.print("Fena Değil : Geçtiniz");
                break;
            case 'F':
                System.out.print("Maalesef Kaldınız");
                break;
            default:        //Şu notların dışında bir not girilirse için kullanılır
                System.out.println("Geçersiz not girdiniz");
        }

    }
}
