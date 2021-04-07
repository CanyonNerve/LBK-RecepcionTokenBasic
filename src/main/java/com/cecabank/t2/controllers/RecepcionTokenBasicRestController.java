package com.cecabank.t2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cecabank.t2.entity.BodyReq;
import com.cecabank.t2.entity.Token;
import com.cecabank.t2.entity.Fichero;
import com.cecabank.t2.entity.Respuesta;
import com.cecabank.t2.services.IRecepcionTokenBasicService;


@RestController
@RequestMapping("/perpetualChange")
public class RecepcionTokenBasicRestController {
	
	@Autowired
	public IRecepcionTokenBasicService cabecera;
	
	@PostMapping(path="/cabecera", 
			consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE,
	        produces = MediaType.APPLICATION_JSON_VALUE)
	public Token show(@ModelAttribute BodyReq bodyReq) {
        System.out.println("Body " + bodyReq.getGrant_type().toString());
        System.out.println("Body " + bodyReq.getScope().toString());
        

		return cabecera.generaToken(bodyReq);

	}
	
	
	@PostMapping(path="/fichero")
	public Respuesta show(@RequestBody Fichero fichero,
			@RequestHeader(value="Authorization") String accessToken) {
		
		System.out.println("El token que me llega es : " + accessToken);

		return cabecera.generaRespuesta(fichero);

	}
		
	}	





