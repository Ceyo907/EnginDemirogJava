package EnginDemiroğJavaGun02Odev._09_ClassesWithAttributes;

public class ProductManager {
    public void Add(Product product){
        System.out.println("Ürün eklendi :" + product.getName());
    }

    //Single Responsibility Principle --Bir class, bir method, bir if bloğu sadece 1 işi yapar


}
