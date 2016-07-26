package com.first.soap.test.main;

import javax.xml.ws.Endpoint;

import com.first.soap.test.ws.WebServiceTest;

public class ClassMain {
	
	public static void main(String[] args) {
		
		WebServiceTest service = new WebServiceTest();
		
		String url = "http://localhost:8080/teste";
		
		Endpoint.publish(url, service);
		
	}

}
