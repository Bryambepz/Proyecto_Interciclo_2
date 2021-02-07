/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorAdmin;
import ec.edu.ups.controlador.ControladorAutomovil;
import ec.edu.ups.controlador.ControladorTicket;
import ec.edu.ups.controlador.ControladorUsuario;
import ec.edu.ups.modelo.Automovil;
import ec.edu.ups.modelo.Ticket;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author braya
 */
public class VntTicket extends javax.swing.JInternalFrame {

    private ControladorAdmin ctrlAdmin;
    private ControladorUsuario ctrlUsuario;
    private ControladorAutomovil ctrlAuto;
    private ControladorTicket ctrlTicker;
    private VntReservar vntReservar;
    private LocalDateTime horaIngreso;
    private Date fechaImngreso;
    public static String ruta = "C:\\Users\\braya\\OneDrive\\Documentos\\NetBeansProjects\\Proyecto_Interciclo\\registrarAdmin";
    public static String ruta2 = "C:\\Users\\braya\\OneDrive\\Documentos\\NetBeansProjects\\Proyecto_Interciclo\\registrarUsuario";
    public static String ruta3 = "C:\\Users\\braya\\OneDrive\\Documentos\\NetBeansProjects\\Proyecto_Interciclo\\registrarAutomovil";
    public static String ruta4 = "C:\\Users\\braya\\OneDrive\\Documentos\\NetBeansProjects\\Proyecto_Interciclo\\registrarTicket";

    /**
     * Creates new form VntTicket
     */
    public VntTicket(ControladorAdmin ctrlAdmin, ControladorUsuario ctrlUsuario, ControladorAutomovil ctrlAuto, ControladorTicket ctrlTicker, VntReservar vntReservar) {
        initComponents();
        this.ctrlAdmin = ctrlAdmin;
        this.ctrlUsuario = ctrlUsuario;
        this.ctrlAuto = ctrlAuto;
        this.ctrlTicker = ctrlTicker;
        this.vntReservar = vntReservar;
//        this.horaIngreso = horaIngreso;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtID = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtCedula = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtNombre = new javax.swing.JTextPane();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtApellido = new javax.swing.JTextPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtTelefono = new javax.swing.JTextPane();
        jScrollPane7 = new javax.swing.JScrollPane();
        txtNEstacionamient = new javax.swing.JTextPane();
        jScrollPane8 = new javax.swing.JScrollPane();
        txtPlaca = new javax.swing.JTextPane();
        jScrollPane9 = new javax.swing.JScrollPane();
        txtModelo = new javax.swing.JTextPane();
        jScrollPane10 = new javax.swing.JScrollPane();
        txtColor = new javax.swing.JTextPane();
        jScrollPane11 = new javax.swing.JScrollPane();
        txtTipoC = new javax.swing.JTextPane();
        jScrollPane12 = new javax.swing.JScrollPane();
        txtFechaI = new javax.swing.JTextPane();
        btnConfirmar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Ticket");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/ticket.png"))); // NOI18N
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jLabel1.setText("ID Ticket");

        jLabel2.setText("Fecha de Ingreso");

        jLabel3.setText("Tipo de Contrato");

        txtID.setEditable(false);
        jScrollPane2.setViewportView(txtID);

        txtCedula.setEditable(false);
        jScrollPane3.setViewportView(txtCedula);

        txtNombre.setEditable(false);
        jScrollPane4.setViewportView(txtNombre);

        jLabel4.setText("Cedula");

        jLabel5.setText("Nombre");

        jLabel6.setText("Apellido");

        jLabel7.setText("Telefono");

        jLabel8.setText("Numero de estacionamiento");

        jLabel9.setText("Placa");

        jLabel10.setText("Modelo");

        jLabel11.setText("Color");

        txtApellido.setEditable(false);
        jScrollPane5.setViewportView(txtApellido);

        txtTelefono.setEditable(false);
        jScrollPane6.setViewportView(txtTelefono);

        txtNEstacionamient.setEditable(false);
        jScrollPane7.setViewportView(txtNEstacionamient);

        txtPlaca.setEditable(false);
        jScrollPane8.setViewportView(txtPlaca);

        txtModelo.setEditable(false);
        jScrollPane9.setViewportView(txtModelo);

        txtColor.setEditable(false);
        jScrollPane10.setViewportView(txtColor);

        txtTipoC.setEditable(false);
        jScrollPane11.setViewportView(txtTipoC);

        txtFechaI.setEditable(false);
        jScrollPane12.setViewportView(txtFechaI);

        btnConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/klipartz.com.png"))); // NOI18N
        btnConfirmar.setText("Confirrmar y Generar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Revise si los datos son correctos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(88, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(109, 109, 109))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(170, 170, 170))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addGap(328, 328, 328))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnConfirmar)
                                .addGap(183, 183, 183))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel12)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnConfirmar)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        // TODO add your handling code here:
        var usuario = ctrlUsuario.obtenerSesion();
        txtID.setText(String.valueOf(ctrlTicker.generarID()));
        txtCedula.setText(usuario.getCedula());
        txtNombre.setText(usuario.getNombre());
        txtApellido.setText(usuario.getApellido());
        txtTelefono.setText(usuario.getTelefono());

        txtNEstacionamient.setText(String.valueOf(vntReservar.getTxtLugar().getText()));
        txtPlaca.setText(vntReservar.getTxtPlaca().getText());
        txtModelo.setText(vntReservar.getTxtModelo().getText());
        txtColor.setText(vntReservar.getTxtColor().getText());
        txtTipoC.setText(vntReservar.getCbxTipoC().getItemAt(vntReservar.getCbxTipoC().getSelectedIndex()));
        horaIngreso = LocalDateTime.now();
        fechaImngreso = java.sql.Timestamp.valueOf(horaIngreso);
        txtFechaI.setText(horaIngreso.toString());

    }//GEN-LAST:event_formInternalFrameActivated

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        int id = ctrlTicker.generarID();
        int lugar = Integer.valueOf(txtNEstacionamient.getText());
        String tipoC = txtTipoC.getText();
        String cedula = txtCedula.getText();
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        String telefono = txtTelefono.getText();
        String placa = txtPlaca.getText();
        String modelo = txtModelo.getText();
        String color = txtColor.getText();

        LocalDateTime hoaI = LocalDateTime.parse(txtFechaI.getText(), DateTimeFormatter.ISO_LOCAL_DATE_TIME);

        try {
            // TODO add your handling code here:
//            var auto = new Automovil(placa, modelo, color);
            var ticket = new Ticket(id, lugar, hoaI, tipoC, cedula, nombre, apellido, telefono);
            var autot = new Automovil(placa, modelo, color, ticket);
            ctrlUsuario.obtenerSesion().create(autot);
            ctrlAuto.create(autot);
            ctrlTicker.create(ticket);

            ctrlUsuario.guardarDatos(ruta2);
            ctrlAuto.guardarDatos(ruta3);
            ctrlTicker.guardarDatos(ruta4);
            JOptionPane.showMessageDialog(this, "Ticket generado");
            this.dispose();
            System.out.println("usuario ---> " + ctrlUsuario.obtenerSesion());
            System.out.println("auto ---> " + autot);
            System.out.println("ticket ---> " + ticket);
            
        } catch (IOException ex) {
            Logger.getLogger(VntTicket.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnConfirmarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmar;
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
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextPane txtApellido;
    private javax.swing.JTextPane txtCedula;
    private javax.swing.JTextPane txtColor;
    private javax.swing.JTextPane txtFechaI;
    private javax.swing.JTextPane txtID;
    private javax.swing.JTextPane txtModelo;
    private javax.swing.JTextPane txtNEstacionamient;
    private javax.swing.JTextPane txtNombre;
    private javax.swing.JTextPane txtPlaca;
    private javax.swing.JTextPane txtTelefono;
    private javax.swing.JTextPane txtTipoC;
    // End of variables declaration//GEN-END:variables
}