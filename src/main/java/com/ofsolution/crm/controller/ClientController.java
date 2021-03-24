package com.ofsolution.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ofsolution.crm.model.Client;
import com.ofsolution.crm.repository.ClientRepository;

@RestController
//mapear os endpoints
@RequestMapping("/clients")
public class ClientController {
	
	@Autowired
	private ClientRepository clientRepository;

	
	@GetMapping
	public List<Client> list() {
		
		
		return clientRepository.findAll();
		
		
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Client add(@RequestBody Client client) {
		
		return clientRepository.save(client);
		
	}
	
	

}
