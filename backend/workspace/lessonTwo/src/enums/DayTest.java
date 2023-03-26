package enums;

public class DayTest {
    static void printDay(Day day){
        switch (day){
            case MONDAY:
                System.out.println("Pazartesi");
                System.out.println( Day.MONDAY.getNumber()+" "+Day.MONDAY.getName());
                break;
            case TUESDAY:
                System.out.println("Salı");
                break;
            case WEDNESDAY:
                System.out.println("Çarşamba");
        }
    }
    public static void main(String[] args) {
        printDay(Day.MONDAY);

        for (Day day:Day.values()
             ) {
            System.out.println(day.getName());
        }
    }
}
