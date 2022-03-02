package model.services;

import java.util.ArrayList;
import java.util.List;

import model.entities.Department;

public class DepartmentService {
	
	public List<Department> findAll() {
		// mock
		List<Department> list = new ArrayList<>();
		list.add(new Department(1, "Computers"));
		list.add(new Department(2, "Jobs"));
		list.add(new Department(3, "Secures"));
		return list;
	}

}