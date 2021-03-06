package com.first.soap.test.ws;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import com.first.soap.test.dao.ItemDaoImpl;
import com.first.soap.test.model.Item;
import com.first.soap.test.model.ItemList;
import com.first.soap.test.security.TokenUser;
import com.first.soap.test.security.exception.SecurityException;

/**
 * 
 * @author rmacedo
 *
 */
@WebService
@SOAPBinding(style=Style.DOCUMENT,parameterStyle=ParameterStyle.WRAPPED, use=Use.LITERAL) 
//Bare e encoded n�o s�o boas praticas
public class WebServiceTest {
	
	ItemDaoImpl dao = new ItemDaoImpl();
	
	@WebResult(name="Produtos")// Mudar o nome da lista do resultado para deixar mais expressivo.
	@WebMethod(operationName="buscarProdutos") //Mudando o nome do metodo no WSDL para o deixar mais expressivo!
	@ResponseWrapper(localName="PacoteDeItens") //Mundando o nome do pacote de resposta padr�o.
	@RequestWrapper(localName="listaItens")//Mundando o nome do pacote de request padr�o.
	public ItemList getItems(){
		return dao.getItems();
	}
	
	@WebMethod(operationName="inserirProduto")
	@WebResult(name="Item")
	public Item insertItem(
			@WebParam(name="tokenUser", header=true )TokenUser token, 
			@WebParam(name="produto") Item item
			) throws SecurityException {
		
		if(!token.getToken().equalsIgnoreCase("logado"))
			throw new SecurityException("User isn't logged!");
		
		return dao.insertItem(item);
		
	}
	
	@Oneway
	@WebMethod(operationName="Sem Resposta.")
	public void withoutResponseTeste(){
		
	}

}
