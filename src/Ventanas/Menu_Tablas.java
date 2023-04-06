package Ventanas;

public class Menu_Tablas extends javax.swing.JFrame {
    
    public Menu_Tablas() {
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
        jPanel7 = new javax.swing.JPanel();
        TablasProd = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        TablasLinea = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        TablasOficinas = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        TablasClientes = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        TablasPedidos = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        TablasDetallesPed = new javax.swing.JButton();
        jPanel23 = new javax.swing.JPanel();
        TablasPagos = new javax.swing.JButton();
        jPanel22 = new javax.swing.JPanel();
        TablasFactura = new javax.swing.JButton();
        jPanel24 = new javax.swing.JPanel();
        TablaEmpleados = new javax.swing.JButton();
        jPanel25 = new javax.swing.JPanel();
        TablasFactura1 = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        Tablas8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Panel.setDoubleBuffered(false);
        Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlMenu.setBackground(new java.awt.Color(0, 0, 0));

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));
        jPanel5.setForeground(new java.awt.Color(51, 51, 51));
        jPanel5.setMinimumSize(new java.awt.Dimension(191, 42));
        jPanel5.setPreferredSize(new java.awt.Dimension(191, 50));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jPanel7.setBackground(new java.awt.Color(51, 51, 51));
        jPanel7.setForeground(new java.awt.Color(51, 51, 51));
        jPanel7.setLayout(new java.awt.BorderLayout());
        jPanel5.add(jPanel7, java.awt.BorderLayout.PAGE_START);

        TablasProd.setBackground(new java.awt.Color(51, 51, 51));
        TablasProd.setFont(new java.awt.Font("Yu Gothic UI", 1, 25)); // NOI18N
        TablasProd.setForeground(new java.awt.Color(51, 255, 255));
        TablasProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/x64-listar.png"))); // NOI18N
        TablasProd.setText("Tabla productos");
        TablasProd.setContentAreaFilled(false);
        TablasProd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TablasProd.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TablasProd.setIconTextGap(10);
        TablasProd.setPreferredSize(new java.awt.Dimension(229, 80));
        TablasProd.setRequestFocusEnabled(false);
        TablasProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TablasProdActionPerformed(evt);
            }
        });
        jPanel5.add(TablasProd, java.awt.BorderLayout.CENTER);

        jPanel8.setBackground(new java.awt.Color(51, 51, 51));
        jPanel8.setForeground(new java.awt.Color(51, 51, 51));
        jPanel8.setMinimumSize(new java.awt.Dimension(191, 42));
        jPanel8.setPreferredSize(new java.awt.Dimension(191, 50));
        jPanel8.setLayout(new java.awt.BorderLayout());

        TablasLinea.setBackground(new java.awt.Color(51, 51, 51));
        TablasLinea.setFont(new java.awt.Font("Yu Gothic UI", 1, 25)); // NOI18N
        TablasLinea.setForeground(new java.awt.Color(51, 255, 255));
        TablasLinea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/x64-listar.png"))); // NOI18N
        TablasLinea.setText("Tabla linea productos");
        TablasLinea.setContentAreaFilled(false);
        TablasLinea.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TablasLinea.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TablasLinea.setIconTextGap(10);
        TablasLinea.setPreferredSize(new java.awt.Dimension(229, 80));
        TablasLinea.setRequestFocusEnabled(false);
        TablasLinea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TablasLineaActionPerformed(evt);
            }
        });
        jPanel8.add(TablasLinea, java.awt.BorderLayout.CENTER);

        jPanel9.setBackground(new java.awt.Color(51, 51, 51));
        jPanel9.setForeground(new java.awt.Color(51, 51, 51));
        jPanel9.setMinimumSize(new java.awt.Dimension(191, 42));
        jPanel9.setPreferredSize(new java.awt.Dimension(191, 50));
        jPanel9.setLayout(new java.awt.BorderLayout());

        TablasOficinas.setBackground(new java.awt.Color(51, 51, 51));
        TablasOficinas.setFont(new java.awt.Font("Yu Gothic UI", 1, 25)); // NOI18N
        TablasOficinas.setForeground(new java.awt.Color(51, 255, 255));
        TablasOficinas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/x64-listar.png"))); // NOI18N
        TablasOficinas.setText("Tabla oficinas");
        TablasOficinas.setContentAreaFilled(false);
        TablasOficinas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TablasOficinas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TablasOficinas.setIconTextGap(10);
        TablasOficinas.setPreferredSize(new java.awt.Dimension(229, 80));
        TablasOficinas.setRequestFocusEnabled(false);
        TablasOficinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TablasOficinasActionPerformed(evt);
            }
        });
        jPanel9.add(TablasOficinas, java.awt.BorderLayout.CENTER);

        jPanel11.setBackground(new java.awt.Color(51, 51, 51));
        jPanel11.setForeground(new java.awt.Color(51, 51, 51));
        jPanel11.setMinimumSize(new java.awt.Dimension(191, 42));
        jPanel11.setPreferredSize(new java.awt.Dimension(191, 50));
        jPanel11.setLayout(new java.awt.BorderLayout());

        TablasClientes.setBackground(new java.awt.Color(51, 51, 51));
        TablasClientes.setFont(new java.awt.Font("Yu Gothic UI", 1, 25)); // NOI18N
        TablasClientes.setForeground(new java.awt.Color(51, 255, 255));
        TablasClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/x64-listar.png"))); // NOI18N
        TablasClientes.setText("Tabla clientes");
        TablasClientes.setContentAreaFilled(false);
        TablasClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TablasClientes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TablasClientes.setIconTextGap(10);
        TablasClientes.setPreferredSize(new java.awt.Dimension(229, 80));
        TablasClientes.setRequestFocusEnabled(false);
        TablasClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TablasClientesActionPerformed(evt);
            }
        });
        jPanel11.add(TablasClientes, java.awt.BorderLayout.CENTER);

        jPanel15.setBackground(new java.awt.Color(51, 51, 51));
        jPanel15.setForeground(new java.awt.Color(51, 51, 51));
        jPanel15.setMinimumSize(new java.awt.Dimension(191, 42));
        jPanel15.setPreferredSize(new java.awt.Dimension(191, 50));
        jPanel15.setLayout(new java.awt.BorderLayout());

        TablasPedidos.setBackground(new java.awt.Color(51, 51, 51));
        TablasPedidos.setFont(new java.awt.Font("Yu Gothic UI", 1, 25)); // NOI18N
        TablasPedidos.setForeground(new java.awt.Color(51, 255, 255));
        TablasPedidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/x64-listar.png"))); // NOI18N
        TablasPedidos.setText("Tabla pedidos");
        TablasPedidos.setContentAreaFilled(false);
        TablasPedidos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TablasPedidos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TablasPedidos.setIconTextGap(10);
        TablasPedidos.setPreferredSize(new java.awt.Dimension(229, 80));
        TablasPedidos.setRequestFocusEnabled(false);
        TablasPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TablasPedidosActionPerformed(evt);
            }
        });
        jPanel15.add(TablasPedidos, java.awt.BorderLayout.CENTER);

        jPanel14.setBackground(new java.awt.Color(51, 51, 51));
        jPanel14.setForeground(new java.awt.Color(51, 51, 51));
        jPanel14.setLayout(new java.awt.BorderLayout());

        TablasDetallesPed.setBackground(new java.awt.Color(51, 51, 51));
        TablasDetallesPed.setFont(new java.awt.Font("Yu Gothic UI", 1, 25)); // NOI18N
        TablasDetallesPed.setForeground(new java.awt.Color(51, 255, 255));
        TablasDetallesPed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/x64-listar.png"))); // NOI18N
        TablasDetallesPed.setText("Tabla detalles de pedidos");
        TablasDetallesPed.setContentAreaFilled(false);
        TablasDetallesPed.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TablasDetallesPed.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TablasDetallesPed.setIconTextGap(10);
        TablasDetallesPed.setPreferredSize(new java.awt.Dimension(229, 80));
        TablasDetallesPed.setRequestFocusEnabled(false);
        TablasDetallesPed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TablasDetallesPedActionPerformed(evt);
            }
        });
        jPanel14.add(TablasDetallesPed, java.awt.BorderLayout.CENTER);

        jPanel23.setBackground(new java.awt.Color(51, 51, 51));
        jPanel23.setForeground(new java.awt.Color(51, 51, 51));
        jPanel23.setMinimumSize(new java.awt.Dimension(191, 42));
        jPanel23.setPreferredSize(new java.awt.Dimension(191, 50));
        jPanel23.setLayout(new java.awt.BorderLayout());

        TablasPagos.setBackground(new java.awt.Color(51, 51, 51));
        TablasPagos.setFont(new java.awt.Font("Yu Gothic UI", 1, 25)); // NOI18N
        TablasPagos.setForeground(new java.awt.Color(51, 255, 255));
        TablasPagos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/x64-listar.png"))); // NOI18N
        TablasPagos.setText("Tabla pagos");
        TablasPagos.setContentAreaFilled(false);
        TablasPagos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TablasPagos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TablasPagos.setIconTextGap(10);
        TablasPagos.setPreferredSize(new java.awt.Dimension(229, 80));
        TablasPagos.setRequestFocusEnabled(false);
        TablasPagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TablasPagosActionPerformed(evt);
            }
        });
        jPanel23.add(TablasPagos, java.awt.BorderLayout.CENTER);

        jPanel22.setBackground(new java.awt.Color(51, 51, 51));
        jPanel22.setForeground(new java.awt.Color(51, 51, 51));
        jPanel22.setLayout(new java.awt.BorderLayout());

        TablasFactura.setBackground(new java.awt.Color(51, 51, 51));
        TablasFactura.setFont(new java.awt.Font("Yu Gothic UI", 1, 25)); // NOI18N
        TablasFactura.setForeground(new java.awt.Color(51, 255, 255));
        TablasFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/x64-ticket.png"))); // NOI18N
        TablasFactura.setText("Tabla factura de compra");
        TablasFactura.setContentAreaFilled(false);
        TablasFactura.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TablasFactura.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TablasFactura.setIconTextGap(10);
        TablasFactura.setPreferredSize(new java.awt.Dimension(229, 80));
        TablasFactura.setRequestFocusEnabled(false);
        TablasFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TablasFacturaActionPerformed(evt);
            }
        });
        jPanel22.add(TablasFactura, java.awt.BorderLayout.CENTER);

        jPanel24.setBackground(new java.awt.Color(51, 51, 51));
        jPanel24.setForeground(new java.awt.Color(51, 51, 51));
        jPanel24.setLayout(new java.awt.BorderLayout());

        TablaEmpleados.setBackground(new java.awt.Color(51, 51, 51));
        TablaEmpleados.setFont(new java.awt.Font("Yu Gothic UI", 1, 25)); // NOI18N
        TablaEmpleados.setForeground(new java.awt.Color(51, 255, 255));
        TablaEmpleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/x64-listar.png"))); // NOI18N
        TablaEmpleados.setText("Tabla empleados");
        TablaEmpleados.setContentAreaFilled(false);
        TablaEmpleados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TablaEmpleados.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TablaEmpleados.setIconTextGap(10);
        TablaEmpleados.setPreferredSize(new java.awt.Dimension(229, 80));
        TablaEmpleados.setRequestFocusEnabled(false);
        TablaEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TablaEmpleadosActionPerformed(evt);
            }
        });
        jPanel24.add(TablaEmpleados, java.awt.BorderLayout.CENTER);

        jPanel25.setBackground(new java.awt.Color(51, 51, 51));
        jPanel25.setForeground(new java.awt.Color(51, 51, 51));
        jPanel25.setLayout(new java.awt.BorderLayout());

        TablasFactura1.setBackground(new java.awt.Color(51, 51, 51));
        TablasFactura1.setFont(new java.awt.Font("Yu Gothic UI", 1, 25)); // NOI18N
        TablasFactura1.setForeground(new java.awt.Color(51, 255, 255));
        TablasFactura1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/x64-salir.png"))); // NOI18N
        TablasFactura1.setText("Menu principal");
        TablasFactura1.setContentAreaFilled(false);
        TablasFactura1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TablasFactura1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TablasFactura1.setIconTextGap(10);
        TablasFactura1.setPreferredSize(new java.awt.Dimension(229, 80));
        TablasFactura1.setRequestFocusEnabled(false);
        TablasFactura1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Volver(evt);
            }
        });
        jPanel25.add(TablasFactura1, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
        pnlMenu.setLayout(pnlMenuLayout);
        pnlMenuLayout.setHorizontalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMenuLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(371, Short.MAX_VALUE))
        );

        Panel.add(pnlMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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
        Panel.add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(419, 12, -1, -1));

        Tablas8.setBackground(new java.awt.Color(51, 51, 51));
        Tablas8.setFont(new java.awt.Font("Yu Gothic UI", 1, 25)); // NOI18N
        Tablas8.setForeground(new java.awt.Color(51, 255, 255));
        Tablas8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/x64-folder.png"))); // NOI18N
        Tablas8.setText("Tabla detalles de pedidos");
        Tablas8.setContentAreaFilled(false);
        Tablas8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Tablas8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Tablas8.setIconTextGap(10);
        Tablas8.setPreferredSize(new java.awt.Dimension(229, 80));
        Tablas8.setRequestFocusEnabled(false);
        Tablas8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tablas8ActionPerformed(evt);
            }
        });
        Panel.add(Tablas8, new org.netbeans.lib.awtextra.AbsoluteConstraints(537, 129, 401, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 1606, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        if(btnMenu.getX()>6){
            Animacion.Animacion.mover_izquierda(435, 1, 5, 5, btnMenu);
            Animacion.Animacion.mover_izquierda(1, -420, 5, 5, pnlMenu);
        }else{
            Animacion.Animacion.mover_derecha(1, 425, 5, 5, btnMenu);
            Animacion.Animacion.mover_derecha(-400, 1, 5, 5, pnlMenu);
        }
    }//GEN-LAST:event_btnMenuActionPerformed

    private void TablasFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TablasFacturaActionPerformed
        Controlador.Controlador_Tablas.ImprimirFacturaDeVenta();
    }//GEN-LAST:event_TablasFacturaActionPerformed

    private void TablasClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TablasClientesActionPerformed
        Controlador.Controlador_Tablas.MostrarTablaClientes();
    }//GEN-LAST:event_TablasClientesActionPerformed

    private void TablasOficinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TablasOficinasActionPerformed
        Controlador.Controlador_Tablas.MostrarTablaOficinas();
    }//GEN-LAST:event_TablasOficinasActionPerformed

    private void TablaEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TablaEmpleadosActionPerformed
        Controlador.Controlador_Tablas.MostrarTablaEmpleados();
    }//GEN-LAST:event_TablaEmpleadosActionPerformed

    private void TablasLineaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TablasLineaActionPerformed
        Controlador.Controlador_Tablas.MostrarTablaLinea();
    }//GEN-LAST:event_TablasLineaActionPerformed

    private void TablasProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TablasProdActionPerformed
        Controlador.Controlador_Tablas.MostrarTablaProductos();
    }//GEN-LAST:event_TablasProdActionPerformed

    private void TablasPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TablasPedidosActionPerformed
        Controlador.Controlador_Tablas.MostrarTablaPedidos();
    }//GEN-LAST:event_TablasPedidosActionPerformed

    private void TablasDetallesPedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TablasDetallesPedActionPerformed
        Controlador.Controlador_Tablas.MostrarTablaDetalles();
    }//GEN-LAST:event_TablasDetallesPedActionPerformed

    private void Tablas8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tablas8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tablas8ActionPerformed

    private void TablasPagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TablasPagosActionPerformed
        Controlador.Controlador_Tablas.MostrarTablaPagos();
    }//GEN-LAST:event_TablasPagosActionPerformed

    private void Volver(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Volver
        Controlador.Controlador_MenuPrincipal.Mostrar();
        Controlador.Controlador_Tablas.Ocultar();
    }//GEN-LAST:event_Volver

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel;
    private javax.swing.JButton TablaEmpleados;
    private javax.swing.JButton Tablas8;
    private javax.swing.JButton TablasClientes;
    private javax.swing.JButton TablasDetallesPed;
    private javax.swing.JButton TablasFactura;
    private javax.swing.JButton TablasFactura1;
    private javax.swing.JButton TablasLinea;
    private javax.swing.JButton TablasOficinas;
    private javax.swing.JButton TablasPagos;
    private javax.swing.JButton TablasPedidos;
    private javax.swing.JButton TablasProd;
    private javax.swing.JButton btnMenu;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel pnlMenu;
    // End of variables declaration//GEN-END:variables
}
