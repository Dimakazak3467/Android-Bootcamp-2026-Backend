package ru.sicampus.bootcamp2026.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.sicampus.bootcamp2026.dto.DepartmentBasicInfoDTO;
import ru.sicampus.bootcamp2026.dto.DepartmentDTO;
import ru.sicampus.bootcamp2026.dto.PersonDTO;
import ru.sicampus.bootcamp2026.service.DepartmentService;
import ru.sicampus.bootcamp2026.service.impl.DepartmentServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/api/department")
@RequiredArgsConstructor
public class DepartmentController {
    private final DepartmentService departmentService;

    @GetMapping
    public List<DepartmentDTO> getAllDepartments(){
        return departmentService.getAllDepartments();
    }

    @GetMapping("/basic-info")
    public List<DepartmentBasicInfoDTO> getAllDepartmentsBasicInfo() {
        return departmentService.getAllDepartmentsBasicInfo();
    }
}
