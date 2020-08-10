package com.java.project.batch;

import java.util.List;

import org.springframework.batch.item.ExecutionContext;
import org.springframework.batch.item.ItemStreamException;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.java.project.model.employee;
import com.java.project.repository.UserRepository;

@Component
public class DBWriter implements ItemWriter<employee>{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void write(List<? extends employee> employees) throws Exception {
		
		System.out.println("Data Saved for Users: " + employees);
		userRepository.saveAll(employees);
	}
	
	public void update(ExecutionContext executionContext) throws ItemStreamException {
        System.out.println("ItemCount: "+executionContext.get("FlatFileItemReader.read.count"));
    }
}
