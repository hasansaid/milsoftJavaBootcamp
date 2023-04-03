package enums;

public enum Day {
    MONDAY(1, "MONDAY"),
    TUESDAY(2, "TUESDAY"),
    WEDNESDAY(3, "WEDNESDAY");

    private int number;

    private String name;

    Day(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }


}
