package com.feign;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;


public class ServerNeedToAdded {

	//Need to add EmployeeInfo.java and this below controller in server side 
	@GetMapping("/employee/find/{id}")
	@ResponseBody
	public EmployeeInfo findme(@PathVariable("id") String id) {
		System.out.println("=======================================START======================================================>");
		System.out.println("the value of myself is"+id);
		EmployeeInfo emp=new EmployeeInfo();
		emp.setAge(26);
		emp.setCompanyName("Accenture");
		emp.setName("Prasanth");
		System.out.println("========================================END=====================================================>");
		return emp;

	}
}
