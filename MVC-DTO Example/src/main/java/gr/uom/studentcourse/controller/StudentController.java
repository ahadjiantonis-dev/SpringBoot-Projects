package gr.uom.studentcourse.controller;

import gr.uom.studentcourse.dto.StudentStripped;
import gr.uom.studentcourse.model.Student;
import gr.uom.studentcourse.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/Student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/getStudents")
    public ArrayList<StudentStripped> getStudents(){

        ArrayList<Student> students = studentService.getStudents();
        ArrayList<StudentStripped> studentsStripped = new ArrayList<>();

        for (Student student : students)
            studentsStripped.add(new StudentStripped(student.getId(),student.getName()));

        return studentsStripped;
    }

}
