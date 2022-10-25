package EnginDemirogJavaGun03Odev._02_Odev._15_Abstract;
//If yerine base oluşturacağız.
public abstract class GameCalculator {

    public abstract void hesapla();//Kim inherit ediyorsa hesaplayı içermek zorunda.Fakat hesaplayı Override etmek, kendi
                                   //hesapla methodunu yazmak zorunda.

    public final void gameOver(){//Final---> GameCalculator'ü kim kullanıyorsa gameOverı olduğu gibi kullanmak zorunda
                                 //Bu hiçbir zaman değişmeyecek kuraldır.
        System.out.println("Oyun Bitti");
    }

}
