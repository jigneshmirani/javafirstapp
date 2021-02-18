package com.example.department.service;

import com.example.department.entity.Department;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.department.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;
	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(DepartmentService.class);
	
	public Department saveDepartment(Department department)
	{
		log.info("Save Department called from Service");
		return departmentRepository.save(department);
	}
	
	public Department findDepartmentById(Long departmentId)
	{
		log.info("findDepartmentById called from Service");
		return departmentRepository.findBydepartmentId(departmentId);
	}
}



