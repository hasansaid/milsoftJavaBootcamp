package example;

import java.util.List;

public class TestLoad {
    public static void main(String[] args) throws Exception {
        String path = "...";
        StudentFiler filer = new StudentFiler(path);
        List<Student> studentList = filer.load();
        for (Student student:studentList){
            System.out.println(student);
        }

    }
}
