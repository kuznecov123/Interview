package hibernate.application;

import hibernate.model.Student;
import hibernate.service.StudentService;

import java.util.List;

public class Application {
    public static void main(String[] args) {

        StudentService studentService = new StudentService();
        Student physicist = new Student("Andrew", 4);
        Student historian = new Student("Aleksandr", 5);
        Student biologist = new Student("Dmitriy", 4);

        studentService.saveUser(physicist);
        studentService.saveUser(historian);
        studentService.saveUser(biologist);

        List<Student> list = studentService.findAllUsers();
        System.out.println(list.toString());

        Student st  = studentService.findUser(1);
        System.out.println(st);

        studentService.deleteUser(historian);

        biologist.setName("Sergey");
        studentService.updateUser(biologist);

        Student student;
        int N = 0;
        String S;
        for (int i = 0; i < 1000;i++){
            if (i%3 == 0) N = 5;
            else N = 4;
         S = "Student #  " + String.valueOf(i);
         student = new Student(S, N);
         studentService.saveUser(student);
        }

    }
}
