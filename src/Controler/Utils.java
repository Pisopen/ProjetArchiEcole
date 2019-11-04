package Controler;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import Model.Personne;
import Model.UniteEnseignement;

public class Utils {
	public Utils utils;
	
	public void jaxbObjectToXMLTeacher(Personne personne) {
		try
        {
            //Create JAXB Context
            JAXBContext jaxbContext = JAXBContext.newInstance(Personne.class);
            
            //Create Marshaller
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
 
            //Required formatting??
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
 
           //Store XML to File
            File file = new File("/File/Teacher.xml");
             
            //Writes XML file to file-system
            jaxbMarshaller.marshal(personne, file); 
        } 
        catch (JAXBException e) 
        {
            e.printStackTrace();
        }
	}
	
	public void jaxbObjectToXMLTeacher(UniteEnseignement unite) {
		try
        {
            //Create JAXB Context
            JAXBContext jaxbContext = JAXBContext.newInstance(UniteEnseignement.class);
             
            //Create Marshaller
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
 
            //Required formatting??
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
 
           //Store XML to File
            File file = new File("/File/Teacher.xml");
             
            //Writes XML file to file-system
            jaxbMarshaller.marshal(unite, file); 
        } 
        catch (JAXBException e) 
        {
            e.printStackTrace();
        }
	}
	
}
