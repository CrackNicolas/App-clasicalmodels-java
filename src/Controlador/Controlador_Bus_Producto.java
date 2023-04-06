package Controlador;

import javax.swing.table.DefaultTableModel;

public class Controlador_Bus_Producto {
    private static Busquedas.BuscarProducto vista = new Busquedas.BuscarProducto(); 
    private static DefaultTableModel tabla = (DefaultTableModel) vista.getTabla().getModel();
    
    public static void Mostrar(){
        vista.setTitle("BUSCAR PRODUCTOS");
        vista.setVisible(true);
        Personalizacion.Personalizar.Tabla(vista.getTabla(),8);
    }
    private static void Limpiar(){
        vista.getNombre().setText("");
        vista.getCod().setText("");
        vista.getPrecio().setText("");
        vista.getLinea().setText("");
    }
    public static boolean Validar(){
        if(vista.getNombre().getText().isEmpty()&&vista.getCod().getText().isEmpty()&&vista.getPrecio().getText().isEmpty()&&vista.getLinea().getText().isEmpty()){
            javax.swing.JOptionPane.showMessageDialog(null," Coloque un dato para poder realizar la busqueda");
            return false;
        }
        return true;
    }
    public static void Buscar(){
        boolean band = false;
        tabla.setNumRows(0);
        for(Modelo.Producto i: DB.Sql.BuscarProducto(vista.getCod().getText(),vista.getPrecio().getText(),vista.getNombre().getText(),vista.getLinea().getText()) ){
            tabla.addRow(new Object[]{i.getCodProduct(),i.getNombre(),i.getEscalaProduct(),i.getVendedor(),i.getDescripcion(),i.getCantStock(),i.getPrecio(),i.getMSRP(),i.getLineaProducto()});
            band = true;
        }
        Limpiar();
        if(!band){
            javax.swing.JOptionPane.showMessageDialog(null," No se encontraron resultados");
        }
    }
    public static void Actualizar(){
        tabla.setNumRows(0);
        for(Modelo.Producto i: DB.Sql.ObtenerProducto()){
            tabla.addRow(new Object[]{i.getCodProduct(),i.getNombre(),i.getEscalaProduct(),i.getVendedor(),i.getDescripcion(),i.getCantStock(),i.getPrecio(),i.getMSRP(),i.getLineaProducto()});
        }
    }
}