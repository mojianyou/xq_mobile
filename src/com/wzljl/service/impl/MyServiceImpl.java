package com.wzljl.service.impl;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import com.wzljl.service.MyServiceI;

@WebService(endpointInterface="com.wzljl.service.MyServiceI")
public class MyServiceImpl implements MyServiceI {

	
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a +"+"+b+"="+(a+b));
		return (a+b);
	}

	
	public int minus(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a +"-"+b+"="+(a-b));
		return (a-b);
	}

}

