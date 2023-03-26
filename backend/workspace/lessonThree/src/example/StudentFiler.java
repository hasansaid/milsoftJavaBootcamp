package example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class StudentFiler {

    // yazana store
    // okuyan load
    private String filePath;

    public StudentFiler(String filePath) {
        this.filePath = filePath;
    }

    public void store(List<Student> studentList) throws Exception{
        // open writer
        // for student of students
        //student to line
        //write line
        //close writer

    }

    public  List<Student> load() throws Exception{
        // open reader
        // list new
        // while line of writer
        // line to student
        // add student to list
        // close line
        // return list

        return null;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    private String format(Student student){
        return null;
    }

    private Student parse(String line){
        return null;
    }
}
