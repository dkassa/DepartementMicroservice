package com.DMicroserviceProject.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.DMicroserviceProject.Model.Departement;
import com.DMicroserviceProject.Respository.DepRespository;
import com.DMicroserviceProject.Services.DepService;


@RestController()
@RequestMapping("/api/v1")
public class DepController {
	
	@Autowired
	DepRespository depRespository;
	
	@Autowired
	DepService depService;
	
	@PostMapping("/departement")
	public ResponseEntity<Departement>createDepartement(@RequestBody Departement departement){
		
		return new ResponseEntity<>(depService.createDepartement(departement),HttpStatus.OK);
		
		
	}
	
	@GetMapping("/departement/{id}")
	public ResponseEntity<Departement>getById(@PathVariable int id){
		
		return new ResponseEntity<>(depService.findById(id),HttpStatus.FOUND);
	}
	
	@GetMapping("/departement")
	public List<Departement> employeeList(){
		
		return depService.findAllEmployee();
		
	}
	
	@DeleteMapping("/departement/{id}")
	public String delteDepartement(@PathVariable int id){
		
		return depService.deleteDepartement(id);
	}

}
