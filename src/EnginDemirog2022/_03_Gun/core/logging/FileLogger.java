package EnginDemirog2022._03_Gun.core.logging;

public class FileLogger implements Logger{

    @Override
    public void log(String data) {
        System.out.println("Dosyaya loglandı : " + data);

    }
}
