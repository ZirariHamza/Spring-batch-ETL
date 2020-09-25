package com.java.project.batch;

import org.springframework.batch.item.ExecutionContext;
import org.springframework.batch.item.ItemStream;
import org.springframework.batch.item.ItemStreamException;

public class ItemCountStream implements ItemStream{

	@Override
	public void open(ExecutionContext executionContext) throws ItemStreamException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(ExecutionContext executionContext) throws ItemStreamException {
		System.out.println("ItemCount: "+executionContext.get("FlatFileItemReader.read.count"));
		
	}

	@Override
	public void close() throws ItemStreamException {
	}

}
