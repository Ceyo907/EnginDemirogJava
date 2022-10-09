package EnginDemiroğ2022._03_Gun.dataAccess;

import EnginDemiroğ2022._03_Gun.entities.Product;
// ProductDao ile ilgili olan alternatifler (HibernateProductDao , JdbcProductDao) add operasyonu içerir.
public interface ProductDao {
    void add(Product product);  // İnterfaceler sadece metod imzasını barındırabilir.



}
