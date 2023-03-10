/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tusalud.interfacesEmpleado;

import com.mycompany.tusalud.controllerEmpleado.MenuEmpleadoController;
import com.mycompany.tusalud.data.Empleado;
import com.mycompany.tusalud.excepciones.BDException;
import com.mycompany.tusalud.interfaces.MiDialogo;
import java.time.LocalDate;

/**
 *
 * @author User
 */
public class VistaMenuEmpleado extends javax.swing.JFrame {

    MenuEmpleadoController menuEmpleadoController;
    
    /**
     * Creates new form Menu
     * @param menuEmpleadoController
     */
    public VistaMenuEmpleado(MenuEmpleadoController menuEmpleadoController) {
        this.menuEmpleadoController = menuEmpleadoController;
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

        jToggleButton1 = new javax.swing.JToggleButton();
        jLabelFecha = new javax.swing.JLabel();
        jLabelNombreUsuario = new javax.swing.JLabel();
        jButtonModificarDatosDePaciente = new javax.swing.JButton();
        jButtonAñadirTurnos = new javax.swing.JButton();
        jButtonDerivaciones = new javax.swing.JButton();
        jButtonAgregarNotificaciones = new javax.swing.JButton();
        jButtonCargarEmpleados = new javax.swing.JButton();
        jButtonCerrarSesion = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(238, 112, 82));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelFecha.setForeground(new java.awt.Color(255, 255, 255));
        jLabelFecha.setText(getFechaDeHoy());
        getContentPane().add(jLabelFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 20, -1, -1));

        jLabelNombreUsuario.setBackground(new java.awt.Color(0, 0, 0));
        jLabelNombreUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNombreUsuario.setText("Usuario: " + getNombreDeUsuario());
        getContentPane().add(jLabelNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, -1, -1));

        jButtonModificarDatosDePaciente.setBackground(new java.awt.Color(255, 255, 255));
        jButtonModificarDatosDePaciente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonModificarDatosDePaciente.setText("Modificar datos de Paciente");
        jButtonModificarDatosDePaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarDatosDePacienteActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonModificarDatosDePaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 530, -1, 50));

        jButtonAñadirTurnos.setBackground(new java.awt.Color(255, 255, 255));
        jButtonAñadirTurnos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonAñadirTurnos.setText("Anadir Turnos");
        jButtonAñadirTurnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAñadirTurnosActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAñadirTurnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 140, 220, 51));

        jButtonDerivaciones.setBackground(new java.awt.Color(255, 255, 255));
        jButtonDerivaciones.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonDerivaciones.setText("Administrar Derivaciones");
        jButtonDerivaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDerivacionesActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonDerivaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 240, 220, 48));

        jButtonAgregarNotificaciones.setBackground(new java.awt.Color(255, 255, 255));
        jButtonAgregarNotificaciones.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonAgregarNotificaciones.setText("Agregar Notificaciones");
        jButtonAgregarNotificaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarNotificacionesActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAgregarNotificaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 430, 220, 50));

        jButtonCargarEmpleados.setBackground(new java.awt.Color(255, 255, 255));
        jButtonCargarEmpleados.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonCargarEmpleados.setText("Cargar Empleados");
        jButtonCargarEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCargarEmpleadosActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCargarEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 330, 220, 50));

        jButtonCerrarSesion.setBackground(new java.awt.Color(255, 255, 255));
        jButtonCerrarSesion.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonCerrarSesion.setText("Cerrar Sesion");
        jButtonCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCerrarSesionActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 700, -1, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesL2/FondoTuSasludEmpleados.png"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCargarEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCargarEmpleadosActionPerformed
        try {
            menuEmpleadoController.cargarEmpleado(this);
        } catch (BDException ex) {
            MiDialogo.mostrar(ex, "Error");
        }
    }//GEN-LAST:event_jButtonCargarEmpleadosActionPerformed

    private void jButtonCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCerrarSesionActionPerformed
        menuEmpleadoController.cerrarSesion();
    }//GEN-LAST:event_jButtonCerrarSesionActionPerformed

    private void jButtonAñadirTurnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAñadirTurnosActionPerformed
        try {
            menuEmpleadoController.crearCalendarioDeTurnos(this);
        } catch (BDException ex) {
            MiDialogo.mostrar(ex, "Error en cargar Calendario");
        }
    }//GEN-LAST:event_jButtonAñadirTurnosActionPerformed

    private void jButtonModificarDatosDePacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarDatosDePacienteActionPerformed
        menuEmpleadoController.crearVistaPacientesAModificar(this);
    }//GEN-LAST:event_jButtonModificarDatosDePacienteActionPerformed

    private void jButtonAgregarNotificacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarNotificacionesActionPerformed
        menuEmpleadoController.crearNotificacionesGlobales(this);
    }//GEN-LAST:event_jButtonAgregarNotificacionesActionPerformed

    private void jButtonDerivacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDerivacionesActionPerformed
        menuEmpleadoController.crearVistaPacientesHabilitarDerivacion(this);
    }//GEN-LAST:event_jButtonDerivacionesActionPerformed

    public String getFechaDeHoy(){
        LocalDate fechaDeHoy = LocalDate.now();
        return fechaDeHoy.toString();
    }
    
    public String getNombreDeUsuario(){
        Empleado empleado = menuEmpleadoController.getUsuario();
        return empleado.getNombre() + " " + empleado.getApellido();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton jButtonAgregarNotificaciones;
    private javax.swing.JButton jButtonAñadirTurnos;
    private javax.swing.JButton jButtonCargarEmpleados;
    private javax.swing.JButton jButtonCerrarSesion;
    private javax.swing.JButton jButtonDerivaciones;
    private javax.swing.JButton jButtonModificarDatosDePaciente;
    private javax.swing.JLabel jLabelFecha;
    private javax.swing.JLabel jLabelNombreUsuario;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
