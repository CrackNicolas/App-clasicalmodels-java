package Modificaciones;

import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class ModificarPedidos extends javax.swing.JFrame{
    
    public ModificarPedidos(){
        this.setContentPane(new Personalizacion.Fondo("/Imagenes/Fondo_secundario.jpg"));
        this.setExtendedState(6);
        initComponents();
        NroOrden.setEnabled(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        NroOrden = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        FechaOrden = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        FechaReq = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        FechaEnvio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Modificar = new javax.swing.JButton();
        LimpiarCampos = new javax.swing.JButton();
        Estado = new javax.swing.JTextField();
        Comentarios = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        NroCliente = new javax.swing.JComboBox<>();
        Buscar = new javax.swing.JTextField();
        Lupa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Tabla = new javax.swing.JTable(){     public boolean isCellEditable(int rowIndex, int colIndex){         return false;     } };
        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero de orden", "Fecha orden", "Fecha requerida", "Fecha envio", "Estado", "Comentarios", "Numero  de cliente"
            }
        ));
        Tabla.getTableHeader().setResizingAllowed(false);
        Tabla.getTableHeader().setReorderingAllowed(false);
        Tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabla);

        jLabel1.setBackground(new java.awt.Color(51, 255, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setText("Fecha orden");

        NroOrden.setBackground(new java.awt.Color(0, 0, 51));
        NroOrden.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        NroOrden.setForeground(new java.awt.Color(255, 255, 255));
        NroOrden.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel2.setBackground(new java.awt.Color(51, 255, 255));
        jLabel2.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText("Nro orden");

        FechaOrden.setBackground(new java.awt.Color(0, 0, 51));
        FechaOrden.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        FechaOrden.setForeground(new java.awt.Color(255, 255, 255));
        FechaOrden.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel3.setBackground(new java.awt.Color(51, 255, 255));
        jLabel3.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setText("Fecha requerida");

        jLabel4.setBackground(new java.awt.Color(51, 255, 255));
        jLabel4.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setText("Fecha envio");

        FechaReq.setBackground(new java.awt.Color(0, 0, 51));
        FechaReq.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        FechaReq.setForeground(new java.awt.Color(255, 255, 255));
        FechaReq.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel5.setBackground(new java.awt.Color(51, 255, 255));
        jLabel5.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel5.setText("Estado");

        FechaEnvio.setBackground(new java.awt.Color(0, 0, 51));
        FechaEnvio.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        FechaEnvio.setForeground(new java.awt.Color(255, 255, 255));
        FechaEnvio.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel6.setBackground(new java.awt.Color(51, 255, 255));
        jLabel6.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel6.setText("Comentarios");

        Modificar.setBackground(new java.awt.Color(51, 255, 255));
        Modificar.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Modificar.setForeground(new java.awt.Color(0, 0, 0));
        Modificar.setText("MODIFICAR");
        Modificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });

        LimpiarCampos.setBackground(new java.awt.Color(0, 0, 0));
        LimpiarCampos.setFont(new java.awt.Font("Dialog", 1, 21)); // NOI18N
        LimpiarCampos.setForeground(new java.awt.Color(51, 102, 0));
        LimpiarCampos.setText("Limpiar campos");
        LimpiarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarCamposActionPerformed(evt);
            }
        });

        Estado.setBackground(new java.awt.Color(0, 0, 51));
        Estado.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        Estado.setForeground(new java.awt.Color(255, 255, 255));
        Estado.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        Comentarios.setBackground(new java.awt.Color(0, 0, 51));
        Comentarios.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        Comentarios.setForeground(new java.awt.Color(255, 255, 255));
        Comentarios.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel13.setBackground(new java.awt.Color(51, 255, 255));
        jLabel13.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel13.setText("Nro cliente");

        NroCliente.setBackground(new java.awt.Color(0, 0, 51));
        NroCliente.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        NroCliente.setForeground(new java.awt.Color(255, 255, 255));

        Buscar.setBackground(new java.awt.Color(0, 0, 51));
        Buscar.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        Buscar.setForeground(new java.awt.Color(255, 255, 255));
        Buscar.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        Lupa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/x32-buscar.png"))); // NOI18N
        Lupa.setBorder(null);
        Lupa.setBorderPainted(false);
        Lupa.setContentAreaFilled(false);
        Lupa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Lupa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LupaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(LimpiarCampos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(0, 0, Short.MAX_VALUE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGap(6, 6, 6)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(FechaOrden)
                                            .addComponent(FechaReq)
                                            .addComponent(FechaEnvio)
                                            .addComponent(Estado)
                                            .addComponent(Comentarios)
                                            .addComponent(NroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(NroOrden, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Lupa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1029, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1031, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Buscar)
                            .addComponent(Lupa, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NroOrden, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FechaOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FechaReq, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FechaEnvio, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Estado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Comentarios, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(NroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(LimpiarCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(480, 480, 480)
                        .addComponent(Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(1, 1, 1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMouseClicked
        DefaultTableModel datos = (DefaultTableModel) Tabla.getModel();
        FechaOrden.setText(datos.getValueAt(Tabla.getSelectedRow(),1).toString());
        FechaReq.setText(datos.getValueAt(Tabla.getSelectedRow(),2).toString());
        FechaEnvio.setText(datos.getValueAt(Tabla.getSelectedRow(),3).toString());
        NroOrden.setText(datos.getValueAt(Tabla.getSelectedRow(),0).toString());
        Estado.setText(datos.getValueAt(Tabla.getSelectedRow(),4).toString());
        Comentarios.setText(datos.getValueAt(Tabla.getSelectedRow(),5).toString());
        Controlador.Controlador_Mod_Pedidos.CargarClientes(datos.getValueAt(Tabla.getSelectedRow(),6).toString());
    }//GEN-LAST:event_TablaMouseClicked
    
    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        if(Tabla.getSelectedRow()>=0){
            if(Controlador.Controlador_Mod_Pedidos.Verificar()){
                if(Validaciones.Validar.ValidarLine(Estado.getText())){
                    javax.swing.JOptionPane.showMessageDialog(null,"Error en el estado solo se permiten letras");
                    Estado.requestFocus();
                }else{
                    Controlador.Controlador_Mod_Pedidos.Modificar();
                }
            }else{
                javax.swing.JOptionPane.showMessageDialog(null,"Primero debe cargar todos los datos");
            }
        }else{
            javax.swing.JOptionPane.showMessageDialog(null," Antes de modificar seleccione un pedido");
        }
    }//GEN-LAST:event_ModificarActionPerformed

    private void LimpiarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarCamposActionPerformed
        Controlador.Controlador_Mod_Pedidos.Limpiar();
    }//GEN-LAST:event_LimpiarCamposActionPerformed

    private void LupaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LupaActionPerformed
        Controlador.Controlador_Mod_Pedidos.Mostrar();
    }//GEN-LAST:event_LupaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Buscar;
    private javax.swing.JTextField Comentarios;
    private javax.swing.JTextField Estado;
    private javax.swing.JTextField FechaEnvio;
    private javax.swing.JTextField FechaOrden;
    private javax.swing.JTextField FechaReq;
    private javax.swing.JButton LimpiarCampos;
    private javax.swing.JButton Lupa;
    private javax.swing.JButton Modificar;
    private javax.swing.JComboBox<String> NroCliente;
    private javax.swing.JTextField NroOrden;
    private javax.swing.JTable Tabla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    
    public JTextField getApellido() {
        return FechaReq;
    }
    public JTextField getComentarios() {
        return Comentarios;
    }
    public JTextField getEstado() {
        return Estado;
    }
    public JComboBox<String> getNroClient() {
        return NroCliente;
    }
    public String getNroCliente(){
        return NroCliente.getItemAt(NroCliente.getSelectedIndex());
    }
    public JTextField getNroOrden() {
        return NroOrden;
    }
    public JTable getTabla() {
        return Tabla;
    }
    public JTextField getTelefono() {
        return FechaEnvio;
    }
    public JTextField getNombre() {
        return FechaOrden;
    }
    public JTextField getBuscar() {
        return Buscar;
    }
}