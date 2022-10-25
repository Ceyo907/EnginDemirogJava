package EnginDemirog2022._03_Gun.dataAccess;

import EnginDemirog2022._03_Gun.entities.Product;

public class HibernateProductDao implements ProductDao{ //
    public void add(Product product){
        //sadece ve sadece db erişim kodları buraya yazılır... SQL
        System.out.println("Hibernate ile veritabanına eklendi");



    }



}
