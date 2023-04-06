package Busquedas;

import javax.swing.JTable;
import javax.swing.JTextField;

public class BuscarOficinas extends javax.swing.JFrame {
    private boolean band = true;
    
    public BuscarOficinas(){
        this.setContentPane(new Personalizacion.Fondo("/Imagenes/Fondo_principal.jpg"));
        this.setExtendedState(6);
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        Codigo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Direccion = new javax.swing.JTextField();
        Ciudad = new javax.swing.JTextField();
        Territorio = new javax.swing.JTextField();
        BuscarOficinas = new javax.swing.JButton();
        Configuracion2 = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 51));
        jLabel1.setText("Buscar por codigo");

        Codigo.setBackground(new java.awt.Color(0, 0, 51));
        Codigo.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        Codigo.setForeground(new java.awt.Color(255, 255, 255));

        Tabla = new javax.swing.JTable(){     public boolean isCellEditable(int rowIndex, int colIndex){         return false;     } };
        Tabla.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Ciudad", "Telefono", "Direccion 1", "Direccion 2", "Estado", "Pais", "Codigo Postal", "Territorio"
            }
        ));
        Tabla.getTableHeader().setResizingAllowed(false);
        Tabla.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(Tabla);

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 51));
        jLabel2.setText("Buscar por direccion");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 51));
        jLabel3.setText("Buscar por territorio");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 51));
        jLabel4.setText("Buscar por ciudad");

        Direccion.setBackground(new java.awt.Color(0, 0, 51));
        Direccion.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        Direccion.setForeground(new java.awt.Color(255, 255, 255));

        Ciudad.setBackground(new java.awt.Color(0, 0, 51));
        Ciudad.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        Ciudad.setForeground(new java.awt.Color(255, 255, 255));

        Territorio.setBackground(new java.awt.Color(0, 0, 51));
        Territorio.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        Territorio.setForeground(new java.awt.Color(255, 255, 255));

        BuscarOficinas.setBackground(new java.awt.Color(0, 0, 0));
        BuscarOficinas.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        BuscarOficinas.setForeground(new java.awt.Color(0, 153, 51));
        BuscarOficinas.setText("Presione para buscar");
        BuscarOficinas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BuscarOficinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarOficinasActionPerformed(evt);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel4)
                                .addGap(30, 30, 30)
                                .addComponent(Ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel2)
                                .addGap(6, 6, 6)
                                .addComponent(Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(Territorio, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(520, 520, 520)
                                .addComponent(Configuracion2)))
                        .addGap(6, 6, 6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BuscarOficinas, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1339, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Territorio, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addComponent(Configuracion2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BuscarOficinas)
                        .addContainerGap())
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1030, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BuscarOficinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarOficinasActionPerformed
        if(Controlador.Controlador_Bus_Oficinas.Validar()){
            Tabla.setVisible(true);
            Controlador.Controlador_Bus_Oficinas.Buscar();
        }
    }//GEN-LAST:event_BuscarOficinasActionPerformed

    private void Configuracion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Configuracion2ActionPerformed
        if(band){
            Controlador.Controlador_Bus_Oficinas.Actualizar();
        }
        Tabla.setVisible(band);
        band = !band;
    }//GEN-LAST:event_Configuracion2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BuscarOficinas;
    private javax.swing.JTextField Ciudad;
    private javax.swing.JTextField Codigo;
    private javax.swing.JButton Configuracion2;
    private javax.swing.JTextField Direccion;
    private javax.swing.JTable Tabla;
    private javax.swing.JTextField Territorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    
    public JTextField getCiudad() {
        return Ciudad;
    }
    public JTextField getCodigo() {
        return Codigo;
    }
    public JTextField getDireccion() {
        return Direccion;
    }
    public JTable getTabla() {
        return Tabla;
    }
    public JTextField getTerritorio() {
        return Territorio;
    }   
}