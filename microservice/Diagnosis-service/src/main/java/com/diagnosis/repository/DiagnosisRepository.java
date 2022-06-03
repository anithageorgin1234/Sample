package com.diagnosis.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.diagnosis.entity.Diagnosis;

public interface DiagnosisRepository extends JpaRepository<Diagnosis, Long> {

}
