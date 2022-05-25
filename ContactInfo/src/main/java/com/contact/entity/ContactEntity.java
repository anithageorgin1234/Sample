package com.contact.entity;

import java.io.Serializable;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="CONTACT")
public class ContactEntity implements Serializable {
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;
    
    @Column
	private String name;
    @Column
	private int  phoneNumber;
    @Column
	private String email;

}
