package Ventanas;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class Cargar_Clientes extends javax.swing.JFrame {
    
    public Cargar_Clientes() {
        this.setContentPane(new Personalizacion.Fondo("/Imagenes/Fondo_principal.jpg"));
        this.setExtendedState(6);
        initComponents();
        this.Eliminar.requestFocus();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Credito = new javax.swing.JTextField();
        Dir1 = new javax.swing.JTextField();
        nom = new javax.swing.JTextField();
        Dir2 = new javax.swing.JTextField();
        NroCliente = new javax.swing.JTextField();
        Limpiar = new javax.swing.JButton();
        Guardar = new javax.swing.JButton();
        Modificar = new javax.swing.JButton();
        MostrarTabla = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        Aceptar = new javax.swing.JButton();
        Telefono = new javax.swing.JTextField();
        Apellido = new javax.swing.JTextField();
        Ciudad = new javax.swing.JTextField();
        EstadoCivil = new javax.swing.JTextField();
        Pais = new javax.swing.JTextField();
        CodigoPostal = new javax.swing.JTextField();
        Representantes = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Credito.setBackground(new java.awt.Color(0, 0, 0));
        Credito.setFont(new java.awt.Font("Dialog", 1, 23)); // NOI18N
        Credito.setForeground(new java.awt.Color(153, 153, 153));
        Credito.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Credito.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CreditoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                CreditoFocusLost(evt);
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

        NroCliente.setBackground(new java.awt.Color(0, 0, 0));
        NroCliente.setFont(new java.awt.Font("Dialog", 1, 23)); // NOI18N
        NroCliente.setForeground(new java.awt.Color(153, 153, 153));
        NroCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        NroCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                NroClienteFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                NroClienteFocusLost(evt);
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

        Apellido.setBackground(new java.awt.Color(0, 0, 0));
        Apellido.setFont(new java.awt.Font("Dialog", 1, 23)); // NOI18N
        Apellido.setForeground(new java.awt.Color(153, 153, 153));
        Apellido.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Apellido.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ApellidoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ApellidoFocusLost(evt);
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

        EstadoCivil.setBackground(new java.awt.Color(0, 0, 0));
        EstadoCivil.setFont(new java.awt.Font("Dialog", 1, 23)); // NOI18N
        EstadoCivil.setForeground(new java.awt.Color(153, 153, 153));
        EstadoCivil.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        EstadoCivil.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                EstadoCivilFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                EstadoCivilFocusLost(evt);
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

        Representantes.setBackground(new java.awt.Color(0, 0, 0));
        Representantes.setFont(new java.awt.Font("Dialog", 1, 23)); // NOI18N
        Representantes.setForeground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MostrarTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115)
                        .addComponent(Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(123, 123, 123)
                        .addComponent(Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(116, 116, 116)
                        .addComponent(Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(695, 695, 695)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(NroCliente)
                            .addComponent(nom)
                            .addComponent(Apellido, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Telefono, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Dir1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Dir2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Ciudad, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(EstadoCivil, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Pais, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Representantes, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Credito, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
                            .addComponent(CodigoPostal, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Aceptar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addComponent(NroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nom, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Dir1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Dir2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(EstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Pais, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Representantes, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Credito, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(MostrarTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(CodigoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(Aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        Controlador.Controlador_Cliente.BotonGuardar();
    }//GEN-LAST:event_GuardarActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        Controlador.Controlador_Mod_Clientes.Mostrar();
    }//GEN-LAST:event_ModificarActionPerformed

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
        Controlador.Controlador_Cliente.Limpiar();
    }//GEN-LAST:event_LimpiarActionPerformed

    private void MostrarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarTablaActionPerformed
        Controlador.Controlador_Tablas.MostrarTablaClientes();
    }//GEN-LAST:event_MostrarTablaActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        Controlador.Controlador_Elimi_Clientes.Mostrar();
    }//GEN-LAST:event_EliminarActionPerformed

    private void AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarActionPerformed
        if(Controlador.Controlador_Cliente.Verificar()){
            Controlador.Controlador_Cliente.Vaciar();
            if(Validaciones.Validar.ValidarInt(NroCliente.getText())){
                javax.swing.JOptionPane.showMessageDialog(null,"Error en el nro de cliente solo se permiten numeros");
                NroCliente.requestFocus();
            }else if(Validaciones.Validar.ValidarLine(nom.getText())){
                javax.swing.JOptionPane.showMessageDialog(null,"Error en el nombre solo se permiten letras");
                nom.requestFocus();
            }else if(Validaciones.Validar.ValidarLine(Apellido.getText())){
                javax.swing.JOptionPane.showMessageDialog(null,"Error en el apellido solo se permiten letras");
                Apellido.requestFocus();
            }else if(Validaciones.Validar.ValidarTel(Telefono.getText())){
                javax.swing.JOptionPane.showMessageDialog(null,"Error en el telefono solo se permiten numeros");
                Telefono.requestFocus();
            }else if(Validaciones.Validar.ValidarCodigos(Dir1.getText())){
                javax.swing.JOptionPane.showMessageDialog(null,"Error en la direccion 1 solo se permiten letras o numeros");
                Dir1.requestFocus();
            }else if(Validaciones.Validar.ValidarCodigos(Ciudad.getText())){
                javax.swing.JOptionPane.showMessageDialog(null,"Error en la ciudad solo se permiten letras o numeros");
                Ciudad.requestFocus();
            }else if(Validaciones.Validar.ValidarLine(Pais.getText())){
                javax.swing.JOptionPane.showMessageDialog(null,"Error en la ciudad solo se permiten letras");
                Pais.requestFocus();
            }else if(Validaciones.Validar.ValidarFloat(Credito.getText())){
                javax.swing.JOptionPane.showMessageDialog(null,"Error en el credito solo se permiten numeros");
                Credito.requestFocus();
            }else if(Validaciones.Validar.ValidarCodigos(CodigoPostal.getText())){
                javax.swing.JOptionPane.showMessageDialog(null,"Error en el codigo postal solo se permiten numeros");
                CodigoPostal.requestFocus();
            }else{
                Controlador.Controlador_Cliente.Desbloquear();
                Guardar.requestFocus();
                javax.swing.JOptionPane.showMessageDialog(null,"Datos del cliente validos");
            }
        }else{
            javax.swing.JOptionPane.showMessageDialog(null,"Primero debe ingresar todos los datos");
        }
    }//GEN-LAST:event_AceptarActionPerformed

    private void NroClienteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NroClienteFocusGained
        Personalizacion.Personalizar.Gained(NroCliente,"Ingresar numero del cliente...");
    }//GEN-LAST:event_NroClienteFocusGained

    private void NroClienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NroClienteFocusLost
        Personalizacion.Personalizar.Lost(NroCliente,"Ingresar numero del cliente...");
    }//GEN-LAST:event_NroClienteFocusLost

    private void nomFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nomFocusGained
        Personalizacion.Personalizar.Gained(nom,"Ingresar nombre del cliente...");
    }//GEN-LAST:event_nomFocusGained

    private void nomFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nomFocusLost
        Personalizacion.Personalizar.Lost(nom,"Ingresar nombre del cliente...");
    }//GEN-LAST:event_nomFocusLost

    private void ApellidoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ApellidoFocusGained
        Personalizacion.Personalizar.Gained(Apellido,"Ingrese apellido del cliente...");
    }//GEN-LAST:event_ApellidoFocusGained

    private void ApellidoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ApellidoFocusLost
        Personalizacion.Personalizar.Lost(Apellido,"Ingrese apellido del cliente...");
    }//GEN-LAST:event_ApellidoFocusLost

    private void TelefonoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TelefonoFocusGained
        Personalizacion.Personalizar.Gained(Telefono,"Ingrese telefono del cliente...");
    }//GEN-LAST:event_TelefonoFocusGained

    private void TelefonoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TelefonoFocusLost
        Personalizacion.Personalizar.Lost(Telefono,"Ingrese telefono del cliente...");
    }//GEN-LAST:event_TelefonoFocusLost

    private void Dir1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Dir1FocusGained
        Personalizacion.Personalizar.Gained(Dir1,"Ingrese direccion 1 del cliente...");
    }//GEN-LAST:event_Dir1FocusGained

    private void Dir1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Dir1FocusLost
        Personalizacion.Personalizar.Lost(Dir1,"Ingrese direccion 1 del cliente...");
    }//GEN-LAST:event_Dir1FocusLost

    private void Dir2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Dir2FocusGained
        Personalizacion.Personalizar.Gained(Dir2,"Ingrese direccion 2 del cliente...");
    }//GEN-LAST:event_Dir2FocusGained

    private void Dir2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Dir2FocusLost
        Personalizacion.Personalizar.Lost(Dir2,"Ingrese direccion 2 del cliente...");
    }//GEN-LAST:event_Dir2FocusLost

    private void CiudadFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CiudadFocusGained
        Personalizacion.Personalizar.Gained(Ciudad,"Ingrese ciudad del cliente...");
    }//GEN-LAST:event_CiudadFocusGained

    private void CiudadFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CiudadFocusLost
        Personalizacion.Personalizar.Lost(Ciudad,"Ingrese ciudad del cliente...");
    }//GEN-LAST:event_CiudadFocusLost

    private void EstadoCivilFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EstadoCivilFocusGained
        Personalizacion.Personalizar.Gained(EstadoCivil,"Ingrese estado del cliente...");
    }//GEN-LAST:event_EstadoCivilFocusGained

    private void EstadoCivilFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EstadoCivilFocusLost
        Personalizacion.Personalizar.Lost(EstadoCivil,"Ingrese estado del cliente...");
    }//GEN-LAST:event_EstadoCivilFocusLost

    private void PaisFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PaisFocusGained
        Personalizacion.Personalizar.Gained(Pais,"Ingrese pais del cliente...");
    }//GEN-LAST:event_PaisFocusGained

    private void PaisFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PaisFocusLost
        Personalizacion.Personalizar.Lost(Pais,"Ingrese pais del cliente...");
    }//GEN-LAST:event_PaisFocusLost

    private void CreditoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CreditoFocusGained
        Personalizacion.Personalizar.Gained(Credito,"Ingrese credito limite del cliente...");
    }//GEN-LAST:event_CreditoFocusGained

    private void CreditoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CreditoFocusLost
        Personalizacion.Personalizar.Lost(Credito,"Ingrese credito limite del cliente...");
    }//GEN-LAST:event_CreditoFocusLost

    private void CodigoPostalFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CodigoPostalFocusGained
        Personalizacion.Personalizar.Gained(CodigoPostal,"Ingrese codigo postal del cliente...");
    }//GEN-LAST:event_CodigoPostalFocusGained

    private void CodigoPostalFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CodigoPostalFocusLost
        Personalizacion.Personalizar.Lost(CodigoPostal,"Ingrese codigo postal del cliente...");
    }//GEN-LAST:event_CodigoPostalFocusLost
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptar;
    private javax.swing.JTextField Apellido;
    private javax.swing.JTextField Ciudad;
    private javax.swing.JTextField CodigoPostal;
    private javax.swing.JTextField Credito;
    private javax.swing.JTextField Dir1;
    private javax.swing.JTextField Dir2;
    private javax.swing.JButton Eliminar;
    private javax.swing.JTextField EstadoCivil;
    private javax.swing.JButton Guardar;
    private javax.swing.JButton Limpiar;
    private javax.swing.JButton Modificar;
    private javax.swing.JButton MostrarTabla;
    private javax.swing.JTextField NroCliente;
    private javax.swing.JTextField Pais;
    private javax.swing.JComboBox<String> Representantes;
    private javax.swing.JTextField Telefono;
    private javax.swing.JTextField nom;
    // End of variables declaration//GEN-END:variables
    
    public JTextField getApellido() {
        return Apellido;
    }
    public JTextField getCiudad() {
        return Ciudad;
    }
    public JTextField getCredito() {
        return Credito;
    }
    public JTextField getDir1() {
        return Dir1;
    }
    public JTextField getDir2() {
        return Dir2;
    }
    public JTextField getEstadoCivil() {
        return EstadoCivil;
    }
    public JTextField getNroCliente() {
        return NroCliente;
    }
    public JTextField getPais() {
        return Pais;
    }
    public String getRepVendedor(){
        return Representantes.getItemAt(Representantes.getSelectedIndex());
    }
    public JTextField getTelefono() {
        return Telefono;
    }
    public JTextField getNom() {
        return nom;
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
    public JTextField getCodigoPostal() {
        return CodigoPostal;
    }
    public JComboBox<String> getRep() {
        return Representantes;
    }
}