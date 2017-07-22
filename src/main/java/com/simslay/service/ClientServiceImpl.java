package com.simslay.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.simslay.dao.ClientDAO;
import com.simslay.model.Client;

@Service
@Transactional
public class ClientServiceImpl implements ClientService {

	@Autowired
	private ClientDAO clientDAO;

	@Transactional
	public List<Client> getAllClients() {
		return clientDAO.getAllClients();
	}

}
