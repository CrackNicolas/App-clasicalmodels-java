package Modificaciones;

import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class ModificarProductos extends javax.swing.JFrame{
    
    public ModificarProductos(){
        this.setContentPane(new Personalizacion.Fondo("/Imagenes/Fondo_secundario.jpg"));
        this.setExtendedState(6);
        initComponents();
        Codigo.setEnabled(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        Codigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        nom = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Stock = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Escala = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Vendedor = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Modificar = new javax.swing.JButton();
        LimpiarCampos = new javax.swing.JButton();
        Precio = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        MSRP = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Linea = new javax.swing.JComboBox<>();
        Buscar = new javax.swing.JTextField();
        Lupa = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Descripcion = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Tabla = new javax.swing.JTable(){     public boolean isCellEditable(int rowIndex, int colIndex){         return false;     } };
        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Escala", "Vendedor", "Descripcion", "Stock", "Precio", "MSRP", "Linea"
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
        jLabel1.setText("Nombre");

        Codigo.setBackground(new java.awt.Color(0, 0, 51));
        Codigo.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        Codigo.setForeground(new java.awt.Color(255, 255, 255));
        Codigo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel2.setBackground(new java.awt.Color(51, 255, 255));
        jLabel2.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText("Codigo");

        nom.setBackground(new java.awt.Color(0, 0, 51));
        nom.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        nom.setForeground(new java.awt.Color(255, 255, 255));
        nom.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel3.setBackground(new java.awt.Color(51, 255, 255));
        jLabel3.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setText("Escala");

        Stock.setBackground(new java.awt.Color(0, 0, 51));
        Stock.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        Stock.setForeground(new java.awt.Color(255, 255, 255));
        Stock.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel4.setBackground(new java.awt.Color(51, 255, 255));
        jLabel4.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setText("Vendedor");

        Escala.setBackground(new java.awt.Color(0, 0, 51));
        Escala.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        Escala.setForeground(new java.awt.Color(255, 255, 255));
        Escala.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel5.setBackground(new java.awt.Color(51, 255, 255));
        jLabel5.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel5.setText("Descripcion");

        Vendedor.setBackground(new java.awt.Color(0, 0, 51));
        Vendedor.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        Vendedor.setForeground(new java.awt.Color(255, 255, 255));
        Vendedor.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel6.setBackground(new java.awt.Color(51, 255, 255));
        jLabel6.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel6.setText("Stock");

        Modificar.setBackground(new java.awt.Color(51, 255, 255));
        Modificar.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Modificar.setForeground(new java.awt.Color(0, 0, 0));
        Modificar.setText("MODIFICAR");
        Modificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });

        LimpiarCampos.setBackground(new java.awt.Color(0, 0, 0));
        LimpiarCampos.setFont(new java.awt.Font("Dialog", 1, 21)); // NOI18N
        LimpiarCampos.setForeground(new java.awt.Color(51, 102, 0));
        LimpiarCampos.setText("Limpiar campos");
        LimpiarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarCamposActionPerformed(evt);
            }
        });

        Precio.setBackground(new java.awt.Color(0, 0, 51));
        Precio.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        Precio.setForeground(new java.awt.Color(255, 255, 255));
        Precio.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel7.setBackground(new java.awt.Color(51, 255, 255));
        jLabel7.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel7.setText("Precio");

        MSRP.setBackground(new java.awt.Color(0, 0, 51));
        MSRP.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        MSRP.setForeground(new java.awt.Color(255, 255, 255));
        MSRP.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel8.setBackground(new java.awt.Color(51, 255, 255));
        jLabel8.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel8.setText("MSRP");

        jLabel9.setBackground(new java.awt.Color(51, 255, 255));
        jLabel9.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel9.setText("Linea");

        Linea.setBackground(new java.awt.Color(0, 0, 51));
        Linea.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        Linea.setForeground(new java.awt.Color(255, 255, 255));

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

        Descripcion.setBackground(new java.awt.Color(0, 0, 51));
        Descripcion.setColumns(20);
        Descripcion.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        Descripcion.setForeground(new java.awt.Color(255, 255, 255));
        Descripcion.setLineWrap(true);
        Descripcion.setRows(5);
        Descripcion.setWrapStyleWord(true);
        jScrollPane2.setViewportView(Descripcion);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(Lupa)
                        .addGap(18, 18, 18)
                        .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(LimpiarCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nom, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Escala, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Vendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Stock, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Precio, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(MSRP, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Linea, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1085, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lupa)
                    .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nom, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Escala, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Vendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Stock, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Precio, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MSRP, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Linea, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LimpiarCampos)
                .addGap(153, 153, 153)
                .addComponent(Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1031, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMouseClicked
        DefaultTableModel datos = (DefaultTableModel) Tabla.getModel();
        Codigo.setText(datos.getValueAt(Tabla.getSelectedRow(),0).toString());
        nom.setText(datos.getValueAt(Tabla.getSelectedRow(),1).toString());
        Escala.setText(datos.getValueAt(Tabla.getSelectedRow(),2).toString());
        Vendedor.setText(datos.getValueAt(Tabla.getSelectedRow(),3).toString());
        Descripcion.setText(datos.getValueAt(Tabla.getSelectedRow(),4).toString());
        Stock.setText(datos.getValueAt(Tabla.getSelectedRow(),5).toString());
        Precio.setText(datos.getValueAt(Tabla.getSelectedRow(),6).toString());
        MSRP.setText(datos.getValueAt(Tabla.getSelectedRow(),7).toString());
        Controlador.Controlador_Mod_Productos.CargarListas(datos.getValueAt(Tabla.getSelectedRow(),8).toString());
    }//GEN-LAST:event_TablaMouseClicked

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        if(Tabla.getSelectedRow()>=0){    
            if(Controlador.Controlador_Mod_Productos.Verificar()){
                if(Validaciones.Validar.ValidarCodigos(nom.getText())){
                    javax.swing.JOptionPane.showMessageDialog(null,"Error en el nombre solo se permiten letras");
                    nom.requestFocus();
                }else if(Validaciones.Validar.ValidarEscala(Escala.getText())){
                    javax.swing.JOptionPane.showMessageDialog(null,"Error en la escala solo se permiten numeros");
                    Escala.requestFocus();
                }else if(Validaciones.Validar.ValidarCodigos(Vendedor.getText())){
                    javax.swing.JOptionPane.showMessageDialog(null,"Error en el vendedor solo se permiten numeros");
                    Vendedor.requestFocus();
                }else if(Validaciones.Validar.ValidarInt(Stock.getText())){
                    javax.swing.JOptionPane.showMessageDialog(null,"Error en el stock solo se permiten numeros enteros");
                    Stock.requestFocus();
                }else if(Validaciones.Validar.ValidarFloat(Precio.getText())){
                    javax.swing.JOptionPane.showMessageDialog(null,"Error en el precio solo se permiten numeros");
                    Precio.requestFocus();
                }else if(Validaciones.Validar.ValidarFloat(MSRP.getText())){
                    javax.swing.JOptionPane.showMessageDialog(null,"Error en el msrp solo se permiten numeros");
                    MSRP.requestFocus();
                }else{
                    Controlador.Controlador_Mod_Productos.Modificar();
                }
            }else{
                javax.swing.JOptionPane.showMessageDialog(null,"Primero debe cargar todos los datos");
            }
        }else{
            javax.swing.JOptionPane.showMessageDialog(null," Antes de modificar seleccione un producto de la tabla");
        }
    }//GEN-LAST:event_ModificarActionPerformed

    private void LimpiarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarCamposActionPerformed
        Controlador.Controlador_Mod_Productos.Limpiar();
    }//GEN-LAST:event_LimpiarCamposActionPerformed

    private void LupaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LupaActionPerformed
        Controlador.Controlador_Mod_Productos.Mostrar();
    }//GEN-LAST:event_LupaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Buscar;
    private javax.swing.JTextField Codigo;
    private javax.swing.JTextArea Descripcion;
    private javax.swing.JTextField Escala;
    private javax.swing.JButton LimpiarCampos;
    private javax.swing.JComboBox<String> Linea;
    private javax.swing.JButton Lupa;
    private javax.swing.JTextField MSRP;
    private javax.swing.JButton Modificar;
    private javax.swing.JTextField Precio;
    private javax.swing.JTextField Stock;
    private javax.swing.JTable Tabla;
    private javax.swing.JTextField Vendedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nom;
    // End of variables declaration//GEN-END:variables
    
    public JTextField getCodigo() {
        return Codigo;
    }
    public JTextArea getDescripcion() {
        return Descripcion;
    }
    public JTextField getEscala() {
        return Escala;
    }
    public String getLinea() {
        return Linea.getItemAt(Linea.getSelectedIndex());
    }
    public JComboBox<String> getLin(){
        return Linea;
    }
    public JTextField getMSRP() {
        return MSRP;
    }
    public JTextField getNombre() {
        return nom;
    }
    public JTextField getPrecio() {
        return Precio;
    }
    public JTextField getStock() {
        return Stock;
    }
    public JTable getTabla() {
        return Tabla;
    }
    public JTextField getVendedor() {
        return Vendedor;
    }
    public JTextField getBuscar(){
        return Buscar;
    }
}