package com.mycompany.interfaces;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.mycompany.controls.ControlCustomer;

public class InterfaceNewUser extends javax.swing.JPanel{
	JPanel panelnewUser;
	//JTextField boxName,boxLastName,boxemailAddress,boxPhoneNumber,boxAddress,boxOccupation,boxrKnow,boxNuisance,boxBirth,boxRegister;
	//String name,lastName,emailAddress,phoneNumber,address,occupation,rKnow,nuisance,birth,register;
  public InterfaceNewUser() {//se crea una ventana
	  setSize(670,560);
	  //setDefaultCloseOperation(EXIT_ON_CLOSE);
	  initPanel();
  }
  
  private void initPanel(){
	  panelnewUser= new JPanel();//se crea un panel
	  panelnewUser.setLayout(null); //desactivamos el diseño por defecto para mover el texto
	  //this.getContentPane().add(panelnewUser);//agregamos el panel a la ventana
	  
	//se crea la etiqueta del nombre junto con su caja de texto
	  JLabel saveL= new JLabel("Crear Usuario");
	  saveL.setBounds(0, 0, 120, 60);
	  saveL.setFont(new Font("",0,18));
	  panelnewUser.add(saveL);
	  
	  JLabel lname= new JLabel("Nombre: ");
	  lname.setBounds(30, 70, 240, 20);
	  panelnewUser.add(lname);
	  JTextField boxName= new JTextField();
	  boxName.setBounds(250, 70, 300, 20);
	  panelnewUser.add(boxName);
	  
	  
	  JLabel labLastName= new JLabel("Apellidos: ");
	  labLastName.setBounds(30, 100, 240, 20);
	  panelnewUser.add(labLastName);
	  JTextField boxLastName= new JTextField();
	  boxLastName.setBounds(250, 100,300, 20);
	  panelnewUser.add(boxLastName); 
	  
	  JLabel labemailAddress= new JLabel("Correo electrónico: ");
	  labemailAddress.setBounds(30, 130, 240, 20);
	  panelnewUser.add(labemailAddress);
	  JTextField boxemailAddress= new JTextField();
	  boxemailAddress.setBounds(250, 130, 300, 20);
	  panelnewUser.add(boxemailAddress);
	
	  JLabel labPhoneNumber= new JLabel("Número de celular: ");
	  labPhoneNumber.setBounds(30, 160, 240, 20);
	  panelnewUser.add(labPhoneNumber);
	  JTextField boxPhoneNumber=new JTextField();
	  boxPhoneNumber.setBounds(250, 160, 300, 20);
	  panelnewUser.add(boxPhoneNumber);
	  
	  JLabel labAddress= new JLabel("Domicilio: ");
	  labAddress.setBounds(30, 190, 240, 20);
	  panelnewUser.add(labAddress);
	  JTextField boxAddress= new JTextField();
	  boxAddress.setBounds(250, 190, 300, 20);
	  panelnewUser.add(boxAddress);
	  
	  JLabel labOccupation= new JLabel("Ocupación: ");
	  labOccupation.setBounds(30, 220, 240, 20);
	  panelnewUser.add(labOccupation);
	  JTextField boxOccupation= new JTextField();
	  boxOccupation.setBounds(250, 220, 300, 20);
	  panelnewUser.add(boxOccupation);
	  
	  JLabel labrKnow= new JLabel("¿Cómo conoce este establecimiento?: ");
	  labrKnow.setBounds(30, 250, 240, 20);
	  panelnewUser.add(labrKnow);
	  JTextField boxrKnow= new JTextField();
	  boxrKnow.setBounds(250, 250, 300, 20);
	  panelnewUser.add(boxrKnow);
	  
	  JLabel labNuisance= new JLabel("Malestares: ");
	  labNuisance.setBounds(30, 280, 240, 20);
	  panelnewUser.add(labNuisance);
	  JTextField boxNuisance= new JTextField();
	  boxNuisance.setBounds(250, 280, 300, 20);
	  panelnewUser.add(boxNuisance);
	  
	  JLabel labBirth= new JLabel("Fecha de nacimiento (AAAA-MM-DD): ");
	  labBirth.setBounds(30, 310, 240, 20);
	  panelnewUser.add(labBirth);
	  JTextField boxBirth= new JTextField();
	  boxBirth.setBounds(250, 310, 300, 20);
	  panelnewUser.add(boxBirth);
	  
	  JLabel labRegister= new JLabel("Fecha de registro (AAAA-MM-DD): ");
	  labRegister.setBounds(30, 340, 240, 50);
	  panelnewUser.add(labRegister);
	  JTextField boxRegister= new JTextField();
	  boxRegister.setBounds(250, 340, 300, 20);
	  panelnewUser.add(boxRegister);
	 
	 JButton btnGuardar= new JButton("Guardar");
	  btnGuardar.setBounds(250, 400, 140, 30);
	  panelnewUser.add(btnGuardar);
	  
 	ActionListener saveU= new ActionListener() {
    ControlCustomer cc= new ControlCustomer();
			@Override
			public void actionPerformed(ActionEvent e) {
				
				 try {
					cc.saveUser(boxName,boxLastName,boxemailAddress,boxPhoneNumber,boxAddress,boxOccupation,boxrKnow,boxNuisance,boxBirth,boxRegister);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
				
			};
	 btnGuardar.addActionListener(saveU);
	  }
  
}
