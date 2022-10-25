package EnginDemirog2022._03_Gun.dataAccess;

import EnginDemirog2022._03_Gun.entities.Product;

public class JdbcProductDao implements ProductDao{ // Data Access Object
    public void add(Product product){
        //sadece ve sadece db erişim kodları buraya yazılır... SQL
        System.out.println("JDBC ile veritabanına eklendi");



    }

}


