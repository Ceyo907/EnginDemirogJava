package EnginDemirogJavaGun03Odev._02_Odev._15_Abstract;

public class _01_Abstract {//Base i gizlemek istedğimiz zaman kullanılır.
    //Abstract sınıflar ASLA newlenemez.
    public static void main(String[] args) {
        WomanGameCalculator womanGameCalculator=new WomanGameCalculator();
        womanGameCalculator.hesapla();
        womanGameCalculator.gameOver();

        GameCalculator gameCalculator=new WomanGameCalculator();//Bir operasyona parametre olarak gamecalculator ü verdik.


    }
}
