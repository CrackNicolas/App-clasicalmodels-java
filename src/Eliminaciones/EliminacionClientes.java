package Eliminaciones;

import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class EliminacionClientes extends javax.swing.JFrame{
    private String index;
    
    public EliminacionClientes(){
        this.setExtendedState(6);
        initComponents();
        Buscar.requestFocus();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        BotonEliminar = new javax.swing.JButton();
        Buscar = new javax.swing.JTextField();
        Lupa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Tabla = new javax.swing.JTable(){     public boolean isCellEditable(int rowIndex, int colIndex){         return false;     } };
        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nro cliente", "Nombre", "Apellido", "Telefono", "Direccion 1", "Direccion 2", "Ciudad", "Estado civil", "Codigo postal", "Pais", "Rep de ventas", "Credito limite"
            }
        ));
        Tabla.getTableHeader().setResizingAllowed(false);
        Tabla.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(Tabla);

        BotonEliminar.setBackground(new java.awt.Color(0, 0, 0));
        BotonEliminar.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        BotonEliminar.setForeground(new java.awt.Color(0, 255, 255));
        BotonEliminar.setText("ELIMINAR");
        BotonEliminar.setBorder(null);
        BotonEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarActionPerformed(evt);
            }
        });

        Buscar.setBackground(new java.awt.Color(0, 0, 51));
        Buscar.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        Buscar.setForeground(new java.awt.Color(255, 255, 255));
        Buscar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                BuscarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                BuscarFocusLost(evt);
            }
        });

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
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BotonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1821, Short.MAX_VALUE)
                .addGap(1, 1, 1))
            .addGroup(layout.createSequentialGroup()
                .addComponent(Lupa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Buscar))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Buscar)
                    .addComponent(Lupa, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1006, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1))
                    .addComponent(BotonEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1006, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarActionPerformed
        DefaultTableModel datos = (DefaultTableModel) Tabla.getModel();
        if(Tabla.getSelectedRow()>=0){
            index = datos.getValueAt(Tabla.getSelectedRow(),0).toString();
            Controlador.Controlador_Elimi_Clientes.Eliminar();
        }else{
            javax.swing.JOptionPane.showMessageDialog(null," Antes de eliminar seleccione un cliente");
        }
    }//GEN-LAST:event_BotonEliminarActionPerformed

    private void LupaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LupaActionPerformed
        if(Buscar.getText().equals("Buscar...")){
            Buscar.setText("");
            Controlador.Controlador_Elimi_Clientes.Mostrar();
        }else{
            Controlador.Controlador_Elimi_Clientes.Mostrar();
        }
    }//GEN-LAST:event_LupaActionPerformed

    private void BuscarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BuscarFocusGained
        Personalizacion.Personalizar.Gained(Buscar,"Buscar...");
    }//GEN-LAST:event_BuscarFocusGained

    private void BuscarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BuscarFocusLost
        Personalizacion.Personalizar.Lost(Buscar,"Buscar...");
    }//GEN-LAST:event_BuscarFocusLost

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonEliminar;
    private javax.swing.JTextField Buscar;
    private javax.swing.JButton Lupa;
    private javax.swing.JTable Tabla;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    
    public String getIndex(){
        return index;
    }
    public JTable getTabla() {
        return Tabla;
    }
    public JTextField getBuscar() {
        return Buscar;
    }
}