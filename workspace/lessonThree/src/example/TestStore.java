package example;

import java.util.ArrayList;
import java.util.List;

public class TestStore {
    public static void main(String[] args) throws Exception {
        List<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student(/**/));
        studentList.add(new Student(/**/));
        studentList.add(new Student(/**/));

        String path = "...";
        StudentFiler filer = new StudentFiler(path);
        filer.store(studentList);
    }
}
