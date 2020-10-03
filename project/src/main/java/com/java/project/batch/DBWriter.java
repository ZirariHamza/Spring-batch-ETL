package com.java.project.batch;

import java.util.List;
import java.util.Vector;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.java.project.dao.ClientRepository;
import com.java.project.model.Client;

@Component
public class DBWriter implements ItemWriter<Client>{

	private Vector<Client> VC = new Vector<>();
	
	@Autowired
	private ClientRepository clientRepository;
	
	
	@Override
	public void write(List<? extends Client> Clients) {
		clientRepository.saveAll(Clients);
		VC.addAll(Clients);
		System.out.println("Clients created : " + Clients.size());
	}
	
	public Vector<Client> getInsertedData(){
		return VC;
	}
}
