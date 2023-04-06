package Busquedas;

import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;

public class BuscarDetallesPedidos extends javax.swing.JFrame {
    private boolean band = true;
    
    public BuscarDetallesPedidos(){
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        CantidadP = new javax.swing.JTextField();
        Precio = new javax.swing.JTextField();
        BuscarEmpleados = new javax.swing.JButton();
        CodigosP = new javax.swing.JComboBox<>();
        Configuracion2 = new javax.swing.JButton();

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
                "Nro orden", "Codigo producto", "Cantidad pedida", "Precio por unidad"
            }
        ));
        Tabla.getTableHeader().setResizingAllowed(false);
        Tabla.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(Tabla);

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 51));
        jLabel2.setText("Cantidad pedida");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 51));
        jLabel3.setText("Precio por unidad");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 51));
        jLabel4.setText("Codigo producto");

        CantidadP.setBackground(new java.awt.Color(0, 0, 51));
        CantidadP.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        CantidadP.setForeground(new java.awt.Color(255, 255, 255));

        Precio.setBackground(new java.awt.Color(0, 0, 51));
        Precio.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        Precio.setForeground(new java.awt.Color(255, 255, 255));

        BuscarEmpleados.setBackground(new java.awt.Color(0, 0, 0));
        BuscarEmpleados.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        BuscarEmpleados.setForeground(new java.awt.Color(0, 153, 51));
        BuscarEmpleados.setText("Presione para buscar");
        BuscarEmpleados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BuscarEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarEmpleadosActionPerformed(evt);
            }
        });

        CodigosP.setBackground(new java.awt.Color(0, 0, 51));
        CodigosP.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        CodigosP.setForeground(new java.awt.Color(255, 255, 255));

        Configuracion2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/x64-folder.png"))); // NOI18N
        Configuracion2.setBorder(null);
        Configuracion2.setBorderPainted(false);
        Configuracion2.setContentAreaFilled(false);
        Configuracion2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Configuracion2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/x64-guardar.png"))); // NOI18N
        Configuracion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Configuracion2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(Orden, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(CodigosP, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(CantidadP, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(Precio, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BuscarEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Configuracion2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1326, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1047, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Orden, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CodigosP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CantidadP, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Precio, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(Configuracion2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BuscarEmpleados)
                        .addGap(22, 22, 22))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BuscarEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarEmpleadosActionPerformed
        if(Controlador.Controlador_Bus_DetallesPed.Validar()){
            Tabla.setVisible(true);
            Controlador.Controlador_Bus_DetallesPed.Buscar();
        }
    }//GEN-LAST:event_BuscarEmpleadosActionPerformed

    private void Configuracion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Configuracion2ActionPerformed
        if(band){
            Controlador.Controlador_Bus_DetallesPed.Actualizar();
        }
        Tabla.setVisible(band);
        band = !band;
    }//GEN-LAST:event_Configuracion2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BuscarEmpleados;
    private javax.swing.JTextField CantidadP;
    private javax.swing.JComboBox<String> CodigosP;
    private javax.swing.JButton Configuracion2;
    private javax.swing.JTextField Orden;
    private javax.swing.JTextField Precio;
    private javax.swing.JTable Tabla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    
    public JTextField getCantidadP() {
        return CantidadP;
    }
    public JComboBox<String> getCodigosP() {
        return CodigosP;
    }
    public JTextField getOrden() {
        return Orden;
    }
    public JTextField getPrecio() {
        return Precio;
    }
    public JTable getTabla() {
        return Tabla;
    }
    public String getCodigo() {
        return CodigosP.getItemAt(CodigosP.getSelectedIndex());
    }
}