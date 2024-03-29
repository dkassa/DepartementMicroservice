package com.DMicroserviceProject.Services;

import java.util.List;

import com.DMicroserviceProject.Model.Departement;

public interface DepService {
	
	Departement createDepartement(Departement departement);
	Departement findById(int id);
	List<Departement> findAllEmployee();
	String deleteDepartement(int id);

}
