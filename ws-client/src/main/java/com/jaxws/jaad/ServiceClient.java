package com.jaxws.jaad;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ServiceClient {
	
	private final static Logger LOG = LoggerFactory.getLogger(ServiceClient.class);

	public static void main(String[] args) throws MalformedURLException {
		
//		URL url = new URL("http://192.168.1.13:8080/crudservice/?wsdl");
//		QName qname = new QName("http://ws.mca.com/", "CrudService");
//		Service service = Service.create(url, qname);
		
//		String endpointURL = "http://192.168.23.192:8080/calculadora/?wsdl";
//		Calculadora servicePort = service.getPort(Calculadora.class);
//		BindingProvider bp = (BindingProvider) servicePort;
//		bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, endpointURL);
//
//		CrudService servicePort = service.getPort(CrudService.class);
//		Cliente cliente = servicePort.buscarCliente("12345672");
//		LOG.info("[Dni: {}, Nombres: {}]", cliente.getDni(), cliente.getNombres() + " " + cliente.getApellidos());
//		ListarClientesResponse clientes = servicePort.listarClientes("");
//		for(Cliente x: clientes.getClientes()) {			
//			LOG.info("Dni: {}, Nombres: {}", x.getDni(), x.getNombres());
//		}

	}

}
