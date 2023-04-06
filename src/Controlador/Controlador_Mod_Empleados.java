package Controlador;

public class Controlador_Mod_Empleados {
    private static Modificaciones.ModificarEmpleados vista = new Modificaciones.ModificarEmpleados(); 
    
    public static void Mostrar(){
        vista.setTitle("MODIFICAR EMPLEADOS");
        vista.setVisible(true);
        Personalizacion.Personalizar.Tabla(vista.getTabla(),6);
        DB.Sql.ActualizaEmpleadosModificados(vista.getTabla(),vista.getBuscar().getText());
        Instanciar();
    }
    public static void Limpiar(){
        vista.getNroEmpleado().setText("");
        vista.getApellido().setText("");
        vista.getNombre().setText("");
        vista.getEstencion().setText("");
        vista.getTitulo().setText("");
        vista.getEmail().setText("");
        vista.getBuscar().setText("");
        Instanciar();
    }
    public static void Modificar(){
        DB.Sql.ModificarEmpleado(vista.getBuscar().getText(),vista.getTabla(),vista.getApellido().getText(),vista.getNombre().getText(),vista.getEstencion().getText(),vista.getReportes(),vista.getOficinas(),vista.getTitulo().getText(),vista.getEmail().getText(),vista.getNroEmpleado().getText());
        Limpiar();
    }
    public static void CargarRepresentantes(String L){
        vista.getRep().removeAllItems();
        vista.getRep().addItem(L);
        for(Modelo.Empleados i:DB.Sql.ObtenerNroDeEmpleados()) {
            vista.getRep().addItem(Integer.toString(i.getNroEmpleado()));
        }
        ((javax.swing.JLabel)vista.getRep().getRenderer()).setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    }
    public static void CargarOficinas(String L){
        vista.getOfi().removeAllItems();
        vista.getOfi().addItem(L);
        for(Modelo.Oficinas i:DB.Sql.ObtenerNroDeOficinas()) {
            vista.getOfi().addItem(i.getCodOffic());
        }
        ((javax.swing.JLabel)vista.getOfi().getRenderer()).setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    }
    public static boolean Verificar(){
        return !(vista.getNroEmpleado().getText().isEmpty()&&vista.getApellido().getText().isEmpty()&&vista.getEstencion().getText().isEmpty()&&vista.getNombre().getText().isEmpty()&&vista.getEmail().getText().isEmpty()&&vista.getTitulo().getText().isEmpty());
    }
    private static void Instanciar(){
        vista.getRep().removeAllItems();
        vista.getRep().addItem("Seleccionar");
        ((javax.swing.JLabel)vista.getRep().getRenderer()).setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vista.getOfi().removeAllItems();
        vista.getOfi().addItem("Seleccionar");
        ((javax.swing.JLabel)vista.getOfi().getRenderer()).setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    }
}