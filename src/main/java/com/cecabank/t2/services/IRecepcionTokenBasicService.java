package com.cecabank.t2.services;

import com.cecabank.t2.entity.*;

public interface IRecepcionTokenBasicService {
	
	public Token generaToken(BodyReq bodyReq);
	
	public Respuesta generaRespuesta(Fichero fichero);

}
