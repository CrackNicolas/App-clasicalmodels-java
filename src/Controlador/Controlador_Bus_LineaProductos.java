package Controlador;

import javax.swing.table.DefaultTableModel;

public class Controlador_Bus_LineaProductos {
    private static Busquedas.BuscarLineaProductos vista = new Busquedas.BuscarLineaProductos(); 
    private static DefaultTableModel tabla = (DefaultTableModel) vista.getTabla().getModel();
    
    public static void Mostrar(){
        vista.setTitle("BUSCAR LINEA DE PRODUCTOS");
        vista.setVisible(true);
        Personalizacion.Personalizar.Tabla(vista.getTabla(),2);
    }
    private static void Limpiar(){
        vista.getHtml().setText("");
        vista.getNombre().setText("");
    }
    public static boolean Validar(){
        if(vista.getHtml().getText().isEmpty()&&vista.getNombre().getText().isEmpty()){
            javax.swing.JOptionPane.showMessageDialog(null," Coloque un dato para poder realizar la busqueda");
            return false;
        }
        return true;
    }
    public static void Buscar(){
        boolean band = false;
        if(vista.getHtml().getText().isEmpty()){
            vista.getHtml().setText("null");
        }
        tabla.setNumRows(0);
        for(Modelo.LineaDeProductos i: DB.Sql.BuscarLineaProductos(vista.getNombre().getText(),vista.getHtml().getText())){
            tabla.addRow(new Object[]{i.getProductLinea(),i.getDescripcion(),i.getDescripcionHtml()});
            band = true;
        }
        Limpiar();
        if(!band){
            javax.swing.JOptionPane.showMessageDialog(null," No se encontraron resultados");
        }
    }
    public static void Actualizar(){
        tabla.setNumRows(0);
        for(Modelo.LineaDeProductos i: DB.Sql.ObtenerProductoLinea()){
            tabla.addRow(new Object[]{i.getProductLinea(),i.getDescripcion(),i.getDescripcionHtml()});
        }
    }
}