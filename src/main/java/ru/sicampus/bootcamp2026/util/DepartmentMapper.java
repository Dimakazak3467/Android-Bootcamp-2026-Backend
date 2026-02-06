package ru.sicampus.bootcamp2026.util;


import lombok.experimental.UtilityClass;
import ru.sicampus.bootcamp2026.dto.DepartmentBasicInfoDTO;
import ru.sicampus.bootcamp2026.dto.DepartmentDTO;
import ru.sicampus.bootcamp2026.entity.Department;

@UtilityClass
public class DepartmentMapper {
    public DepartmentDTO ConvertToDto(Department department){
        DepartmentDTO departmentDTO = new DepartmentDTO();

        departmentDTO.setId(department.getId());
        departmentDTO.setName(department.getName());
        departmentDTO.setPeople(department.getPeople());

        return departmentDTO;
    }

    public DepartmentBasicInfoDTO convertToBasicInfoDto(Department department) {
        DepartmentBasicInfoDTO departmentBasicInfoDto = new DepartmentBasicInfoDTO();

        departmentBasicInfoDto.setId(department.getId());
        departmentBasicInfoDto.setName(department.getName());

        return departmentBasicInfoDto;
    }
}
