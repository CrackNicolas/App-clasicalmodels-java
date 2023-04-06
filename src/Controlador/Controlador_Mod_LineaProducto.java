package Controlador;

public class Controlador_Mod_LineaProducto {
    private static Modificaciones.ModificarLineaProductos vista = new Modificaciones.ModificarLineaProductos(); 
    
    public static void Mostrar(){
        vista.setTitle("MODIFICAR LINEA DE PRODUCTOS");
        vista.setVisible(true);
        Personalizacion.Personalizar.Tabla(vista.getTabla(),2);
        DB.Sql.ActualizarDatosModificados(vista.getTabla(),vista.getBuscar().getText());
    }
    public static void Limpiar(){
        vista.getLinea().setText("");
        vista.getDesc().setText("");
        vista.getDescHtml().setText("");
        vista.getBuscar().setText("");
    }
    public static void Modificar(){
        DB.Sql.ModificarLineaProductos(vista.getBuscar().getText(),vista.getTabla(),vista.getLinea().getText(),vista.getDesc().getText(),vista.getDescHtml().getText());
        Limpiar();
    }
}