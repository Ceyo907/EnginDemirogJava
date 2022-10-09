package EnginDemiroğJavaGun03Odev._01_Odev;

public class CustomerManager{
    private Customer _customer;
    private ICreditManager _creditmanager;
    //Interfaceler referans tip olduğu için implement edildiği fonksiyonun referansını tutar


    public CustomerManager(Customer customer,ICreditManager creditManager){//Polimorphism--> çok biçimlilik
        _customer=customer; //savede customer parametresine ulaşmak için eşitledik.
        _creditmanager=creditManager;
    }

    public void save(){

        System.out.println("Müşteri Kaydedildi : ");
    }
    public void delete(){

        System.out.println("Müşteri Silindi : " );
    }

    public void giveCredit()
    {//Farklı biçimlerde davranış sergiletiyoruz.
        _creditmanager.calculate();
        System.out.println("Kredi verildi");

    }

}
