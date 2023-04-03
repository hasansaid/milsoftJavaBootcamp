package homework1B;

public class Student {
    private long studentId;
    private String studentName;
    private double avarageMark;
    private Classroom classroom;

    public Student(){}
    public Student(long studentId, String studentName, double avarageMark) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.avarageMark = avarageMark;
    }


    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public double getAvarageMark() {
        return avarageMark;
    }

    public void setAvarageMark(double avarageMark) {
        this.avarageMark = avarageMark;
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }


}
