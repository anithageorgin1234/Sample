package com.doctor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.doctor.entity.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {

}
