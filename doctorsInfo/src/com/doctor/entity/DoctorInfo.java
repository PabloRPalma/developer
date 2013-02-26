package com.doctor.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the doctor_info database table.
 * 
 */
@Entity
@Table(name="doctor_info")
@NamedQuery(name="doctor.findAllDoctors",query=" select d from DoctorInfo d order by d.id ")
public class DoctorInfo implements Serializable {
	private static final long serialVersionUID = 1L;

    @Temporal( TemporalType.DATE)
	private Date birthday;

	private int gender;

	@Id
	private int id;

	@Column(name="identity_id")
	private int identityId;

	private String name;

	@Column(name="nationality_id")
	private int nationalityId;

	private int status;

    @Temporal( TemporalType.DATE)
	private Date timestamp;

    public DoctorInfo() {
    }

	public Date getBirthday() {
		return this.birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public int getGender() {
		return this.gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdentityId() {
		return this.identityId;
	}

	public void setIdentityId(int identityId) {
		this.identityId = identityId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNationalityId() {
		return this.nationalityId;
	}

	public void setNationalityId(int nationalityId) {
		this.nationalityId = nationalityId;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Date getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

}