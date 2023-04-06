package Ventanas;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class CargarProductos extends javax.swing.JFrame {
    
    public CargarProductos() {
        this.setContentPane(new Personalizacion.Fondo("/Imagenes/Fondo_principal.jpg"));
        this.setExtendedState(6);
        initComponents();
        this.Eliminar.requestFocus();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Limpiar = new javax.swing.JButton();
        Guardar = new javax.swing.JButton();
        Modificar = new javax.swing.JButton();
        MostrarTabla = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        Aceptar = new javax.swing.JButton();
        Lista = new javax.swing.JComboBox<>();
        cod = new javax.swing.JTextField();
        nom = new javax.swing.JTextField();
        Escala = new javax.swing.JTextField();
        Vendedor = new javax.swing.JTextField();
        desc = new javax.swing.JTextField();
        Stock = new javax.swing.JTextField();
        Precio = new javax.swing.JTextField();
        MSRP = new javax.swing.JTextField();
        MostrarTabla1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Limpiar.setBackground(new java.awt.Color(0, 0, 0));
        Limpiar.setFont(new java.awt.Font("Dialog", 0, 34)); // NOI18N
        Limpiar.setForeground(new java.awt.Color(255, 153, 51));
        Limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/limpiar_norm.png"))); // NOI18N
        Limpiar.setBorder(null);
        Limpiar.setBorderPainted(false);
        Limpiar.setContentAreaFilled(false);
        Limpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Limpiar.setFocusPainted(false);
        Limpiar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/limpiar_press.png"))); // NOI18N
        Limpiar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/limpiar_roll.png"))); // NOI18N
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });

        Guardar.setBackground(new java.awt.Color(0, 0, 0));
        Guardar.setFont(new java.awt.Font("Dialog", 0, 34)); // NOI18N
        Guardar.setForeground(new java.awt.Color(255, 153, 51));
        Guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/save_norm.png"))); // NOI18N
        Guardar.setBorder(null);
        Guardar.setBorderPainted(false);
        Guardar.setContentAreaFilled(false);
        Guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Guardar.setFocusPainted(false);
        Guardar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/save_press.png"))); // NOI18N
        Guardar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/save_roll.png"))); // NOI18N
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });

        Modificar.setBackground(new java.awt.Color(0, 0, 0));
        Modificar.setFont(new java.awt.Font("Dialog", 0, 34)); // NOI18N
        Modificar.setForeground(new java.awt.Color(255, 153, 51));
        Modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/upd_norm.png"))); // NOI18N
        Modificar.setBorder(null);
        Modificar.setBorderPainted(false);
        Modificar.setContentAreaFilled(false);
        Modificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Modificar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/upd_press.png"))); // NOI18N
        Modificar.setRolloverEnabled(true);
        Modificar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/upd_roll.png"))); // NOI18N
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });

        MostrarTabla.setBackground(new java.awt.Color(0, 0, 0));
        MostrarTabla.setFont(new java.awt.Font("Dialog", 0, 34)); // NOI18N
        MostrarTabla.setForeground(new java.awt.Color(255, 153, 51));
        MostrarTabla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/folder 2.png"))); // NOI18N
        MostrarTabla.setBorder(null);
        MostrarTabla.setBorderPainted(false);
        MostrarTabla.setContentAreaFilled(false);
        MostrarTabla.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MostrarTabla.setFocusPainted(false);
        MostrarTabla.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/folder 1.png"))); // NOI18N
        MostrarTabla.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/folder 1.png"))); // NOI18N
        MostrarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarTablaActionPerformed(evt);
            }
        });

        Eliminar.setBackground(new java.awt.Color(0, 0, 0));
        Eliminar.setFont(new java.awt.Font("Dialog", 0, 34)); // NOI18N
        Eliminar.setForeground(new java.awt.Color(255, 153, 51));
        Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/eliminar_norm.png"))); // NOI18N
        Eliminar.setBorder(null);
        Eliminar.setBorderPainted(false);
        Eliminar.setContentAreaFilled(false);
        Eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Eliminar.setFocusPainted(false);
        Eliminar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/eliminar_press.png"))); // NOI18N
        Eliminar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/eliminar_roll.png"))); // NOI18N
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });

        Aceptar.setBackground(new java.awt.Color(0, 153, 153));
        Aceptar.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Aceptar.setForeground(new java.awt.Color(0, 0, 0));
        Aceptar.setText("Aceptar");
        Aceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarActionPerformed(evt);
            }
        });

        Lista.setBackground(new java.awt.Color(0, 0, 0));
        Lista.setFont(new java.awt.Font("Dialog", 1, 23)); // NOI18N
        Lista.setForeground(new java.awt.Color(153, 153, 153));

        cod.setBackground(new java.awt.Color(0, 0, 0));
        cod.setFont(new java.awt.Font("Dialog", 1, 23)); // NOI18N
        cod.setForeground(new java.awt.Color(153, 153, 153));
        cod.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cod.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                codFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                codFocusLost(evt);
            }
        });

        nom.setBackground(new java.awt.Color(0, 0, 0));
        nom.setFont(new java.awt.Font("Dialog", 1, 23)); // NOI18N
        nom.setForeground(new java.awt.Color(153, 153, 153));
        nom.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nom.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nomFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nomFocusLost(evt);
            }
        });

        Escala.setBackground(new java.awt.Color(0, 0, 0));
        Escala.setFont(new java.awt.Font("Dialog", 1, 23)); // NOI18N
        Escala.setForeground(new java.awt.Color(153, 153, 153));
        Escala.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Escala.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                EscalaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                EscalaFocusLost(evt);
            }
        });

        Vendedor.setBackground(new java.awt.Color(0, 0, 0));
        Vendedor.setFont(new java.awt.Font("Dialog", 1, 23)); // NOI18N
        Vendedor.setForeground(new java.awt.Color(153, 153, 153));
        Vendedor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Vendedor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                VendedorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                VendedorFocusLost(evt);
            }
        });

        desc.setBackground(new java.awt.Color(0, 0, 0));
        desc.setFont(new java.awt.Font("Dialog", 1, 23)); // NOI18N
        desc.setForeground(new java.awt.Color(153, 153, 153));
        desc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        desc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                descFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                descFocusLost(evt);
            }
        });

        Stock.setBackground(new java.awt.Color(0, 0, 0));
        Stock.setFont(new java.awt.Font("Dialog", 1, 23)); // NOI18N
        Stock.setForeground(new java.awt.Color(153, 153, 153));
        Stock.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Stock.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                StockFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                StockFocusLost(evt);
            }
        });

        Precio.setBackground(new java.awt.Color(0, 0, 0));
        Precio.setFont(new java.awt.Font("Dialog", 1, 23)); // NOI18N
        Precio.setForeground(new java.awt.Color(153, 153, 153));
        Precio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Precio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PrecioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                PrecioFocusLost(evt);
            }
        });

        MSRP.setBackground(new java.awt.Color(0, 0, 0));
        MSRP.setFont(new java.awt.Font("Dialog", 1, 23)); // NOI18N
        MSRP.setForeground(new java.awt.Color(153, 153, 153));
        MSRP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        MSRP.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                MSRPFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                MSRPFocusLost(evt);
            }
        });

        MostrarTabla1.setBackground(new java.awt.Color(0, 0, 0));
        MostrarTabla1.setFont(new java.awt.Font("Dialog", 0, 34)); // NOI18N
        MostrarTabla1.setForeground(new java.awt.Color(255, 153, 51));
        MostrarTabla1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/folder 2.png"))); // NOI18N
        MostrarTabla1.setBorder(null);
        MostrarTabla1.setBorderPainted(false);
        MostrarTabla1.setContentAreaFilled(false);
        MostrarTabla1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MostrarTabla1.setFocusPainted(false);
        MostrarTabla1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/folder 1.png"))); // NOI18N
        MostrarTabla1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/folder 1.png"))); // NOI18N
        MostrarTabla1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarTabla1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(738, 738, 738)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MSRP, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Precio, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Stock, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(desc, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Vendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Escala, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nom, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cod, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Lista, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(578, 578, 578)
                        .addComponent(MostrarTabla1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(450, 450, 450)
                        .addComponent(MostrarTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115)
                .addComponent(Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123)
                .addComponent(Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126)
                .addComponent(Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(90, 90, 90)
                .addComponent(cod, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(nom, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(Escala, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(Vendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(desc, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(Stock, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(Precio, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(MSRP, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(MostrarTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(Lista, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(Aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MostrarTabla1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        Controlador.Controlador_Productos.BotonGuardar();
    }//GEN-LAST:event_GuardarActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        Controlador.Controlador_Mod_Productos.Mostrar();
    }//GEN-LAST:event_ModificarActionPerformed

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
        Controlador.Controlador_Productos.Limpiar();
    }//GEN-LAST:event_LimpiarActionPerformed

    private void MostrarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarTablaActionPerformed
        Controlador.Controlador_Tablas.MostrarTablaProductos();
    }//GEN-LAST:event_MostrarTablaActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        Controlador.Controlador_Elimi_Prod.Mostrar();
    }//GEN-LAST:event_EliminarActionPerformed

    private void codFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_codFocusGained
        Personalizacion.Personalizar.Gained(cod,"Ingresa codigo del producto...");
    }//GEN-LAST:event_codFocusGained

    private void codFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_codFocusLost
        Personalizacion.Personalizar.Lost(cod,"Ingresa codigo del producto...");
    }//GEN-LAST:event_codFocusLost

    private void nomFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nomFocusGained
        Personalizacion.Personalizar.Gained(nom,"Ingresa nombre del producto...");
    }//GEN-LAST:event_nomFocusGained

    private void nomFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nomFocusLost
        Personalizacion.Personalizar.Lost(nom,"Ingresa nombre del producto...");
    }//GEN-LAST:event_nomFocusLost

    private void EscalaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EscalaFocusGained
        Personalizacion.Personalizar.Gained(Escala,"Ingresa escala del producto...");
    }//GEN-LAST:event_EscalaFocusGained

    private void EscalaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EscalaFocusLost
        Personalizacion.Personalizar.Lost(Escala,"Ingresa escala del producto...");
    }//GEN-LAST:event_EscalaFocusLost

    private void VendedorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_VendedorFocusGained
        Personalizacion.Personalizar.Gained(Vendedor,"Ingresa nombre del vendedor...");
    }//GEN-LAST:event_VendedorFocusGained

    private void VendedorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_VendedorFocusLost
        Personalizacion.Personalizar.Lost(Vendedor,"Ingresa nombre del vendedor...");
    }//GEN-LAST:event_VendedorFocusLost

    private void descFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_descFocusGained
        Personalizacion.Personalizar.Gained(desc,"Ingresa descripcion del producto...");
    }//GEN-LAST:event_descFocusGained

    private void descFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_descFocusLost
        Personalizacion.Personalizar.Lost(desc,"Ingresa descripcion del producto...");
    }//GEN-LAST:event_descFocusLost

    private void StockFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_StockFocusGained
        Personalizacion.Personalizar.Gained(Stock,"Ingresa cantidad de stock...");
    }//GEN-LAST:event_StockFocusGained

    private void StockFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_StockFocusLost
        Personalizacion.Personalizar.Lost(Stock,"Ingresa cantidad de stock...");
    }//GEN-LAST:event_StockFocusLost

    private void PrecioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PrecioFocusGained
        Personalizacion.Personalizar.Gained(Precio,"Ingresa precio del producto...");
    }//GEN-LAST:event_PrecioFocusGained

    private void PrecioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PrecioFocusLost
        Personalizacion.Personalizar.Lost(Precio,"Ingresa precio del producto...");
    }//GEN-LAST:event_PrecioFocusLost

    private void MSRPFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_MSRPFocusGained
        Personalizacion.Personalizar.Gained(MSRP,"Ingresa msrp del produtco...");
    }//GEN-LAST:event_MSRPFocusGained

    private void MSRPFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_MSRPFocusLost
        Personalizacion.Personalizar.Lost(MSRP,"Ingresa msrp del produtco...");
    }//GEN-LAST:event_MSRPFocusLost

    private void AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarActionPerformed
        if(Controlador.Controlador_Productos.Verificar()){
            if(Validaciones.Validar.ValidarCodigos(cod.getText())){
                javax.swing.JOptionPane.showMessageDialog(null,"Error en el codigo solo se permiten letras o numeros");
                cod.requestFocus();
            }else if(Validaciones.Validar.ValidarCodigos(nom.getText())){
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
                Controlador.Controlador_Productos.Desbloquear();
                Guardar.requestFocus();
                javax.swing.JOptionPane.showMessageDialog(null,"Datos del producto validos");
            }
        }else{
            javax.swing.JOptionPane.showMessageDialog(null,"Primero debe cargar todos los datos");
        }
    }//GEN-LAST:event_AceptarActionPerformed

    private void MostrarTabla1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarTabla1ActionPerformed
        Controlador.Controlador_Tablas.MostrarTablaProductos();
    }//GEN-LAST:event_MostrarTabla1ActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptar;
    private javax.swing.JButton Eliminar;
    private javax.swing.JTextField Escala;
    private javax.swing.JButton Guardar;
    private javax.swing.JButton Limpiar;
    private javax.swing.JComboBox<String> Lista;
    private javax.swing.JTextField MSRP;
    private javax.swing.JButton Modificar;
    private javax.swing.JButton MostrarTabla;
    private javax.swing.JButton MostrarTabla1;
    private javax.swing.JTextField Precio;
    private javax.swing.JTextField Stock;
    private javax.swing.JTextField Vendedor;
    private javax.swing.JTextField cod;
    private javax.swing.JTextField desc;
    private javax.swing.JTextField nom;
    // End of variables declaration//GEN-END:variables
    
    public JTextField getEscala() {
        return Escala;
    }
    public JTextField getMSRP() {
        return MSRP;
    }
    public JTextField getPrecio() {
        return Precio;
    }
    public JTextField getStock() {
        return Stock;
    }
    public JTextField getVendedor() {
        return Vendedor;
    }
    public JTextField getCod() {
        return cod;
    }
    public JTextField getDesc() {
        return desc;
    }
    public JTextField getNom() {
        return nom;
    }
    public JButton getGuardar() {
        return Guardar;
    }
    public JButton getLimpiar() {
        return Limpiar;
    }
    public String getItem(){
        return Lista.getItemAt(Lista.getSelectedIndex());
    }
    public JComboBox<String> getLista() {
        return Lista;
    }
}