package com.cydeo.model;

import com.cydeo.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Mentor {

    private String firstName;
    private String lastName;
    private int age;
    //gender enum ?
    private Gender gender;
}
