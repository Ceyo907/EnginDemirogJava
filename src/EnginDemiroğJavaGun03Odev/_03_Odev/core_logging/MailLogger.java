package EnginDemiroğJavaGun03Odev._03_Odev.core_logging;

public class MailLogger implements Logger {
    @Override
    public void log(String data) {
        System.out.println("Mail gönderildi : " + data);
    }
}
