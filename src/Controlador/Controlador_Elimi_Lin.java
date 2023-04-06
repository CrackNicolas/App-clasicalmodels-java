package Controlador;

import javax.swing.table.DefaultTableModel;

public class Controlador_Elimi_Lin {
    private static Eliminaciones.EliminarLineaProductos vista = new Eliminaciones.EliminarLineaProductos(); 
    
    public static void Mostrar(){
        vista.setTitle("ELIMINAR LINEA DE PRODUCTOS");
        vista.setVisible(true);
        Actualizar();
        Personalizacion.Personalizar.Tabla(vista.getTabla(),2);
    }
    public static void Eliminar(){
        DB.Sql.EliminarLineaP(vista.getIndex());
        Actualizar();
        javax.swing.JOptionPane.showMessageDialog(null,"Linea de producto eliminada");
    }
    public static void Actualizar(){
        DefaultTableModel tabla = (DefaultTableModel) vista.getTabla().getModel();
        tabla.setNumRows(0);
        for(Modelo.LineaDeProductos i: DB.Sql.ObtenerActualizacionLineaP(vista.getBuscar().getText()) ){
            tabla.addRow(new Object[]{i.getProductLinea(),i.getDescripcion(),i.getDescripcionHtml()});
        }
    }
}
