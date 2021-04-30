package com.ecodation.dersler.cdi;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Named (value = "cdiBean")
@ApplicationScoped  // b�t�n kullan�c�lar i�indir.


@Data 
@AllArgsConstructor  
@NoArgsConstructor  
public class A004_CdiBean implements Serializable {
	private static final long serialVersionUID = -7035283249283208777L;
	
	private long id;
	private String name="Hamit";
	private String surname="M�zrak";
}