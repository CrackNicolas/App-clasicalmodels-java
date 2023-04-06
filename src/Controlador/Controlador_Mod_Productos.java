package Controlador;

public class Controlador_Mod_Productos {
    private static Modificaciones.ModificarProductos vista = new Modificaciones.ModificarProductos(); 
    
    public static void Mostrar(){
        vista.setTitle("MODIFICAR PRODUCTOS");
        vista.setVisible(true);
        Personalizacion.Personalizar.Tabla(vista.getTabla(),8);
        DB.Sql.ActualizaProductosModificados(vista.getTabla(),vista.getBuscar().getText());
        Instancia();
    }
    public static void Limpiar(){
        vista.getCodigo().setText("");
        vista.getNombre().setText("");
        vista.getEscala().setText("");
        vista.getVendedor().setText("");
        vista.getDescripcion().setText("");
        vista.getPrecio().setText("");
        vista.getStock().setText("");
        vista.getMSRP().setText("");   
        vista.getBuscar().setText("");   
        Instancia();
    }
    public static void Modificar(){
        DB.Sql.ModificarProductos(vista.getBuscar().getText(),vista.getTabla(),vista.getLinea(),vista.getEscala().getText(),vista.getMSRP().getText(),vista.getVendedor().getText(),vista.getNombre().getText(),vista.getDescripcion().getText(),vista.getPrecio().getText(),vista.getStock().getText(),vista.getCodigo().getText());
        Limpiar();
    }
    public static void CargarListas(String L){
        vista.getLin().removeAllItems();
        vista.getLin().addItem(L);
        for(Modelo.LineaDeProductos i:DB.Sql.ObtenerNroDeLineasDeProductos()) {
            vista.getLin().addItem(i.getProductLinea());
        }
        ((javax.swing.JLabel)vista.getLin().getRenderer()).setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    }
    private static void Instancia(){
        vista.getLin().removeAllItems();
        vista.getLin().addItem("Seleccionar");
        ((javax.swing.JLabel)vista.getLin().getRenderer()).setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    }
    public static boolean Verificar(){
        return !(vista.getMSRP().getText().isEmpty()||vista.getStock().getText().isEmpty()||vista.getCodigo().getText().isEmpty()||vista.getNombre().getText().isEmpty()&&vista.getEscala().getText().isEmpty()&&vista.getVendedor().getText().isEmpty()&&vista.getDescripcion().getText().isEmpty()&&vista.getPrecio().getText().isEmpty());
    }
}