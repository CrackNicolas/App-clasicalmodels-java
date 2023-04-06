package Modificaciones;

public class Menu_Modificaciones extends javax.swing.JFrame{
    
    public Menu_Modificaciones(){
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
        jPanel17 = new javax.swing.JPanel();
        ActProductos = new javax.swing.JButton();
        jPanel27 = new javax.swing.JPanel();
        ActLineaProductos = new javax.swing.JButton();
        jPanel26 = new javax.swing.JPanel();
        ActEmpleados = new javax.swing.JButton();
        jPanel25 = new javax.swing.JPanel();
        ActOficinas = new javax.swing.JButton();
        jPanel20 = new javax.swing.JPanel();
        ActClientes = new javax.swing.JButton();
        jPanel19 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        ActPedidos = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        ActDetallesPedidos = new javax.swing.JButton();
        jPanel28 = new javax.swing.JPanel();
        ActPagos = new javax.swing.JButton();
        jPanel29 = new javax.swing.JPanel();
        Volver = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Panel.setDoubleBuffered(false);

        pnlMenu.setBackground(new java.awt.Color(0, 0, 0));

        jPanel17.setBackground(new java.awt.Color(51, 51, 51));
        jPanel17.setForeground(new java.awt.Color(51, 51, 51));
        jPanel17.setLayout(new java.awt.BorderLayout());

        ActProductos.setBackground(new java.awt.Color(51, 51, 51));
        ActProductos.setFont(new java.awt.Font("Yu Gothic UI", 1, 25)); // NOI18N
        ActProductos.setForeground(new java.awt.Color(51, 255, 255));
        ActProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/x64-editar_doc.png"))); // NOI18N
        ActProductos.setText("Actualizar productos");
        ActProductos.setContentAreaFilled(false);
        ActProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ActProductos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ActProductos.setIconTextGap(10);
        ActProductos.setPreferredSize(new java.awt.Dimension(229, 80));
        ActProductos.setRequestFocusEnabled(false);
        ActProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActProductosActionPerformed(evt);
            }
        });
        jPanel17.add(ActProductos, java.awt.BorderLayout.CENTER);

        jPanel27.setBackground(new java.awt.Color(51, 51, 51));
        jPanel27.setForeground(new java.awt.Color(51, 51, 51));
        jPanel27.setLayout(new java.awt.BorderLayout());

        ActLineaProductos.setBackground(new java.awt.Color(51, 51, 51));
        ActLineaProductos.setFont(new java.awt.Font("Yu Gothic UI", 1, 25)); // NOI18N
        ActLineaProductos.setForeground(new java.awt.Color(51, 255, 255));
        ActLineaProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/x64-editar_doc.png"))); // NOI18N
        ActLineaProductos.setText("Actualizar linea de productos");
        ActLineaProductos.setContentAreaFilled(false);
        ActLineaProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ActLineaProductos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ActLineaProductos.setIconTextGap(10);
        ActLineaProductos.setPreferredSize(new java.awt.Dimension(229, 80));
        ActLineaProductos.setRequestFocusEnabled(false);
        ActLineaProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActLineaProductosActionPerformed(evt);
            }
        });
        jPanel27.add(ActLineaProductos, java.awt.BorderLayout.CENTER);

        jPanel26.setBackground(new java.awt.Color(51, 51, 51));
        jPanel26.setForeground(new java.awt.Color(51, 51, 51));
        jPanel26.setLayout(new java.awt.BorderLayout());

        ActEmpleados.setBackground(new java.awt.Color(51, 51, 51));
        ActEmpleados.setFont(new java.awt.Font("Yu Gothic UI", 1, 25)); // NOI18N
        ActEmpleados.setForeground(new java.awt.Color(51, 255, 255));
        ActEmpleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/x64-editar_doc.png"))); // NOI18N
        ActEmpleados.setText("Actualizar empleados");
        ActEmpleados.setContentAreaFilled(false);
        ActEmpleados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ActEmpleados.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ActEmpleados.setIconTextGap(10);
        ActEmpleados.setPreferredSize(new java.awt.Dimension(229, 80));
        ActEmpleados.setRequestFocusEnabled(false);
        ActEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActEmpleadosActionPerformed(evt);
            }
        });
        jPanel26.add(ActEmpleados, java.awt.BorderLayout.CENTER);

        jPanel25.setBackground(new java.awt.Color(51, 51, 51));
        jPanel25.setForeground(new java.awt.Color(51, 51, 51));
        jPanel25.setLayout(new java.awt.BorderLayout());

        ActOficinas.setBackground(new java.awt.Color(51, 51, 51));
        ActOficinas.setFont(new java.awt.Font("Yu Gothic UI", 1, 25)); // NOI18N
        ActOficinas.setForeground(new java.awt.Color(51, 255, 255));
        ActOficinas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/x64-editar_doc.png"))); // NOI18N
        ActOficinas.setText("Actualizar oficinas");
        ActOficinas.setContentAreaFilled(false);
        ActOficinas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ActOficinas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ActOficinas.setIconTextGap(10);
        ActOficinas.setPreferredSize(new java.awt.Dimension(229, 80));
        ActOficinas.setRequestFocusEnabled(false);
        ActOficinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActOficinasActionPerformed(evt);
            }
        });
        jPanel25.add(ActOficinas, java.awt.BorderLayout.CENTER);

        jPanel20.setBackground(new java.awt.Color(51, 51, 51));
        jPanel20.setForeground(new java.awt.Color(51, 51, 51));
        jPanel20.setLayout(new java.awt.BorderLayout());

        ActClientes.setBackground(new java.awt.Color(51, 51, 51));
        ActClientes.setFont(new java.awt.Font("Yu Gothic UI", 1, 25)); // NOI18N
        ActClientes.setForeground(new java.awt.Color(51, 255, 255));
        ActClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/x64-editar_doc.png"))); // NOI18N
        ActClientes.setText("Actualizar clientes");
        ActClientes.setContentAreaFilled(false);
        ActClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ActClientes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ActClientes.setIconTextGap(10);
        ActClientes.setPreferredSize(new java.awt.Dimension(229, 80));
        ActClientes.setRequestFocusEnabled(false);
        ActClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActClientesActionPerformed(evt);
            }
        });
        jPanel20.add(ActClientes, java.awt.BorderLayout.CENTER);

        jPanel19.setBackground(new java.awt.Color(51, 51, 51));
        jPanel19.setForeground(new java.awt.Color(51, 51, 51));
        jPanel19.setLayout(new java.awt.BorderLayout());

        jPanel21.setBackground(new java.awt.Color(51, 51, 51));
        jPanel21.setForeground(new java.awt.Color(51, 51, 51));
        jPanel21.setLayout(new java.awt.BorderLayout());

        jPanel22.setBackground(new java.awt.Color(51, 51, 51));
        jPanel22.setForeground(new java.awt.Color(51, 51, 51));
        jPanel22.setLayout(new java.awt.BorderLayout());

        jPanel23.setBackground(new java.awt.Color(51, 51, 51));
        jPanel23.setForeground(new java.awt.Color(51, 51, 51));
        jPanel23.setLayout(new java.awt.BorderLayout());

        jPanel24.setBackground(new java.awt.Color(51, 51, 51));
        jPanel24.setForeground(new java.awt.Color(51, 51, 51));
        jPanel24.setLayout(new java.awt.BorderLayout());
        jPanel23.add(jPanel24, java.awt.BorderLayout.CENTER);

        jPanel22.add(jPanel23, java.awt.BorderLayout.CENTER);

        jPanel21.add(jPanel22, java.awt.BorderLayout.CENTER);

        jPanel19.add(jPanel21, java.awt.BorderLayout.PAGE_START);

        ActPedidos.setBackground(new java.awt.Color(51, 51, 51));
        ActPedidos.setFont(new java.awt.Font("Yu Gothic UI", 1, 25)); // NOI18N
        ActPedidos.setForeground(new java.awt.Color(51, 255, 255));
        ActPedidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/x64-editar_doc.png"))); // NOI18N
        ActPedidos.setText("Actualizar pedidos");
        ActPedidos.setContentAreaFilled(false);
        ActPedidos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ActPedidos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ActPedidos.setIconTextGap(10);
        ActPedidos.setPreferredSize(new java.awt.Dimension(229, 80));
        ActPedidos.setRequestFocusEnabled(false);
        ActPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActPedidosActionPerformed(evt);
            }
        });
        jPanel19.add(ActPedidos, java.awt.BorderLayout.CENTER);

        jPanel18.setBackground(new java.awt.Color(51, 51, 51));
        jPanel18.setForeground(new java.awt.Color(51, 51, 51));
        jPanel18.setLayout(new java.awt.BorderLayout());

        ActDetallesPedidos.setBackground(new java.awt.Color(51, 51, 51));
        ActDetallesPedidos.setFont(new java.awt.Font("Yu Gothic UI", 1, 25)); // NOI18N
        ActDetallesPedidos.setForeground(new java.awt.Color(51, 255, 255));
        ActDetallesPedidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/x64-editar_doc.png"))); // NOI18N
        ActDetallesPedidos.setText("Actualizar detalles de pedido");
        ActDetallesPedidos.setContentAreaFilled(false);
        ActDetallesPedidos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ActDetallesPedidos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ActDetallesPedidos.setIconTextGap(10);
        ActDetallesPedidos.setPreferredSize(new java.awt.Dimension(229, 80));
        ActDetallesPedidos.setRequestFocusEnabled(false);
        ActDetallesPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActDetallesPedidosActionPerformed(evt);
            }
        });
        jPanel18.add(ActDetallesPedidos, java.awt.BorderLayout.CENTER);

        jPanel28.setBackground(new java.awt.Color(51, 51, 51));
        jPanel28.setForeground(new java.awt.Color(51, 51, 51));
        jPanel28.setLayout(new java.awt.BorderLayout());

        ActPagos.setBackground(new java.awt.Color(51, 51, 51));
        ActPagos.setFont(new java.awt.Font("Yu Gothic UI", 1, 25)); // NOI18N
        ActPagos.setForeground(new java.awt.Color(51, 255, 255));
        ActPagos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/x64-editar_doc.png"))); // NOI18N
        ActPagos.setText("Actualizar pagos");
        ActPagos.setContentAreaFilled(false);
        ActPagos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ActPagos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ActPagos.setIconTextGap(10);
        ActPagos.setPreferredSize(new java.awt.Dimension(229, 80));
        ActPagos.setRequestFocusEnabled(false);
        ActPagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActPagosActionPerformed(evt);
            }
        });
        jPanel28.add(ActPagos, java.awt.BorderLayout.CENTER);

        jPanel29.setBackground(new java.awt.Color(51, 51, 51));
        jPanel29.setForeground(new java.awt.Color(51, 51, 51));
        jPanel29.setLayout(new java.awt.BorderLayout());

        Volver.setBackground(new java.awt.Color(51, 51, 51));
        Volver.setFont(new java.awt.Font("Yu Gothic UI", 1, 25)); // NOI18N
        Volver.setForeground(new java.awt.Color(51, 255, 255));
        Volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/x64-salir.png"))); // NOI18N
        Volver.setText("Menu principal");
        Volver.setContentAreaFilled(false);
        Volver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Volver.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Volver.setIconTextGap(10);
        Volver.setPreferredSize(new java.awt.Dimension(229, 80));
        Volver.setRequestFocusEnabled(false);
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });
        jPanel29.add(Volver, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
        pnlMenu.setLayout(pnlMenuLayout);
        pnlMenuLayout.setHorizontalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMenuLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel28, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel29, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(pnlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMenu)
                .addGap(0, 1304, Short.MAX_VALUE))
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
            Animacion.Animacion.mover_izquierda(450, 1, 6, 6, btnMenu);
            Animacion.Animacion.mover_izquierda(1, -450, 6, 6, pnlMenu);
        }else{
            Animacion.Animacion.mover_derecha(1, 455, 6, 6, btnMenu);
            Animacion.Animacion.mover_derecha(-430, 1, 6, 6, pnlMenu);
        }
    }//GEN-LAST:event_btnMenuActionPerformed

    private void ActLineaProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActLineaProductosActionPerformed
        Controlador.Controlador_Mod_LineaProducto.Mostrar();
    }//GEN-LAST:event_ActLineaProductosActionPerformed

    private void ActClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActClientesActionPerformed
        Controlador.Controlador_Mod_Clientes.Mostrar();
    }//GEN-LAST:event_ActClientesActionPerformed

    private void ActPagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActPagosActionPerformed
        Controlador.Controlador_Mod_Pagos.Mostrar();
    }//GEN-LAST:event_ActPagosActionPerformed

    private void ActProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActProductosActionPerformed
        Controlador.Controlador_Mod_Productos.Mostrar();
    }//GEN-LAST:event_ActProductosActionPerformed

    private void ActEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActEmpleadosActionPerformed
        Controlador.Controlador_Mod_Empleados.Mostrar();
    }//GEN-LAST:event_ActEmpleadosActionPerformed

    private void ActOficinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActOficinasActionPerformed
        Controlador.Controlador_Mod_Oficinas.Mostrar();
    }//GEN-LAST:event_ActOficinasActionPerformed

    private void ActPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActPedidosActionPerformed
        Controlador.Controlador_Mod_Pedidos.Mostrar();
    }//GEN-LAST:event_ActPedidosActionPerformed

    private void ActDetallesPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActDetallesPedidosActionPerformed
        Controlador.Controlador_Mod_DetallesPed.Mostrar();
    }//GEN-LAST:event_ActDetallesPedidosActionPerformed

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        Controlador.Controlador_MenuPrincipal.Mostrar();
        Controlador.Controlador_Menu_Mod.Ocultar();
    }//GEN-LAST:event_VolverActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ActClientes;
    private javax.swing.JButton ActDetallesPedidos;
    private javax.swing.JButton ActEmpleados;
    private javax.swing.JButton ActLineaProductos;
    private javax.swing.JButton ActOficinas;
    private javax.swing.JButton ActPagos;
    private javax.swing.JButton ActPedidos;
    private javax.swing.JButton ActProductos;
    private javax.swing.JPanel Panel;
    private javax.swing.JButton Volver;
    private javax.swing.JButton btnMenu;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel pnlMenu;
    // End of variables declaration//GEN-END:variables
}