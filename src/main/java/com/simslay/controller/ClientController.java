package com.simslay.controller;

import java.io.IOException;
import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.simslay.model.Client;
import com.simslay.service.ClientService;

@Controller
public class ClientController {

	@SuppressWarnings("unused")
	private static final Logger logger = Logger.getLogger(ClientController.class);

	public ClientController() {
		//System.out.println("ClientController()");
	}

	@Autowired
	private ClientService clientService;

	@RequestMapping(value = "/")
	public ModelAndView listEmployee(ModelAndView model) throws IOException {
		List<Client> listClient = clientService.getAllClients();
		model.addObject("listClient", listClient);
		model.setViewName("index");
		return model;
	}
}
