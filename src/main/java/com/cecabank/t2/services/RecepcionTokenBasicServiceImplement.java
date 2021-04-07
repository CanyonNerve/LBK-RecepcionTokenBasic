package com.cecabank.t2.services;

import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.cecabank.t2.entity.BodyReq;
import com.cecabank.t2.entity.Fichero;
import com.cecabank.t2.entity.Respuesta;
import com.cecabank.t2.entity.Token;

@Service
public class RecepcionTokenBasicServiceImplement implements IRecepcionTokenBasicService{

	@Override
	public Token generaToken(BodyReq bodyReq) {
		// TODO Auto-generated method stub
		
		System.out.println("Los datos del body son " + bodyReq.getGrant_type()+" / "
		+ bodyReq.getScope());
		
		Token token = new Token();
        token.setAccess_token("token.yes.90125");
        token.setConsented_on("333344");
        token.setExpires_in("3600");
        token.setScope("read");
        token.setToken_type("Bearer");
		 
		return token;
	}
	
	@Override
	public Respuesta generaRespuesta(Fichero fichero) {	
		
		System.out.println("Fichero " + fichero.getLongitud());
		System.out.println("Fichero "  + fichero.getXml());
		
		Respuesta respuesta=new Respuesta();
		respuesta.setMensaje("Operación Recibida OK");
		respuesta.setStatus("OK");
		respuesta.setError("");
		
	    return respuesta;
	}
	

}
