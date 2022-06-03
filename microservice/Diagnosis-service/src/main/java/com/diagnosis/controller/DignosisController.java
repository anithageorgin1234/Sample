package com.diagnosis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diagnosis.entity.Diagnosis;
import com.diagnosis.repository.DiagnosisRepository;

@RestController
@RequestMapping("/diagnosis")
public class DignosisController {
	
	@Autowired
	DiagnosisRepository diagnosisRepository;
	
	@PostMapping("/saveDiagnosis")
	public Diagnosis save(@RequestBody Diagnosis diagnosis )
	{
		return diagnosisRepository.save(diagnosis);
	}
	
	@GetMapping("getDiagnosis/{id}")
	public Diagnosis getDiagnosis(@PathVariable("id") Long id)
	{
		return diagnosisRepository.getById(id);
	}

}
