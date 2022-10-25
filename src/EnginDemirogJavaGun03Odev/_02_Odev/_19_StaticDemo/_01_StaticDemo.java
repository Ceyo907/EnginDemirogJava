package EnginDemirogJavaGun03Odev._02_Odev._19_StaticDemo;

public class _01_StaticDemo {
    public static void main(String[] args) {
        ProductManager manager=new ProductManager();
        Product product=new Product();
        product.price=10;
        product.name="";
        manager.add(product);


    }
}
