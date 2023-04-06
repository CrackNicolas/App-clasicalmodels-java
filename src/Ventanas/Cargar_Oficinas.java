package Ventanas;

import javax.swing.JButton;
import javax.swing.JTextField;

public class Cargar_Oficinas extends javax.swing.JFrame {
    
    public Cargar_Oficinas() {
        this.setContentPane(new Personalizacion.Fondo("/Imagenes/Fondo_principal.jpg"));
        this.setExtendedState(6);
        initComponents();
        this.Eliminar.requestFocus();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Territorio = new javax.swing.JTextField();
        Dir2 = new javax.swing.JTextField();
        Ciudad = new javax.swing.JTextField();
        Estado = new javax.swing.JTextField();
        cod = new javax.swing.JTextField();
        Limpiar = new javax.swing.JButton();
        Guardar = new javax.swing.JButton();
        Modificar = new javax.swing.JButton();
        MostrarTabla = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        Aceptar = new javax.swing.JButton();
        Dir1 = new javax.swing.JTextField();
        Telefono = new javax.swing.JTextField();
        Pais = new javax.swing.JTextField();
        CodigoPostal = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Territorio.setBackground(new java.awt.Color(0, 0, 0));
        Territorio.setFont(new java.awt.Font("Dialog", 1, 23)); // NOI18N
        Territorio.setForeground(new java.awt.Color(153, 153, 153));
        Territorio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Territorio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TerritorioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TerritorioFocusLost(evt);
            }
        });

        Dir2.setBackground(new java.awt.Color(0, 0, 0));
        Dir2.setFont(new java.awt.Font("Dialog", 1, 23)); // NOI18N
        Dir2.setForeground(new java.awt.Color(153, 153, 153));
        Dir2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Dir2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Dir2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Dir2FocusLost(evt);
            }
        });

        Ciudad.setBackground(new java.awt.Color(0, 0, 0));
        Ciudad.setFont(new java.awt.Font("Dialog", 1, 23)); // NOI18N
        Ciudad.setForeground(new java.awt.Color(153, 153, 153));
        Ciudad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Ciudad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CiudadFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                CiudadFocusLost(evt);
            }
        });

        Estado.setBackground(new java.awt.Color(0, 0, 0));
        Estado.setFont(new java.awt.Font("Dialog", 1, 23)); // NOI18N
        Estado.setForeground(new java.awt.Color(153, 153, 153));
        Estado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Estado.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                EstadoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                EstadoFocusLost(evt);
            }
        });

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

        Dir1.setBackground(new java.awt.Color(0, 0, 0));
        Dir1.setFont(new java.awt.Font("Dialog", 1, 23)); // NOI18N
        Dir1.setForeground(new java.awt.Color(153, 153, 153));
        Dir1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Dir1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Dir1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Dir1FocusLost(evt);
            }
        });

        Telefono.setBackground(new java.awt.Color(0, 0, 0));
        Telefono.setFont(new java.awt.Font("Dialog", 1, 23)); // NOI18N
        Telefono.setForeground(new java.awt.Color(153, 153, 153));
        Telefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Telefono.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TelefonoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TelefonoFocusLost(evt);
            }
        });

        Pais.setBackground(new java.awt.Color(0, 0, 0));
        Pais.setFont(new java.awt.Font("Dialog", 1, 23)); // NOI18N
        Pais.setForeground(new java.awt.Color(153, 153, 153));
        Pais.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Pais.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PaisFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                PaisFocusLost(evt);
            }
        });

        CodigoPostal.setBackground(new java.awt.Color(0, 0, 0));
        CodigoPostal.setFont(new java.awt.Font("Dialog", 1, 23)); // NOI18N
        CodigoPostal.setForeground(new java.awt.Color(153, 153, 153));
        CodigoPostal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CodigoPostal.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CodigoPostalFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                CodigoPostalFocusLost(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(695, 695, 695)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(cod)
                    .addComponent(Ciudad)
                    .addComponent(Telefono)
                    .addComponent(Dir1)
                    .addComponent(Dir2)
                    .addComponent(Estado)
                    .addComponent(Pais)
                    .addComponent(CodigoPostal)
                    .addComponent(Territorio)
                    .addComponent(Aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MostrarTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115)
                .addComponent(Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123)
                .addComponent(Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116)
                .addComponent(Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(880, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Modificar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Eliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 197, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(MostrarTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cod, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(Ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(Dir1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(Dir2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(Estado, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(Pais, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(CodigoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(Territorio, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(Aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(139, 139, 139))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        Controlador.Controlador_Oficina.BotonGuardar();
    }//GEN-LAST:event_GuardarActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        Controlador.Controlador_Mod_Oficinas.Mostrar();
    }//GEN-LAST:event_ModificarActionPerformed

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
        Controlador.Controlador_Oficina.Limpiar();
    }//GEN-LAST:event_LimpiarActionPerformed

    private void MostrarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarTablaActionPerformed
        Controlador.Controlador_Tablas.MostrarTablaOficinas();
    }//GEN-LAST:event_MostrarTablaActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        Controlador.Controlador_Elimi_Oficinas.Mostrar();
    }//GEN-LAST:event_EliminarActionPerformed

    private void AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarActionPerformed
        if(Controlador.Controlador_Oficina.Verificar()){
            Controlador.Controlador_Oficina.Vaciar();
            if(Validaciones.Validar.ValidarInt(cod.getText())){
                javax.swing.JOptionPane.showMessageDialog(null,"Error en el codigo de la oficina solo se permiten numeros");
                cod.requestFocus();
            }else if(Validaciones.Validar.ValidarLine(Ciudad.getText())){
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
            }else if(Validaciones.Validar.ValidarCodigos(CodigoPostal.getText())){
                javax.swing.JOptionPane.showMessageDialog(null,"Error en el codigo postal solo se permiten numeros");
                CodigoPostal.requestFocus();
            }else if(Validaciones.Validar.ValidarCodigos(Territorio.getText())){
                javax.swing.JOptionPane.showMessageDialog(null,"Error en el territorio solo se permiten letras o numeros");
                Territorio.requestFocus();
            }else{
                Controlador.Controlador_Oficina.Desbloquear();
                Guardar.transferFocus();
                javax.swing.JOptionPane.showMessageDialog(null,"Datos de la oficina validos");
            }
        }else{
            javax.swing.JOptionPane.showMessageDialog(null,"Primero debe ingresar todos los datos");
        }
    }//GEN-LAST:event_AceptarActionPerformed

    private void codFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_codFocusGained
        Personalizacion.Personalizar.Gained(cod,"Ingresar codigo de la oficina...");
    }//GEN-LAST:event_codFocusGained

    private void codFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_codFocusLost
        Personalizacion.Personalizar.Lost(cod,"Ingresar codigo de la oficina...");
    }//GEN-LAST:event_codFocusLost

    private void CiudadFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CiudadFocusGained
        Personalizacion.Personalizar.Gained(Ciudad,"Ingresar ciudad de la oficina...");
    }//GEN-LAST:event_CiudadFocusGained

    private void CiudadFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CiudadFocusLost
        Personalizacion.Personalizar.Lost(Ciudad,"Ingresar ciudad de la oficina...");
    }//GEN-LAST:event_CiudadFocusLost

    private void TelefonoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TelefonoFocusGained
        Personalizacion.Personalizar.Gained(Telefono,"Ingresar telefono de la oficina...");
    }//GEN-LAST:event_TelefonoFocusGained

    private void TelefonoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TelefonoFocusLost
        Personalizacion.Personalizar.Lost(Telefono,"Ingresar telefono de la oficina...");
    }//GEN-LAST:event_TelefonoFocusLost

    private void Dir1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Dir1FocusGained
        Personalizacion.Personalizar.Gained(Dir1,"Ingresar direccion 1 de la oficina...");
    }//GEN-LAST:event_Dir1FocusGained

    private void Dir1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Dir1FocusLost
        Personalizacion.Personalizar.Lost(Dir1,"Ingresar direccion 1 de la oficina...");
    }//GEN-LAST:event_Dir1FocusLost

    private void Dir2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Dir2FocusGained
        Personalizacion.Personalizar.Gained(Dir2,"Ingresar direccion 2 de la oficina...");
    }//GEN-LAST:event_Dir2FocusGained

    private void Dir2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Dir2FocusLost
        Personalizacion.Personalizar.Lost(Dir2,"Ingresar direccion 2 de la oficina...");
    }//GEN-LAST:event_Dir2FocusLost

    private void EstadoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EstadoFocusGained
        Personalizacion.Personalizar.Gained(Estado,"Ingresar estado de la oficina...");
    }//GEN-LAST:event_EstadoFocusGained

    private void EstadoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EstadoFocusLost
        Personalizacion.Personalizar.Lost(Estado,"Ingresar estado de la oficina...");
    }//GEN-LAST:event_EstadoFocusLost

    private void PaisFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PaisFocusGained
        Personalizacion.Personalizar.Gained(Pais,"Ingresar pais de la oficina...");
    }//GEN-LAST:event_PaisFocusGained

    private void PaisFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PaisFocusLost
        Personalizacion.Personalizar.Lost(Pais,"Ingresar pais de la oficina...");
    }//GEN-LAST:event_PaisFocusLost

    private void CodigoPostalFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CodigoPostalFocusGained
        Personalizacion.Personalizar.Gained(CodigoPostal,"Ingresar codigo postal de la oficina...");
    }//GEN-LAST:event_CodigoPostalFocusGained

    private void CodigoPostalFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CodigoPostalFocusLost
        Personalizacion.Personalizar.Lost(CodigoPostal,"Ingresar codigo postal de la oficina...");
    }//GEN-LAST:event_CodigoPostalFocusLost

    private void TerritorioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TerritorioFocusGained
        Personalizacion.Personalizar.Gained(Territorio,"Ingresar territorio de la oficina...");
    }//GEN-LAST:event_TerritorioFocusGained

    private void TerritorioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TerritorioFocusLost
        Personalizacion.Personalizar.Lost(Territorio,"Ingresar territorio de la oficina...");
    }//GEN-LAST:event_TerritorioFocusLost

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptar;
    private javax.swing.JTextField Ciudad;
    private javax.swing.JTextField CodigoPostal;
    private javax.swing.JTextField Dir1;
    private javax.swing.JTextField Dir2;
    private javax.swing.JButton Eliminar;
    private javax.swing.JTextField Estado;
    private javax.swing.JButton Guardar;
    private javax.swing.JButton Limpiar;
    private javax.swing.JButton Modificar;
    private javax.swing.JButton MostrarTabla;
    private javax.swing.JTextField Pais;
    private javax.swing.JTextField Telefono;
    private javax.swing.JTextField Territorio;
    private javax.swing.JTextField cod;
    // End of variables declaration//GEN-END:variables
    
    public JTextField getCiudad() {
        return Ciudad;
    }
    public JTextField getCodigoPostal() {
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
    public JTextField getTelefono() {
        return Telefono;
    }
    public JTextField getTerritorio() {
        return Territorio;
    }
    public JTextField getCod() {
        return cod;
    }
    public JButton getAceptar() {
        return Aceptar;
    }
    public JButton getEliminar() {
        return Eliminar;
    }
    public JButton getGuardar() {
        return Guardar;
    }
    public JButton getLimpiar() {
        return Limpiar;
    }
    public JButton getModificar() {
        return Modificar;
    }
    public JButton getMostrarTabla() {
        return MostrarTabla;
    }
}