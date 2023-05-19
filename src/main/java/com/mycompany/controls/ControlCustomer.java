package com.mycompany.controls;
import static java.lang.Integer.parseInt;
import java.io.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.LinkedList;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.mycompany.entities.Customer;

public class ControlCustomer {
	JTextField boxName,boxLastName,boxemailAddress,boxPhoneNumber,boxAddress,boxOccupation,boxrKnow,boxNuisance,boxBirth,boxRegister;
	 LinkedList<Customer> customerList = new LinkedList<>();
	    Customer customer;
	    
	    public  ControlCustomer () {
	    	
	    }
	    
	
 public  void saveUser(JTextField boxName,JTextField boxLastName,JTextField boxemailAddress,JTextField boxPhoneNumber,JTextField boxAddress,JTextField boxOccupation,JTextField boxrKnow,JTextField boxNuisance,JTextField boxBirth,JTextField boxRegister) throws FileNotFoundException, IOException{
		
		String name=boxName.getText().trim();
		String lastName=boxLastName.getText().trim();
		String emailAddress=boxemailAddress.getText().trim();
		String phoneNumber=boxPhoneNumber.getText().trim();
		String address=boxAddress.getText().trim();
		String occupation=boxOccupation.getText().trim();
		String rKnow=boxrKnow.getText().trim();
		String nuisance=boxNuisance.getText().trim();
		String birth=boxBirth.getText().trim();
		String register=boxRegister.getText().trim();
		
		
		customer= new Customer(name,lastName,emailAddress,phoneNumber,address,occupation,rKnow,nuisance,birth,register);
		customerList.add(customer);
		/*public void saveOnFile() throws FileNotFoundException, IOException{
	        try{
	            FileOutputStream fileOut = new FileOutputStream("F:\\T.HECTOR S.M.Y\\ESTUDIO\\BUAP\\QUINTO SEMESTRE\\INGENIERIA DE SOFTWARE\\PROYECTO FINAL\\ProyectoIS\\obj.txt");
	            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
	            objectOut.writeObject(productsList);
	            objectOut.close();
	            System.out.println("Lista de productos guardada en elarchivo");
	        } catch (Exception e){
	            e.printStackTrace();
	            System.out.println("Error al guardar.");
	        }
	    }*/
		try {
			 FileOutputStream fileOut = new FileOutputStream("db.txt");
			 ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
			 objectOut.writeObject(customerList);
	            objectOut.close();
	            System.out.println("Lista de productos guardada en elarchivo");
			
		} catch (Exception e) {
			System.out.println("Error, no se pudo guardar sobre el archivo");
			e.printStackTrace();}
		
}   
        public void editUser(JTextField boxName,JTextField boxLastName,JTextField boxemailAddress,JTextField boxPhoneNumber,JTextField boxAddress,JTextField boxOccupation,JTextField boxrKnow,JTextField boxNuisance,JTextField boxBirth,JTextField boxRegister) {
        	
      //se lee la lista desde la bd
        	try {
        		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("db.txt")); 
        	    customerList = (LinkedList<Customer>) ois.readObject();
        	    ois.close();
        	} catch (Exception e) {
        	    e.printStackTrace();
        	}
   //Editar la lista 
        	int i=parseInt(JOptionPane.showInputDialog("Ingrese el número de cliente el cual quiere editar: "));
        	
        	Customer customer = customerList.get(i-1); // Obtiene el cliente de la lista
        	customer.setName(boxName.getText()); // Actualiza dato del cliente
        	customer.setLastName(boxName.getText());
        	customer.setEmailAddress(boxName.getText());
        	customer.setPhoneNumber(boxName.getText());
        	customer.setAddress(boxName.getText());
        	customer.setOccupation(boxName.getText());
        	customer.setrKnow(boxName.getText()); 
        	customer.setNuisance(boxName.getText());
        	customer.setBirth(boxName.getText());
        	customer.setRegister(boxName.getText());
        	
        	
        	//se actualiza la lista
        	try {
        		ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream("db.txt"));
        		oos.writeObject(customerList);
        		oos.close();
        	} catch (Exception e) {
        		e.printStackTrace();
        	}
        	
        	
        	
        } 

}