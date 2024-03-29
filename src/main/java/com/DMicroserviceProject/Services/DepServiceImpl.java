package com.DMicroserviceProject.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DMicroserviceProject.Model.Departement;
import com.DMicroserviceProject.Respository.DepRespository;


@Service
public class DepServiceImpl implements DepService{
	
	@Autowired
	DepRespository depRespository;
	@Override
	public Departement createDepartement(Departement departement) {
		// TODO Auto-generated method stub
		 return depRespository.save(departement);
	}

	@Override
	public Departement findById(int id) {
		// TODO Auto-generated method stub
Optional<Departement> optionalDepartement=depRespository.findById(id);
		
		if(optionalDepartement.isPresent()) {
			return optionalDepartement.get();
		}
		
		return null;
		
		
	}

	@Override
	public List<Departement> findAllEmployee() {
		// TODO Auto-generated method stub
		return depRespository.findAll();
	}

	@Override
	public String deleteDepartement(int id) {
		// TODO Auto-generated method stub
		Optional<Departement> deltedEmployee=depRespository.findById(id);
		
		if(deltedEmployee.isPresent()) {
			
			 depRespository.deleteById(id);
		}
		
		return "delted";
	}

}
