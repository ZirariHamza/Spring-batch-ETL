package com.java.project.batch;

import java.util.HashMap;
import java.util.Map;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.java.project.model.employee;

@Component
public class Processor implements ItemProcessor<employee, employee>{
	
	private static final Map<String, String> DEPT_NAMES = new HashMap<>();

	public Processor() {
		DEPT_NAMES.put("1", "Technology");
		DEPT_NAMES.put("2", "Operations");
		DEPT_NAMES.put("3", "Accounts");
	}
	
	@Override
	public employee process(employee employee) throws Exception {
		String deptCode = employee.getDept();
		String dept = DEPT_NAMES.get(deptCode);
		employee.setDept(dept);
		System.out.println(String.format("Converted from [%s] to [%s]", deptCode, dept));
		return employee;
	}

}
