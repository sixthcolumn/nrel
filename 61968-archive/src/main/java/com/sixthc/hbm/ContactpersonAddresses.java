package com.sixthc.hbm;
// Generated May 25, 2015 9:14:25 AM by Hibernate Tools 3.2.2.GA


import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.apache.log4j.Logger;

/**
 * ContactpersonAddresses generated by hbm2java
 */
@Entity
@Table(name="contactperson_addresses"

)
public class ContactpersonAddresses  implements java.io.Serializable {
	private static Constraint con = new Constraint(ContactpersonAddresses.class);
	private static org.apache.log4j.Logger log = Logger
			.getLogger(Contactperson.class);

     private Integer id;
     private Contactperson contactperson;
     private Address address;
     private String addressType;
     private Integer priorityOrder;

    public ContactpersonAddresses() {
    }

	
    public ContactpersonAddresses(Contactperson contactperson, Address address) {
        this.contactperson = contactperson;
        this.address = address;
    }
    public ContactpersonAddresses(Contactperson contactperson, Address address, String addressType, Integer priorityOrder) {
       this.contactperson = contactperson;
       this.address = address;
       this.addressType = addressType;
       this.priorityOrder = priorityOrder;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
@ManyToOne(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
    @JoinColumn(name="contactperson_id", nullable=false)
    public Contactperson getContactperson() {
        return this.contactperson;
    }
    
    public void setContactperson(Contactperson contactperson) {
        this.contactperson = contactperson;
    }
@ManyToOne(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
    @JoinColumn(name="address_id", nullable=false)
    public Address getAddress() {
        return this.address;
    }
    
    public void setAddress(Address address) {
        this.address = address;
    }
    
    @Column(name="address_type", length=12)
    public String getAddressType() {
        return this.addressType;
    }
    
    public void setAddressType(String addressType) {
    	con.check("setAddressType", addressType, true, 12);
        this.addressType = addressType;
    }
    
    @Column(name="priority_order")
    public Integer getPriorityOrder() {
        return this.priorityOrder;
    }
    
    public void setPriorityOrder(Integer priorityOrder) {
        this.priorityOrder = priorityOrder;
    }




}

