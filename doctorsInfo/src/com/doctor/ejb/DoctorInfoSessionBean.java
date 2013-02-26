package com.doctor.ejb;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.doctor.entity.DoctorInfo;

/**
 * Session Bean implementation class DoctorInfoSessionBean
 */
@Stateless
public class DoctorInfoSessionBean {

    
    @PersistenceContext(unitName = "doctorsInfo")
    private EntityManager em;
    
    public List<DoctorInfo> findAllDoctors(){

    	return em.createNamedQuery("doctor.findAllDoctors", DoctorInfo.class).getResultList();
    }

}
