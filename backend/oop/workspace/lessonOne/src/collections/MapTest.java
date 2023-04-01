package collections;
import java.util.*;


public class MapTest {
    public static void main(String[] args) {
        Map<String,String> countries = new HashMap<>();
        countries.put("tr","Türkiye");
        countries.put("az","Azerbeycan");
        countries.put("tm","Türkmenistan");
        countries.put("uz","Özbekistan");
        countries.put("kz","Kazakistan");
        countries.put("kg","Kırgiztan");

        for (String code : countries.keySet()){
            System.out.println(code + " " + countries.get(code));
        }
        for (Map.Entry<String,String> entry : countries.entrySet()){
            System.out.println("*"+entry.getKey()+":"+entry.getValue());
        }
    }
}
