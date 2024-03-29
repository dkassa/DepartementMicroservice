package com.DMicroserviceProject.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Departement {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int depId;
	private String depCode;
	private String depAddress;
	private String depName;
	
}
