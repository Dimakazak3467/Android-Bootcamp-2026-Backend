package ru.sicampus.bootcamp2026.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.sicampus.bootcamp2026.dto.PersonDTO;
import ru.sicampus.bootcamp2026.entity.Person;
import ru.sicampus.bootcamp2026.service.PersonService;

import java.util.List;

@RestController
@RequestMapping("/api/person")
@RequiredArgsConstructor
public class PersonController {
    private final PersonService personService;

    @GetMapping
    public List<PersonDTO> getAllPersons(){
        return personService.getAllPersons();
    }

    @GetMapping("/{id}")
    public ResponseEntity<PersonDTO> getResponseById(@PathVariable Long id){
        return ResponseEntity.ok(personService.getPersonById(id));
    }

    @PostMapping("/register")
    public ResponseEntity<PersonDTO> createPerson(@RequestBody PersonDTO dto){
        return ResponseEntity.status(HttpStatus.CREATED).body(personService.createPerson(dto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<PersonDTO> updatePerson(@PathVariable Long id, @RequestBody PersonDTO dto){
        return ResponseEntity.ok(personService.updatePerson(id, dto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePerson(@PathVariable Long id){
        personService.deletePerson(id);
        return ResponseEntity.noContent().build();
    }

}
