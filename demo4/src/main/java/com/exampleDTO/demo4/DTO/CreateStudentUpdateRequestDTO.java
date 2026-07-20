package com.exampleDTO.demo4.DTO;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CreateStudentUpdateRequestDTO {
    private String name;
    private String department;
    private Integer age;
}
