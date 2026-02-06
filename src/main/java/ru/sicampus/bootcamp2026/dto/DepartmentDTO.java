package ru.sicampus.bootcamp2026.dto;

import lombok.Data;
import ru.sicampus.bootcamp2026.entity.Person;

import java.util.List;

@Data
public class DepartmentDTO {
    private long id;
    private String name;
    private List<Person> people;
}
