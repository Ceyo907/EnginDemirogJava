package EnginDemiroğJavaGun03Odev._01_Odev;

public class Customer {

    public Customer(){// New bloğunu heapte gördüğü anda çalışır.
        System.out.println("Müşteri nesnesi başlatıldı");
    }

      int id;

      String city;


    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
