package EnginDemiroğJavaGun03Odev._02_Odev._19_StaticDemo;

public class ProductValidator { // Ana class static olamaz ama bu classın içinde(inner class) başka bir classı static yapabiliriz.
    //Ürünü güncellerken ürünün kurallara uygun olup olmadığını bulmak için kullanıırız

    static {
        System.out.println("Static Yapıcı Blok Çalıştı");
    }

    public ProductValidator(){
        System.out.println("Yapıcı Blok Çalıştı");
    }
    public static boolean isValid(Product product){
        if (product.price>0 && !product.name.isEmpty()){

            return true;

        }else {
            return false;
        }

    }

    public void bisey() {


    }

    public static class BaşkaBirClass{//-->Inner Class
        public static void Sil(){


        }
    }

}
