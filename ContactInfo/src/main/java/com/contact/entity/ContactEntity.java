package com.contact.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.*;

@Entity
@Table(name="CONTACT")
public class ContactEntity implements Serializable {
	
    @Id
	private Long Id;
    
    @Column
	private String name;
    @Column
	private int  phoneNumber;
    @Column
	private String email;

}
