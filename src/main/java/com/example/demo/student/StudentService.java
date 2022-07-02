package com.example.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;


//@Component also works but Service is easier to understand
@Service
public class StudentService {

    public List<Student> getStudents() {
        return List.of(new Student(
                1L,
                "Mariam",
                LocalDate.of(2000, Month.JANUARY, 5),
                21,
                "mariam.jamal@gmail.com"
        ));
    }
}
