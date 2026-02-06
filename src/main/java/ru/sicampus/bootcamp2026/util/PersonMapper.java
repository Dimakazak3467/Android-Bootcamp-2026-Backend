package ru.sicampus.bootcamp2026.util;

import lombok.experimental.UtilityClass;
import ru.sicampus.bootcamp2026.dto.PersonDTO;
import ru.sicampus.bootcamp2026.entity.Person;


@UtilityClass
public class PersonMapper {
    public PersonDTO convertToDto(Person person) {
        PersonDTO personDTO = new PersonDTO();

        personDTO.setId(person.getId());
        personDTO.setName(person.getName());
        personDTO.setEmail(person.getEmail());
        personDTO.setUsername(person.getUsername());
        personDTO.setPhotoUrl(person.getPhotoUrl());
        personDTO.setDepartmentName(person.getDepartment().getName());

        return personDTO;
    }
}
