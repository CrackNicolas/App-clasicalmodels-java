package Controlador;

public class Controlador_Mod_Clientes {
    private static Modificaciones.ModificarClientes vista = new Modificaciones.ModificarClientes(); 
    
    public static void Mostrar(){
        vista.setTitle("MODIFICAR CLIENTES");
        vista.setVisible(true);
        Personalizacion.Personalizar.Tabla(vista.getTabla(),11);
        DB.Sql.ActualizaClientesModificados(vista.getTabla(),vista.getBuscar().getText());
        Instanciar();
    }
    public static void Limpiar(){
        vista.getNroCliente().setText("");
        vista.getNombre().setText("");
        vista.getApellido().setText("");
        vista.getTelefono().setText("");
        vista.getCiudad().setText("");
        vista.getEstado().setText("");
        vista.getCredito().setText("");
        vista.getPais().setText("");
        vista.getDir1().setText("");
        vista.getDir2().setText("");
        vista.getCodPostal().setText("");
        vista.getBuscar().setText("");
        Instanciar();
    }
    public static void Modificar(){
        DB.Sql.ModificarCliente(vista.getBuscar().getText(),vista.getTabla(),vista.getVend(),vista.getPais().getText(),vista.getEstado().getText(),vista.getCredito().getText(),vista.getCodPostal().getText(),vista.getCiudad().getText(),vista.getDir1().getText(),vista.getDir2().getText(),vista.getTelefono().getText(),vista.getNombre().getText(),vista.getApellido().getText(),vista.getNroCliente().getText());
        Limpiar();
    }
    public static void CargarListas(String L){
        vista.getVendedores().removeAllItems();
        vista.getVendedores().addItem(L);
        for(Modelo.Empleados i:DB.Sql.ObtenerNroDeEmpleados()) {
            vista.getVendedores().addItem(Integer.toString(i.getNroEmpleado()));
        }
        ((javax.swing.JLabel)vista.getVendedores().getRenderer()).setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    }
    public static boolean Verificar(){
        return !(vista.getNroCliente().getText().isEmpty()&&vista.getNombre().getText().isEmpty()&&vista.getTelefono().getText().isEmpty()&&vista.getApellido().getText().isEmpty()&&vista.getEstado().getText().isEmpty()&&vista.getCiudad().getText().isEmpty());
    }
    public static void Instanciar(){
        vista.getVendedores().removeAllItems();
        vista.getVendedores().addItem("Seleccionar");
        ((javax.swing.JLabel)vista.getVendedores().getRenderer()).setHorizontalAlignment(javax.swing.SwingConstants.CENTER);   
    }
}