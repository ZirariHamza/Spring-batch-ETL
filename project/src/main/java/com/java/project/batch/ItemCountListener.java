package com.java.project.batch;

import org.springframework.batch.core.scope.context.ChunkContext;


public class ItemCountListener implements org.springframework.batch.core.ChunkListener{

	@Override
	public void beforeChunk(ChunkContext context) {
	}

	@Override
	public void afterChunk(ChunkContext context) {
	}

	@Override
	public void afterChunkError(ChunkContext context) {
		int count = context.getStepContext().getStepExecution().getReadCount();
        System.out.println("ItemCount: " + count);
	}


}