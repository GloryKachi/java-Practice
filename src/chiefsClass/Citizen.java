package chiefsClass;

import java.math.BigDecimal;

public class Citizen {
    private String firstName;
    private String surname;
    private BigDecimal earnings;

    public Citizen(){}
    public Citizen(String firstName, String lastName){
        this.firstName = firstName;
        surname = lastName;
    }
    public Citizen(String firstName, String lastName, BigDecimal amount){
        this(firstName,lastName);
        earnings = amount;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getSurname(){
        return surname;
    }
    public void setSurname(String lastName){
        surname = lastName;
    }
    public BigDecimal getEarnings(){
        return earnings;
    }
    public void setEarnings(BigDecimal earnings){
        this.earnings = earnings;
    }
}
