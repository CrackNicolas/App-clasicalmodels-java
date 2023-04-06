package Controlador;

import javax.swing.table.DefaultTableModel;

public class Controlador_Elimi_Pedidos {
    private static Eliminaciones.EliminarPedidos vista = new Eliminaciones.EliminarPedidos(); 
    
    public static void Mostrar(){
        vista.setTitle("ELIMINAR PEDIDOS");
        vista.setVisible(true);
        Actualizar();
        Personalizacion.Personalizar.Tabla(vista.getTabla(),6);
    }
    public static void Eliminar(){
        DB.Sql.EliminarPedidos(vista.getIndex());
        Actualizar();
        javax.swing.JOptionPane.showMessageDialog(null,"Pedido eliminado");
    }
    private static void Actualizar(){
        DefaultTableModel tabla = (DefaultTableModel) vista.getTabla().getModel();
        tabla.setNumRows(0);
        for(Modelo.Pedidos i: DB.Sql.ObtenerActualizacionPedidos(vista.getBuscar().getText()) ){
            tabla.addRow(new Object[]{i.getNroDeOrden(),i.getFechaOrden(),i.getFechaEnvio(),i.getFechaRequerida(),i.getEstado(),i.getComentarios(),i.getNroDeCliente()});
        }
    }
}