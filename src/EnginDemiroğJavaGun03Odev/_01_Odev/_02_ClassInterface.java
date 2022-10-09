package EnginDemiroğJavaGun03Odev._01_Odev;

public class _02_ClassInterface {
    public static void main(String[] args) {
        //Classlar

        CreditManager creditManager=new CreditManager();
        /*****Stack Kısmı*********///***Heap Kısmı*****/

        //creditManager.calculate();
        //creditManager.calculate();
        creditManager.save();

        Customer customer=new Customer(); // örneğini oluşturmak, instance oluşturmak , instance creation

        customer.id=1;
        customer.city="Ankara";


        CustomerManager customerManager=new CustomerManager(new Customer(),new MilitaryCreditManager());
        customerManager.giveCredit();
        customerManager.save();
        customerManager.delete();


        Company company=new Company();
        company.taxNumber="100000";
        company.companyName="Arçelik";
        company.id=100;

        //CustomerManager customerManager2=new CustomerManager();

        Person person=new Person();
        person.firstName=
        person.nationalIdentity="";

        Customer c1=new Customer();     //Inheritance varsa referans tipler olduğundan hepsini çağırabiliyoruz.
        Customer c2=new Person();
        Customer c3=new Company();


    }
}
