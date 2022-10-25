package EnginDemirogJavaGun03Odev._01_Odev;

public class Person extends Customer{

    String nationalIdentity;
    String firstName;

    String lastName;


    public String getnationalIdentity() {
        return nationalIdentity;
    }

    public void setnationalIdentity(String nationalIdentity) {
        nationalIdentity = nationalIdentity;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
