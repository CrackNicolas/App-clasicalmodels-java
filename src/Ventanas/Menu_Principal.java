package Ventanas;

public class Menu_Principal extends javax.swing.JFrame{
    
    public Menu_Principal(){
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
        jPanel1 = new javax.swing.JPanel();
        Admin = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        Bus = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        Mod = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        Elim = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        Tablas = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        Tablas1 = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        Configuracion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setExtendedState(6);

        Panel.setDoubleBuffered(false);

        pnlMenu.setBackground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.setMinimumSize(new java.awt.Dimension(191, 42));
        jPanel1.setPreferredSize(new java.awt.Dimension(191, 50));
        jPanel1.setLayout(new java.awt.BorderLayout());

        Admin.setBackground(new java.awt.Color(51, 51, 51));
        Admin.setFont(new java.awt.Font("Yu Gothic UI", 1, 25)); // NOI18N
        Admin.setForeground(new java.awt.Color(51, 255, 255));
        Admin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/x64-admin.png"))); // NOI18N
        Admin.setText("Administracion");
        Admin.setContentAreaFilled(false);
        Admin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Admin.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Admin.setIconTextGap(32);
        Admin.setPreferredSize(new java.awt.Dimension(229, 80));
        Admin.setRequestFocusEnabled(false);
        Admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminActionPerformed(evt);
            }
        });
        jPanel1.add(Admin, java.awt.BorderLayout.CENTER);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setForeground(new java.awt.Color(51, 51, 51));
        jPanel2.setMinimumSize(new java.awt.Dimension(191, 42));
        jPanel2.setPreferredSize(new java.awt.Dimension(191, 50));
        jPanel2.setLayout(new java.awt.BorderLayout());

        Bus.setBackground(new java.awt.Color(51, 51, 51));
        Bus.setFont(new java.awt.Font("Yu Gothic UI", 1, 25)); // NOI18N
        Bus.setForeground(new java.awt.Color(51, 255, 255));
        Bus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/x64-buscar.png"))); // NOI18N
        Bus.setText("Busquedas");
        Bus.setContentAreaFilled(false);
        Bus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Bus.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Bus.setIconTextGap(32);
        Bus.setPreferredSize(new java.awt.Dimension(229, 80));
        Bus.setRequestFocusEnabled(false);
        Bus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BusActionPerformed(evt);
            }
        });
        jPanel2.add(Bus, java.awt.BorderLayout.CENTER);

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setForeground(new java.awt.Color(51, 51, 51));
        jPanel3.setMinimumSize(new java.awt.Dimension(191, 42));
        jPanel3.setPreferredSize(new java.awt.Dimension(191, 50));
        jPanel3.setLayout(new java.awt.BorderLayout());

        Mod.setBackground(new java.awt.Color(51, 51, 51));
        Mod.setFont(new java.awt.Font("Yu Gothic UI", 1, 25)); // NOI18N
        Mod.setForeground(new java.awt.Color(51, 255, 255));
        Mod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/x64-actualizar.png"))); // NOI18N
        Mod.setText("Modificaciones");
        Mod.setContentAreaFilled(false);
        Mod.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Mod.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Mod.setIconTextGap(32);
        Mod.setPreferredSize(new java.awt.Dimension(229, 80));
        Mod.setRequestFocusEnabled(false);
        Mod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModActionPerformed(evt);
            }
        });
        jPanel3.add(Mod, java.awt.BorderLayout.CENTER);

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setForeground(new java.awt.Color(51, 51, 51));
        jPanel4.setMinimumSize(new java.awt.Dimension(191, 42));
        jPanel4.setPreferredSize(new java.awt.Dimension(191, 50));
        jPanel4.setLayout(new java.awt.BorderLayout());

        Elim.setBackground(new java.awt.Color(51, 51, 51));
        Elim.setFont(new java.awt.Font("Yu Gothic UI", 1, 25)); // NOI18N
        Elim.setForeground(new java.awt.Color(51, 255, 255));
        Elim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/x64-basura.png"))); // NOI18N
        Elim.setText("Eliminaciones");
        Elim.setContentAreaFilled(false);
        Elim.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Elim.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Elim.setIconTextGap(32);
        Elim.setPreferredSize(new java.awt.Dimension(229, 80));
        Elim.setRequestFocusEnabled(false);
        Elim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ElimActionPerformed(evt);
            }
        });
        jPanel4.add(Elim, java.awt.BorderLayout.CENTER);

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));
        jPanel5.setForeground(new java.awt.Color(51, 51, 51));
        jPanel5.setMinimumSize(new java.awt.Dimension(191, 42));
        jPanel5.setPreferredSize(new java.awt.Dimension(191, 50));
        jPanel5.setLayout(new java.awt.BorderLayout());

        Tablas.setBackground(new java.awt.Color(51, 51, 51));
        Tablas.setFont(new java.awt.Font("Yu Gothic UI", 1, 25)); // NOI18N
        Tablas.setForeground(new java.awt.Color(51, 255, 255));
        Tablas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/x64-folder.png"))); // NOI18N
        Tablas.setText("Tablas");
        Tablas.setContentAreaFilled(false);
        Tablas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Tablas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Tablas.setIconTextGap(32);
        Tablas.setPreferredSize(new java.awt.Dimension(229, 80));
        Tablas.setRequestFocusEnabled(false);
        Tablas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TablasActionPerformed(evt);
            }
        });
        jPanel5.add(Tablas, java.awt.BorderLayout.CENTER);

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));
        jPanel6.setForeground(new java.awt.Color(51, 51, 51));
        jPanel6.setMinimumSize(new java.awt.Dimension(191, 42));
        jPanel6.setPreferredSize(new java.awt.Dimension(191, 50));
        jPanel6.setLayout(new java.awt.BorderLayout());

        Tablas1.setBackground(new java.awt.Color(51, 51, 51));
        Tablas1.setFont(new java.awt.Font("Yu Gothic UI", 1, 25)); // NOI18N
        Tablas1.setForeground(new java.awt.Color(51, 255, 255));
        Tablas1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/x64-salir.png"))); // NOI18N
        Tablas1.setText("Cerrar sesion");
        Tablas1.setContentAreaFilled(false);
        Tablas1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Tablas1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Tablas1.setIconTextGap(32);
        Tablas1.setPreferredSize(new java.awt.Dimension(229, 80));
        Tablas1.setRequestFocusEnabled(false);
        Tablas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tablas1ActionPerformed(evt);
            }
        });
        jPanel6.add(Tablas1, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
        pnlMenu.setLayout(pnlMenuLayout);
        pnlMenuLayout.setHorizontalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMenuLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlMenuLayout.createSequentialGroup()
                        .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(651, Short.MAX_VALUE))
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

        Configuracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/x64-config.png"))); // NOI18N
        Configuracion.setBorder(null);
        Configuracion.setBorderPainted(false);
        Configuracion.setContentAreaFilled(false);
        Configuracion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Configuracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfiguracionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addComponent(pnlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(btnMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1369, Short.MAX_VALUE)
                .addComponent(Configuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Configuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMenu)))
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
            Animacion.Animacion.mover_izquierda(435, 1, 5, 5, btnMenu);
            Animacion.Animacion.mover_izquierda(1, -400, 5, 5, pnlMenu);
        }else{
            Animacion.Animacion.mover_derecha(1, 425, 5, 5, btnMenu);
            Animacion.Animacion.mover_derecha(-400, 1, 5, 5, pnlMenu);
        }
    }//GEN-LAST:event_btnMenuActionPerformed

    private void ConfiguracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfiguracionActionPerformed
        Controlador.Control_SuperUsuario.Mostrar();
        Controlador.Controlador_MenuPrincipal.Ocultar();
    }//GEN-LAST:event_ConfiguracionActionPerformed

    private void AdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminActionPerformed
        Controlador.Controlador_Menu_Admin.Mostrar();
    }//GEN-LAST:event_AdminActionPerformed

    private void BusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BusActionPerformed
        Controlador.Controlador_Menu_Busqueda.Mostrar();
    }//GEN-LAST:event_BusActionPerformed

    private void ModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModActionPerformed
        Controlador.Controlador_Menu_Mod.Mostrar();
    }//GEN-LAST:event_ModActionPerformed

    private void ElimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ElimActionPerformed
        Controlador.Controlador_Menu_Eliminacion.Mostrar();
    }//GEN-LAST:event_ElimActionPerformed

    private void TablasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TablasActionPerformed
        Controlador.Controlador_Tablas.Mostrar();
    }//GEN-LAST:event_TablasActionPerformed

    private void Tablas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tablas1ActionPerformed
        Controlador.Control_Login.Mostrar();
        Controlador.Controlador_MenuPrincipal.Ocultar();
    }//GEN-LAST:event_Tablas1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Admin;
    private javax.swing.JButton Bus;
    private javax.swing.JButton Configuracion;
    private javax.swing.JButton Elim;
    private javax.swing.JButton Mod;
    private javax.swing.JPanel Panel;
    private javax.swing.JButton Tablas;
    private javax.swing.JButton Tablas1;
    private javax.swing.JButton btnMenu;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel pnlMenu;
    // End of variables declaration//GEN-END:variables
}