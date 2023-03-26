package inheritance;

public class Test {
    public static void main(String[] args) {
        Customer customer = new Customer(301,"Cem","Karaca",6540);
        customer.setEmailAdress("cem@godoro.com");
        /*customer.setCustomerId(301);
        customer.setFirstName("Cem");
        customer.setLastName("Karaca");
        customer.setTotalDebit(6540);*/

        Person person = new Customer(302,"Barış","Manço",7620);
        person.setEmailAdress("baris@godoro.com");
        /*person.setFirstName("Barış");
        person.setLastName("Manço");*/

        Supplier supplier = new Supplier(701,"Fikret","Kızılok",8795);
        supplier.setEmailAdress("fikret@godoro.com");
        /*supplier.setSupplierId(701);
        supplier.setFirstName("Fikret");
        supplier.setLastName("Kızılok");
        supplier.setTotalCredit(8795);*/


        System.out.println(customer.getGreeting()+" "+customer.getFullName());
        System.out.println(person.getGreeting()+" "+person.getFullName());
        System.out.println(supplier.getGreeting()+" "+supplier.getFullName());
        sendMail(customer);
        sendMail(person);
        sendMail(supplier);



        // ek bilgi
        if(person instanceof Customer /*customerPerson*/ /*JDK 17 ile yeni güncelleme geldi*/){
            Customer customerPerson  = (Customer) person;
            customerPerson.setCustomerId(302);
            customerPerson.setTotalDebit(7325);
        }
    }
    private static void sendMail(Person person){
        System.out.println();
        System.out.println("Kime: " + person.getEmailAdress());
        System.out.println("Konu: " + person.getGreeting());
        System.out.println("Gövde: " + person.getFullName());
    }
}
