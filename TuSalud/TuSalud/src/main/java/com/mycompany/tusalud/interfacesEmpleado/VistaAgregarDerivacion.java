/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tusalud.interfacesEmpleado;

import com.mycompany.tusalud.controllerEmpleado.AgregarDerivacionController;
import com.mycompany.tusalud.data.Derivacion;
import com.mycompany.tusalud.data.Especialidad;
import com.mycompany.tusalud.data.Paciente;
import com.mycompany.tusalud.excepciones.BDException;
import com.mycompany.tusalud.excepciones.LoginException;
import com.mycompany.tusalud.interfaces.MiDialogo;
import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JComboBox;

/**
 *
 * @author Alumno
 */
public class VistaAgregarDerivacion extends javax.swing.JFrame {

    AgregarDerivacionController agregarDerivacionController;
    private Map<Integer, Derivacion> tablaEliminarDerivacion = new HashMap<>();
    private List<Derivacion> derivaciones;
    private List<Especialidad> especialidades;
    private Paciente paciente;
    
    /**
     * Creates new form AgregarDerivacion
     * @param agregarDerivacionService
     * @param paciente
     * @param especialidades
     * @param derivaciones
     */
    public VistaAgregarDerivacion(AgregarDerivacionController agregarDerivacionController, Paciente paciente, List<Derivacion> derivaciones, List<Especialidad> especialidades ) {
        this.agregarDerivacionController = agregarDerivacionController;
        this.derivaciones = derivaciones;
        this.especialidades = especialidades;
        this.paciente = paciente;
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

        jComboBoxEspecialidades = new JComboBox(getListaEspecialidades());
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButtonAprobarDerivacion = new javax.swing.JButton();
        jButtonAtras = new javax.swing.JButton();
        jButtonVolverAMenu = new javax.swing.JButton();
        jButtonEliminarDerivacion = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(650, 750));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jComboBoxEspecialidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 540, 141, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Seleccione Especialidad");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 510, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            getMatrizObject(getArregloString().length),
            getArregloString()
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 155, 530, 320));

        jButtonAprobarDerivacion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonAprobarDerivacion.setText("Aprobar Derivacion");
        jButtonAprobarDerivacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAprobarDerivacionActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAprobarDerivacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 600, -1, -1));

        jButtonAtras.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonAtras.setText("Atras");
        jButtonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 30, -1, -1));

        jButtonVolverAMenu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonVolverAMenu.setText("Volver a menu");
        jButtonVolverAMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverAMenuActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVolverAMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 680, -1, -1));

        jButtonEliminarDerivacion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonEliminarDerivacion.setText("Eliminar Derivacion");
        jButtonEliminarDerivacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarDerivacionActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEliminarDerivacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 600, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesL2/FondoListas.png"))); // NOI18N
        jLabel2.setPreferredSize(new java.awt.Dimension(650, 750));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtrasActionPerformed
        agregarDerivacionController.volverAPacientesHabilitarDerivacion(this);
    }//GEN-LAST:event_jButtonAtrasActionPerformed

    private void jButtonAprobarDerivacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAprobarDerivacionActionPerformed
        try {
            aprobarDerivacion();
        } catch (LoginException ex) {
            MiDialogo.mostrar(ex, "Error");
        }
    }//GEN-LAST:event_jButtonAprobarDerivacionActionPerformed

    private void jButtonVolverAMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverAMenuActionPerformed
        agregarDerivacionController.volverAMenu(this);
    }//GEN-LAST:event_jButtonVolverAMenuActionPerformed

    private void jButtonEliminarDerivacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarDerivacionActionPerformed
        try{
            Derivacion derivacion = tablaEliminarDerivacion.get(jTable1.getSelectedRow());
            if(derivacion != null){
                agregarDerivacionController.eliminarDerivacion(derivacion, paciente, this);
            }
            else{
                System.out.println("No se ha seleccionado derivacion");
            }
        } catch (BDException ex) {
            MiDialogo.mostrar(ex, "Error");
        } catch (LoginException ex) {
            MiDialogo.mostrar(ex, "Error");
        }
    }//GEN-LAST:event_jButtonEliminarDerivacionActionPerformed

    public Object[][] getMatrizObject(int tama??o){
        Object[][] matriz = new Object[derivaciones.size()][tama??o];
        
        for(int fila=0; fila<derivaciones.size(); fila++){
            
            matriz[fila][0] = derivaciones.get(fila).getEspecialidad().getNombre();
            if(derivaciones.get(fila).getAprobado() == true){
                matriz[fila][1] = "si";
            }
            tablaEliminarDerivacion.put(fila, derivaciones.get(fila));
        }
        
        return matriz;
    }
    
    public String[] getArregloString(){
        String[] arreglo = {"Especialidad", "Aprobada"};
        
        return arreglo;
    }
    
    public String[] getListaEspecialidades(){
        String[] arregloEspecialidades = new String[especialidades.size()];
        
        for(int i=0; i<arregloEspecialidades.length; i++){
            arregloEspecialidades[i] = especialidades.get(i).getNombre();
        }
        
        return arregloEspecialidades;
    }
    
    public Especialidad getEspecialidadSeleccionada(){
        return especialidades.get(jComboBoxEspecialidades.getSelectedIndex());
    }
    
    public void aprobarDerivacion() throws LoginException{
        LocalDate fechaSeleccionada = LocalDate.now();
        Date fecha = java.sql.Date.valueOf(fechaSeleccionada);
        
        try {
            agregarDerivacionController.agregarDerivacion(paciente, getEspecialidadSeleccionada(), fecha, this);
        } catch (BDException ex) {
            MiDialogo.mostrar(ex, "Error");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAprobarDerivacion;
    private javax.swing.JButton jButtonAtras;
    private javax.swing.JButton jButtonEliminarDerivacion;
    private javax.swing.JButton jButtonVolverAMenu;
    private javax.swing.JComboBox<String> jComboBoxEspecialidades;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
