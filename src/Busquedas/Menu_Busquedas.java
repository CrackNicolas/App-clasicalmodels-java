package Busquedas;

public class Menu_Busquedas extends javax.swing.JFrame{
    
    public Menu_Busquedas(){
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
        jPanel11 = new javax.swing.JPanel();
        BusEmpleados = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        BusClientes = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        BusLineaP = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        BusOficina = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        BusPed = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        BusDetallesPed = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        BusPagos = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        BusProd = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        Volver = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Panel.setDoubleBuffered(false);

        pnlMenu.setBackground(new java.awt.Color(0, 0, 0));

        jPanel11.setBackground(new java.awt.Color(51, 51, 51));
        jPanel11.setForeground(new java.awt.Color(51, 51, 51));
        jPanel11.setMinimumSize(new java.awt.Dimension(191, 42));
        jPanel11.setPreferredSize(new java.awt.Dimension(191, 50));
        jPanel11.setLayout(new java.awt.BorderLayout());

        BusEmpleados.setBackground(new java.awt.Color(51, 51, 51));
        BusEmpleados.setFont(new java.awt.Font("Yu Gothic UI", 1, 25)); // NOI18N
        BusEmpleados.setForeground(new java.awt.Color(51, 255, 255));
        BusEmpleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/x64-buscar.png"))); // NOI18N
        BusEmpleados.setText("Buscar empleados");
        BusEmpleados.setContentAreaFilled(false);
        BusEmpleados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BusEmpleados.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BusEmpleados.setIconTextGap(10);
        BusEmpleados.setPreferredSize(new java.awt.Dimension(229, 80));
        BusEmpleados.setRequestFocusEnabled(false);
        BusEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BusEmpleadosActionPerformed(evt);
            }
        });
        jPanel11.add(BusEmpleados, java.awt.BorderLayout.CENTER);

        jPanel15.setBackground(new java.awt.Color(51, 51, 51));
        jPanel15.setForeground(new java.awt.Color(51, 51, 51));
        jPanel15.setMinimumSize(new java.awt.Dimension(191, 42));
        jPanel15.setPreferredSize(new java.awt.Dimension(191, 50));
        jPanel15.setLayout(new java.awt.BorderLayout());

        BusClientes.setBackground(new java.awt.Color(51, 51, 51));
        BusClientes.setFont(new java.awt.Font("Yu Gothic UI", 1, 25)); // NOI18N
        BusClientes.setForeground(new java.awt.Color(51, 255, 255));
        BusClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/x64-buscar.png"))); // NOI18N
        BusClientes.setText("Buscar clientes");
        BusClientes.setContentAreaFilled(false);
        BusClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BusClientes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BusClientes.setIconTextGap(10);
        BusClientes.setPreferredSize(new java.awt.Dimension(229, 80));
        BusClientes.setRequestFocusEnabled(false);
        BusClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BusClientesActionPerformed(evt);
            }
        });
        jPanel15.add(BusClientes, java.awt.BorderLayout.CENTER);

        jPanel14.setBackground(new java.awt.Color(51, 51, 51));
        jPanel14.setForeground(new java.awt.Color(51, 51, 51));
        jPanel14.setLayout(new java.awt.BorderLayout());

        BusLineaP.setBackground(new java.awt.Color(51, 51, 51));
        BusLineaP.setFont(new java.awt.Font("Yu Gothic UI", 1, 25)); // NOI18N
        BusLineaP.setForeground(new java.awt.Color(51, 255, 255));
        BusLineaP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/x64-buscar.png"))); // NOI18N
        BusLineaP.setText("Buscar linea de productos");
        BusLineaP.setContentAreaFilled(false);
        BusLineaP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BusLineaP.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BusLineaP.setIconTextGap(10);
        BusLineaP.setPreferredSize(new java.awt.Dimension(229, 80));
        BusLineaP.setRequestFocusEnabled(false);
        BusLineaP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BusLineaPActionPerformed(evt);
            }
        });
        jPanel14.add(BusLineaP, java.awt.BorderLayout.CENTER);

        jPanel13.setBackground(new java.awt.Color(51, 51, 51));
        jPanel13.setForeground(new java.awt.Color(51, 51, 51));
        jPanel13.setLayout(new java.awt.BorderLayout());

        BusOficina.setBackground(new java.awt.Color(51, 51, 51));
        BusOficina.setFont(new java.awt.Font("Yu Gothic UI", 1, 25)); // NOI18N
        BusOficina.setForeground(new java.awt.Color(51, 255, 255));
        BusOficina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/x64-buscar.png"))); // NOI18N
        BusOficina.setText("Buscar oficinas");
        BusOficina.setContentAreaFilled(false);
        BusOficina.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BusOficina.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BusOficina.setIconTextGap(10);
        BusOficina.setPreferredSize(new java.awt.Dimension(229, 80));
        BusOficina.setRequestFocusEnabled(false);
        BusOficina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BusOficinaActionPerformed(evt);
            }
        });
        jPanel13.add(BusOficina, java.awt.BorderLayout.CENTER);

        jPanel12.setBackground(new java.awt.Color(51, 51, 51));
        jPanel12.setForeground(new java.awt.Color(51, 51, 51));
        jPanel12.setLayout(new java.awt.BorderLayout());

        BusPed.setBackground(new java.awt.Color(51, 51, 51));
        BusPed.setFont(new java.awt.Font("Yu Gothic UI", 1, 25)); // NOI18N
        BusPed.setForeground(new java.awt.Color(51, 255, 255));
        BusPed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/x64-buscar.png"))); // NOI18N
        BusPed.setText("Buscar pedidos");
        BusPed.setContentAreaFilled(false);
        BusPed.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BusPed.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BusPed.setIconTextGap(10);
        BusPed.setPreferredSize(new java.awt.Dimension(229, 80));
        BusPed.setRequestFocusEnabled(false);
        BusPed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BusPedActionPerformed(evt);
            }
        });
        jPanel12.add(BusPed, java.awt.BorderLayout.CENTER);

        jPanel10.setBackground(new java.awt.Color(51, 51, 51));
        jPanel10.setForeground(new java.awt.Color(51, 51, 51));
        jPanel10.setLayout(new java.awt.BorderLayout());

        BusDetallesPed.setBackground(new java.awt.Color(51, 51, 51));
        BusDetallesPed.setFont(new java.awt.Font("Yu Gothic UI", 1, 25)); // NOI18N
        BusDetallesPed.setForeground(new java.awt.Color(51, 255, 255));
        BusDetallesPed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/x64-buscar.png"))); // NOI18N
        BusDetallesPed.setText("Buscar detalles de pedidos");
        BusDetallesPed.setContentAreaFilled(false);
        BusDetallesPed.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BusDetallesPed.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BusDetallesPed.setIconTextGap(10);
        BusDetallesPed.setPreferredSize(new java.awt.Dimension(229, 80));
        BusDetallesPed.setRequestFocusEnabled(false);
        BusDetallesPed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BusDetallesPedActionPerformed(evt);
            }
        });
        jPanel10.add(BusDetallesPed, java.awt.BorderLayout.CENTER);

        jPanel9.setBackground(new java.awt.Color(51, 51, 51));
        jPanel9.setForeground(new java.awt.Color(51, 51, 51));
        jPanel9.setMinimumSize(new java.awt.Dimension(191, 42));
        jPanel9.setPreferredSize(new java.awt.Dimension(191, 50));
        jPanel9.setLayout(new java.awt.BorderLayout());

        BusPagos.setBackground(new java.awt.Color(51, 51, 51));
        BusPagos.setFont(new java.awt.Font("Yu Gothic UI", 1, 25)); // NOI18N
        BusPagos.setForeground(new java.awt.Color(51, 255, 255));
        BusPagos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/x64-buscar.png"))); // NOI18N
        BusPagos.setText("Buscar pagos");
        BusPagos.setContentAreaFilled(false);
        BusPagos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BusPagos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BusPagos.setIconTextGap(10);
        BusPagos.setPreferredSize(new java.awt.Dimension(229, 80));
        BusPagos.setRequestFocusEnabled(false);
        BusPagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BusPagosActionPerformed(evt);
            }
        });
        jPanel9.add(BusPagos, java.awt.BorderLayout.CENTER);

        jPanel8.setBackground(new java.awt.Color(51, 51, 51));
        jPanel8.setForeground(new java.awt.Color(51, 51, 51));
        jPanel8.setMinimumSize(new java.awt.Dimension(191, 42));
        jPanel8.setPreferredSize(new java.awt.Dimension(191, 50));
        jPanel8.setLayout(new java.awt.BorderLayout());

        BusProd.setBackground(new java.awt.Color(51, 51, 51));
        BusProd.setFont(new java.awt.Font("Yu Gothic UI", 1, 25)); // NOI18N
        BusProd.setForeground(new java.awt.Color(51, 255, 255));
        BusProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/x64-buscar.png"))); // NOI18N
        BusProd.setText("Buscar productos");
        BusProd.setContentAreaFilled(false);
        BusProd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BusProd.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BusProd.setIconTextGap(10);
        BusProd.setPreferredSize(new java.awt.Dimension(229, 80));
        BusProd.setRequestFocusEnabled(false);
        BusProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BusProdActionPerformed(evt);
            }
        });
        jPanel8.add(BusProd, java.awt.BorderLayout.CENTER);

        jPanel16.setBackground(new java.awt.Color(51, 51, 51));
        jPanel16.setForeground(new java.awt.Color(51, 51, 51));
        jPanel16.setMinimumSize(new java.awt.Dimension(191, 42));
        jPanel16.setPreferredSize(new java.awt.Dimension(191, 50));
        jPanel16.setLayout(new java.awt.BorderLayout());

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
        jPanel16.add(Volver, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
        pnlMenu.setLayout(pnlMenuLayout);
        pnlMenuLayout.setHorizontalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlMenuLayout.createSequentialGroup()
                        .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMenuLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(438, Short.MAX_VALUE))
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
                .addGap(7, 7, 7)
                .addComponent(btnMenu)
                .addContainerGap(2012, Short.MAX_VALUE))
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

    private void BusEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BusEmpleadosActionPerformed
        Controlador.Controlador_Bus_Empleados.Mostrar();
    }//GEN-LAST:event_BusEmpleadosActionPerformed

    private void BusOficinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BusOficinaActionPerformed
        Controlador.Controlador_Bus_Oficinas.Mostrar();
    }//GEN-LAST:event_BusOficinaActionPerformed

    private void BusLineaPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BusLineaPActionPerformed
        Controlador.Controlador_Bus_LineaProductos.Mostrar();
    }//GEN-LAST:event_BusLineaPActionPerformed

    private void BusPagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BusPagosActionPerformed
        Controlador.Controlador_Bus_Pagos.Mostrar();
    }//GEN-LAST:event_BusPagosActionPerformed

    private void BusClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BusClientesActionPerformed
        Controlador.Controlador_Bus_Cliente.Mostrar();
    }//GEN-LAST:event_BusClientesActionPerformed

    private void BusPedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BusPedActionPerformed
        Controlador.Controlador_Bus_Pedidos.Mostrar();
    }//GEN-LAST:event_BusPedActionPerformed

    private void BusProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BusProdActionPerformed
        Controlador.Controlador_Bus_Producto.Mostrar();
    }//GEN-LAST:event_BusProdActionPerformed

    private void BusDetallesPedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BusDetallesPedActionPerformed
        Controlador.Controlador_Bus_DetallesPed.Mostrar();
    }//GEN-LAST:event_BusDetallesPedActionPerformed

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        Controlador.Controlador_MenuPrincipal.Mostrar();
        Controlador.Controlador_Menu_Busqueda.Ocultar();
    }//GEN-LAST:event_VolverActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BusClientes;
    private javax.swing.JButton BusDetallesPed;
    private javax.swing.JButton BusEmpleados;
    private javax.swing.JButton BusLineaP;
    private javax.swing.JButton BusOficina;
    private javax.swing.JButton BusPagos;
    private javax.swing.JButton BusPed;
    private javax.swing.JButton BusProd;
    private javax.swing.JPanel Panel;
    private javax.swing.JButton Volver;
    private javax.swing.JButton btnMenu;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel pnlMenu;
    // End of variables declaration//GEN-END:variables
}