package Ventanas;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class Cargar_Empleados extends javax.swing.JFrame {
    
    public Cargar_Empleados() {
        this.setContentPane(new Personalizacion.Fondo("/Imagenes/Fondo_principal.jpg"));
        this.setExtendedState(6);
        initComponents();
        this.Eliminar.requestFocus();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Email = new javax.swing.JTextField();
        Apellido = new javax.swing.JTextField();
        NroEmpleado = new javax.swing.JTextField();
        Limpiar = new javax.swing.JButton();
        Guardar = new javax.swing.JButton();
        Modificar = new javax.swing.JButton();
        MostrarTabla = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        Aceptar = new javax.swing.JButton();
        Extencion = new javax.swing.JTextField();
        Nombre = new javax.swing.JTextField();
        TituloP = new javax.swing.JTextField();
        Lista1 = new javax.swing.JComboBox<>();
        Lista2 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Email.setBackground(new java.awt.Color(0, 0, 0));
        Email.setFont(new java.awt.Font("Dialog", 1, 23)); // NOI18N
        Email.setForeground(new java.awt.Color(153, 153, 153));
        Email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                EmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                EmailFocusLost(evt);
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

        NroEmpleado.setBackground(new java.awt.Color(0, 0, 0));
        NroEmpleado.setFont(new java.awt.Font("Dialog", 1, 23)); // NOI18N
        NroEmpleado.setForeground(new java.awt.Color(153, 153, 153));
        NroEmpleado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        NroEmpleado.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                NroEmpleadoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                NroEmpleadoFocusLost(evt);
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

        Extencion.setBackground(new java.awt.Color(0, 0, 0));
        Extencion.setFont(new java.awt.Font("Dialog", 1, 23)); // NOI18N
        Extencion.setForeground(new java.awt.Color(153, 153, 153));
        Extencion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Extencion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ExtencionFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ExtencionFocusLost(evt);
            }
        });

        Nombre.setBackground(new java.awt.Color(0, 0, 0));
        Nombre.setFont(new java.awt.Font("Dialog", 1, 23)); // NOI18N
        Nombre.setForeground(new java.awt.Color(153, 153, 153));
        Nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Nombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                NombreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                NombreFocusLost(evt);
            }
        });

        TituloP.setBackground(new java.awt.Color(0, 0, 0));
        TituloP.setFont(new java.awt.Font("Dialog", 1, 23)); // NOI18N
        TituloP.setForeground(new java.awt.Color(153, 153, 153));
        TituloP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TituloP.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TituloPFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TituloPFocusLost(evt);
            }
        });

        Lista1.setBackground(new java.awt.Color(0, 0, 0));
        Lista1.setFont(new java.awt.Font("Dialog", 1, 23)); // NOI18N
        Lista1.setForeground(new java.awt.Color(153, 153, 153));

        Lista2.setBackground(new java.awt.Color(0, 0, 0));
        Lista2.setFont(new java.awt.Font("Dialog", 1, 23)); // NOI18N
        Lista2.setForeground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addGap(699, 699, 699)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NroEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Extencion, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Lista1, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Lista2, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(Aceptar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(TituloP, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)))
                                .addGap(553, 553, 553)
                                .addComponent(MostrarTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(795, 795, 795))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(NroEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(Extencion, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(Lista1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(Lista2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(TituloP, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(Aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MostrarTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        Controlador.Controlador_Empleado.BotonGuardar();
    }//GEN-LAST:event_GuardarActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        Controlador.Controlador_Mod_Empleados.Mostrar();
    }//GEN-LAST:event_ModificarActionPerformed

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
        Controlador.Controlador_Empleado.Limpiar();
    }//GEN-LAST:event_LimpiarActionPerformed

    private void MostrarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarTablaActionPerformed
        Controlador.Controlador_Tablas.MostrarTablaEmpleados();
    }//GEN-LAST:event_MostrarTablaActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        Controlador.Controlador_Elimi_Empleado.Mostrar();
    }//GEN-LAST:event_EliminarActionPerformed

    private void AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarActionPerformed
        if(Controlador.Controlador_Empleado.Verificar()){
            if(Validaciones.Validar.ValidarInt(NroEmpleado.getText())){
                javax.swing.JOptionPane.showMessageDialog(null,"Error en el nro de empleado solo se permiten numeros");
                NroEmpleado.requestFocus();
            }else if(Validaciones.Validar.ValidarLine(Apellido.getText())){
                javax.swing.JOptionPane.showMessageDialog(null,"Error en el apellido solo se permiten letras");
                Apellido.requestFocus();
            }else if(Validaciones.Validar.ValidarLine(Nombre.getText())){
                javax.swing.JOptionPane.showMessageDialog(null,"Error en el nombre solo se permiten letras");
                Nombre.requestFocus();
            }else if(Validaciones.Validar.ValidarCodigos(Extencion.getText())){
                javax.swing.JOptionPane.showMessageDialog(null,"Error en la extencion solo se permiten letras o numeros");
                Extencion.requestFocus();
            }else if(Validaciones.Validar.ValidarEmail(Email.getText())){
                javax.swing.JOptionPane.showMessageDialog(null,"Error en el email solo se permiten letras o numeros");
                Email.requestFocus();
            }else if(Validaciones.Validar.ValidarLine(TituloP.getText())){
                javax.swing.JOptionPane.showMessageDialog(null,"Error en el titulo solo se permiten letras");
                TituloP.requestFocus();
            }else{
                Controlador.Controlador_Empleado.Desbloquear();
                Guardar.requestFocus();
                javax.swing.JOptionPane.showMessageDialog(null,"Datos del empleado validos");
            }
        }else{
            javax.swing.JOptionPane.showMessageDialog(null,"Primero debe ingresar todos los datos");
        }
    }//GEN-LAST:event_AceptarActionPerformed

    private void NroEmpleadoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NroEmpleadoFocusGained
        Personalizacion.Personalizar.Gained(NroEmpleado,"Ingresar numero de empleado...");
    }//GEN-LAST:event_NroEmpleadoFocusGained

    private void NroEmpleadoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NroEmpleadoFocusLost
        Personalizacion.Personalizar.Lost(NroEmpleado,"Ingresar numero de empleado...");
    }//GEN-LAST:event_NroEmpleadoFocusLost

    private void ApellidoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ApellidoFocusLost
        Personalizacion.Personalizar.Lost(Apellido,"Ingresar apellido de empleado...");
    }//GEN-LAST:event_ApellidoFocusLost

    private void ApellidoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ApellidoFocusGained
        Personalizacion.Personalizar.Gained(Apellido,"Ingresar apellido de empleado...");
    }//GEN-LAST:event_ApellidoFocusGained

    private void NombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NombreFocusGained
        Personalizacion.Personalizar.Gained(Nombre,"Ingresar nombre de empleado...");
    }//GEN-LAST:event_NombreFocusGained

    private void NombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NombreFocusLost
        Personalizacion.Personalizar.Lost(Nombre,"Ingresar nombre de empleado...");
    }//GEN-LAST:event_NombreFocusLost

    private void ExtencionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ExtencionFocusGained
        Personalizacion.Personalizar.Gained(Extencion,"Ingresar extencion de empleado...");
    }//GEN-LAST:event_ExtencionFocusGained

    private void ExtencionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ExtencionFocusLost
        Personalizacion.Personalizar.Lost(Extencion,"Ingresar extencion de empleado...");
    }//GEN-LAST:event_ExtencionFocusLost

    private void EmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EmailFocusGained
        Personalizacion.Personalizar.Gained(Email,"Ingresar email de empleado...");
    }//GEN-LAST:event_EmailFocusGained

    private void EmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EmailFocusLost
        Personalizacion.Personalizar.Lost(Email,"Ingresar email de empleado...");
    }//GEN-LAST:event_EmailFocusLost

    private void TituloPFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TituloPFocusGained
        Personalizacion.Personalizar.Gained(TituloP,"Ingresar titulo de empleado...");
    }//GEN-LAST:event_TituloPFocusGained

    private void TituloPFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TituloPFocusLost
        Personalizacion.Personalizar.Lost(TituloP,"Ingresar titulo de empleado...");
    }//GEN-LAST:event_TituloPFocusLost
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptar;
    private javax.swing.JTextField Apellido;
    private javax.swing.JButton Eliminar;
    private javax.swing.JTextField Email;
    private javax.swing.JTextField Extencion;
    private javax.swing.JButton Guardar;
    private javax.swing.JButton Limpiar;
    private javax.swing.JComboBox<String> Lista1;
    private javax.swing.JComboBox<String> Lista2;
    private javax.swing.JButton Modificar;
    private javax.swing.JButton MostrarTabla;
    private javax.swing.JTextField Nombre;
    private javax.swing.JTextField NroEmpleado;
    private javax.swing.JTextField TituloP;
    // End of variables declaration//GEN-END:variables
    public JButton getAceptar() {
        return Aceptar;
    }
    public JTextField getApellido() {
        return Apellido;
    }
    public JButton getEliminar() {
        return Eliminar;
    }
    public JTextField getEmail() {
        return Email;
    }
    public JTextField getExtencion() {
        return Extencion;
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
    public JTextField getNombre() {
        return Nombre;
    }
    public JTextField getNroEmpleado() {
        return NroEmpleado;
    }
    public JTextField getTituloP() {
        return TituloP;
    }
    public String getCodOficina(){
        return Lista1.getItemAt(Lista1.getSelectedIndex());
    }
    public String getInformes(){
        return Lista2.getItemAt(Lista2.getSelectedIndex());
    }
    public JComboBox<String> getList1() {
        return Lista1;
    }
    public JComboBox<String> getList2() {
        return Lista2;
    }
}