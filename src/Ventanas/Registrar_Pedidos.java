package Ventanas;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class Registrar_Pedidos extends javax.swing.JFrame {
    
    public Registrar_Pedidos() {
        this.setContentPane(new Personalizacion.Fondo("/Imagenes/Fondo_principal.jpg"));
        this.setExtendedState(6);
        initComponents();
        this.Eliminar.requestFocus();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Limpiar = new javax.swing.JButton();
        Guardar = new javax.swing.JButton();
        Modificar = new javax.swing.JButton();
        MostrarTabla = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        Aceptar = new javax.swing.JButton();
        Comentarios = new javax.swing.JTextField();
        FechaOrden = new com.toedter.calendar.JDateChooser();
        FechaRequerida = new com.toedter.calendar.JDateChooser();
        FechaEnvio = new com.toedter.calendar.JDateChooser();
        NrosDeClientes = new javax.swing.JComboBox<>();
        NroDeOrdenes = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Limpiar.setBackground(new java.awt.Color(0, 0, 0));
        Limpiar.setFont(new java.awt.Font("Dialog", 0, 34)); // NOI18N
        Limpiar.setForeground(new java.awt.Color(255, 153, 51));
        Limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/limpiar_norm.png"))); // NOI18N
        Limpiar.setBorder(null);
        Limpiar.setBorderPainted(false);
        Limpiar.setContentAreaFilled(false);
        Limpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Limpiar.setFocusPainted(false);
        Limpiar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/limpiar_press.png"))); // NOI18N
        Limpiar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/limpiar_roll.png"))); // NOI18N
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(Limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1476, 35, 345, 46));

        Guardar.setBackground(new java.awt.Color(0, 0, 0));
        Guardar.setFont(new java.awt.Font("Dialog", 0, 34)); // NOI18N
        Guardar.setForeground(new java.awt.Color(255, 153, 51));
        Guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/save_norm.png"))); // NOI18N
        Guardar.setBorder(null);
        Guardar.setBorderPainted(false);
        Guardar.setContentAreaFilled(false);
        Guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Guardar.setFocusPainted(false);
        Guardar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/save_press.png"))); // NOI18N
        Guardar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/save_roll.png"))); // NOI18N
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });
        getContentPane().add(Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 35, 344, 46));

        Modificar.setBackground(new java.awt.Color(0, 0, 0));
        Modificar.setFont(new java.awt.Font("Dialog", 0, 34)); // NOI18N
        Modificar.setForeground(new java.awt.Color(255, 153, 51));
        Modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/upd_norm.png"))); // NOI18N
        Modificar.setBorder(null);
        Modificar.setBorderPainted(false);
        Modificar.setContentAreaFilled(false);
        Modificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Modificar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/upd_press.png"))); // NOI18N
        Modificar.setRolloverEnabled(true);
        Modificar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/upd_roll.png"))); // NOI18N
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });
        getContentPane().add(Modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1016, 35, 344, 46));

        MostrarTabla.setBackground(new java.awt.Color(0, 0, 0));
        MostrarTabla.setFont(new java.awt.Font("Dialog", 0, 34)); // NOI18N
        MostrarTabla.setForeground(new java.awt.Color(255, 153, 51));
        MostrarTabla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/folder 2.png"))); // NOI18N
        MostrarTabla.setBorder(null);
        MostrarTabla.setBorderPainted(false);
        MostrarTabla.setContentAreaFilled(false);
        MostrarTabla.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MostrarTabla.setFocusPainted(false);
        MostrarTabla.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/folder 1.png"))); // NOI18N
        MostrarTabla.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/folder 1.png"))); // NOI18N
        MostrarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarTablaActionPerformed(evt);
            }
        });
        getContentPane().add(MostrarTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(1770, 928, 137, 137));

        Eliminar.setBackground(new java.awt.Color(0, 0, 0));
        Eliminar.setFont(new java.awt.Font("Dialog", 0, 34)); // NOI18N
        Eliminar.setForeground(new java.awt.Color(255, 153, 51));
        Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/eliminar_norm.png"))); // NOI18N
        Eliminar.setBorder(null);
        Eliminar.setBorderPainted(false);
        Eliminar.setContentAreaFilled(false);
        Eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Eliminar.setFocusPainted(false);
        Eliminar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/eliminar_press.png"))); // NOI18N
        Eliminar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/eliminar_roll.png"))); // NOI18N
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        getContentPane().add(Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(547, 35, 346, 46));

        Aceptar.setBackground(new java.awt.Color(0, 153, 153));
        Aceptar.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Aceptar.setForeground(new java.awt.Color(0, 0, 0));
        Aceptar.setText("Aceptar");
        Aceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarActionPerformed(evt);
            }
        });
        getContentPane().add(Aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(693, 821, 520, 45));

        Comentarios.setBackground(new java.awt.Color(0, 0, 0));
        Comentarios.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Comentarios.setForeground(new java.awt.Color(153, 153, 153));
        Comentarios.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Comentarios.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ComentariosFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ComentariosFocusLost(evt);
            }
        });
        getContentPane().add(Comentarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(693, 321, 520, 46));

        FechaOrden.setBackground(new java.awt.Color(0, 0, 0));
        FechaOrden.setForeground(new java.awt.Color(153, 153, 153));
        FechaOrden.setFont(new java.awt.Font("Dialog", 1, 23)); // NOI18N
        getContentPane().add(FechaOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(693, 517, 520, 45));

        FechaRequerida.setBackground(new java.awt.Color(0, 0, 0));
        FechaRequerida.setForeground(new java.awt.Color(153, 153, 153));
        FechaRequerida.setFont(new java.awt.Font("Dialog", 1, 23)); // NOI18N
        getContentPane().add(FechaRequerida, new org.netbeans.lib.awtextra.AbsoluteConstraints(693, 717, 520, 45));

        FechaEnvio.setBackground(new java.awt.Color(0, 0, 0));
        FechaEnvio.setForeground(new java.awt.Color(153, 153, 153));
        FechaEnvio.setFont(new java.awt.Font("Dialog", 1, 23)); // NOI18N
        getContentPane().add(FechaEnvio, new org.netbeans.lib.awtextra.AbsoluteConstraints(693, 617, 520, 45));

        NrosDeClientes.setBackground(new java.awt.Color(0, 0, 0));
        NrosDeClientes.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        NrosDeClientes.setForeground(new java.awt.Color(153, 153, 153));
        NrosDeClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(NrosDeClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(693, 421, 520, 46));

        NroDeOrdenes.setBackground(new java.awt.Color(0, 0, 0));
        NroDeOrdenes.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        NroDeOrdenes.setForeground(new java.awt.Color(153, 153, 153));
        NroDeOrdenes.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        NroDeOrdenes.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                NroDeOrdenesFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                NroDeOrdenesFocusLost(evt);
            }
        });
        getContentPane().add(NroDeOrdenes, new org.netbeans.lib.awtextra.AbsoluteConstraints(693, 224, 520, 46));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setText("FECHA DE ENTREGA");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 520, 140, 40));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText("FECHA REQUERIDA");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 720, 150, 40));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setText("FECHA ENVIO");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 620, 140, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        Controlador.Controlador_Pedidos.BotonGuardar();
    }//GEN-LAST:event_GuardarActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        Controlador.Controlador_Mod_Pedidos.Mostrar();
    }//GEN-LAST:event_ModificarActionPerformed

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
        Controlador.Controlador_Pedidos.Limpiar();
    }//GEN-LAST:event_LimpiarActionPerformed

    private void MostrarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarTablaActionPerformed
        Controlador.Controlador_Tablas.MostrarTablaPedidos();
    }//GEN-LAST:event_MostrarTablaActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        Controlador.Controlador_Elimi_Pedidos.Mostrar();
    }//GEN-LAST:event_EliminarActionPerformed

    private void AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarActionPerformed
        if(Controlador.Controlador_Pedidos.Verificar()){
            Controlador.Controlador_Pedidos.Vaciar();
            if(Validaciones.Validar.ValidarInt(NroDeOrdenes.getText())){
                javax.swing.JOptionPane.showMessageDialog(null,"Error en el nro de orden solo se permiten numeros");
                NroDeOrdenes.requestFocus();
            }else{
                Controlador.Controlador_Pedidos.Desbloquear();
                Guardar.requestFocus();
                javax.swing.JOptionPane.showMessageDialog(null,"Datos del pedido validos");
            }
        }else{
            javax.swing.JOptionPane.showMessageDialog(null,"Primero debe cargar todos los datos");
        }
    }//GEN-LAST:event_AceptarActionPerformed

    private void NroDeOrdenesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NroDeOrdenesFocusGained
        Personalizacion.Personalizar.Gained(NroDeOrdenes,"Ingresar numero de orden del pedido...");
    }//GEN-LAST:event_NroDeOrdenesFocusGained

    private void NroDeOrdenesFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NroDeOrdenesFocusLost
        Personalizacion.Personalizar.Lost(NroDeOrdenes,"Ingresar numero de orden del pedido...");
    }//GEN-LAST:event_NroDeOrdenesFocusLost

    private void ComentariosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ComentariosFocusGained
        Personalizacion.Personalizar.Gained(Comentarios,"Ingresar comentarios del pedido...");
    }//GEN-LAST:event_ComentariosFocusGained

    private void ComentariosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ComentariosFocusLost
        Personalizacion.Personalizar.Lost(Comentarios,"Ingresar comentarios del pedido...");
    }//GEN-LAST:event_ComentariosFocusLost
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptar;
    private javax.swing.JTextField Comentarios;
    private javax.swing.JButton Eliminar;
    private com.toedter.calendar.JDateChooser FechaEnvio;
    private com.toedter.calendar.JDateChooser FechaOrden;
    private com.toedter.calendar.JDateChooser FechaRequerida;
    private javax.swing.JButton Guardar;
    private javax.swing.JButton Limpiar;
    private javax.swing.JButton Modificar;
    private javax.swing.JButton MostrarTabla;
    private javax.swing.JTextField NroDeOrdenes;
    private javax.swing.JComboBox<String> NrosDeClientes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
    
    public JButton getAceptar() {
        return Aceptar;
    }
    public JTextField getComentarios() {
        return Comentarios;
    }
    public JButton getEliminar() {
        return Eliminar;
    }
    public JButton getGuardar() {
        return Guardar;
    }
    public JButton getLimpiar() {
        return Limpiar;
    }
    public JButton getModificar() {
        return Modificar;
    }
    public com.toedter.calendar.JDateChooser getFechaEnvio() {
        return FechaEnvio;
    }
    public com.toedter.calendar.JDateChooser getFechaOrden() {
        return FechaOrden;
    }
    public com.toedter.calendar.JDateChooser getFechaRequerida() {
        return FechaRequerida;
    }
    public String getNroCliente(){
        return NrosDeClientes.getItemAt(NrosDeClientes.getSelectedIndex());
    }
    public JTextField getNroDeOrdenes() {
        return NroDeOrdenes;
    }
    public JComboBox<String> getNrosDeC() {
        return NrosDeClientes;
    }
}