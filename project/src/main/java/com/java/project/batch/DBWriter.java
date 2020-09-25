package com.java.project.batch;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.batch.item.ExecutionContext;
import org.springframework.batch.item.ItemStreamException;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.java.project.model.Client;
import com.java.project.repository.ClientRepository;

@Component
public class DBWriter implements ItemWriter<Client>{

	private String re1 = "^[a-zA-Z]*,[a-zA-Z]*,[a-zA-Z]*$";
	private String re2 = "^[a-zA-Z]*,[a-zA-Z]*,[a-zA-Z0-9]{6}$";
	private String line = "";
	
	@Autowired
	private ClientRepository clientRepository;
	private BufferedReader br;
	
	
	@Override
	public void write(List<? extends Client> Clients) {
		try{
			br = new BufferedReader(new FileReader("src/main/resources/Client.csv"));

			Pattern pt1 = Pattern.compile(re1);
			Pattern pt2 = Pattern.compile(re2);
		while((line = br.readLine()) != null) {
			Matcher mt1 = pt1.matcher(line);
			Matcher mt2 = pt2.matcher(line);
			if(mt1.matches() == true){
				System.out.println("Header structure matched");
			}else if(mt2.matches() == true) {
				String[] part = line.split(",");
				Client e = new Client(part[0], part[1], part[2]);
				clientRepository.save(e);
				System.out.println("Client : " + e);
			}
		}
		}catch (Exception e) {
			System.out.println("Error : " + e);
		}
	}
}
