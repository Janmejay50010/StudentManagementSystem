package net.javaguies.sms.Service;

import net.javaguies.sms.Entity.Student;
import net.javaguies.sms.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentServiceInterface{

    @Autowired
    StudentRepo studentRepo;

    @Override
    public List<Student> listAllStudents() {
        List<Student> students = studentRepo.findAll();
        return students;
    }

    @Override
    public String addStudent(String firstName, String lastName, String email) {
        Student student = new Student(firstName, lastName, email);
        student = studentRepo.save(student);
        if(student == null){
            return "Sorry, we were not able to create this student";
        }
        return student.toString() + " has been created.";
    }

    @Override
    public String deleteStudent(String firstName, String lastName, String email) {
        Student student = new Student(firstName, lastName, email);
        try{
            studentRepo.delete(student);
        }
        catch(Exception e){
            return "Sorry, the problem was  " + e.getMessage();
        }

        return "The given Student was deleted successfully";
    }

    @Override
    public String updateStudentByName(String firstName, String lastName, String email) {
        Student student = new Student(firstName, lastName, email);
        try{

        }
        catch(Exception e){
            return "Sorry, the problem was  " + e.getMessage();
        }

        return "Student has been updated to " + student.toString();
    }
}
