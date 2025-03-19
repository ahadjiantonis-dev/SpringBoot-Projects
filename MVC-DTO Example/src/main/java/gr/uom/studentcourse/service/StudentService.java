package gr.uom.studentcourse.service;

import gr.uom.studentcourse.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class StudentService {

    ArrayList<Student> students = new ArrayList<Student>();

    public StudentService() {
        students.add(new Student(1,"Nikos","1234"));
        students.add(new Student(2,"Maria","4321"));
    }

    public ArrayList<Student> getStudents() {
        return students;
    }
}
