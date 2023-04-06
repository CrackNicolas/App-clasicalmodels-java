package Ventanas;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;

public class Registrar_Pagos extends javax.swing.JFrame {
    
    public Registrar_Pagos() {
        this.setContentPane(new Personalizacion.Fondo("/Imagenes/Fondo_principal.jpg"));
        this.setExtendedState(6);
        initComponents();
        Personalizacion.Personalizar.Tabla(Tabla,4);
        this.Deco.enable(false);
        this.TotalP.enable(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        VerificarNro = new javax.swing.JTextField();
        MostrarTabla = new javax.swing.JButton();
        Aceptar = new javax.swing.JButton();
        NrosDeClientes = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        Deco = new javax.swing.JButton();
        Guardar = new javax.swing.JButton();
        Limpiar = new javax.swing.JButton();
        TotalP = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Limpiar1 = new javax.swing.JButton();
        Guardar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        VerificarNro.setBackground(new java.awt.Color(0, 0, 0));
        VerificarNro.setFont(new java.awt.Font("Dialog", 1, 23)); // NOI18N
        VerificarNro.setForeground(new java.awt.Color(153, 153, 153));
        VerificarNro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        VerificarNro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                VerificarNroFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                VerificarNroFocusLost(evt);
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

        Aceptar.setBackground(new java.awt.Color(0, 153, 153));
        Aceptar.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Aceptar.setForeground(new java.awt.Color(0, 0, 0));
        Aceptar.setText("Validar");
        Aceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarActionPerformed(evt);
            }
        });

        NrosDeClientes.setBackground(new java.awt.Color(0, 0, 0));
        NrosDeClientes.setFont(new java.awt.Font("Dialog", 1, 23)); // NOI18N
        NrosDeClientes.setForeground(new java.awt.Color(153, 153, 153));

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero de orden", "Codigo producto", "Cantidad pedida", "Precio por unidad", "Sub total"
            }
        ));
        jScrollPane2.setViewportView(Tabla);

        Deco.setBackground(new java.awt.Color(51, 51, 51));
        Deco.setFont(new java.awt.Font("Arial", 1, 25)); // NOI18N
        Deco.setForeground(new java.awt.Color(51, 255, 255));
        Deco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/x64-money.png"))); // NOI18N
        Deco.setText("REGISTRAR PAGOS");
        Deco.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Deco.setContentAreaFilled(false);
        Deco.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Deco.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Deco.setIconTextGap(125);
        Deco.setPreferredSize(new java.awt.Dimension(229, 80));
        Deco.setRequestFocusEnabled(false);

        Guardar.setBackground(new java.awt.Color(0, 0, 0));
        Guardar.setForeground(new java.awt.Color(0, 0, 0));
        Guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/x64-guardar.png"))); // NOI18N
        Guardar.setBorder(null);
        Guardar.setBorderPainted(false);
        Guardar.setContentAreaFilled(false);
        Guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });

        Limpiar.setBackground(new java.awt.Color(0, 0, 0));
        Limpiar.setForeground(new java.awt.Color(0, 0, 0));
        Limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/x64-limpiar.png"))); // NOI18N
        Limpiar.setBorder(null);
        Limpiar.setBorderPainted(false);
        Limpiar.setContentAreaFilled(false);
        Limpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });

        TotalP.setBackground(new java.awt.Color(0, 0, 0));
        TotalP.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        TotalP.setForeground(new java.awt.Color(51, 255, 255));
        TotalP.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 255));
        jLabel1.setText("TOTAL A PAGAR");

        Limpiar1.setBackground(new java.awt.Color(0, 0, 0));
        Limpiar1.setForeground(new java.awt.Color(0, 0, 0));
        Limpiar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/x32-dinero.png"))); // NOI18N
        Limpiar1.setBorder(null);
        Limpiar1.setBorderPainted(false);
        Limpiar1.setContentAreaFilled(false);
        Limpiar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Guardar1.setBackground(new java.awt.Color(0, 0, 0));
        Guardar1.setForeground(new java.awt.Color(0, 0, 0));
        Guardar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/x64-folder.png"))); // NOI18N
        Guardar1.setBorder(null);
        Guardar1.setBorderPainted(false);
        Guardar1.setContentAreaFilled(false);
        Guardar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Guardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Guardar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Deco, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NrosDeClientes, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(VerificarNro, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Aceptar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(Limpiar1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TotalP, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(Limpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Guardar1)
                        .addGap(195, 195, 195)
                        .addComponent(Guardar)))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(621, 621, 621)
                .addComponent(MostrarTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Deco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(NrosDeClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(VerificarNro, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(Aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Guardar1)
                    .addComponent(Limpiar)
                    .addComponent(Guardar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Limpiar1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TotalP, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1050, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(878, 878, 878)
                        .addComponent(MostrarTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MostrarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarTablaActionPerformed
        Controlador.Controlador_Tablas.MostrarTablaPagos();
    }//GEN-LAST:event_MostrarTablaActionPerformed

    private void AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarActionPerformed
        if(Controlador.Controlador_Pagos.Verificar()){
            Controlador.Controlador_Pagos.Desbloquear();
            javax.swing.JOptionPane.showMessageDialog(null,"Datos del pago validos");
        }else{
            javax.swing.JOptionPane.showMessageDialog(null,"Primero debe ingresar todos los datos");
        }
    }//GEN-LAST:event_AceptarActionPerformed

    private void VerificarNroFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_VerificarNroFocusGained
        Personalizacion.Personalizar.Gained(VerificarNro,"Verificar numero del pedido...");
    }//GEN-LAST:event_VerificarNroFocusGained

    private void VerificarNroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_VerificarNroFocusLost
        Personalizacion.Personalizar.Lost(VerificarNro,"Verificar numero del pedido...");
    }//GEN-LAST:event_VerificarNroFocusLost

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
        Controlador.Controlador_Pagos.Limpiar();
    }//GEN-LAST:event_LimpiarActionPerformed

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        Controlador.Controlador_Pagos.BotonGuardar();
    }//GEN-LAST:event_GuardarActionPerformed

    private void Guardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Guardar1ActionPerformed
        Controlador.Controlador_Tablas.MostrarTablaPagos();
    }//GEN-LAST:event_Guardar1ActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptar;
    private javax.swing.JButton Deco;
    private javax.swing.JButton Guardar;
    private javax.swing.JButton Guardar1;
    private javax.swing.JButton Limpiar;
    private javax.swing.JButton Limpiar1;
    private javax.swing.JButton MostrarTabla;
    private javax.swing.JComboBox<String> NrosDeClientes;
    private javax.swing.JTable Tabla;
    private javax.swing.JTextField TotalP;
    private javax.swing.JTextField VerificarNro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
    
    public JButton getAceptar() {
        return Aceptar;
    }
    public JTextField getVerificarNro() {
        return VerificarNro;
    }
    public String getNroCliente(){
        return NrosDeClientes.getItemAt(NrosDeClientes.getSelectedIndex());
    }
    public JComboBox<String> getNrosDeC() {
        return NrosDeClientes;
    }
    public JButton getGuardar() {
        return Guardar;
    }
    public JButton getLimpiar() {
        return Limpiar;
    }
    public JTable getTabla() {
        return Tabla;
    }
    public JTextField getTotalP() {
        return TotalP;
    }
}