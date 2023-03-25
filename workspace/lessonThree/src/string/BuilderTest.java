package string;

public class BuilderTest {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("Godoro");
        builder.append(":");
        builder.append("Java").append(", ");
        builder.append("Spring Boot").append(", ");
        builder.append("JavaScript").append(", ");
        builder.append("React").append(".");

        String string = builder.toString();
        System.out.println("Sicim: " + string);

        String text = new StringBuilder("Godoro")
                .append(":")
                .append("Java").append(", ")
                .append("Spring Boot").append(", ")
                .append("JavaScript").append(", ")
                .append("React").append(".").toString();
        System.out.println("Yazı: "+text);

    }
}
