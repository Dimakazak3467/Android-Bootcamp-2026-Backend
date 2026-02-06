package ru.sicampus.bootcamp2026.dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class PersonDTO {
    private long id;
    private String name;
    private String email;
    private String username;
    private String photoUrl;
    private String departmentName;
}
