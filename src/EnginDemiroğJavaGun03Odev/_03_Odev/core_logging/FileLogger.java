package EnginDemiroğJavaGun03Odev._03_Odev.core_logging;

public class FileLogger implements Logger {

    @Override
    public void log(String data) {
        System.out.println("Dosyaya loglandı : " + data);

    }
}
