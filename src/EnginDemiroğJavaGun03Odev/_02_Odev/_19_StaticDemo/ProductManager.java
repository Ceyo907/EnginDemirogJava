package EnginDemiroğJavaGun03Odev._02_Odev._19_StaticDemo;

public class ProductManager {

    public void add(Product product){
        if (ProductValidator.isValid(product)){
            System.out.println("Eklendi");
        }else {
            System.out.println("Ürün Bilgileri Geçersizdir");
        }

      //  ProductValidator productValidator=new ProductValidator();
      //  productValidator.bisey(); // Yapıcı Bloklar "new"leyince çalışır.
    }

}
