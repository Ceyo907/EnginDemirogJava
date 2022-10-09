package EnginDemiroğ2022._03_Gun;

import EnginDemiroğ2022._03_Gun.business.ProductManager;
import EnginDemiroğ2022._03_Gun.core.logging.DataabaseLogger;
import EnginDemiroğ2022._03_Gun.core.logging.FileLogger;
import EnginDemiroğ2022._03_Gun.core.logging.Logger;
import EnginDemiroğ2022._03_Gun.core.logging.MailLogger;
import EnginDemiroğ2022._03_Gun.dataAccess.HibernateProductDao;
import EnginDemiroğ2022._03_Gun.entities.Product;
import sun.rmi.runtime.Log;

public class oopWithNLayeredApp {

    public static void main(String[] args) throws Exception {

        Product product1=new Product(1,"IPhone Xr",9000);

        Logger[] loggers={};

        ProductManager productManager=new ProductManager(new HibernateProductDao(),loggers);
        productManager.add(product1);


    }

}
