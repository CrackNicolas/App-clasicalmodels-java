package Controlador;

import javax.swing.table.DefaultTableModel;

public class Controlador_Elimi_DetallesPed {
    private static Eliminaciones.EliminarDetallesPedido vista = new Eliminaciones.EliminarDetallesPedido(); 
    
    public static void Mostrar(){
        vista.setTitle("ELIMINAR DETALLES DETALLES DEL PEDIDO");
        vista.setVisible(true);
        Actualizar();
        Personalizacion.Personalizar.Tabla(vista.getTabla(),3);
    }
    public static void Eliminar(){
        DB.Sql.EliminarDetallesPedido(vista.getXX(),vista.getYY(),vista.getZZ(),vista.getWW());
        Actualizar();
        javax.swing.JOptionPane.showMessageDialog(null,"Detalle eliminado");
    }
    private static void Actualizar(){
        DefaultTableModel tabla = (DefaultTableModel) vista.getTabla().getModel();
        tabla.setNumRows(0);
        for(Modelo.DetalleDelPedido i: DB.Sql.ObtenerActualizacionDetallesP(vista.getBuscar().getText())){
            tabla.addRow(new Object[]{i.getNroDeOrden(),i.getCodProducto(),i.getCantidad(),i.getPrecio()});
        }
    }
}
