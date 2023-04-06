package Ventanas;

import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class CargarProductosEnLinea extends javax.swing.JFrame {
    
    public CargarProductosEnLinea() {
        this.setContentPane(new Personalizacion.Fondo("/Imagenes/Fondo_principal.jpg"));
        this.setExtendedState(6);
        initComponents();
        this.Eliminar.requestFocus();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Linea = new javax.swing.JTextField();
        Limpiar = new javax.swing.JButton();
        Guardar = new javax.swing.JButton();
        Modificar = new javax.swing.JButton();
        MostrarTabla = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        Aceptar = new javax.swing.JButton();
        Html = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Desc = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Linea.setBackground(new java.awt.Color(0, 0, 0));
        Linea.setFont(new java.awt.Font("Dialog", 1, 23)); // NOI18N
        Linea.setForeground(new java.awt.Color(153, 153, 153));
        Linea.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Linea.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                LineaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                LineaFocusLost(evt);
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

        Html.setBackground(new java.awt.Color(0, 0, 0));
        Html.setFont(new java.awt.Font("Dialog", 1, 23)); // NOI18N
        Html.setForeground(new java.awt.Color(153, 153, 153));
        Html.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Html.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                HtmlFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                HtmlFocusLost(evt);
            }
        });

        Desc.setBackground(new java.awt.Color(0, 0, 0));
        Desc.setColumns(20);
        Desc.setFont(new java.awt.Font("Dialog", 1, 23)); // NOI18N
        Desc.setForeground(new java.awt.Color(153, 153, 153));
        Desc.setLineWrap(true);
        Desc.setRows(5);
        Desc.setWrapStyleWord(true);
        jScrollPane1.setViewportView(Desc);
        Desc.getAccessibleContext().setAccessibleName("");
        Desc.getAccessibleContext().setAccessibleDescription("");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 19)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("Descripcion");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(MostrarTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
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
                        .addGap(687, 687, 687)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(Html, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Linea, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Aceptar, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE)
                                .addComponent(jScrollPane1)))))
                .addContainerGap(880, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 243, Short.MAX_VALUE)
                .addComponent(Linea, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(Html, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(Aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(MostrarTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        Controlador.Controlador_Linea_Prod.Guardar();
    }//GEN-LAST:event_GuardarActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        Controlador.Controlador_Mod_LineaProducto.Mostrar();
    }//GEN-LAST:event_ModificarActionPerformed

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
        Controlador.Controlador_Linea_Prod.Limpiar();
    }//GEN-LAST:event_LimpiarActionPerformed

    private void MostrarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarTablaActionPerformed
        Controlador.Controlador_Tablas.MostrarTablaLinea();
    }//GEN-LAST:event_MostrarTablaActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        Controlador.Controlador_Elimi_Lin.Mostrar();
    }//GEN-LAST:event_EliminarActionPerformed

    private void AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarActionPerformed
        if(Controlador.Controlador_Linea_Prod.Verificar()){
            Controlador.Controlador_Linea_Prod.Vaciar();
            if(Validaciones.Validar.ValidarLine(Linea.getText())){
                javax.swing.JOptionPane.showMessageDialog(null,"Error en el nombre de la linea solo se permiten ingresar letras");
                Linea.requestFocus();
            }else{
                Controlador.Controlador_Linea_Prod.Desbloquear();
                Guardar.requestFocus();
                javax.swing.JOptionPane.showMessageDialog(null,"Linea de productos valida");
            }
        }else{
            javax.swing.JOptionPane.showMessageDialog(null,"Primero debe cargar todo los datos");
        }
    }//GEN-LAST:event_AceptarActionPerformed

    private void LineaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_LineaFocusGained
        Personalizacion.Personalizar.Gained(Linea,"Ingresar linea producto...");
    }//GEN-LAST:event_LineaFocusGained

    private void LineaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_LineaFocusLost
        Personalizacion.Personalizar.Lost(Linea,"Ingresar linea producto...");
    }//GEN-LAST:event_LineaFocusLost

    private void HtmlFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_HtmlFocusGained
        Personalizacion.Personalizar.Gained(Html,"Ingresar descripcion html producto...");
    }//GEN-LAST:event_HtmlFocusGained

    private void HtmlFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_HtmlFocusLost
        Personalizacion.Personalizar.Lost(Html,"Ingresar descripcion html producto...");
    }//GEN-LAST:event_HtmlFocusLost

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptar;
    private javax.swing.JTextArea Desc;
    private javax.swing.JButton Eliminar;
    private javax.swing.JButton Guardar;
    private javax.swing.JTextField Html;
    private javax.swing.JButton Limpiar;
    private javax.swing.JTextField Linea;
    private javax.swing.JButton Modificar;
    private javax.swing.JButton MostrarTabla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    
    public JTextField getHtml() {
        return Html;
    }
    public JTextArea getDesc() {
        return Desc;
    }
    public JButton getGuardar() {
        return Guardar;
    }
    public JButton getLimpiar() {
        return Limpiar;
    }
    public JTextField getLinea() {
        return Linea;
    }
}