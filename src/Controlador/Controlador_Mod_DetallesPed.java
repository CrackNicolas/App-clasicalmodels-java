package Controlador;

public class Controlador_Mod_DetallesPed {
    private static Modificaciones.ModificarDetallesPedidos vista = new Modificaciones.ModificarDetallesPedidos(); 
    
    public static void Mostrar(){
        vista.setTitle("MODIFICAR DETALLES DEL PEDIDO");
        vista.setVisible(true);
        Personalizacion.Personalizar.Tabla(vista.getTabla(),3);
        DB.Sql.ActualizaDetallesPedModificados(vista.getTabla(),vista.getBuscar().getText());
        Instanciar();
    }
    public static void Modificar(){
        DB.Sql.ModificarDetallesPedidos(vista.getBuscar().getText(),vista.getTabla(),vista.getCodigo(),vista.getCantidad().getText(),vista.getPrecio().getText(),vista.getNroOrden().getText());
        Limpiar();
    }
    public static void CargarCodigos(String L){
        vista.getCod().removeAllItems();
        vista.getCod().addItem(L);
        for(Modelo.Producto i:DB.Sql.ObtenerCodProductos()) {
            vista.getCod().addItem(i.getCodProduct());
        }
        ((javax.swing.JLabel)vista.getCod().getRenderer()).setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    }
    public static void Limpiar(){
        vista.getNroOrden().setText("");
        vista.getCantidad().setText("");
        vista.getPrecio().setText("");
        vista.getBuscar().setText("");
        Instanciar();
    }
    public static boolean Verificar(){
        return !(vista.getPrecio().getText().isEmpty()&&vista.getCantidad().getText().isEmpty());
    }
    private static void Instanciar(){
        vista.getCod().removeAllItems();
        vista.getCod().addItem("Seleccinar");
        ((javax.swing.JLabel)vista.getCod().getRenderer()).setHorizontalAlignment(javax.swing.SwingConstants.CENTER);  
    }
}