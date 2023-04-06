package Modificaciones;

import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class ModificarLineaProductos extends javax.swing.JFrame{
    
    public ModificarLineaProductos(){
        this.setContentPane(new Personalizacion.Fondo("/Imagenes/Fondo_secundario.jpg"));
        this.setExtendedState(6);
        initComponents();
        Linea.setEnabled(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        Linea = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        DescHtml = new javax.swing.JTextField();
        Modificar = new javax.swing.JButton();
        LimpiarCampos = new javax.swing.JButton();
        Buscar = new javax.swing.JTextField();
        Lupa = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Desc = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Tabla = new javax.swing.JTable(){     public boolean isCellEditable(int rowIndex, int colIndex){         return false;     } };
        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Linea producto", "Descripcion", "Descripcion html"
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
        jLabel1.setText("Descripcion");

        Linea.setBackground(new java.awt.Color(0, 0, 51));
        Linea.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        Linea.setForeground(new java.awt.Color(255, 255, 255));
        Linea.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel2.setBackground(new java.awt.Color(51, 255, 255));
        jLabel2.setFont(new java.awt.Font("Dialog", 0, 17)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText("Linea produto");

        jLabel3.setBackground(new java.awt.Color(51, 255, 255));
        jLabel3.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setText("Descripcion html");

        DescHtml.setBackground(new java.awt.Color(0, 0, 51));
        DescHtml.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        DescHtml.setForeground(new java.awt.Color(255, 255, 255));
        DescHtml.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        Modificar.setBackground(new java.awt.Color(0, 0, 0));
        Modificar.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        Modificar.setForeground(new java.awt.Color(51, 102, 0));
        Modificar.setText("Modificar");
        Modificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });

        LimpiarCampos.setBackground(new java.awt.Color(0, 0, 0));
        LimpiarCampos.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        LimpiarCampos.setForeground(new java.awt.Color(51, 102, 0));
        LimpiarCampos.setText("Limpiar campos");
        LimpiarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarCamposActionPerformed(evt);
            }
        });

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

        Desc.setBackground(new java.awt.Color(0, 0, 51));
        Desc.setColumns(20);
        Desc.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        Desc.setForeground(new java.awt.Color(255, 255, 255));
        Desc.setLineWrap(true);
        Desc.setRows(5);
        Desc.setWrapStyleWord(true);
        jScrollPane2.setViewportView(Desc);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Lupa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Linea, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Modificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LimpiarCampos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DescHtml)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 910, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lupa))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Linea))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DescHtml, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LimpiarCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(337, 337, 337)
                .addComponent(Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jScrollPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMouseClicked
        DefaultTableModel datos = (DefaultTableModel) Tabla.getModel();
        Linea.setText(datos.getValueAt(Tabla.getSelectedRow(),0).toString());      
        Desc.setText(datos.getValueAt(Tabla.getSelectedRow(),1).toString());
        DescHtml.setText(datos.getValueAt(Tabla.getSelectedRow(),2).toString());
    }//GEN-LAST:event_TablaMouseClicked

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        if(Tabla.getSelectedRow()>=0){  
            Controlador.Controlador_Mod_LineaProducto.Modificar();
        }else{
            javax.swing.JOptionPane.showMessageDialog(null," Antes de modificar seleccione la linea del producto");
        }
    }//GEN-LAST:event_ModificarActionPerformed

    private void LimpiarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarCamposActionPerformed
        Controlador.Controlador_Mod_LineaProducto.Limpiar();
    }//GEN-LAST:event_LimpiarCamposActionPerformed

    private void LupaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LupaActionPerformed
        Controlador.Controlador_Mod_LineaProducto.Mostrar();
    }//GEN-LAST:event_LupaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Buscar;
    private javax.swing.JTextArea Desc;
    private javax.swing.JTextField DescHtml;
    private javax.swing.JButton LimpiarCampos;
    private javax.swing.JTextField Linea;
    private javax.swing.JButton Lupa;
    private javax.swing.JButton Modificar;
    private javax.swing.JTable Tabla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
    
    public JTextArea getDesc() {
        return Desc;
    }
    public JTextField getDescHtml() {
        return DescHtml;
    }
    public JTextField getLinea() {
        return Linea;
    }
    public JTable getTabla() {
        return Tabla;
    }
    public JTextField getBuscar() {
        return Buscar;
    }
}