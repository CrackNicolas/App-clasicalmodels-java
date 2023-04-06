package Ventanas;

import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Registrar_Usuarios extends javax.swing.JFrame{
    
    public Registrar_Usuarios(){
        this.setContentPane(new Personalizacion.Fondo("/Imagenes/Fondo_secundario.jpg"));
        this.setExtendedState(6);
        initComponents();
        this.Panel.requestFocus();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        Panel = new javax.swing.JPanel();
        jPanel1 = new Personalizacion.Fondo("/Imagenes/Fondo_secundario.jpg");
        Registrar = new javax.swing.JButton();
        Con_Contraseña = new javax.swing.JPasswordField();
        Contraseña = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Usuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Panel.setDoubleBuffered(false);
        Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Registrar.setBackground(new java.awt.Color(0, 0, 0));
        Registrar.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        Registrar.setForeground(new java.awt.Color(0, 0, 255));
        Registrar.setText("Registrar");
        Registrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(Registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 690, 409, 40));

        Con_Contraseña.setBackground(new java.awt.Color(0, 0, 0));
        Con_Contraseña.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Con_Contraseña.setForeground(new java.awt.Color(255, 255, 255));
        Con_Contraseña.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Con_Contraseña.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Con_ContraseñaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Con_ContraseñaFocusLost(evt);
            }
        });
        jPanel1.add(Con_Contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 570, 410, 40));

        Contraseña.setBackground(new java.awt.Color(0, 0, 0));
        Contraseña.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Contraseña.setForeground(new java.awt.Color(255, 255, 255));
        Contraseña.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Contraseña.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ContraseñaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ContraseñaFocusLost(evt);
            }
        });
        jPanel1.add(Contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 460, 410, 40));

        jLabel1.setBackground(new java.awt.Color(51, 255, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setText("CONFIRMA CONTRASEÑA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 570, 300, 38));

        jLabel5.setBackground(new java.awt.Color(51, 255, 255));
        jLabel5.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel5.setText("CONTRASEÑA");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 460, 262, 38));

        Usuario.setBackground(new java.awt.Color(0, 0, 0));
        Usuario.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Usuario.setForeground(new java.awt.Color(255, 255, 255));
        Usuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Usuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                UsuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                UsuarioFocusLost(evt);
            }
        });
        jPanel1.add(Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 350, 409, 38));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 26)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("REGISTRAR USUARIOS");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 240, 403, 47));

        jLabel2.setBackground(new java.awt.Color(51, 255, 255));
        jLabel2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText("USUARIO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 350, 262, 38));

        Panel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1980, 1050));

        jLabel4.setBackground(new java.awt.Color(51, 255, 255));
        jLabel4.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setText("CONTRASEÑA");
        Panel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(487, 443, 262, 38));

        jMenuBar1.setBackground(new java.awt.Color(0, 0, 0));
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuBar1.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N

        jMenu1.setBackground(new java.awt.Color(0, 0, 0));
        jMenu1.setForeground(new java.awt.Color(0, 204, 204));
        jMenu1.setText("Usuarios");
        jMenu1.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N

        jMenuItem2.setBackground(new java.awt.Color(0, 0, 0));
        jMenuItem2.setForeground(new java.awt.Color(0, 204, 204));
        jMenuItem2.setText("Modificar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setBackground(new java.awt.Color(0, 0, 0));
        jMenuItem3.setForeground(new java.awt.Color(0, 204, 204));
        jMenuItem3.setText("Eliminar");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setBackground(new java.awt.Color(0, 0, 0));
        jMenuItem4.setForeground(new java.awt.Color(0, 204, 204));
        jMenuItem4.setText("Listar");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu2.setBackground(new java.awt.Color(0, 0, 0));
        jMenu2.setForeground(new java.awt.Color(0, 204, 204));
        jMenu2.setText("Salir");
        jMenu2.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N

        jMenuItem5.setBackground(new java.awt.Color(0, 0, 0));
        jMenuItem5.setForeground(new java.awt.Color(0, 204, 204));
        jMenuItem5.setText("Cerrar sesion");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        Controlador.Controlador_Tablas.MostrarTablaUsuarios();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        Controlador.Controlador_Mod_Usuarios.Mostrar();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        Controlador.Control_SuperUsuario.Mostrar();
        Controlador.Control_SuperUsuario.OcultarReg();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        Controlador.Controlador_Elimi_Usuarios.Mostrar();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void UsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UsuarioFocusLost
        Usuario.setForeground(new Color(153,153,153));
        Usuario.setBackground(Color.BLACK);
    }//GEN-LAST:event_UsuarioFocusLost

    private void UsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UsuarioFocusGained
        Usuario.setForeground(Color.CYAN);
        Usuario.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_UsuarioFocusGained

    private void ContraseñaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ContraseñaFocusLost
        Contraseña.setForeground(new Color(153,153,153));
        Contraseña.setBackground(Color.BLACK);
    }//GEN-LAST:event_ContraseñaFocusLost

    private void ContraseñaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ContraseñaFocusGained
        Contraseña.setForeground(Color.CYAN);
        Contraseña.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_ContraseñaFocusGained

    private void Con_ContraseñaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Con_ContraseñaFocusLost
        Con_Contraseña.setForeground(new Color(153,153,153));
        Con_Contraseña.setBackground(Color.BLACK);
    }//GEN-LAST:event_Con_ContraseñaFocusLost

    private void Con_ContraseñaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Con_ContraseñaFocusGained
        Con_Contraseña.setForeground(Color.CYAN);
        Con_Contraseña.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_Con_ContraseñaFocusGained

    private void RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarActionPerformed
        Controlador.Control_SuperUsuario.RegistrarUsuarios();
    }//GEN-LAST:event_RegistrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Con_Contraseña;
    private javax.swing.JPasswordField Contraseña;
    private javax.swing.JPanel Panel;
    private javax.swing.JButton Registrar;
    private javax.swing.JTextField Usuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
    
    public JPasswordField getContraseña() {
        return Contraseña;
    }
    public JTextField getUsuario() {
        return Usuario;
    }
    public JPasswordField getCon_Contraseña() {
        return Con_Contraseña;
    }
}