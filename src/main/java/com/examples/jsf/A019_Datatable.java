package com.examples.jsf;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.java.Log;

@Named(value = "dataTable")
@ApplicationScoped
@Log
@Data
@NoArgsConstructor
@AllArgsConstructor
public class A019_Datatable implements Serializable {
	private static final long serialVersionUID = 4766951759126377098L;
	
	private String name;
	
	public void getAjax() {
		System.out.println("Ajax çalıştı");
		
	}
}