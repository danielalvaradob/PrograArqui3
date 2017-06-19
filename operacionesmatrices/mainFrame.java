/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacionesmatrices;

import java.io.IOException;
import java.util.Random;
import jxl.write.WriteException;
import javax.swing.JOptionPane;
/**
 *
 * @author danielalvarado
 */
public class mainFrame extends javax.swing.JFrame {

    private Operations operations;
    /**
     * Creates new form mainFrame
     */
    public mainFrame() {
        initComponents();
       this.operations = new Operations();
       newFileNameTextEdit.setVisible(false);
            nameEdit1.setVisible(true);
            nameEdit2.setVisible(false);
            escalarEdit.setVisible(false);
            jTextArea1.setVisible(false);
            
            name2Label.setVisible(false);
            escalarLabel.setVisible(false);
            jLabel2.setVisible(false);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        crearArchivoDialog = new javax.swing.JDialog();
        jLabel5 = new javax.swing.JLabel();
        nameTextEdit = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        comboBoxPN = new javax.swing.JComboBox<>();
        jToggleButton1 = new javax.swing.JToggleButton();
        colTextEdit = new javax.swing.JTextField();
        rowTextEdit = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        createFile = new javax.swing.JButton();
        optionsComboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        nameEdit1 = new javax.swing.JTextField();
        nameEdit2 = new javax.swing.JTextField();
        name1Label = new javax.swing.JLabel();
        name2Label = new javax.swing.JLabel();
        escalarLabel = new javax.swing.JLabel();
        escalarEdit = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        acceptBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        newFileNameTextEdit = new javax.swing.JTextField();

        crearArchivoDialog.setMinimumSize(new java.awt.Dimension(500, 300));

        jLabel5.setText("Nombre del Archivo");

        nameTextEdit.setText("nombre");
        nameTextEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextEditActionPerformed(evt);
            }
        });

        jLabel6.setText("Numero de Columnas");

        jLabel7.setText("Numero de Filas");

        comboBoxPN.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Positivos", "Negativos", "Pos-Neg"}));

        jToggleButton1.setText("Aceptar");
        jToggleButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButton1MouseClicked(evt);
            }
        });
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        colTextEdit.setText("10");

        rowTextEdit.setText("10");

        jLabel8.setText("Tipo de Enteros");

        javax.swing.GroupLayout crearArchivoDialogLayout = new javax.swing.GroupLayout(crearArchivoDialog.getContentPane());
        crearArchivoDialog.getContentPane().setLayout(crearArchivoDialogLayout);
        crearArchivoDialogLayout.setHorizontalGroup(
            crearArchivoDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crearArchivoDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(crearArchivoDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, crearArchivoDialogLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jToggleButton1))
                    .addGroup(crearArchivoDialogLayout.createSequentialGroup()
                        .addGroup(crearArchivoDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(crearArchivoDialogLayout.createSequentialGroup()
                                .addGroup(crearArchivoDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(crearArchivoDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rowTextEdit)
                                    .addComponent(colTextEdit)))
                            .addGroup(crearArchivoDialogLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(nameTextEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(crearArchivoDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboBoxPN, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(crearArchivoDialogLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        crearArchivoDialogLayout.setVerticalGroup(
            crearArchivoDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crearArchivoDialogLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(crearArchivoDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(nameTextEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(crearArchivoDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(crearArchivoDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(colTextEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(comboBoxPN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(crearArchivoDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(rowTextEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        createFile.setText("Crear Archivo");
        createFile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createFileMouseClicked(evt);
            }
        });
        createFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createFileActionPerformed(evt);
            }
        });

        optionsComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Suma", "Producto por un escalar", "Producto", "Transpuesta","Identificar Tipo","Inversa" }));
        optionsComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionsComboBoxActionPerformed(evt);
            }
        });

        jLabel1.setText("Seleccionar Operacion");

        jButton1.setText("Abrir Archivo");

        nameEdit1.setMinimumSize(new java.awt.Dimension(100, 50));
        nameEdit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameEdit1ActionPerformed(evt);
            }
        });

        nameEdit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameEdit2ActionPerformed(evt);
            }
        });

        name1Label.setText("Nombre Arhivo1");

        name2Label.setText("Nombre Arhivo2");

        escalarLabel.setText("Escalar");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        acceptBtn.setText("Aceptar");
        acceptBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                acceptBtnMouseClicked(evt);
            }
        });
        acceptBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptBtnActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre del nuevo Archivo");

        newFileNameTextEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newFileNameTextEditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(name1Label, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(name2Label, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(escalarLabel)
                            .addComponent(acceptBtn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(nameEdit2, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                            .addComponent(nameEdit1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(escalarEdit))))
                .addGap(27, 27, 27))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(newFileNameTextEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(createFile)
                            .addComponent(optionsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createFile)
                    .addComponent(jButton1))
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(optionsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(acceptBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameEdit1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name1Label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameEdit2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name2Label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(escalarLabel)
                    .addComponent(escalarEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newFileNameTextEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createFileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_createFileActionPerformed

    private void optionsComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionsComboBoxActionPerformed
        // TODO add your handling code here:
        
        String inComboBox = optionsComboBox.getSelectedItem().toString();
        String newFileName = newFileNameTextEdit.getText();
        String fileName1 = nameEdit1.getText();
        String fileName2 = nameEdit2.getText();
        String numberE = escalarEdit.getText();
        
        if (inComboBox == "Transpuesta") {
            newFileNameTextEdit.setVisible(true);
            nameEdit1.setVisible(true);
            nameEdit2.setVisible(false);
            escalarEdit.setVisible(false);
            jTextArea1.setVisible(false);
            
            
            name2Label.setVisible(false);
            escalarLabel.setVisible(false);
            jLabel2.setVisible(true);
            

            
        } else if (inComboBox == "Identificar Tipo") {
            
            newFileNameTextEdit.setVisible(false);
            nameEdit1.setVisible(true);
            nameEdit2.setVisible(false);
            escalarEdit.setVisible(false);
            jTextArea1.setVisible(true);
            
            
            name2Label.setVisible(false);
            escalarLabel.setVisible(false);
            jLabel2.setVisible(false);
            
            
            
            
        } else if (inComboBox == "Producto") {
            
            newFileNameTextEdit.setVisible(true);
            nameEdit1.setVisible(true);
            nameEdit2.setVisible(true);
            escalarEdit.setVisible(false);
            jTextArea1.setVisible(false);
            
            name2Label.setVisible(true);
            escalarLabel.setVisible(false);
            jLabel2.setVisible(true);
 
        }else if (inComboBox == "Producto por un escalar") {
            
            newFileNameTextEdit.setVisible(true);
            nameEdit1.setVisible(true);
            nameEdit2.setVisible(false);
            escalarEdit.setVisible(true);
            jTextArea1.setVisible(false);
            
            name2Label.setVisible(false);
            escalarLabel.setVisible(true);
            jLabel2.setVisible(true);

        } else if (inComboBox == "Inversa") {
            newFileNameTextEdit.setVisible(true);
            nameEdit1.setVisible(true);
            nameEdit2.setVisible(false);
            escalarEdit.setVisible(false);
            jTextArea1.setVisible(false);
            
            name2Label.setVisible(false);
            escalarLabel.setVisible(false);
            jLabel2.setVisible(true);
           
            
        }else if (inComboBox == "Suma") {
            newFileNameTextEdit.setVisible(true);
            nameEdit1.setVisible(true);
            nameEdit2.setVisible(true);
            escalarEdit.setVisible(false);
            jTextArea1.setVisible(false);
            
            name2Label.setVisible(true);
            escalarLabel.setVisible(false);
            jLabel2.setVisible(true);
            
            
        }
        
        
        
    }//GEN-LAST:event_optionsComboBoxActionPerformed

    private void nameEdit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameEdit1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameEdit1ActionPerformed

    private void nameEdit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameEdit2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameEdit2ActionPerformed

    @SuppressWarnings("empty-statement")
    private void createFileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createFileMouseClicked
        // TODO add your handling code here:
        
        //PRUEBA
        //Random r = new Random();
        //int n =  -100 + r.nextInt(100 - (-100)) + 1;
        //System.out.println(Integer.toString(n));
        
        crearArchivoDialog.setVisible(true);
        
        /*
        WriteExcel test = new WriteExcel();
        test.setNormalSettings(10, 10, IntType.POS_NEG);
        test.setOutputFile("POSNEG");
        try {
            test.writeNewFile();
            
        } 
        catch (IOException | WriteException e) {
            System.out.println("ERROR");
        };
        */
            
    }//GEN-LAST:event_createFileMouseClicked

    private void nameTextEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextEditActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton1MouseClicked
        
        int nrows = Integer.parseInt(rowTextEdit.getText());
        int ncols = Integer.parseInt(colTextEdit.getText());
        
        IntType type = IntType.NEGATIVE;
        String name = nameTextEdit.getText();
        String PosNeg = comboBoxPN.getSelectedItem().toString();
        
        switch (PosNeg) {
            case "Positivos":
                type = IntType.POSITIVE;
                break;
            case "Negativos":
                type = IntType.NEGATIVE;
                break;
            default:
                type = IntType.POS_NEG;
                break;
        }
        
        
        
        
        
        WriteExcel test = new WriteExcel();
        test.setNormalSettings(nrows, ncols, type);
        test.setOutputFile(name);
        try {
            test.writeNewFile();
            
        } 
        catch (IOException | WriteException e) {
            System.out.println("ERROR");
        };
        
        JOptionPane.showMessageDialog(null,"Matriz Creada");
        crearArchivoDialog.setVisible(false);
        
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton1MouseClicked

    private void acceptBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_acceptBtnActionPerformed

    private void acceptBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acceptBtnMouseClicked
        
        String inComboBox = optionsComboBox.getSelectedItem().toString();
        /*
        "Suma", "Producto por un escalar", "Producto", "Transpuesta",
        "Matriz Unidad"
        */
        
        /*
        "Suma", "Producto por un escalar", "Producto", "Transpuesta",
        "Matriz Fila","Matriz Columna",
        "Matriz Rectangular","Matriz cuadrada","Matriz nula",
        "Matriz Triangular","Triangular Inferioz","Matriz Escalar",
        "Matriz Identidad","Matriz Unidad"
        */
        jTextArea1.setText(" ");
        String newFileName = newFileNameTextEdit.getText();
        String fileName1 = nameEdit1.getText();
        String fileName2 = nameEdit2.getText();
        String numberE = escalarEdit.getText();
        
        
        
        
        if (inComboBox == "Transpuesta") {
            this.operations.createTransM(fileName1, newFileName);
            JOptionPane.showMessageDialog(null,"Matriz Transpuesta creada con "
                    + "el nombre de " + newFileName);
            
        } else if (inComboBox == "Identificar Tipo") {
            String type = this.operations.getType(fileName1);
            
            jTextArea1.setText(type);
            
        } else if (inComboBox == "Producto") {
            String msg = this.operations.multiplyM(fileName1, fileName2, newFileName);
            JOptionPane.showMessageDialog(null,msg);
        
        }else if (inComboBox == "Producto por un escalar") {
            this.operations.multiplyE(fileName1, newFileName,Integer.parseInt(numberE));
            JOptionPane.showMessageDialog(null,"Matriz creada!");
            
        } else if (inComboBox == "Inversa") {
            //se saca la inversaint x = 0;
            int rs = 0,cs = 1;
            ReadExcel file1 = new ReadExcel();
            try {
                file1.read(file1 + ".xls");
                 rs = file1.getNumRows();
                 cs = file1.getNumCols();
            }catch (Exception e) {};

            if (rs != cs) {
                JOptionPane.showMessageDialog(null,"Matriz debe ser cuadrada!");
            } else {
                int[][]m = operations.createMatrix(fileName1);
                int[][]inversa = operations.matrizInversa(m);
                int r = inversa.length;
                operations.crearMatrixEnArchivo(inversa, newFileName, r, r);
                JOptionPane.showMessageDialog(null,"Matriz CREADA!, bajo el nombre de "
                        + newFileName );
            }
            
            
            
            
        }else if (inComboBox == "Suma") {
            
            //codigo para que saque la suma, conexion
            int x = 0;
            
        }
    }//GEN-LAST:event_acceptBtnMouseClicked

    private void newFileNameTextEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newFileNameTextEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newFileNameTextEditActionPerformed

    static native void sumarValores(int a, int b);

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acceptBtn;
    private javax.swing.JTextField colTextEdit;
    private javax.swing.JComboBox<String> comboBoxPN;
    private javax.swing.JDialog crearArchivoDialog;
    private javax.swing.JButton createFile;
    private javax.swing.JTextField escalarEdit;
    private javax.swing.JLabel escalarLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel name1Label;
    private javax.swing.JLabel name2Label;
    private javax.swing.JTextField nameEdit1;
    private javax.swing.JTextField nameEdit2;
    private javax.swing.JTextField nameTextEdit;
    private javax.swing.JTextField newFileNameTextEdit;
    private javax.swing.JComboBox<String> optionsComboBox;
    private javax.swing.JTextField rowTextEdit;
    // End of variables declaration//GEN-END:variables
}
