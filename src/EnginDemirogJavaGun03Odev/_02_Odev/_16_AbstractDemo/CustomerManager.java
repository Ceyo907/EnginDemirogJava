package EnginDemirogJavaGun03Odev._02_Odev._16_AbstractDemo;

public class CustomerManager {
    BaseDatabaseManager databaseManager; // Hangi veritabanını verirsek onun GetData'sı çalışacak

    public void getCustomers(){
        databaseManager.getData();
    }




   // public void getCustomers(){
   //     OracleDatabaseManager oracleDatabaseManager=new OracleDatabaseManager();
   //     oracleDatabaseManager.getData(); // Oracle a bağımlıyız Geçmiş olsun
   //
   //
   // }

}
