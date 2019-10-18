package main;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

public class MainXMLaObjeto {
	public static void main(String[] args) throws Exception{
		JAXBContext objetoJAXB = 
				JAXBContext.newInstance(Apuesta.class);
		Unmarshaller unmarshall = 
				objetoJAXB.createUnmarshaller();
		Apuesta a = 
				(Apuesta)unmarshall.unmarshal(
						new File("apuesta.xml"));
		System.out.println("apuesta formada a partir del xml:");
		System.out.println(a.toString());
	}
}


