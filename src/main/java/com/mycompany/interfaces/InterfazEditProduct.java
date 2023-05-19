package com.mycompany.interfaces;

import com.mycompany.controls.ControlRegProd;
import java.awt.Color;
import java.io.File;
import static java.lang.Integer.parseInt;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;

public class InterfazEditProduct extends javax.swing.JPanel {

    ControlRegProd regProduct = new ControlRegProd();
    
    public InterfazEditProduct(ControlRegProd controlProd) {
        this.regProduct = controlProd;
        initComponents();
        jScrollPane1.getVerticalScrollBar().setUnitIncrement(16);
        
        dataPanel.setVisible(false);
        jScrollPane1.setVisible(false);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        searchPanel = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        searchButton = new javax.swing.JButton();
        searchCodeField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dataPanel = new javax.swing.JPanel();
        header = new javax.swing.JLabel();
        instructions = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        codeField = new javax.swing.JTextField();
        nameField = new javax.swing.JTextField();
        priceField = new javax.swing.JTextField();
        promoField = new javax.swing.JTextField();
        date1Field = new javax.swing.JTextField();
        date2Field = new javax.swing.JTextField();
        imgField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        descText = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        headAche = new javax.swing.JCheckBox();
        jointAche = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        allergi1 = new javax.swing.JCheckBox();
        allergi2 = new javax.swing.JCheckBox();
        saveButton = new javax.swing.JButton();
        fileChoose = new javax.swing.JButton();
        imgView = new javax.swing.JLabel();
        enablePromo = new javax.swing.JToggleButton();

        jMenuItem1.setText("jMenuItem1");

        setMinimumSize(new java.awt.Dimension(750, 1125));
        setPreferredSize(new java.awt.Dimension(750, 1125));

        jLabel11.setText("Ingrese el  codigo del producto a editar:");

        searchButton.setText("BUSCAR");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        jLabel12.setText("Codigo:");

        javax.swing.GroupLayout searchPanelLayout = new javax.swing.GroupLayout(searchPanel);
        searchPanel.setLayout(searchPanelLayout);
        searchPanelLayout.setHorizontalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPanelLayout.createSequentialGroup()
                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(searchPanelLayout.createSequentialGroup()
                        .addGap(330, 330, 330)
                        .addComponent(searchButton))
                    .addGroup(searchPanelLayout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(searchCodeField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(searchPanelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(222, Short.MAX_VALUE))
        );
        searchPanelLayout.setVerticalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel11)
                .addGap(84, 84, 84)
                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchCodeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addComponent(searchButton)
                .addGap(48, 48, 48))
        );

        jScrollPane1.setAutoscrolls(true);
        jScrollPane1.setHorizontalScrollBar(null);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(752, 1082));

        header.setText("jLabel1");

        instructions.setText("INGRESE LOS DATOS QUE SE PIDEN A CONTINUACION");

        jLabel1.setText("Codigo del producto:");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Descripcion:");

        jLabel4.setText("Precio:");

        jLabel5.setText("Precio de promocion:");

        jLabel6.setText("Fecha de inicio de la promocion  (yyyy-mm-dd):");

        jLabel7.setText("Fecha de fin de la promocion  (yyyy-mm-dd):");

        jLabel8.setText("Imagen del producto:");

        codeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codeFieldActionPerformed(evt);
            }
        });

        priceField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceFieldActionPerformed(evt);
            }
        });

        imgField.setFocusable(false);
        imgField.setVerifyInputWhenFocusTarget(false);
        imgField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imgFieldActionPerformed(evt);
            }
        });

        descText.setColumns(20);
        descText.setRows(5);
        jScrollPane2.setViewportView(descText);

        jLabel9.setText("Seleccione el tipo de malestares que alivia el producto:");

        headAche.setText("Dolor de cabeza");
        headAche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                headAcheActionPerformed(evt);
            }
        });

        jointAche.setText("Dolor articular");

        jLabel10.setText("Seleccione el tipo de alergias que alivia el producto:");

        allergi1.setText("alergia1");
        allergi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allergi1ActionPerformed(evt);
            }
        });

        allergi2.setText("alergia2");

        saveButton.setText("GUARDAR");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        fileChoose.setText("Elegir archivo");
        fileChoose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileChooseActionPerformed(evt);
            }
        });

        enablePromo.setText("Habilitar datos de promocion");
        enablePromo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enablePromoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dataPanelLayout = new javax.swing.GroupLayout(dataPanel);
        dataPanel.setLayout(dataPanelLayout);
        dataPanelLayout.setHorizontalGroup(
            dataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dataPanelLayout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addGroup(dataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(dataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nameField)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                    .addComponent(priceField)
                    .addComponent(codeField))
                .addGap(434, 434, 434))
            .addGroup(dataPanelLayout.createSequentialGroup()
                .addGroup(dataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dataPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(header))
                    .addGroup(dataPanelLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(dataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(headAche)
                            .addComponent(jointAche)
                            .addComponent(jLabel10)
                            .addComponent(allergi1)
                            .addComponent(allergi2)
                            .addGroup(dataPanelLayout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(imgView, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(instructions)))
                    .addGroup(dataPanelLayout.createSequentialGroup()
                        .addGap(311, 311, 311)
                        .addComponent(saveButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dataPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(dataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(dataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(enablePromo)
                            .addGroup(dataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(date2Field)
                                .addComponent(date1Field)
                                .addComponent(promoField)
                                .addGroup(dataPanelLayout.createSequentialGroup()
                                    .addComponent(imgField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                                    .addComponent(fileChoose))))
                        .addGap(14, 14, 14)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        dataPanelLayout.setVerticalGroup(
            dataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dataPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(instructions)
                .addGap(38, 38, 38)
                .addGroup(dataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(codeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(dataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dataPanelLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(85, 85, 85)
                        .addGroup(dataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(priceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(enablePromo)
                .addGap(18, 18, 18)
                .addGroup(dataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(promoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(dataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(date1Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(dataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(date2Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(dataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(imgField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(fileChoose))
                .addGap(31, 31, 31)
                .addComponent(imgView, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(headAche)
                .addGap(18, 18, 18)
                .addComponent(jointAche)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(allergi1)
                .addGap(18, 18, 18)
                .addComponent(allergi2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(saveButton)
                .addGap(80, 80, 80))
        );

        jScrollPane1.setViewportView(dataPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(searchPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1125, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(searchPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 806, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
        int index = regProduct.searchCode(searchCodeField.getText());
        if ( index >= 0){
            dataPanel.setVisible(true);
            jScrollPane1.setVisible(true);
            searchPanel.setVisible(false);
            JOptionPane.showMessageDialog(null, "Producto encontrado.");
            fillFields(index);
        }else{
            JOptionPane.showMessageDialog(null, "Producto no encontrado.");
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void fileChooseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileChooseActionPerformed
        // Se debe agregar un file chooser:
        JFileChooser fc = new JFileChooser();
        if (evt.getSource() == fileChoose) {
            int returnVal = fc.showOpenDialog(fc);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                File file = fc.getSelectedFile();
                String path = file.getAbsolutePath();
                // use the path here
                imgField.setText(path);
                //actualizamos el visualizador de imagenes
                ImageIcon icon = new ImageIcon(path);
                imgView.setIcon(icon);
            }
        }
    }//GEN-LAST:event_fileChooseActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // El boton de guardar va a mandar una actualizacion a la lista de productos
        String[] benefits = new String[10];
        int index = regProduct.searchCode(codeField.getText());
        if(checkFields()){
            if (headAche.isSelected()){
                benefits[1]="Dolor de cabeza.";
            }
            if (jointAche.isSelected()){
                benefits[2]="Dolor articular.";
            }
            if (allergi1.isSelected()){
                benefits[3]="Alergia 1";
            }
            if (allergi2.isSelected()){
                benefits[4]="Alergia 2";
            }

            for (int i = 1; i==benefits.length; i++){
                System.out.println(benefits[i] + "\n");
            }

            try{
                if (enablePromo.isSelected()) {
                    regProduct.editProductP(index, codeField.getText(), nameField.getText(), descText.getText(), parseInt(priceField.getText()), parseInt(promoField.getText()), benefits, imgField.getText(), LocalDate.parse(date1Field.getText()), LocalDate.parse(date2Field.getText()));
                } else {
                    regProduct.editProduct(index, codeField.getText(), nameField.getText(), descText.getText(), parseInt(priceField.getText()), benefits, imgField.getText());
                }
                JOptionPane.showMessageDialog(null, "Producto guardado.");
                resetFields();
                dataPanel.setVisible(false);
                jScrollPane1.setVisible(false);
                searchPanel.setVisible(true);
            }catch(NumberFormatException e1){
                System.out.println("Entrada numerica invalida");
                JOptionPane.showMessageDialog(null, "Error: Entrada numerica invalida.");
                checkInts();
                checkDates();
            }catch(DateTimeParseException e1){
                System.out.println("Fecha ingresada invalida");
                JOptionPane.showMessageDialog(null, "Error: Formato de fecha invalido.");
                checkDates();
                checkInts();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error: Aun hay campos por rellenar.");
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void allergi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allergi1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_allergi1ActionPerformed

    private void headAcheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_headAcheActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_headAcheActionPerformed

    private void imgFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imgFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imgFieldActionPerformed

    private void priceFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceFieldActionPerformed

    private void codeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codeFieldActionPerformed

    private void enablePromoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enablePromoActionPerformed
        // TODO add your handling code here:
        if(enablePromo.isSelected()){
            enablePromo();
            enablePromo.setText("Deshabilitar datos de promocion");
        }else{
            disablePromo();
            enablePromo.setText("Habilitar datos de promocion");
        }
    }//GEN-LAST:event_enablePromoActionPerformed

    private void resetFields(){
        
        codeField.setText("");
        nameField.setText("");
        priceField.setText("");
        descText.setText("");
        promoField.setText("");
        imgField.setText("");
        date1Field.setText("");
        date2Field.setText("");
        
        headAche.setSelected(false);
        jointAche.setSelected(false);
        allergi1.setSelected(false);
        allergi2.setSelected(false);
        
        imgView.setIcon(null);
        
    }
    
    private boolean checkFields(){
        int count = 0;
        if (codeField.getText().trim().isEmpty()){
            codeField.setBorder(new LineBorder(Color.RED, 2));
            count++;
        } else {
            codeField.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));
        }
        if (nameField.getText().trim().isEmpty()){
            nameField.setBorder(new LineBorder(Color.RED, 2));
            count++;
        }else {
            nameField.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));
        }
        if (descText.getText().trim().isEmpty()){
            jScrollPane2.setBorder(new LineBorder(Color.RED, 2));;
        }else {
            jScrollPane2.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("jScrollPane.border"));
        }
        if (priceField.getText().trim().isEmpty()){
            priceField.setBorder(new LineBorder(Color.RED, 2));
            count++;
        }else {
            priceField.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));
        }
       
        if (imgField.getText().trim().isEmpty()){
            imgField.setBorder(new LineBorder(Color.RED, 2));
            count++;
        }else {
            imgField.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));
        }
        
        if (enablePromo.isSelected()){
            if (date1Field.getText().trim().isEmpty()){
                date1Field.setBorder(new LineBorder(Color.RED, 2));
                count++;
            }else {
                date1Field.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));
            }
            if (date2Field.getText().trim().isEmpty()){
                date2Field.setBorder(new LineBorder(Color.RED, 2));
                count++;
            }else {
                date2Field.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));
            }
            if (promoField.getText().trim().isEmpty()){
                promoField.setBorder(new LineBorder(Color.RED, 2));
                count++;
            }else {
                promoField.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));
            }
        }else{
            date1Field.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));
            date2Field.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));
            promoField.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));
        }
        
        if (count > 0){
            return (false);
        }
        return (true);
    }
    
    private void disablePromo(){
        promoField.setEnabled(false);
        date1Field.setEnabled(false);
        date2Field.setEnabled(false);
        promoField.setText("");
        date1Field.setText("");
        date2Field.setText("");
    }
    
    private void enablePromo(){
        promoField.setEnabled(true);
        date1Field.setEnabled(true);
        date2Field.setEnabled(true);
    }
    
    private void checkInts(){
        try{
            Integer.valueOf(priceField.getText());
        }catch(NumberFormatException e2){
            System.out.println("Error en dato numerico 1");
            priceField.setBorder(new LineBorder(Color.orange, 2));
        }
        if (enablePromo.isSelected()){
            try{
                Integer.valueOf(promoField.getText());
            }catch(NumberFormatException e3){
                System.out.println("Error en dato numerico 2");
                promoField.setBorder(new LineBorder(Color.ORANGE, 2));
            }
        }
    }
    
    private void checkDates(){
        if (enablePromo.isSelected()){
            try{
                LocalDate.parse(date1Field.getText());
            }catch(DateTimeParseException e2){
                System.out.println("Error en fecha 1");
                date1Field.setBorder(new LineBorder(Color.orange, 2));
            }
            try{
                LocalDate.parse(date2Field.getText());
            }catch(DateTimeParseException e3){
                System.out.println("Error en fecha 2");
                date2Field.setBorder(new LineBorder(Color.orange, 2));
            }
        }
    }
    
    
    public void resetStiles (){
        
    }
    
    public void fillFields (int index){
        String bene = new String();
        codeField.setText(regProduct.getCode(index));
        nameField.setText(regProduct.getNombre(index));
        priceField.setText(regProduct.getPrice(index));
        descText.setText(regProduct.getDesc(index));
        imgField.setText(regProduct.getImg(index));
        
        bene = "Dolor de cabeza";
        if(regProduct.getBene(index).contains(bene)){
            headAche.setSelected(true);
        }
        bene = "Dolor articular.";
        if(regProduct.getBene(index).contains(bene)){
            jointAche.setSelected(true);
        }
        bene = "Alergia 1";
        if(regProduct.getBene(index).contains(bene)){
            allergi1.setSelected(true);
        }
        bene = "Alergia 2";
        if(regProduct.getBene(index).contains(bene)){
            allergi2.setSelected(true);
        }
        
        ImageIcon icon = new ImageIcon(regProduct.getImg(index));
        imgView.setIcon(icon);
        
        if (regProduct.isPromo(index)==true){
            promoField.setText(regProduct.getPricePromo(index));
            date1Field.setText(regProduct.getDate1(index));
            date2Field.setText(regProduct.getDate2(index));
            
            enablePromo.setSelected(true);
            enablePromo.setText("Deshabilitar datos de promocion.");
            //disablePromo();
            enablePromo();
        }
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox allergi1;
    private javax.swing.JCheckBox allergi2;
    private javax.swing.JTextField codeField;
    private javax.swing.JPanel dataPanel;
    private javax.swing.JTextField date1Field;
    private javax.swing.JTextField date2Field;
    private javax.swing.JTextArea descText;
    private javax.swing.JToggleButton enablePromo;
    private javax.swing.JButton fileChoose;
    private javax.swing.JCheckBox headAche;
    private javax.swing.JLabel header;
    private javax.swing.JTextField imgField;
    private javax.swing.JLabel imgView;
    private javax.swing.JLabel instructions;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JCheckBox jointAche;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField priceField;
    private javax.swing.JTextField promoField;
    private javax.swing.JButton saveButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchCodeField;
    private javax.swing.JPanel searchPanel;
    // End of variables declaration//GEN-END:variables
}
