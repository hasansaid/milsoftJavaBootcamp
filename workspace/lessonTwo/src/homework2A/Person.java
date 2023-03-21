package homework2A;

public abstract class Person {
    protected String firstName;
    protected String lastName;
    protected String emailAdress;


    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
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

    public String getEmailAdress() {
        return emailAdress;
    }

    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
    }

    abstract public String getGreeting();
    abstract public String getRole();

    public String fullName(){
        return firstName + lastName;
    }





}
