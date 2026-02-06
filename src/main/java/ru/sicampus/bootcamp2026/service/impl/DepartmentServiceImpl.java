package ru.sicampus.bootcamp2026.service.impl;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.sicampus.bootcamp2026.dto.DepartmentBasicInfoDTO;
import ru.sicampus.bootcamp2026.dto.DepartmentDTO;
import ru.sicampus.bootcamp2026.repository.DepartmentRepository;
import ru.sicampus.bootcamp2026.service.DepartmentService;
import ru.sicampus.bootcamp2026.util.DepartmentMapper;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {
    private final DepartmentRepository departmentRepository;


    @Override
    public List<DepartmentDTO> getAllDepartments() {
        return departmentRepository.findAll().stream()
                .map(DepartmentMapper::ConvertToDto)
                .collect(Collectors.toList());
    }

    @Override
    public List<DepartmentBasicInfoDTO> getAllDepartmentsBasicInfo() {
        return departmentRepository.findAll().stream()
                .map(DepartmentMapper::convertToBasicInfoDto)
                .collect(Collectors.toList());
    }
}