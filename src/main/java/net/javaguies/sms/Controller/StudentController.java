package net.javaguies.sms.Controller;


import net.javaguies.sms.Entity.Student;
import net.javaguies.sms.Service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {

    @Autowired
    StudentServiceImpl studentService;

    @RequestMapping("/listAll")
    public List<Student> listAllStudents(Student student){
        List<Student> students = studentService.listAllStudents();
        return students;
    }

    @RequestMapping("/addStudent")
    public ResponseEntity<Student> addStudent(Student student){
        return null;
    }

    @RequestMapping("/updateStudent")
    public ResponseEntity<Student> updateStudent(Student student){
        return null;
    }

    @RequestMapping("/deleteStudent")
    public ResponseEntity<Student> deleteStudent(Student student){
        return null;
    }

}
