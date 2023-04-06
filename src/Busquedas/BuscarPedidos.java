package Busquedas;

import javax.swing.JTable;
import javax.swing.JTextField;

public class BuscarPedidos extends javax.swing.JFrame {
    private boolean band = true;
    
    public BuscarPedidos(){
        this.setContentPane(new Personalizacion.Fondo("/Imagenes/Fondo_principal.jpg"));
        this.setExtendedState(6);
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        Orden = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Estado = new javax.swing.JTextField();
        BuscarPedidos = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Clientes = new javax.swing.JTextField();
        FechaOrden = new com.toedter.calendar.JDateChooser();
        Configuracion1 = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 51));
        jLabel1.setText("Buscar nro de orden");

        Orden.setBackground(new java.awt.Color(0, 0, 51));
        Orden.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        Orden.setForeground(new java.awt.Color(255, 255, 255));

        Tabla = new javax.swing.JTable(){     public boolean isCellEditable(int rowIndex, int colIndex){         return false;     } };
        Tabla.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nro orden", "Fecha orden", "Fecha requerida", "Fecha envio", "Estado", "Comentarios", "Nro cliente"
            }
        ));
        Tabla.getTableHeader().setResizingAllowed(false);
        Tabla.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(Tabla);

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 51));
        jLabel2.setText("Buscar por estado");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 51));
        jLabel4.setText("Buscar por cliente");

        Estado.setBackground(new java.awt.Color(0, 0, 51));
        Estado.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        Estado.setForeground(new java.awt.Color(255, 255, 255));

        BuscarPedidos.setBackground(new java.awt.Color(0, 0, 0));
        BuscarPedidos.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        BuscarPedidos.setForeground(new java.awt.Color(0, 153, 51));
        BuscarPedidos.setText("Presione para buscar");
        BuscarPedidos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BuscarPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarPedidosActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 51));
        jLabel3.setText("Fecha orden");

        Clientes.setBackground(new java.awt.Color(0, 0, 51));
        Clientes.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        Clientes.setForeground(new java.awt.Color(255, 255, 255));

        FechaOrden.setBackground(new java.awt.Color(0, 0, 51));
        FechaOrden.setForeground(new java.awt.Color(255, 255, 255));
        FechaOrden.setDateFormatString("yyyy/MM/dd");
        FechaOrden.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N

        Configuracion1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/x64-folder.png"))); // NOI18N
        Configuracion1.setBorder(null);
        Configuracion1.setBorderPainted(false);
        Configuracion1.setContentAreaFilled(false);
        Configuracion1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Configuracion1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/x64-guardar.png"))); // NOI18N
        Configuracion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Configuracion1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(Clientes)
                                .addComponent(Estado, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Orden, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(FechaOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(Configuracion1, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BuscarPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1275, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Orden, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Estado, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Clientes, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                            .addComponent(FechaOrden, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Configuracion1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(687, 687, 687)
                        .addComponent(BuscarPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1046, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BuscarPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarPedidosActionPerformed
        if(Controlador.Controlador_Bus_Pedidos.Validar()){
            Tabla.setVisible(true);
            Controlador.Controlador_Bus_Pedidos.Buscar();
        }
    }//GEN-LAST:event_BuscarPedidosActionPerformed
    
    private void Configuracion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Configuracion1ActionPerformed
        if(band){
            Controlador.Controlador_Bus_Pedidos.Actualizar();
        }
        Tabla.setVisible(band);
        band = !band;
    }//GEN-LAST:event_Configuracion1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BuscarPedidos;
    private javax.swing.JTextField Clientes;
    private javax.swing.JButton Configuracion1;
    private javax.swing.JTextField Estado;
    private com.toedter.calendar.JDateChooser FechaOrden;
    private javax.swing.JTextField Orden;
    private javax.swing.JTable Tabla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    
    public JTextField getClientes() {
        return Clientes;
    }
    public JTextField getEstado() {
        return Estado;
    }
    public JTextField getOrden() {
        return Orden;
    }
    public JTable getTabla() {
        return Tabla;
    }
    public com.toedter.calendar.JDateChooser getF1() {
        return FechaOrden;
    }
}