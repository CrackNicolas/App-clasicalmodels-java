package Busquedas;

import javax.swing.JTable;
import javax.swing.JTextField;

public class BuscarLineaProductos extends javax.swing.JFrame {
    private boolean band = true;
    
    public BuscarLineaProductos(){
        this.setContentPane(new Personalizacion.Fondo("/Imagenes/Fondo_principal.jpg"));
        this.setExtendedState(6);
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        Nombre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        Html = new javax.swing.JTextField();
        BuscarProductos = new javax.swing.JButton();
        Configuracion2 = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 51));
        jLabel1.setText("Nombre");

        Nombre.setBackground(new java.awt.Color(0, 0, 51));
        Nombre.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        Nombre.setForeground(new java.awt.Color(255, 255, 255));

        Tabla = new javax.swing.JTable(){     public boolean isCellEditable(int rowIndex, int colIndex){         return false;     } };
        Tabla.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Descripcion", "Descripcion html"
            }
        ));
        Tabla.getTableHeader().setResizingAllowed(false);
        Tabla.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(Tabla);

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 51));
        jLabel2.setText("Html");

        Html.setBackground(new java.awt.Color(0, 0, 51));
        Html.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        Html.setForeground(new java.awt.Color(255, 255, 255));

        BuscarProductos.setBackground(new java.awt.Color(0, 0, 0));
        BuscarProductos.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        BuscarProductos.setForeground(new java.awt.Color(0, 153, 51));
        BuscarProductos.setText("Presione para buscar");
        BuscarProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BuscarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarProductosActionPerformed(evt);
            }
        });

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BuscarProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Html, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Configuracion2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1217, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Html, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(Configuracion2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BuscarProductos)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 999, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BuscarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarProductosActionPerformed
        if(Controlador.Controlador_Bus_LineaProductos.Validar()){
            Tabla.setVisible(true);
            Controlador.Controlador_Bus_LineaProductos.Buscar();
        }
    }//GEN-LAST:event_BuscarProductosActionPerformed

    private void Configuracion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Configuracion2ActionPerformed
        if(band){
            Controlador.Controlador_Bus_LineaProductos.Actualizar();
        }
        Tabla.setVisible(band);
        band = !band;
    }//GEN-LAST:event_Configuracion2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BuscarProductos;
    private javax.swing.JButton Configuracion2;
    private javax.swing.JTextField Html;
    private javax.swing.JTextField Nombre;
    private javax.swing.JTable Tabla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    
    public JTextField getHtml() {
        return Html;
    }
    public JTextField getNombre() {
        return Nombre;
    }
    public JTable getTabla() {
        return Tabla;
    }
}