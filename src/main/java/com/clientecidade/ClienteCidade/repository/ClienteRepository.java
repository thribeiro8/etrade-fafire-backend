package com.clientecidade.ClienteCidade.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.clientecidade.ClienteCidade.entity.Cliente;

@Repository
@EnableJpaRepositories
public interface ClienteRepository extends JpaRepository<Cliente, Long>{
	
	List<Cliente> findByNome(String name);

}
