package Ventanas;

public class Inicio extends javax.swing.JFrame{
    
    public Inicio(){
        this.setContentPane(new Personalizacion.Fondo("/Imagenes/Fondo_inicio.jpg"));
        this.setExtendedState(6);
        initComponents();
        Panel.requestFocus();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new Personalizacion.Fondo("/Imagenes/Fondo_inicio.jpg");
        jPanel25 = new javax.swing.JPanel();
        TablasFactura1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Panel.setDoubleBuffered(false);
        Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel25.setBackground(new java.awt.Color(51, 51, 51));
        jPanel25.setForeground(new java.awt.Color(51, 51, 51));
        jPanel25.setLayout(new java.awt.BorderLayout());

        TablasFactura1.setBackground(new java.awt.Color(51, 51, 51));
        TablasFactura1.setFont(new java.awt.Font("Yu Gothic UI", 1, 25)); // NOI18N
        TablasFactura1.setForeground(new java.awt.Color(102, 102, 102));
        TablasFactura1.setText("Classic Models");
        TablasFactura1.setContentAreaFilled(false);
        TablasFactura1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TablasFactura1.setIconTextGap(10);
        TablasFactura1.setPreferredSize(new java.awt.Dimension(229, 80));
        TablasFactura1.setRequestFocusEnabled(false);
        TablasFactura1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Classic(evt);
            }
        });
        jPanel25.add(TablasFactura1, java.awt.BorderLayout.CENTER);

        Panel.add(jPanel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(1530, 980, 352, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, 1894, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, 1031, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Classic(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Classic
        Controlador.Control_Login.Mostrar();
        Controlador.Control_Login.OcultarInicio();
    }//GEN-LAST:event_Classic

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel;
    private javax.swing.JButton TablasFactura1;
    private javax.swing.JPanel jPanel25;
    // End of variables declaration//GEN-END:variables
}