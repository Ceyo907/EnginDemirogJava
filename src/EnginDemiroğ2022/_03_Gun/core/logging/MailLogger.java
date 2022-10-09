package EnginDemiroğ2022._03_Gun.core.logging;

public class MailLogger implements Logger{
    @Override
    public void log(String data) {
        System.out.println("Mail gönderildi : " + data);
    }
}
