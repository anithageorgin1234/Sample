package com.doctor.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import org.springframework.web.client.RestTemplate;

import com.doctor.DTO.Diagnosis;
import com.doctor.DTO.Patient;
import com.doctor.entity.Doctor;
import com.doctor.repository.DoctorRepository;

@Service
public class DoctorService {
	 @Autowired 
     RestTemplate template;
	 
	@Autowired
	DoctorRepository doctorRepository;
	
	public List<Object> getInforamtion(Long patient,
			Long diagnosis,
			 Long consultion)
	{
		Doctor details=doctorRepository.getById(consultion);
		List<Object> response=new ArrayList<Object>();  
		  Patient patientResponse = template.getForObject("http://localhost:8989/patient/getPatient/"+patient, Patient.class);
		response.add(patientResponse);
		  Diagnosis diagnosisResponse = template.getForObject("http://localhost:8989/diagnosis/getDiagnosis/"+diagnosis, Diagnosis.class);
			response.add(diagnosisResponse);
			response.add(details);
			
			return response;
	}
}
