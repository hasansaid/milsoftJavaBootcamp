package homework1B;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        School school1=new School(901,"Godoro Üniversitesi");
        school1.setClassroomList(new ArrayList<Classroom>());

        Classroom classroom1 = new Classroom(701,"Mühendislik");
        classroom1.setStudentList(new ArrayList<Student>());
        school1.getClassroomList().add(classroom1);

        Student student1 = new Student(301,"Neşet Ertaş",45.2);
        classroom1.getStudentList().add(student1);
        Student student3 = new Student(303,"Mahsuni Şerif",36.5);
        classroom1.getStudentList().add(student3);
        Student student4 = new Student(304,"Celal Güzelses",61.2);
        classroom1.getStudentList().add(student4);


        Classroom classroom2 = new Classroom(702,"Ekonomi");
        school1.getClassroomList().add(classroom2);
        classroom2.setStudentList(new ArrayList<Student>());

        Student student2 = new Student(302,"Erkan Ocaklı",71.30);
        classroom2.getStudentList().add(student2);
        Student student5 = new Student(305,"Mustafa Topaloğlu",42.2);
        classroom2.getStudentList().add(student5);

        System.out.println(school1.getSchoolId()+" "+school1.getSchoolName());
        System.out.println("\t"+classroom1.getClassroomId()+" "+classroom1.getClassroomName());
        for (Student student:classroom1.getStudentList()){
            System.out.println("\t\t"+student.getStudentId()+" "+student.getStudentName()+" "+student.getAvarageMark());
        }
        System.out.println("\t"+classroom2.getClassroomId()+" "+classroom2.getClassroomName());
        for (Student student:classroom2.getStudentList()){
            System.out.println("\t\t"+student.getStudentId()+" "+student.getStudentName()+" "+student.getAvarageMark());
        }
    }


}
