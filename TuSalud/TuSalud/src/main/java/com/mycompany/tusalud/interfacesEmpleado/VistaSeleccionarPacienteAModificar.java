/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tusalud.interfacesEmpleado;

import com.mycompany.tusalud.controllerEmpleado.SeleccionarPacienteAModificarController;
import com.mycompany.tusalud.excepciones.BDException;
import com.mycompany.tusalud.interfaces.MiDialogo;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Alumno
 */
public class VistaSeleccionarPacienteAModificar extends javax.swing.JFrame {

    SeleccionarPacienteAModificarController seleccionarPacienteAModificarController;
    private Map<Integer, Integer> tablaBotonIdPaciente = new HashMap<>();
    private List<Object[]> lista;
    
    /**
     * Creates new form VistaModificarDatosDePacientesDeLugar
     * @param seleccionarPacienteAModificarController
     * @param lista
     */
    public VistaSeleccionarPacienteAModificar(SeleccionarPacienteAModificarController seleccionarPacienteAModificarController, List<Object[]> lista) {
        this.seleccionarPacienteAModificarController = seleccionarPacienteAModificarController;
        this.lista = lista;
        initComponents();
        this.setLocationRelativeTo(null);
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
        jTable1 = new javax.swing.JTable();
        jButtonSeleccionarPaciente = new javax.swing.JButton();
        jButtonVolverAMenu = new javax.swing.JButton();
        jTextFieldIndice = new javax.swing.JTextField();
        jButtonBuscar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButtonEliminarPaciente = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            getMatrizObject(getArregloString().length),
            getArregloString()
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 400, 390));

        jButtonSeleccionarPaciente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonSeleccionarPaciente.setText("Seleccionar Paciente");
        jButtonSeleccionarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSeleccionarPacienteActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSeleccionarPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 610, 180, -1));

        jButtonVolverAMenu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonVolverAMenu.setText("Volver a Menu");
        jButtonVolverAMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverAMenuActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVolverAMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 670, 140, -1));
        getContentPane().add(jTextFieldIndice, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 180, 140, 25));

        jButtonBuscar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, 140, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Seleccionar Paciente");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, -1, -1));

        jButtonEliminarPaciente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonEliminarPaciente.setText("Eliminar Paciente");
        jButtonEliminarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarPacienteActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEliminarPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 610, 180, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesL2/FondoNotificacion.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 0, 650, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        seleccionarPacienteAModificarController.buscarPacientePorIndice(jTextFieldIndice.getText()+"%", this);
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonSeleccionarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSeleccionarPacienteActionPerformed
        Integer id = tablaBotonIdPaciente.get(jTable1.getSelectedRow());
        if(id != null){
            try {
                seleccionarPacienteAModificarController.idPacienteAModificar(id, this);
            } catch (BDException ex) {
                MiDialogo.mostrar(ex, "Error al seleccionar paciente");
            }
        }
        else{
            System.out.println("No ha seleccionado paciente");
        }
    }//GEN-LAST:event_jButtonSeleccionarPacienteActionPerformed

    private void jButtonVolverAMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverAMenuActionPerformed
        seleccionarPacienteAModificarController.volverAMenu(this);
    }//GEN-LAST:event_jButtonVolverAMenuActionPerformed

    private void jButtonEliminarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarPacienteActionPerformed
        Integer id = tablaBotonIdPaciente.get(jTable1.getSelectedRow());
        if(id != null){
            try {
                seleccionarPacienteAModificarController.eliminarPaciente(id, this);
                MiDialogo.mostrar("El paciente fue eliminado con exito", "Notificacion");
            } catch (BDException ex) {
                MiDialogo.mostrar(ex, "Error al eliminar paciente");
            }
        }
        else{
            System.out.println("No ha seleccionado paciente");
        }
    }//GEN-LAST:event_jButtonEliminarPacienteActionPerformed

    public Object[][] getMatrizObject(int tama??o){
        Object[][] matriz = new Object[lista.size()][tama??o];
        
        for(int fila=0; fila<lista.size(); fila++){
            
            matriz[fila][0] = lista.get(fila)[1];
            matriz[fila][1] = lista.get(fila)[2];
            matriz[fila][2] = lista.get(fila)[3];
            matriz[fila][3] = lista.get(fila)[4];
            
            tablaBotonIdPaciente.put(fila, (Integer) lista.get(fila)[0]);
        }
        
        return matriz;
    }
    
    public String[] getArregloString(){
        String[] arreglo = {"Apellido", "Nombre", "Historia Clinica", "Telefono"};
        
        return arreglo;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonEliminarPaciente;
    private javax.swing.JButton jButtonSeleccionarPaciente;
    private javax.swing.JButton jButtonVolverAMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldIndice;
    // End of variables declaration//GEN-END:variables
}
