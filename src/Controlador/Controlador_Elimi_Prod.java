package Controlador;

import javax.swing.table.DefaultTableModel;

public class Controlador_Elimi_Prod {
    private static Eliminaciones.EliminarProductos vista = new Eliminaciones.EliminarProductos(); 
    
    public static void Mostrar(){
        vista.setTitle("ELIMINAR PRODUCTOS");
        vista.setVisible(true);
        Actualizar();
        Personalizacion.Personalizar.Tabla(vista.getTabla(),8);
    }
    public static void Eliminar(){
        DB.Sql.EliminarProducto(vista.getIndex());
        Actualizar();
        javax.swing.JOptionPane.showMessageDialog(null,"Producto eliminado");
    }
    private static void Actualizar(){
        DefaultTableModel tabla = (DefaultTableModel) vista.getTabla().getModel();
        tabla.setNumRows(0);
        for(Modelo.Producto i: DB.Sql.ObtenerActualizacionProducto(vista.getBuscar().getText()) ){
            tabla.addRow(new Object[]{i.getCodProduct(),i.getNombre(),i.getEscalaProduct(),i.getVendedor(),i.getDescripcion(),i.getCantStock(),i.getPrecio(),i.getMSRP(),i.getLineaProducto()});
        }
    }
}