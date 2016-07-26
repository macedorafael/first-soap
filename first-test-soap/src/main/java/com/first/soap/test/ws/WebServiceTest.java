package com.first.soap.test.ws;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import com.first.soap.test.dao.ItemDaoImpl;
import com.first.soap.test.model.ItemList;

@WebService
public class WebServiceTest {
	
	ItemDaoImpl dao = new ItemDaoImpl();
	
	@WebResult(name="Produtos")// Mudar o nome da lista do resultado para deixar mais expressivo.
	@WebMethod(operationName="buscarProdutos") //Mudando o nome do metodo no WSDL para o deixar mais expressivo!
	@ResponseWrapper(localName="PacoteDeItens") //Mundando o nome do pacote de resposta padr�o.
	@RequestWrapper(localName="listaItens")//Mundando o nome do pacote de request padr�o.
	public ItemList getItems(){
		return dao.getItems();
	}

}
