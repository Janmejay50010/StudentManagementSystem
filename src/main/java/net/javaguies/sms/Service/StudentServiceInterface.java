package net.javaguies.sms.Service;

import net.javaguies.sms.Entity.Student;
import org.springframework.stereotype.Component;

import java.util.List;


public interface StudentServiceInterface {

    List<Student> listAllStudents();

    public String addStudent(String firstName, String lastName, String email);

    public String deleteStudent(String firstName, String lastName, String email);

    public String updateStudentByName(String firstName, String lastName, String email);
}
