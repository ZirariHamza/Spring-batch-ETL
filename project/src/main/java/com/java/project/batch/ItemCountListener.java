package com.java.project.batch;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.batch.core.ChunkListener;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.beans.factory.annotation.Autowired;

public class ItemCountListener implements ChunkListener {

	private int counter = 1;

	@Autowired
	private DBWriter data;

	private static final Logger LOGGER = LogManager.getLogger(ItemCountListener.class);

	@Override
	public void beforeChunk(ChunkContext context) {
	}

	@Override
	public void afterChunk(ChunkContext context) {
		int count = context.getStepContext().getStepExecution().getReadCount();
		System.out.println("Batch number " + counter + " is processed");
		System.out.println("Total items processed : " + count);

		LOGGER.info("Batch number " + counter + " is processed");
		LOGGER.info("Total items processed : " + count);
		LOGGER.info("Clients created : " + data.getInsertedData().size());
		counter++;
	}

	@Override
	public void afterChunkError(ChunkContext context) {
	}
}