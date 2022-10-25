package EnginDemirog2022._02_Gun;

public class _01_OOP {
    public static void main(String[] args) {
        //Object Oriented Programming -Nesne Yönelimli Programlama
        String mesaj = "Vade oranı";

        Product product1 = new Product();
        product1.setName("Delonghi Kahve Makinesi");
        product1.setDiscount(7);
        product1.setUnitPrice(7500);
        product1.setUnitsInStock(3);
        product1.setImageUrl("image1.jpg");

        Product product2 = new Product();
        product2.setName("Smeg Kahve Makinesi");
        product2.setDiscount(7);
        product2.setUnitPrice(7500);
        product2.setUnitsInStock(3);
        product2.setImageUrl("image2.jpg");


        Product product3 = new Product();
        product3.setName("Kitchen Aid Kahve Makinesi");
        product3.setDiscount(7);
        product3.setUnitPrice(7500);
        product3.setUnitsInStock(3);
        product3.setImageUrl("image3.jpg");

        Product[] products={product1,product2,product3};
        System.out.println("<ul>");
        for (Product product : products) {
            System.out.println("<li>" + product.getName()+ "<li>");
        }
        System.out.println("</ul>");

        IndividualCustomer individualCustomer=new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setPhone("052222222");
        individualCustomer.setCustomerNumber("12345");
        individualCustomer.setFirstName("Ceyhun");
        individualCustomer.setLastName("Taşcı");

        CorporoteCustomer corporoteCustomer=new CorporoteCustomer();
        corporoteCustomer.setId(2);
        corporoteCustomer.setCompanyName("Kodlama.io");
        corporoteCustomer.setPhone("050333333");
        corporoteCustomer.setTaxNumber("11111111111");
        corporoteCustomer.setCustomerNumber("54321");


        Customer[] customers=new Customer[]{individualCustomer,corporoteCustomer};


        }

}
