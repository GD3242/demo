package com.example.demo.student;

import lombok.*;

import java.time.LocalDate;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Student {

    private Long id;
    private String name;
    private LocalDate dob;
    private Integer age;
    private String email;


    public Student(String name, LocalDate dob, Integer age, String email) {
        this.name = name;
        this.dob = dob;
        this.age = age;
        this.email = email;
    }


}
