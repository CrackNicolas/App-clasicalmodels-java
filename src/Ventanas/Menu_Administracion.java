package Ventanas;

public class Menu_Administracion extends javax.swing.JFrame{
    
    public Menu_Administracion(){
        this.setContentPane(new Personalizacion.Fondo("/Imagenes/Fondo_secundario.jpg"));
        this.setExtendedState(6);
        initComponents();
        this.Panel.requestFocus();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new Personalizacion.Fondo("/Imagenes/Fondo_secundario.jpg");
        pnlMenu = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        Productos = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        LineaProd = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        Oficinas = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        Empleados = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        Clientes = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        Pedidos = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        DetallesPed = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        Pagos = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        Volver = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Panel.setDoubleBuffered(false);

        pnlMenu.setBackground(new java.awt.Color(0, 0, 0));

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));
        jPanel5.setForeground(new java.awt.Color(51, 51, 51));
        jPanel5.setMinimumSize(new java.awt.Dimension(191, 42));
        jPanel5.setPreferredSize(new java.awt.Dimension(191, 50));
        jPanel5.setLayout(new java.awt.BorderLayout());

        Productos.setBackground(new java.awt.Color(51, 51, 51));
        Productos.setFont(new java.awt.Font("Yu Gothic UI", 1, 25)); // NOI18N
        Productos.setForeground(new java.awt.Color(51, 255, 255));
        Productos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/x64-addProducto.png"))); // NOI18N
        Productos.setText("Registrar productos");
        Productos.setContentAreaFilled(false);
        Productos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Productos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Productos.setIconTextGap(15);
        Productos.setPreferredSize(new java.awt.Dimension(229, 80));
        Productos.setRequestFocusEnabled(false);
        Productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductosActionPerformed(evt);
            }
        });
        jPanel5.add(Productos, java.awt.BorderLayout.CENTER);

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));
        jPanel6.setForeground(new java.awt.Color(51, 51, 51));
        jPanel6.setMinimumSize(new java.awt.Dimension(191, 42));
        jPanel6.setPreferredSize(new java.awt.Dimension(191, 50));
        jPanel6.setLayout(new java.awt.BorderLayout());

        LineaProd.setBackground(new java.awt.Color(51, 51, 51));
        LineaProd.setFont(new java.awt.Font("Yu Gothic UI", 1, 25)); // NOI18N
        LineaProd.setForeground(new java.awt.Color(51, 255, 255));
        LineaProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/x64-folder.png"))); // NOI18N
        LineaProd.setText("Registrar linea productos");
        LineaProd.setContentAreaFilled(false);
        LineaProd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LineaProd.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LineaProd.setIconTextGap(15);
        LineaProd.setPreferredSize(new java.awt.Dimension(229, 80));
        LineaProd.setRequestFocusEnabled(false);
        LineaProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LineaProdActionPerformed(evt);
            }
        });
        jPanel6.add(LineaProd, java.awt.BorderLayout.CENTER);

        jPanel7.setBackground(new java.awt.Color(51, 51, 51));
        jPanel7.setForeground(new java.awt.Color(51, 51, 51));
        jPanel7.setMinimumSize(new java.awt.Dimension(191, 42));
        jPanel7.setPreferredSize(new java.awt.Dimension(191, 50));
        jPanel7.setLayout(new java.awt.BorderLayout());

        Oficinas.setBackground(new java.awt.Color(51, 51, 51));
        Oficinas.setFont(new java.awt.Font("Yu Gothic UI", 1, 25)); // NOI18N
        Oficinas.setForeground(new java.awt.Color(51, 255, 255));
        Oficinas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/x64-inicio.png"))); // NOI18N
        Oficinas.setText("Registrar oficinas");
        Oficinas.setContentAreaFilled(false);
        Oficinas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Oficinas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Oficinas.setIconTextGap(15);
        Oficinas.setPreferredSize(new java.awt.Dimension(229, 80));
        Oficinas.setRequestFocusEnabled(false);
        Oficinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OficinasActionPerformed(evt);
            }
        });
        jPanel7.add(Oficinas, java.awt.BorderLayout.CENTER);

        jPanel11.setBackground(new java.awt.Color(51, 51, 51));
        jPanel11.setForeground(new java.awt.Color(51, 51, 51));
        jPanel11.setMinimumSize(new java.awt.Dimension(191, 42));
        jPanel11.setPreferredSize(new java.awt.Dimension(191, 50));
        jPanel11.setLayout(new java.awt.BorderLayout());

        Empleados.setBackground(new java.awt.Color(51, 51, 51));
        Empleados.setFont(new java.awt.Font("Yu Gothic UI", 1, 25)); // NOI18N
        Empleados.setForeground(new java.awt.Color(51, 255, 255));
        Empleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/x64-empleado.png"))); // NOI18N
        Empleados.setText("Registrar empleados");
        Empleados.setContentAreaFilled(false);
        Empleados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Empleados.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Empleados.setIconTextGap(15);
        Empleados.setPreferredSize(new java.awt.Dimension(229, 80));
        Empleados.setRequestFocusEnabled(false);
        Empleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpleadosActionPerformed(evt);
            }
        });
        jPanel11.add(Empleados, java.awt.BorderLayout.CENTER);

        jPanel10.setBackground(new java.awt.Color(51, 51, 51));
        jPanel10.setForeground(new java.awt.Color(51, 51, 51));
        jPanel10.setLayout(new java.awt.BorderLayout());

        Clientes.setBackground(new java.awt.Color(51, 51, 51));
        Clientes.setFont(new java.awt.Font("Yu Gothic UI", 1, 25)); // NOI18N
        Clientes.setForeground(new java.awt.Color(51, 255, 255));
        Clientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/x64-clientes.png"))); // NOI18N
        Clientes.setText("Registrar clientes");
        Clientes.setContentAreaFilled(false);
        Clientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Clientes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Clientes.setIconTextGap(15);
        Clientes.setPreferredSize(new java.awt.Dimension(229, 80));
        Clientes.setRequestFocusEnabled(false);
        Clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClientesActionPerformed(evt);
            }
        });
        jPanel10.add(Clientes, java.awt.BorderLayout.CENTER);

        jPanel9.setBackground(new java.awt.Color(51, 51, 51));
        jPanel9.setForeground(new java.awt.Color(51, 51, 51));
        jPanel9.setMinimumSize(new java.awt.Dimension(191, 42));
        jPanel9.setPreferredSize(new java.awt.Dimension(191, 50));
        jPanel9.setLayout(new java.awt.BorderLayout());

        Pedidos.setBackground(new java.awt.Color(51, 51, 51));
        Pedidos.setFont(new java.awt.Font("Yu Gothic UI", 1, 25)); // NOI18N
        Pedidos.setForeground(new java.awt.Color(51, 255, 255));
        Pedidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/x64-reporte.png"))); // NOI18N
        Pedidos.setText("Registrar pedidos");
        Pedidos.setContentAreaFilled(false);
        Pedidos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Pedidos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Pedidos.setIconTextGap(15);
        Pedidos.setPreferredSize(new java.awt.Dimension(229, 80));
        Pedidos.setRequestFocusEnabled(false);
        Pedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PedidosActionPerformed(evt);
            }
        });
        jPanel9.add(Pedidos, java.awt.BorderLayout.CENTER);

        jPanel8.setBackground(new java.awt.Color(51, 51, 51));
        jPanel8.setForeground(new java.awt.Color(51, 51, 51));
        jPanel8.setMinimumSize(new java.awt.Dimension(191, 42));
        jPanel8.setPreferredSize(new java.awt.Dimension(191, 50));
        jPanel8.setLayout(new java.awt.BorderLayout());

        DetallesPed.setBackground(new java.awt.Color(51, 51, 51));
        DetallesPed.setFont(new java.awt.Font("Yu Gothic UI", 1, 25)); // NOI18N
        DetallesPed.setForeground(new java.awt.Color(51, 255, 255));
        DetallesPed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/x64-folder.png"))); // NOI18N
        DetallesPed.setText("Registrar detalles pedidos");
        DetallesPed.setContentAreaFilled(false);
        DetallesPed.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DetallesPed.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        DetallesPed.setIconTextGap(15);
        DetallesPed.setPreferredSize(new java.awt.Dimension(229, 80));
        DetallesPed.setRequestFocusEnabled(false);
        DetallesPed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DetallesPedActionPerformed(evt);
            }
        });
        jPanel8.add(DetallesPed, java.awt.BorderLayout.CENTER);

        jPanel12.setBackground(new java.awt.Color(51, 51, 51));
        jPanel12.setForeground(new java.awt.Color(51, 51, 51));
        jPanel12.setMinimumSize(new java.awt.Dimension(191, 42));
        jPanel12.setPreferredSize(new java.awt.Dimension(191, 50));
        jPanel12.setLayout(new java.awt.BorderLayout());

        Pagos.setBackground(new java.awt.Color(51, 51, 51));
        Pagos.setFont(new java.awt.Font("Yu Gothic UI", 1, 25)); // NOI18N
        Pagos.setForeground(new java.awt.Color(51, 255, 255));
        Pagos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/x64-pago.png"))); // NOI18N
        Pagos.setText("Registrar pagos");
        Pagos.setContentAreaFilled(false);
        Pagos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Pagos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Pagos.setIconTextGap(15);
        Pagos.setPreferredSize(new java.awt.Dimension(229, 80));
        Pagos.setRequestFocusEnabled(false);
        Pagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PagosActionPerformed(evt);
            }
        });
        jPanel12.add(Pagos, java.awt.BorderLayout.CENTER);

        jPanel13.setBackground(new java.awt.Color(51, 51, 51));
        jPanel13.setForeground(new java.awt.Color(51, 51, 51));
        jPanel13.setMinimumSize(new java.awt.Dimension(191, 42));
        jPanel13.setPreferredSize(new java.awt.Dimension(191, 50));
        jPanel13.setLayout(new java.awt.BorderLayout());

        Volver.setBackground(new java.awt.Color(51, 51, 51));
        Volver.setFont(new java.awt.Font("Yu Gothic UI", 1, 25)); // NOI18N
        Volver.setForeground(new java.awt.Color(51, 255, 255));
        Volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/x64-salir.png"))); // NOI18N
        Volver.setText("Menu principal");
        Volver.setContentAreaFilled(false);
        Volver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Volver.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Volver.setIconTextGap(15);
        Volver.setPreferredSize(new java.awt.Dimension(229, 80));
        Volver.setRequestFocusEnabled(false);
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });
        jPanel13.add(Volver, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
        pnlMenu.setLayout(pnlMenuLayout);
        pnlMenuLayout.setHorizontalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlMenuLayout.createSequentialGroup()
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(439, Short.MAX_VALUE))
        );

        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/icono-menu.png"))); // NOI18N
        btnMenu.setBorder(null);
        btnMenu.setContentAreaFilled(false);
        btnMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenu.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/icono-menu1.png"))); // NOI18N
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(439, 439, 439)
                        .addComponent(btnMenu))
                    .addComponent(pnlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(1325, Short.MAX_VALUE))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnMenu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        if(btnMenu.getX()>6){
            Animacion.Animacion.mover_izquierda(440, 1, 6, 6, btnMenu);
            Animacion.Animacion.mover_izquierda(1, -430, 6, 6, pnlMenu);
        }else{
            Animacion.Animacion.mover_derecha(1, 440, 6, 6, btnMenu);
            Animacion.Animacion.mover_derecha(-430, 1, 6, 6, pnlMenu);
        }
    }//GEN-LAST:event_btnMenuActionPerformed

    private void PagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PagosActionPerformed
        Controlador.Controlador_Pagos.Mostrar();
    }//GEN-LAST:event_PagosActionPerformed

    private void DetallesPedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DetallesPedActionPerformed
        Controlador.Controlado_Detalles_Ped.Mostrar();
    }//GEN-LAST:event_DetallesPedActionPerformed

    private void PedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PedidosActionPerformed
        Controlador.Controlador_Pedidos.Mostrar();
    }//GEN-LAST:event_PedidosActionPerformed

    private void ClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClientesActionPerformed
        Controlador.Controlador_Cliente.Mostrar();
    }//GEN-LAST:event_ClientesActionPerformed

    private void EmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpleadosActionPerformed
        Controlador.Controlador_Empleado.Mostrar();
    }//GEN-LAST:event_EmpleadosActionPerformed

    private void OficinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OficinasActionPerformed
        Controlador.Controlador_Oficina.Mostrar();
    }//GEN-LAST:event_OficinasActionPerformed

    private void LineaProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LineaProdActionPerformed
        Controlador.Controlador_Linea_Prod.Mostrar();
    }//GEN-LAST:event_LineaProdActionPerformed

    private void ProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductosActionPerformed
        Controlador.Controlador_Productos.Bloquear();
        Controlador.Controlador_Productos.Mostrar();
    }//GEN-LAST:event_ProductosActionPerformed

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        Controlador.Controlador_MenuPrincipal.Mostrar();
        Controlador.Controlador_Menu_Admin.Ocultar();
    }//GEN-LAST:event_VolverActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clientes;
    private javax.swing.JButton DetallesPed;
    private javax.swing.JButton Empleados;
    private javax.swing.JButton LineaProd;
    private javax.swing.JButton Oficinas;
    private javax.swing.JButton Pagos;
    private javax.swing.JPanel Panel;
    private javax.swing.JButton Pedidos;
    private javax.swing.JButton Productos;
    private javax.swing.JButton Volver;
    private javax.swing.JButton btnMenu;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel pnlMenu;
    // End of variables declaration//GEN-END:variables
}