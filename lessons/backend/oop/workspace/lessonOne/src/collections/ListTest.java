package collections;
import java.util.*;

public class ListTest {
    public static void main(String[] args) {
        List<String> provinceList = new ArrayList<>();
        provinceList.add("İstanbul");
        provinceList.add("Ankara");
        provinceList.add("İzmir");
        provinceList.add("Bursa");
        provinceList.add("Adana");

        for(String pl:provinceList){
            System.out.println(pl);
        }

        /*Iterator<String> itr = provinceList.listIterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }*/
    }
}
