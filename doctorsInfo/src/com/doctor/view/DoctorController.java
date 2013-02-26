package com.doctor.view;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;

import com.doctor.ejb.DoctorInfoSessionBean;
import com.doctor.entity.DoctorInfo;


@ManagedBean
@RequestScoped
public class DoctorController {
	
	@Inject
	private DoctorInfoSessionBean doctorInfoSessionBean;
	private List<DoctorInfo> doctors;

	public List<DoctorInfo> getDoctors() {
		return doctorInfoSessionBean.findAllDoctors();
	}

	public void setDocctors(List<DoctorInfo> doctors) {
		this.doctors = doctors;
	}
	
	
	
	

}
