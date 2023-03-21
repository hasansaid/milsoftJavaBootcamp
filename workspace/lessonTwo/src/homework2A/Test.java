package homework2A;

public class Test {
    public static void main(String[] args) {

        Employee employee1 = new Employee(401,"Edip","Akbayram",32.750);
        System.out.println(employee1.getRole()+" "+employee1.getEmployeeId()+" "+employee1.getFirstName()+ " " + employee1.getLastName()+
                " "+ employee1.getMonthlySalary());
        employee1.setEmailAdress("edipAK@gmail.com");
        sendMail(employee1);

        System.out.println();

        Customer customer1 = new Customer(501,"Hasan","Sertkaya");
        customer1.setEmailAdress("hsert@gmail.com");
        System.out.println(customer1.getRole()+" "+customer1.getCustomerId()+" "+customer1.getFirstName()+ " " + customer1.getLastName());
        sendMail(customer1);

    }

    static void sendMail(Person person){
        System.out.println("************SENDMAIL************");
        System.out.println("Kime: "+person.getEmailAdress());
        System.out.println("Mesaj: "+person.getGreeting());
        System.out.println("İsim: "+ person.fullName());
    }
}
