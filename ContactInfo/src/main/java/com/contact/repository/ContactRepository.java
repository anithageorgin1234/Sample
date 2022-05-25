package com.contact.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.contact.entity.ContactEntity;
 

@Repository
public interface ContactRepository extends JpaRepository  <ContactEntity,Long>{

}
