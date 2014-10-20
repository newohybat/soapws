package com.redhat.brq.dvqe.soapws.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(serviceName="MyService",portName="employee",targetNamespace="http://teiid.org")
public class MyService {
	@WebMethod
	public String getEmployees(){
		return "<employees><employee><FirstName></FirstName></employee></employees>";
	}
}
