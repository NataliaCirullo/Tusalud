/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tusalud.interfaces;

import com.mycompany.tusalud.controller.NotificacionController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Alumno
 */
public class VistaNotificacion extends javax.swing.JFrame {

    NotificacionController notificacionController;
    private Map<Integer, String> tablaBotonTurno = new HashMap<>();
    List<Object[]> lista;
    
    /**
     * Creates new form NewJFrame
     * @param notificacionService
     * @param lista
     */
    public VistaNotificacion(NotificacionController notificacionController, List<Object[]> lista) {
        this.notificacionController =  notificacionController;
        this.lista = lista;
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    private ActionListener listenerBoton = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            String mensaje = tablaBotonTurno.get(jTable1.getSelectedRow());
            if(mensaje != null){
                notificacionController.mostrarMensaje(mensaje);
            }
            else{
                System.out.println("No ha seleccionado notificacion");
            }
        }
    };
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButtonVolverAMenu = new javax.swing.JButton();
        jButtonVerMensaje = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            getMatrizObject(getArregloString().length),
            getArregloString()
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 520, 470));

        jButtonVolverAMenu.setBackground(new java.awt.Color(255, 255, 255));
        jButtonVolverAMenu.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonVolverAMenu.setText("Volver a Menu");
        jButtonVolverAMenu.setBorder(null);
        jButtonVolverAMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverAMenuActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVolverAMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 430, 150, 40));

        jButtonVerMensaje.setBackground(new java.awt.Color(255, 255, 255));
        jButtonVerMensaje.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonVerMensaje.setText("Ver Mensaje");
        jButtonVerMensaje.setBorder(null);
        getContentPane().add(jButtonVerMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 210, 150, 40));

        Fondo.setBackground(new java.awt.Color(92, 212, 195));
        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesL2/FondoListas.png"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVolverAMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverAMenuActionPerformed
        cerrar();
    }//GEN-LAST:event_jButtonVolverAMenuActionPerformed

    private Object[][] getMatrizObject(Integer tamaño){
        Object[][] matriz = new Object[lista.size()][tamaño];
        
        for(int fila=0; fila<lista.size(); fila++){
            
            for(int columna=0; columna<tamaño; columna++){
                matriz[fila][columna] = lista.get(fila)[columna+1];
            }
            
            tablaBotonTurno.put(fila, (String) lista.get(fila)[3]);
        }
        
        jButtonVerMensaje.addActionListener(listenerBoton);
        
        return matriz;
    }
    
    private String[] getArregloString(){
        String[] arreglo = {"FechaVigenciaInicial", "FechaVigenciaFinal", "Texto"};
        
        return arreglo;
    }
    
    public void cerrar() {
        notificacionController.volverAMenu(this);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton jButtonVerMensaje;
    private javax.swing.JButton jButtonVolverAMenu;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}