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
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

/**
 *
 * @author braya
 */
public class VntPrincipal extends javax.swing.JFrame {
    private ControladorUsuario ctrlUsuario;
    private ControladorAdmin ctrlAdmin;
    private ControladorAutomovil ctrlAuto;
    private ControladorTicket ctrlTicket;
    //
    private VntRegistrarAdmin vntRegistrarAdmin;
    private VntRegistrarUsuario vntRegistarUsuario;
    private VntIniciarsesion vntIniciar;
    private VntListarEstacionamientosOcupados vntListar;
    private VntReservar vntReservar;
    private VntRetirar vntRetirar;
    private VntTicket vntTicket;
    /**
     * Creates new form a
     */
    public VntPrincipal() {
        initComponents();
        //
        ctrlUsuario = ControladorUsuario.getInstancia();
        ctrlAdmin = ControladorAdmin.getInstancia();
        ctrlAuto = new ControladorAutomovil();
        ctrlTicket = new ControladorTicket();
        //
        vntRegistrarAdmin = new VntRegistrarAdmin(ctrlUsuario, ctrlAdmin, this);
        vntRegistarUsuario = new VntRegistrarUsuario(ctrlUsuario, ctrlAdmin);
        vntIniciar = new VntIniciarsesion(ctrlUsuario, ctrlAdmin, this);
        vntListar = new VntListarEstacionamientosOcupados(ctrlUsuario, ctrlAuto, this);
        vntReservar = new VntReservar(ctrlAdmin, ctrlUsuario, ctrlAuto, ctrlTicket, this, vntTicket);
        vntRetirar = new VntRetirar(ctrlUsuario, ctrlAuto,this, ctrlTicket);
        vntTicket = new VntTicket(ctrlAdmin, ctrlUsuario, ctrlAuto, ctrlTicket, vntReservar);
        //
        gestionMenu.setVisible(false);
        registarUMenuItem.setVisible(false);
        listarMenuItem.setVisible(false);
        reservarMenuItem.setVisible(false);
        retirarMenuItem.setVisible(false);
//        this.setExtendedState(MAXIMIZED_HORIZ);
//        this.setExtendedState(MAXIMIZED_VERT);
//        generarMenu1.setVisible(false);
    }

    public JDesktopPane getDesktopPane() {
        return desktopPane;
    }

    public JMenu getGestionMenu() {
        return gestionMenu;
    }

    public JMenuItem getRegistarUMenuItem() {
        return registarUMenuItem;
    }

    public JMenuItem getRegistrarAdminMenuvnttItem() {
        return registrarAdminMenuItem;
    }

    public JMenuItem getReservarMenuItem() {
        return reservarMenuItem;
    }

    public JMenuItem getRetirarMenuItem() {
        return retirarMenuItem;
    }

    public JMenuItem getListarMenuItem() {
        return listarMenuItem;
    }

    public VntTicket getVntTicket() {
        return vntTicket;
    }

//    public JMenu getGenerarMenu1() {
//        return generarMenu1;
//    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        Menu = new javax.swing.JMenu();
        registrarAdminMenuItem = new javax.swing.JMenuItem();
        registarUMenuItem = new javax.swing.JMenuItem();
        iniciarSesionMenuItem = new javax.swing.JMenuItem();
        cerrarMenuItem = new javax.swing.JMenuItem();
        gestionMenu = new javax.swing.JMenu();
        listarMenuItem = new javax.swing.JMenuItem();
        reservarMenuItem = new javax.swing.JMenuItem();
        retirarMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/fondo_.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        desktopPane.add(jLabel1);
        jLabel1.setBounds(0, 0, 840, 850);

        Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/menu.png"))); // NOI18N
        Menu.setMnemonic('f');
        Menu.setText("Menu");

        registrarAdminMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        registrarAdminMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/register.png"))); // NOI18N
        registrarAdminMenuItem.setMnemonic('o');
        registrarAdminMenuItem.setText("Registrar Admin");
        registrarAdminMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarAdminMenuItemActionPerformed(evt);
            }
        });
        Menu.add(registrarAdminMenuItem);

        registarUMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        registarUMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/register.png"))); // NOI18N
        registarUMenuItem.setMnemonic('s');
        registarUMenuItem.setText("Registrar Usuario");
        registarUMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registarUMenuItemActionPerformed(evt);
            }
        });
        Menu.add(registarUMenuItem);

        iniciarSesionMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        iniciarSesionMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/loguin.png"))); // NOI18N
        iniciarSesionMenuItem.setMnemonic('a');
        iniciarSesionMenuItem.setText("Iniciar Sesion");
        iniciarSesionMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarSesionMenuItemActionPerformed(evt);
            }
        });
        Menu.add(iniciarSesionMenuItem);

        cerrarMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        cerrarMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/logout.png"))); // NOI18N
        cerrarMenuItem.setMnemonic('x');
        cerrarMenuItem.setText("Cerrar Sesion");
        cerrarMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarMenuItemActionPerformed(evt);
            }
        });
        Menu.add(cerrarMenuItem);

        menuBar.add(Menu);

        gestionMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/gestion.png"))); // NOI18N
        gestionMenu.setMnemonic('e');
        gestionMenu.setText("Gestion");

        listarMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        listarMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/listar.png"))); // NOI18N
        listarMenuItem.setMnemonic('t');
        listarMenuItem.setText("Listar  Contratos");
        listarMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarMenuItemActionPerformed(evt);
            }
        });
        gestionMenu.add(listarMenuItem);

        reservarMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        reservarMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/klipartz.com.png"))); // NOI18N
        reservarMenuItem.setMnemonic('y');
        reservarMenuItem.setText("Reservar");
        reservarMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservarMenuItemActionPerformed(evt);
            }
        });
        gestionMenu.add(reservarMenuItem);

        retirarMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        retirarMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/klipartz.com.png"))); // NOI18N
        retirarMenuItem.setMnemonic('p');
        retirarMenuItem.setText("Retirar");
        retirarMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retirarMenuItemActionPerformed(evt);
            }
        });
        gestionMenu.add(retirarMenuItem);

        menuBar.add(gestionMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 838, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 850, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listarMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarMenuItemActionPerformed
        // TODO add your handling code here:
        abrir(vntListar);
    }//GEN-LAST:event_listarMenuItemActionPerformed

    private void reservarMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservarMenuItemActionPerformed
        // TODO add your handling code here:
        abrir(vntReservar);
    }//GEN-LAST:event_reservarMenuItemActionPerformed

    private void retirarMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retirarMenuItemActionPerformed
        // TODO add your handling code here:
        abrir(vntRetirar);
    }//GEN-LAST:event_retirarMenuItemActionPerformed

    private void registrarAdminMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarAdminMenuItemActionPerformed
        // TODO add your handling code here:
        abrir(vntRegistrarAdmin);
    }//GEN-LAST:event_registrarAdminMenuItemActionPerformed

    private void registarUMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registarUMenuItemActionPerformed
        // TODO add your handling code here:
        abrir(vntRegistarUsuario);
    }//GEN-LAST:event_registarUMenuItemActionPerformed

    private void iniciarSesionMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarSesionMenuItemActionPerformed
        // TODO add your handling code here:
        abrir(vntIniciar);
    }//GEN-LAST:event_iniciarSesionMenuItemActionPerformed

    private void cerrarMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarMenuItemActionPerformed
        listarMenuItem.setVisible(false);
        reservarMenuItem.setVisible(false);
        retirarMenuItem.setVisible(false);
        gestionMenu.setVisible(false);
    }//GEN-LAST:event_cerrarMenuItemActionPerformed
    
    public void abrir(JInternalFrame frame) {
        desktopPane.add(frame);
        frame.setVisible(true);
    }
    
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
            java.util.logging.Logger.getLogger(VntPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VntPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VntPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VntPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VntPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Menu;
    private javax.swing.JMenuItem cerrarMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu gestionMenu;
    private javax.swing.JMenuItem iniciarSesionMenuItem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem listarMenuItem;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem registarUMenuItem;
    private javax.swing.JMenuItem registrarAdminMenuItem;
    private javax.swing.JMenuItem reservarMenuItem;
    private javax.swing.JMenuItem retirarMenuItem;
    // End of variables declaration//GEN-END:variables

}
