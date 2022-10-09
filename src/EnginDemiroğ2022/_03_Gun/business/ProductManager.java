package EnginDemiroğ2022._03_Gun.business;

import EnginDemiroğ2022._03_Gun.core.logging.Logger;
import EnginDemiroğ2022._03_Gun.dataAccess.ProductDao;
import EnginDemiroğ2022._03_Gun.entities.Product;

import java.util.List;

public class ProductManager {
    private ProductDao productDao;
    private Logger[] loggers;

    public ProductManager(ProductDao productDao,Logger[] loggers) {
        this.productDao = productDao;
        this.loggers=loggers;
    }

    public void add(Product product) throws Exception {//Metodu çağırdığında hata gelebilir.
        // iş kuralları--> Business Domain
        if(product.getUnitPrice()<10){
            throw new Exception("Ürün fiyatı 10 dan küçük olamaz");

        }
        // Bir katman başka bir katmanın class ını kullanıyorken sadece interface inden erişim kurmalıdır
        productDao.add(product);

        for (Logger logger : loggers) { // [db,file]
            logger.log(product.getName());
        }
    }
}
