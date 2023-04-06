package Ventanas;

import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Ventana_SuperUsuario extends javax.swing.JFrame{
    private boolean band = false;
    private String pass = "";
    private int j=0;
    
    public Ventana_SuperUsuario(){
        this.setContentPane(new Personalizacion.Fondo("/Imagenes/Fondo_secundario.jpg"));
        this.setExtendedState(6);
        initComponents();
        Ver.setVisible(false);
        Contraseña_Reg.setVisible(true);
        Usuario_Reg.requestFocus();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new Personalizacion.Fondo("/Imagenes/Fondo_secundario.jpg");
        Usuario_Reg = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Acceder = new javax.swing.JButton();
        Contraseña_Reg = new javax.swing.JPasswordField();
        Ojo = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Ver = new javax.swing.JTextField();
        jPanel25 = new javax.swing.JPanel();
        TablasFactura1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Panel.setDoubleBuffered(false);
        Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Usuario_Reg.setBackground(new java.awt.Color(0, 51, 51));
        Usuario_Reg.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Usuario_Reg.setForeground(new java.awt.Color(0, 153, 153));
        Usuario_Reg.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Usuario_Reg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Usuario_RegActionPerformed(evt);
            }
        });
        Panel.add(Usuario_Reg, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 340, 410, 40));

        jLabel1.setBackground(new java.awt.Color(51, 255, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setText("CONTRASEÑA");
        Panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(487, 443, 262, 38));

        jLabel2.setBackground(new java.awt.Color(51, 255, 255));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText("USUARIO");
        Panel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(487, 341, 262, 38));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 26)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("SUPER USUARIO");
        Panel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(767, 231, 403, 47));

        Acceder.setBackground(new java.awt.Color(0, 0, 0));
        Acceder.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Acceder.setForeground(new java.awt.Color(51, 255, 255));
        Acceder.setText("ACCEDER");
        Acceder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Acceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccederActionPerformed(evt);
            }
        });
        Panel.add(Acceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(761, 538, 409, 40));

        Contraseña_Reg.setBackground(new java.awt.Color(0, 51, 51));
        Contraseña_Reg.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Contraseña_Reg.setForeground(new java.awt.Color(0, 153, 153));
        Contraseña_Reg.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Contraseña_Reg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Contraseña_RegActionPerformed(evt);
            }
        });
        Panel.add(Contraseña_Reg, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 440, 410, 40));

        Ojo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/ver_contra_norm.png"))); // NOI18N
        Ojo.setBorderPainted(false);
        Ojo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Ojo.setOpaque(false);
        Ojo.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/ver_contra_press.png"))); // NOI18N
        Ojo.setRolloverEnabled(true);
        Ojo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OjoActionPerformed(evt);
            }
        });
        Panel.add(Ojo, new org.netbeans.lib.awtextra.AbsoluteConstraints(761, 413, 25, 25));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/x32-lock.png"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton2.setOpaque(false);
        jButton2.setRolloverEnabled(true);
        Panel.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(761, 311, 25, 25));

        Ver.setBackground(new java.awt.Color(0, 51, 51));
        Ver.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Ver.setForeground(new java.awt.Color(0, 153, 153));
        Ver.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Panel.add(Ver, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 440, 410, 40));

        jPanel25.setBackground(new java.awt.Color(51, 51, 51));
        jPanel25.setForeground(new java.awt.Color(51, 51, 51));
        jPanel25.setLayout(new java.awt.BorderLayout());

        TablasFactura1.setBackground(new java.awt.Color(51, 51, 51));
        TablasFactura1.setFont(new java.awt.Font("Yu Gothic UI", 1, 25)); // NOI18N
        TablasFactura1.setForeground(new java.awt.Color(102, 102, 102));
        TablasFactura1.setText("INICIO");
        TablasFactura1.setContentAreaFilled(false);
        TablasFactura1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TablasFactura1.setIconTextGap(10);
        TablasFactura1.setPreferredSize(new java.awt.Dimension(229, 80));
        TablasFactura1.setRequestFocusEnabled(false);
        TablasFactura1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TablasFactura1Volver(evt);
            }
        });
        jPanel25.add(TablasFactura1, java.awt.BorderLayout.CENTER);

        Panel.add(jPanel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(1550, 990, 352, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Usuario_RegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Usuario_RegActionPerformed
        Contraseña_Reg.requestFocus();
    }//GEN-LAST:event_Usuario_RegActionPerformed

    private void AccederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccederActionPerformed
        Controlador.Control_SuperUsuario.BotonAceptar();
    }//GEN-LAST:event_AccederActionPerformed

    private void OjoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OjoActionPerformed
        if(band){
            if(j++%2==0){
                Pass(true,false);          
                Ver.setText(pass);
            }else{
                Pass(false,true);          
                Contraseña_Reg.setText(Ver.getText());
            }
        }else{
            Pass(true,false);          
            Ver.setText(pass);
            j++;
        }
    }//GEN-LAST:event_OjoActionPerformed

    private void Contraseña_RegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Contraseña_RegActionPerformed
        Acceder.requestFocus();
    }//GEN-LAST:event_Contraseña_RegActionPerformed

    private void TablasFactura1Volver(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TablasFactura1Volver
        Controlador.Control_Login.MostrarInicio();
        Controlador.Control_SuperUsuario.Ocultar();
    }//GEN-LAST:event_TablasFactura1Volver

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Acceder;
    private javax.swing.JPasswordField Contraseña_Reg;
    private javax.swing.JButton Ojo;
    private javax.swing.JPanel Panel;
    private javax.swing.JButton TablasFactura1;
    private javax.swing.JTextField Usuario_Reg;
    private javax.swing.JTextField Ver;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel25;
    // End of variables declaration//GEN-END:variables
    
    public void Pass(boolean x,boolean y){
        pass="";
        char password [] = Contraseña_Reg.getPassword();
        for(int i=0;i<password.length;i++){
            pass+=password[i];    
        }
        Ver.setVisible(x);
        Contraseña_Reg.setVisible(y);
        band=x;
    }
    public JPasswordField getContraseña_Reg() {
        return Contraseña_Reg;
    }
    public JTextField getUsuario_Reg() {
        return Usuario_Reg;
    }
    public JTextField getVer() {
        return Ver;
    } 
}