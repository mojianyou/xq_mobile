package com.wzljl.service;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface MyServiceI {

	@WebMethod
	 int add(int a, int b) ;
	

	@WebMethod
	 int minus(int a, int b) ;
}
