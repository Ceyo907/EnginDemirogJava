package EnginDemirogJavaGun03Odev._01_Odev;

abstract class BaseCreditManager implements ICreditManager{
    @Override
    public abstract void calculate(); // Ortak değil heryerde değişken olduğu için abstract yaptık

    @Override
    public void save() {
        System.out.println("Kaydedildi");

    }
}
