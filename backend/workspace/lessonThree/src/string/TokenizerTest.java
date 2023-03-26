package string;

import java.util.StringTokenizer;

public class TokenizerTest {
    public static void main(String[] args) {

        // iterator patern
        String string = "Java, JSP, Servlet, JSF, JDBC, JPA, EJB, JMS, JAX-WS, JAX-RS, CDI" ;
        StringTokenizer tokenizer = new StringTokenizer(string," ,.:;",true);

        while (tokenizer.hasMoreTokens()){
            String token = tokenizer.nextToken();
            System.out.println("Dizgecik: "+token);
        }

        System.out.println("**************************************");

        String[] tokens = string.split(", ");
        for (String token:tokens){
            System.out.println("#Dizgecik: "+token);
        }

        System.out.println("**************************************");

        for (String token:string.split(", ")){
            System.out.println("*Dizgecik: "+token);
        }
    }
}
