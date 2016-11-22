package com.wzljl.client;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebServiceClient;

import com.wzljl.service.MyServiceI;

@WebServiceClient
public class ToRequestMyService {

	/**
	 * @param args
	 * @throws MalformedURLException 
	 */
	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		URL url = new URL("http://localhost:666/dd?wsdl");
		QName qname = new QName("http://impl.service.wzljl.com/","MyServiceImplService");
		Service service = Service.create(url, qname);
		MyServiceI msi = service.getPort(MyServiceI.class);
		msi.add(1, 2);
		
	}

}
