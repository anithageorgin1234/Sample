package com.patient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
import com.patient.entity.Patient;
import com.patient.repository.PatientRepository;

@RestController
@RequestMapping("/patient")
public class PatientController {
	@Autowired
	PatientRepository patientRepository;
	@PostMapping("/savePatient")
	public Patient savePatient(@RequestBody Patient patient)
	{
		return patientRepository.save(patient);
	}
	@GetMapping("/getPatient/{id}")
	public Patient getDiagnosis(@PathVariable("id") Long id)
	{
		return patientRepository.getById(id) ;
	}
}
