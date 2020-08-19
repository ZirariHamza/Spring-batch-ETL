package com.java.project.batch;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.java.project.model.Logs;
import com.java.project.model.employee;
import com.java.project.repository.LogRepository;

@Component
public class Processor implements ItemProcessor<employee, employee>{

	@Autowired
	private LogRepository logRepository;
	private int counter = 1;
	private String re2 = "^(\\d*),[a-zA-Z]*,(\\d*),(\\d*)$";
	
	@Override
	public employee process(employee employee){
		Pattern pt2 = Pattern.compile(re2);
		Matcher mt1 = pt2.matcher(employee.toString());
		if(mt1.matches() == true){
			System.out.println("Data structure matched");
			System.out.println(employee.toString());
			return employee;
		}else {
			System.out.println("Data structure not matched");
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
			LocalDateTime now = LocalDateTime.now();  
			Logs log = new Logs(counter, dtf.format(now).toString(), employee.toString());
			counter++;
			logRepository.save(log);
			return null;
		}
	}

}
