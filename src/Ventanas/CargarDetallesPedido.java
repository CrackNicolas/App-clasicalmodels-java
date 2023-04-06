package Ventanas;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class CargarDetallesPedido extends javax.swing.JFrame {
    
    public CargarDetallesPedido(){
        this.setContentPane(new Personalizacion.Fondo("/Imagenes/Fondo_principal.jpg"));
        this.setExtendedState(6);
        initComponents();
        this.Eliminar.requestFocus();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CantidadP = new javax.swing.JTextField();
        Limpiar = new javax.swing.JButton();
        Guardar = new javax.swing.JButton();
        Modificar = new javax.swing.JButton();
        MostrarTabla = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        Aceptar = new javax.swing.JButton();
        NroDeOrdenes = new javax.swing.JComboBox<>();
        CodigosProductos = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        CantidadP.setBackground(new java.awt.Color(0, 0, 0));
        CantidadP.setFont(new java.awt.Font("Dialog", 1, 23)); // NOI18N
        CantidadP.setForeground(new java.awt.Color(153, 153, 153));
        CantidadP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CantidadP.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CantidadPFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                CantidadPFocusLost(evt);
            }
        });

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

        NroDeOrdenes.setBackground(new java.awt.Color(0, 0, 0));
        NroDeOrdenes.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        NroDeOrdenes.setForeground(new java.awt.Color(153, 153, 153));

        CodigosProductos.setBackground(new java.awt.Color(0, 0, 0));
        CodigosProductos.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        CodigosProductos.setForeground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(MostrarTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(115, 115, 115)
                                .addComponent(Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(123, 123, 123)
                                .addComponent(Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(116, 116, 116)
                                .addComponent(Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(732, 732, 732)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CodigosProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NroDeOrdenes, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CantidadP, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Modificar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Eliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 345, Short.MAX_VALUE)
                .addComponent(NroDeOrdenes, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(CodigosProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(CantidadP, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(Aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(211, 211, 211)
                .addComponent(MostrarTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        Controlador.Controlado_Detalles_Ped.Registrar();
    }//GEN-LAST:event_GuardarActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        Controlador.Controlador_Mod_DetallesPed.Mostrar();
    }//GEN-LAST:event_ModificarActionPerformed

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
        Controlador.Controlado_Detalles_Ped.Limpiar();
    }//GEN-LAST:event_LimpiarActionPerformed

    private void MostrarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarTablaActionPerformed
        Controlador.Controlador_Tablas.MostrarTablaDetalles();
    }//GEN-LAST:event_MostrarTablaActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        Controlador.Controlador_Elimi_DetallesPed.Mostrar();
    }//GEN-LAST:event_EliminarActionPerformed

    private void AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarActionPerformed
        if(Controlador.Controlado_Detalles_Ped.Verificar()){
            if(Validaciones.Validar.ValidarInt(CantidadP.getText())){
                javax.swing.JOptionPane.showMessageDialog(null,"Error en la cantidad del pedido solo se permiten numeros");
                CantidadP.requestFocus();
            }else{
                Controlador.Controlado_Detalles_Ped.Desbloquear();
                Guardar.requestFocus();
                javax.swing.JOptionPane.showMessageDialog(null,"Detalles del pedido validos");
            }
        }else{
            javax.swing.JOptionPane.showMessageDialog(null,"Primero debe cargar todos los datos");
        }
    }//GEN-LAST:event_AceptarActionPerformed

    private void CantidadPFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CantidadPFocusGained
        Personalizacion.Personalizar.Gained(CantidadP,"Ingresar cantidad del pedido...");
    }//GEN-LAST:event_CantidadPFocusGained

    private void CantidadPFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CantidadPFocusLost
        Personalizacion.Personalizar.Lost(CantidadP,"Ingresar cantidad del pedido...");
    }//GEN-LAST:event_CantidadPFocusLost

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptar;
    private javax.swing.JTextField CantidadP;
    private javax.swing.JComboBox<String> CodigosProductos;
    private javax.swing.JButton Eliminar;
    private javax.swing.JButton Guardar;
    private javax.swing.JButton Limpiar;
    private javax.swing.JButton Modificar;
    private javax.swing.JButton MostrarTabla;
    private javax.swing.JComboBox<String> NroDeOrdenes;
    // End of variables declaration//GEN-END:variables
    
    public JButton getAceptar() {
        return Aceptar;
    }
    public JTextField getCantidadP() {
        return CantidadP;
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
    public JButton getMostrarTabla() {
        return MostrarTabla;
    }
    public String getCodigo(){
        return CodigosProductos.getItemAt(CodigosProductos.getSelectedIndex());
    }
    public String getNroDeOrden(){
        return NroDeOrdenes.getItemAt(NroDeOrdenes.getSelectedIndex());
    }
    public JComboBox<String> getCodigosProductos() {
        return CodigosProductos;
    }
    public JComboBox<String> getNroDeOrdenes() {
        return NroDeOrdenes;
    }
}