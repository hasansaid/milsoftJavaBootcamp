package string;

public class WrapperTest {
    public static void main(String[] args) {
       int i = 1234;
       String s = Integer.toString(i);

       long l = 1234;
       String s2 = Long.toString(l);

       Long lw = new Long(1234);
       Long lw2 = Long.valueOf(1234);
       //Long lw3 = 1;
        Long lw4=lw;
    }
}
