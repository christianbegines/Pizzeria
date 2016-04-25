    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeria5;

import java.io.File;
import pizzeria4.*;
import pizzeria3.*;
import pizzeria2.*;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author daw1
 */
public class pizzeria5 extends javax.swing.JFrame {

    Pizza p;

    /**
     * Creates new form pizzeria
     */
    public pizzeria5() {
        initComponents();
        String masa;

        if (this.rButonN.isSelected()) {
            masa = "Normal";
        } else {
            masa = "Integral";
        }
        tipo = this.listaTipos.getActionCommand();
        tam = (String) this.spinnerTamaño.getValue();
        lista = listaIngredientes.getSelectedValuesList();
        p = new Pizza(masa, tipo, tam, lista);
//        p.calcularPrecio();
        this.textoFinal.setText(p.pedido());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tipoMasa = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        rButonN = new javax.swing.JRadioButton();
        rButonI = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        listaTipos = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaIngredientes = new javax.swing.JList();
        jPanel4 = new javax.swing.JPanel();
        spinnerTamaño = new javax.swing.JSpinner();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        textoFinal = new javax.swing.JTextArea();
        botonFactura = new javax.swing.JButton();
        botonCargar = new javax.swing.JButton();
        l1 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 0));

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 0), 1, true));

        tipoMasa.add(rButonN);
        rButonN.setSelected(true);
        rButonN.setText("Normal");
        rButonN.setEnabled(false);
        rButonN.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rButonNItemStateChanged(evt);
            }
        });

        tipoMasa.add(rButonI);
        rButonI.setText("Integral");
        rButonI.setEnabled(false);
        rButonI.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rButonIItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rButonN)
                    .addComponent(rButonI))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(rButonN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rButonI)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 0), 1, true));

        listaTipos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Basica", "Cuatro Quesos", "Barbacoa", "Mexicana", "" }));
        listaTipos.setActionCommand("Basica");
        listaTipos.setEnabled(false);
        listaTipos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                listaTiposItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(listaTipos, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(listaTipos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 0), 1, true));

        listaIngredientes.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Sin ingrediente Extra", "Jamon", "Queso", "Tomate", "Olivas", "Cebolla", " " };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        listaIngredientes.setEnabled(false);
        listaIngredientes.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaIngredientesValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listaIngredientes);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 0), 1, true));

        spinnerTamaño.setModel(new javax.swing.SpinnerListModel(new String[] {"Pequeña", "Mediana", "Familiar"}));
        spinnerTamaño.setToolTipText("");
        spinnerTamaño.setEnabled(false);
        spinnerTamaño.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinnerTamañoStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(spinnerTamaño, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(spinnerTamaño, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 0), 1, true));

        textoFinal.setColumns(20);
        textoFinal.setRows(5);
        jScrollPane2.setViewportView(textoFinal);

        botonFactura.setText("GENERAR FACTURA");
        botonFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonFacturaActionPerformed(evt);
            }
        });

        botonCargar.setText("Cargar Precios");
        botonCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCargarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonFactura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonCargar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(botonCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        l1.setText("Masa");

        l2.setText("Tipo Pizza");

        l3.setText("Ingredientes Extre");

        l4.setText("Tamaño");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(l3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l2)
                    .addComponent(l3)
                    .addComponent(l4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listaIngredientesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaIngredientesValueChanged
        lista = listaIngredientes.getSelectedValuesList();
        p.setListaIngredientes(lista);
        this.textoFinal.setText(p.pedido());

    }//GEN-LAST:event_listaIngredientesValueChanged

    private void spinnerTamañoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerTamañoStateChanged
        tam = (String) this.spinnerTamaño.getValue();
        if (tam.equalsIgnoreCase("Mediana")) {
            p.setTamaño("Mediana");
            this.textoFinal.setText(p.pedido());

        }
        if (tam.equalsIgnoreCase("Familiar")) {
            p.setTamaño("Familiar");
            this.textoFinal.setText(p.pedido());

        }
        if (tam.equalsIgnoreCase("Pequeña")) {
            p.setTamaño("Pequeña");
            this.textoFinal.setText(p.pedido());

        }

    }//GEN-LAST:event_spinnerTamañoStateChanged

    private void rButonNItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rButonNItemStateChanged
        p.setMasa("Normal");
        this.textoFinal.setText(p.pedido());
    }//GEN-LAST:event_rButonNItemStateChanged

    private void rButonIItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rButonIItemStateChanged

        p.setMasa("Integral");
        this.textoFinal.setText(p.pedido());
    }//GEN-LAST:event_rButonIItemStateChanged

    private void listaTiposItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_listaTiposItemStateChanged
        String tipo = (String) this.listaTipos.getSelectedItem();
        if (tipo.equalsIgnoreCase("Basica")) {

            p.setTipo("Basica");

        }
        if (tipo.equalsIgnoreCase("Cuatro Quesos")) {

            p.setTipo("Cuatro Quesos");

        }
        if (tipo.equalsIgnoreCase("Mexicana")) {
            p.setTipo("Mexicana");

        }
        if (tipo.equalsIgnoreCase("Barbacoa")) {
            p.setTipo("Barbacoa");

        }
        this.textoFinal.setText(p.pedido());
    }//GEN-LAST:event_listaTiposItemStateChanged

    private void botonFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonFacturaActionPerformed
        boolean res = p.generarTicket();
        contador++;
        if (res == true) {
            JOptionPane.showMessageDialog(rootPane, "Factura Generada" + "\r\n" + "-----FACTURA " + Integer.toString(contador) + "-----");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Factura NO Generada", null, JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_botonFacturaActionPerformed

    private void botonCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCargarActionPerformed
        final JFileChooser fc = new JFileChooser();
        int indice = fc.showOpenDialog(null);
        if (indice == JFileChooser.APPROVE_OPTION) {
            File fichero = fc.getSelectedFile();
            boolean res = p.cargarPrecios(fichero);
            p.calcularPrecio();
            this.rButonI.setEnabled(true);
            this.rButonN.setEnabled(true);
            this.listaIngredientes.setEnabled(true);
            this.listaTipos.setEnabled(true);
            this.spinnerTamaño.setEnabled(true);
            if (res = true) {
                JOptionPane.showMessageDialog(rootPane, "Precios Cargados");
            } else {
                JOptionPane.showMessageDialog(rootPane, "Precios no cargados", null, JOptionPane.WARNING_MESSAGE);

            }
        }

    }//GEN-LAST:event_botonCargarActionPerformed

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
            java.util.logging.Logger.getLogger(pizzeria5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pizzeria5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pizzeria5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pizzeria5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pizzeria5().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCargar;
    private javax.swing.JButton botonFactura;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JList listaIngredientes;
    private javax.swing.JComboBox listaTipos;
    private javax.swing.JRadioButton rButonI;
    private javax.swing.JRadioButton rButonN;
    private javax.swing.JSpinner spinnerTamaño;
    private javax.swing.JTextArea textoFinal;
    private javax.swing.ButtonGroup tipoMasa;
    // End of variables declaration//GEN-END:variables
    int contador = 0;
    Double porcentaje;
    Double precioMasa = 0.0;
    Double precioTipo = 0.0;
    Double precioIngredientes = 0.0;
    Double precioTotal = 0.0;
    List lista;
    String tamaño, tipoPizza, tam, masa, tipo;
    List<String> totalesIngredientes = new ArrayList();
}