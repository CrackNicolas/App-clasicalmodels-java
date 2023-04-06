package Modificaciones;

import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class ModificarOficinas extends javax.swing.JFrame{
    
    public ModificarOficinas(){
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
        Ciudad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Telefono = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Dir1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Modificar = new javax.swing.JButton();
        LimpiarCampos = new javax.swing.JButton();
        Pais = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        CodigoPostal = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Dir2 = new javax.swing.JTextField();
        Estado = new javax.swing.JTextField();
        Territorio = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Buscar = new javax.swing.JTextField();
        Lupa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Tabla = new javax.swing.JTable(){     public boolean isCellEditable(int rowIndex, int colIndex){         return false;     } };
        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo oficina", "Ciudad", "Telefono", "Direccion 1", "Direccion 2", "Estado", "Pais", "Codigo postal", "Territorio"
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
        jLabel1.setText("Ciudad");

        Codigo.setBackground(new java.awt.Color(0, 0, 51));
        Codigo.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        Codigo.setForeground(new java.awt.Color(255, 255, 255));
        Codigo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel2.setBackground(new java.awt.Color(51, 255, 255));
        jLabel2.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText("Codigo");

        Ciudad.setBackground(new java.awt.Color(0, 0, 51));
        Ciudad.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        Ciudad.setForeground(new java.awt.Color(255, 255, 255));
        Ciudad.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel3.setBackground(new java.awt.Color(51, 255, 255));
        jLabel3.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setText("Telefono");

        jLabel4.setBackground(new java.awt.Color(51, 255, 255));
        jLabel4.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setText("Direccion 1");

        Telefono.setBackground(new java.awt.Color(0, 0, 51));
        Telefono.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        Telefono.setForeground(new java.awt.Color(255, 255, 255));
        Telefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel5.setBackground(new java.awt.Color(51, 255, 255));
        jLabel5.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel5.setText("Direccion 2");

        Dir1.setBackground(new java.awt.Color(0, 0, 51));
        Dir1.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        Dir1.setForeground(new java.awt.Color(255, 255, 255));
        Dir1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel6.setBackground(new java.awt.Color(51, 255, 255));
        jLabel6.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel6.setText("Estado");

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

        Pais.setBackground(new java.awt.Color(0, 0, 51));
        Pais.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        Pais.setForeground(new java.awt.Color(255, 255, 255));
        Pais.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel7.setBackground(new java.awt.Color(51, 255, 255));
        jLabel7.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel7.setText("Pais");

        CodigoPostal.setBackground(new java.awt.Color(0, 0, 51));
        CodigoPostal.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        CodigoPostal.setForeground(new java.awt.Color(255, 255, 255));
        CodigoPostal.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel8.setBackground(new java.awt.Color(51, 255, 255));
        jLabel8.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel8.setText("Codigo postal");

        Dir2.setBackground(new java.awt.Color(0, 0, 51));
        Dir2.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        Dir2.setForeground(new java.awt.Color(255, 255, 255));
        Dir2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        Estado.setBackground(new java.awt.Color(0, 0, 51));
        Estado.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        Estado.setForeground(new java.awt.Color(255, 255, 255));
        Estado.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        Territorio.setBackground(new java.awt.Color(0, 0, 51));
        Territorio.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        Territorio.setForeground(new java.awt.Color(255, 255, 255));
        Territorio.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel9.setBackground(new java.awt.Color(51, 255, 255));
        jLabel9.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel9.setText("Territorio");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Dir2, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Dir1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addComponent(Modificar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Estado)
                                .addComponent(Pais)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(CodigoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Territorio, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(0, 0, Short.MAX_VALUE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LimpiarCampos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Lupa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1015, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Buscar)
                            .addComponent(Lupa, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Codigo)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Dir1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Dir2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Estado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Pais, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CodigoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Territorio, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(LimpiarCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 387, Short.MAX_VALUE)
                        .addComponent(Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(1, 1, 1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMouseClicked
        DefaultTableModel datos = (DefaultTableModel) Tabla.getModel();       
        Codigo.setText(datos.getValueAt(Tabla.getSelectedRow(),0).toString());
        Ciudad.setText(datos.getValueAt(Tabla.getSelectedRow(),1).toString());
        Telefono.setText(datos.getValueAt(Tabla.getSelectedRow(),2).toString());
        Dir1.setText(datos.getValueAt(Tabla.getSelectedRow(),3).toString());
        Dir2.setText(datos.getValueAt(Tabla.getSelectedRow(),4).toString());
        Estado.setText(datos.getValueAt(Tabla.getSelectedRow(),5).toString());
        Pais.setText(datos.getValueAt(Tabla.getSelectedRow(),6).toString());
        CodigoPostal.setText(datos.getValueAt(Tabla.getSelectedRow(),7).toString());
        Territorio.setText(datos.getValueAt(Tabla.getSelectedRow(),8).toString());
    }//GEN-LAST:event_TablaMouseClicked

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        if(Tabla.getSelectedRow()>=0){
            if(Controlador.Controlador_Mod_Oficinas.Verificar()){
                if(Validaciones.Validar.ValidarLine(Ciudad.getText())){
                    javax.swing.JOptionPane.showMessageDialog(null,"Error en la ciudad solo se permiten letras");
                    Ciudad.requestFocus();
                }else if(Validaciones.Validar.ValidarTel(Telefono.getText())){
                    javax.swing.JOptionPane.showMessageDialog(null,"Error en el telefono solo se permiten numeros");
                    Telefono.requestFocus();
                }else if(Validaciones.Validar.ValidarCodigos(Dir1.getText())){
                    javax.swing.JOptionPane.showMessageDialog(null,"Error en la direccion 1 solo se permiten letras o numeros");
                    Dir1.requestFocus();
                }else if(Validaciones.Validar.ValidarLine(Pais.getText())){
                    javax.swing.JOptionPane.showMessageDialog(null,"Error en el pais solo se permiten letras");
                    Pais.requestFocus();
                }else if(Validaciones.Validar.ValidarInt(CodigoPostal.getText())){
                    javax.swing.JOptionPane.showMessageDialog(null,"Error en el codigo postal solo se permiten numeros");
                    CodigoPostal.requestFocus();
                }else if(Validaciones.Validar.ValidarCodigos(Territorio.getText())){
                    javax.swing.JOptionPane.showMessageDialog(null,"Error en el territorio solo se permiten letras o numeros");
                    Territorio.requestFocus();
                }else{
                    Controlador.Controlador_Mod_Oficinas.Modificar();
                }
            }else{
                javax.swing.JOptionPane.showMessageDialog(null,"Primero debe ingresar todos los datos");
            }
        }else{
            javax.swing.JOptionPane.showMessageDialog(null," Antes de modificar seleccione una oficina");
        }
    }//GEN-LAST:event_ModificarActionPerformed

    private void LimpiarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarCamposActionPerformed
        Controlador.Controlador_Mod_Oficinas.Limpiar();
    }//GEN-LAST:event_LimpiarCamposActionPerformed

    private void LupaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LupaActionPerformed
        Controlador.Controlador_Mod_Oficinas.Mostrar();
    }//GEN-LAST:event_LupaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Buscar;
    private javax.swing.JTextField Ciudad;
    private javax.swing.JTextField Codigo;
    private javax.swing.JTextField CodigoPostal;
    private javax.swing.JTextField Dir1;
    private javax.swing.JTextField Dir2;
    private javax.swing.JTextField Estado;
    private javax.swing.JButton LimpiarCampos;
    private javax.swing.JButton Lupa;
    private javax.swing.JButton Modificar;
    private javax.swing.JTextField Pais;
    private javax.swing.JTable Tabla;
    private javax.swing.JTextField Telefono;
    private javax.swing.JTextField Territorio;
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
    // End of variables declaration//GEN-END:variables
    
    public JTextField getCiudad() {
        return Ciudad;
    }
    public JTextField getCodigo() {
        return Codigo;
    }
    public JTextField getCodigoP() {
        return CodigoPostal;
    }
    public JTextField getDir1() {
        return Dir1;
    }
    public JTextField getDir2() {
        return Dir2;
    }
    public JTextField getEstado() {
        return Estado;
    }
    public JTextField getPais() {
        return Pais;
    }
    public JTable getTabla() {
        return Tabla;
    }
    public JTextField getTelefono() {
        return Telefono;
    }
    public JTextField getTerritorio() {
        return Territorio;
    }
    public JTextField getBuscar() {
        return Buscar;
    }
}