package Controlador;
public class Controlador_Empleado {
    private static Ventanas.Cargar_Empleados vista = new Ventanas.Cargar_Empleados();
    
    public static void BotonGuardar(){
        Modelo.Empleados empleado = new Modelo.Empleados();
        empleado.setNroEmpleado(Integer.parseInt(vista.getNroEmpleado().getText()));
        empleado.setApellido(vista.getApellido().getText());
        empleado.setNombre(vista.getNombre().getText());
        empleado.setExtencion(vista.getExtencion().getText());
        empleado.setEmail(vista.getEmail().getText());
        empleado.setCodOffic(vista.getCodOficina());
        empleado.setTituloProf(vista.getTituloP().getText());
        if(vista.getList2().getSelectedItem().equals("null")){
            empleado.setJefe(0);
        }else{
            empleado.setJefe(Integer.parseInt(vista.getInformes()));
        }
        DB.Sql.AgregarEmpleados(empleado);
        Limpiar();
    }
    public static void Mostrar(){
        vista.setTitle("REGISTRO DE EMPLEADOS");
        vista.setVisible(true);
        CargarOficinas();
        CargarJefes();
        Bloquear();
        Instanciar();
    }
    public static void Limpiar(){
        vista.getApellido().setText(""); 
        vista.getTituloP().setText("");
        vista.getNroEmpleado().setText(""); 
        vista.getNombre().setText(""); 
        vista.getExtencion().setText(""); 
        vista.getEmail().setText("");
        CargarOficinas();
        CargarJefes();
        Bloquear();
        Instanciar();
        DesbloquearText();
    }
    public static void Instanciar(){
        vista.getApellido().setText("Ingresar apellido de empleado..."); 
        vista.getTituloP().setText("Ingresar titulo de empleado...");
        vista.getNroEmpleado().setText("Ingresar numero de empleado..."); 
        vista.getNombre().setText("Ingresar nombre de empleado..."); 
        vista.getExtencion().setText("Ingresar extencion de empleado..."); 
        vista.getEmail().setText("Ingresar email de empleado...");
    }
    private static void Bloquear(){
        vista.getGuardar().setEnabled(false);
        vista.getLimpiar().setEnabled(false);
    }
    public static void Desbloquear(){
        vista.getGuardar().setEnabled(true);
        vista.getLimpiar().setEnabled(true);
        BloquearText();
    }
    private static void CargarOficinas(){
        vista.getList1().removeAllItems();
        vista.getList1().addItem("Seleccionar codigo oficina");
        for(Modelo.Oficinas i:DB.Sql.ObtenerNroDeOficinas()) {
            vista.getList1().addItem(i.getCodOffic());
        }
        ((javax.swing.JLabel)vista.getList1().getRenderer()).setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    }
    private static void CargarJefes(){
        vista.getList2().removeAllItems();
        vista.getList2().addItem("Seleccionar numero de vendedor");
        vista.getList2().addItem("null");
        for(Modelo.Empleados i:DB.Sql.ObtenerNroDeEmpleados()){
            vista.getList2().addItem(Integer.toString(i.getNroEmpleado()));
        }
        ((javax.swing.JLabel)vista.getList2().getRenderer()).setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    }
    public static boolean Verificar(){
        return !(vista.getList2().getSelectedItem().equals("Seleccionar numero de vendedor")||vista.getList1().getSelectedItem().equals("Seleccionar codigo oficina")||vista.getNroEmpleado().getText().equals("Ingresar numero de empleado...")||vista.getApellido().getText().equals("Ingresar apellido de empleado...")||vista.getNombre().getText().equals("Ingresar nombre de empleado...")||vista.getExtencion().getText().equals("Ingresar extencion de empleado...")||vista.getEmail().getText().equals("Ingresar email de empleado...")||vista.getTituloP().getText().equals("Ingresar titulo de empleado..."));        
    }  
    private static void BloquearText(){
        vista.getApellido().setEnabled(false);
        vista.getTituloP().setEnabled(false);
        vista.getNroEmpleado().setEnabled(false);
        vista.getNombre().setEnabled(false);
        vista.getExtencion().setEnabled(false);
        vista.getEmail().setEnabled(false);
    }
    private static void DesbloquearText(){
        vista.getApellido().setEnabled(true);
        vista.getTituloP().setEnabled(true);
        vista.getNroEmpleado().setEnabled(true);
        vista.getNombre().setEnabled(true);
        vista.getExtencion().setEnabled(true);
        vista.getEmail().setEnabled(true);
    }
}