package com.doctor.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.doctor.DTO.Diagnosis;
import com.doctor.DTO.Patient;
import com.doctor.entity.Doctor;
import com.doctor.repository.DoctorRepository;
import com.doctor.service.DoctorService;

@RestController
@RequestMapping("/doctor")
public class DoctorController {
 
	@Autowired
	DoctorRepository doctorRepository;
	
	@Autowired
	DoctorService doctorService;
	
	@PostMapping("/saveDoctor")
	public Doctor save(@RequestBody Doctor doctor)
	{
		return doctorRepository.save(doctor);
	}
	@GetMapping("/getInformation")
	public List<Object> getInforamtion(@RequestParam(name="patient") Long patient,
			@RequestParam(name="diagnosis") Long diagnosis,
			@RequestParam(name="consultion") Long consultion)
	{ 
		List<Object> response= doctorService.getInforamtion(patient, diagnosis, consultion);
			
		return response;
	}

}
