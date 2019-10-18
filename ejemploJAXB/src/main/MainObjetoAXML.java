package main;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class MainObjetoAXML {

	public static void main(String[] args) throws Exception {
		Apuesta a = new Apuesta(4, 20, 100, "ruleta");
		JAXBContext objetoJAXB = 
				JAXBContext.newInstance(Apuesta.class);
		Marshaller marshall = objetoJAXB.createMarshaller();
		marshall.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, 
				true);
		marshall.marshal(a, new FileOutputStream("apuesta.xml"));
		System.out.println("xml generado correctamente");
	}
}
