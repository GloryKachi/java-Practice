package chapter8;

public class Native {
    private String firstNaName;
    private String lastName;
    private String phoneNumber;
    private String emailAddress;
    private String address;

    public Native(Human human){
        firstNaName = human.getFirstNaName();
        lastName = human.getLastName();
        if (human.getPhoneNumber().length()!=11)throw new IllegalArgumentException("Invalid number size");
        phoneNumber = human.getPhoneNumber();
        emailAddress = human.getEmailAddress();
        address = human.getAddress();
    }

    public String getFirstNaName() {
        return firstNaName;
    }

    public void setFirstNaName(String firstNaName) {
        this.firstNaName = firstNaName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
