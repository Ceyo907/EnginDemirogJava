package EnginDemirog2022._03_Gun;

import EnginDemirog2022._03_Gun.business.ProductManager;
import EnginDemirog2022._03_Gun.core.logging.Logger;
import EnginDemirog2022._03_Gun.dataAccess.HibernateProductDao;
import EnginDemirog2022._03_Gun.entities.Product;

public class oopWithNLayeredApp {

    public static void main(String[] args) throws Exception {

        Product product1=new Product(1,"IPhone Xr",9000);

        Logger[] loggers={};

        ProductManager productManager=new ProductManager(new HibernateProductDao(),loggers);
        productManager.add(product1);


    }

}
