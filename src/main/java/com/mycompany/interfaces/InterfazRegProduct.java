package com.mycompany.interfaces;

import com.mycompany.controls.ControlRegProd;
import java.awt.Color;
import java.awt.Component;
import java.io.File;
import static java.lang.Integer.parseInt;
import java.time.LocalDate;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;

public class InterfazRegProduct extends javax.swing.JPanel {

    ControlRegProd regProduct = new ControlRegProd();
    
    public InterfazRegProduct() {
        
        initComponents();
        jScrollPane1.getVerticalScrollBar().setUnitIncrement(16);
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
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

        setMinimumSize(new java.awt.Dimension(750, 1125));
        setPreferredSize(new java.awt.Dimension(750, 1125));

        jScrollPane1.setAutoscrolls(true);
        jScrollPane1.setHorizontalScrollBar(null);

        header.setText("jLabel1");

        instructions.setText("INGRESE LOS DATOS QUE SE PIDEN A CONTINUACION");

        jLabel1.setText("Codigo del producto:");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Descripcion:");

        jLabel4.setText("Precio:");

        jLabel5.setText("Precio de promocion:");

        jLabel6.setText("Fecha de inicio de la promocion:");

        jLabel7.setText("Fecha de fin de la promocion:");

        jLabel8.setText("Imagen del producto:");

        codeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codeFieldActionPerformed(evt);
            }
        });

        priceField.setText("0000");
        priceField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceFieldActionPerformed(evt);
            }
        });

        promoField.setText("0000");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(codeField, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameField)
                    .addComponent(jScrollPane2)
                    .addComponent(date2Field)
                    .addComponent(date1Field)
                    .addComponent(promoField)
                    .addComponent(priceField)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(imgField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addComponent(fileChoose)))
                .addGap(434, 434, 434))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(header))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(instructions)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(headAche)
                            .addComponent(jointAche)
                            .addComponent(jLabel10)
                            .addComponent(allergi1)
                            .addComponent(allergi2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(332, 332, 332)
                        .addComponent(saveButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(instructions)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(codeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(85, 85, 85)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(priceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(promoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(date1Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(date2Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(imgField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(fileChoose)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(headAche)
                .addGap(18, 18, 18)
                .addComponent(jointAche)
                .addGap(56, 56, 56)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(allergi1)
                .addGap(18, 18, 18)
                .addComponent(allergi2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 180, Short.MAX_VALUE)
                .addComponent(saveButton)
                .addGap(154, 154, 154))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // El boton de guardar va a mandar una actualizacion a la lista de productos
        String[] benefits = new String[10];
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

            regProduct.newProduct(codeField.getText(), nameField.getText(), descText.getText(), parseInt(priceField.getText()), parseInt(promoField.getText()), benefits, imgField.getText(), LocalDate.parse(date1Field.getText()), LocalDate.parse(date2Field.getText()));
            JOptionPane.showMessageDialog(null, "Producto guardado.");
            resetFields();
        } else {
            JOptionPane.showMessageDialog(null, "Error: Aun hay campos por rellenar.");
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void allergi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allergi1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_allergi1ActionPerformed

    private void imgFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imgFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imgFieldActionPerformed

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
            }
        }
        
    }//GEN-LAST:event_fileChooseActionPerformed

    private void headAcheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_headAcheActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_headAcheActionPerformed

    private void codeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codeFieldActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_codeFieldActionPerformed

    private void priceFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceFieldActionPerformed

    private void resetFields(){
        
        codeField.setText("");
        nameField.setText("");
        priceField.setText("0");
        descText.setText("0");
        promoField.setText("");
        imgField.setText("");
        date1Field.setText("");
        date2Field.setText("");
        
        headAche.setSelected(false);
        jointAche.setSelected(false);
        allergi1.setSelected(false);
        allergi2.setSelected(false);
        
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
            nameField.setBackground(Color.red);
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
        if (promoField.getText().trim().isEmpty()){
            promoField.setBorder(new LineBorder(Color.RED, 2));
            count++;
        }else {
            promoField.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));
        }
        if (imgField.getText().trim().isEmpty()){
            imgField.setBorder(new LineBorder(Color.RED, 2));
            count++;
        }else {
            imgField.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));
        }
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
        if (count > 0){
            return (false);
        }
        return (true);
    }
    
    public void resetStiles (){
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox allergi1;
    private javax.swing.JCheckBox allergi2;
    private javax.swing.JTextField codeField;
    private javax.swing.JTextField date1Field;
    private javax.swing.JTextField date2Field;
    private javax.swing.JTextArea descText;
    private javax.swing.JButton fileChoose;
    private javax.swing.JCheckBox headAche;
    private javax.swing.JLabel header;
    private javax.swing.JTextField imgField;
    private javax.swing.JLabel instructions;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JCheckBox jointAche;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField priceField;
    private javax.swing.JTextField promoField;
    private javax.swing.JButton saveButton;
    // End of variables declaration//GEN-END:variables
}
