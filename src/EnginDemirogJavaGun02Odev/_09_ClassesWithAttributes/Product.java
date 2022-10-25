package EnginDemirogJavaGun02Odev._09_ClassesWithAttributes;

public class Product {

    //Constructor:classın kendi ismi
    public Product(int id,String name, String description,double price,int stockAmount,String renk){
        System.out.println("Yapıcı blok çalıştı");
        this.id=id;
        this.setRenk(renk);
        this.setName(name);
        this.setPrice(price);
        this.setDescription(description);
        this.setStockAmount(stockAmount);

    }

    //Overloading Biri parametresiz diğeri parametreli constructor
    public Product(){

    }

    //attribute | field
     private int id;  //Sadece tanımlandığı blokta geçerlidir.(Product Bloğu)
     private String name;
     private String description;
     private double price;
     private int stockAmount;
     private String renk;

     private String kod;

    //getter
    public int getId() {
        //id okuyabilir ama yazamaz.
        return id;
    }

    //setter
    public void setId(int id) { // parametre olarak verilmeli
        this.id= id; // this. == içerisinde bulunduğum class -->product
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getKod() {
        return this.name.substring(0,1)+id;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }
}
