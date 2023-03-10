/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tusalud.interfaces;

import com.mycompany.tusalud.controller.SeleccionarEspecialidadController;
import com.mycompany.tusalud.data.Especialidad;
import com.mycompany.tusalud.excepciones.BDException;
import java.util.List;

/**
 *
 * @author User
 */
public class VistaSeleccionarEspecialidad extends javax.swing.JFrame {

    SeleccionarEspecialidadController seleccionarEspecialidadController;
    private final List<Especialidad> lista;

    /**
     * Creates new form Especialidad
     * @param seleccionarEspecialidadController
     * @param lista
     */
    public VistaSeleccionarEspecialidad(SeleccionarEspecialidadController seleccionarEspecialidadController, List<Especialidad> lista) {
        this.seleccionarEspecialidadController = seleccionarEspecialidadController;
        this.lista = lista;
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    private String[] getArrayEspecialidades() {
        String[] especialidades = new String[lista.size()];

        for(int i=0; i<lista.size();i++) { 

            especialidades[i] = lista.get(i).getNombre();
        }
        return especialidades;
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jListEspecialidad = new javax.swing.JList<>();
        jButtonCancelar = new javax.swing.JButton();
        jButtonAceptar = new javax.swing.JButton();
        titulo = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(238, 112, 82));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jListEspecialidad.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = getArrayEspecialidades();
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jListEspecialidad);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 340, 390));

        jButtonCancelar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 410, -1, -1));

        jButtonAceptar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonAceptar.setText("Aceptar");
        jButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 240, 110, -1));

        titulo.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        titulo.setText("Seleccionar Especialidad");
        getContentPane().add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesL2/FondoNotificacion.png"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActionPerformed
        // TODO add your handling code here:
        try {
            String elementoSeleccionado = jListEspecialidad.getSelectedValue();
            seleccionarEspecialidadController.crearAlmanaque(elementoSeleccionado);
        } catch (BDException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButtonAceptarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed

        seleccionarEspecialidadController.volverAMenu(this);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JList<String> jListEspecialidad;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
