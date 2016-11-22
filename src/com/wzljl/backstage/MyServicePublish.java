package com.wzljl.backstage;

import javax.xml.ws.Endpoint;

import com.wzljl.service.impl.MyServiceImpl;

public class MyServicePublish 
{
   public  static void main(String [] Args)
   {
	   String address = "http://localhost:666/dd";
	   Endpoint.publish(address, new MyServiceImpl());
   }
}
