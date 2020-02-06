/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main.java.entities;


import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;


@Embeddable
public class DepartmentDetails {

    private String contractNo;
    
    @ManyToOne
    private Department department;
    
    public String getContractNo() {
		return contractNo;
	}
    
    public Department getDepartment() {
		return department;
	}
    
    public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}
    
    public void setDepartment(Department department) {
		this.department = department;
	}
}
