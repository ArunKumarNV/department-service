package com.org.departmentservice.service;

import com.org.departmentservice.entities.Department;


public interface DepartmentService {
    Department saveDepartment(Department department);
    Department getDepartmentById(Long departmentId);
}
