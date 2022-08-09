package net.javaguies.sms.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "studentdemo")
public class Student {
    @Id
    @SequenceGenerator(name = "student_sequence", sequenceName = "student_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_sequence")
    @Column(name = "id",
            updatable = false
    )
    private Long id;

    @Column(name = "firstname",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String firstName;

    @Column(name = "lastname",
            columnDefinition = "TEXT"
    )
    private String LastName;

    private String email;

    public Student(String firstName, String lastName, String email){

    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
