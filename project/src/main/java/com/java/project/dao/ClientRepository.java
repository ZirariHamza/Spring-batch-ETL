package com.java.project.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.java.project.model.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer>{

	@Query(value = "SELECT COUNT(1) FROM Client WHERE bankCode = clientBankCode")
	boolean findClientByBankCode(@Param("clientBankCode")String clientBankCode);
}
