package EnginDemiroğJavaGun03Odev._02_Odev._16_AbstractDemo;

public class _01_AbstractDemo {
    public static void main(String[] args) {
        //Open-close principle : Bir sisteme yeni bir özellik getirildiğinde mevcuttaki hiçbir kodu değiştiremezsin
        CustomerManager customerManager=new CustomerManager();
        customerManager.databaseManager=new OracleDatabaseManager();
        customerManager.databaseManager=new SqlServerDatabaseManager();//Sadece configürasyonu değiştirdik.
        customerManager.databaseManager=new MySqlDatabaseManager();

        customerManager.getCustomers();



    }
}
