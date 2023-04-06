package Controlador;

import javax.swing.table.DefaultTableModel;

public class Controlador_Elimi_Pagos {
    private static Eliminaciones.EliminarPagos vista = new Eliminaciones.EliminarPagos(); 
    
    public static void Mostrar(){
        vista.setTitle("ELIMINAR PAGOS");
        vista.setVisible(true);
        Actualizar();
        Personalizacion.Personalizar.Tabla(vista.getTabla(),3);
    }
    public static void Eliminar(){
        DB.Sql.EliminarPagos(vista.getIndex1(),vista.getIndex2(),vista.getIndex3());
        Actualizar();
        javax.swing.JOptionPane.showMessageDialog(null,"Pago eliminado");
    }
    private static void Actualizar(){
        Modelo.Fecha fecha = new Modelo.Fecha();
        DefaultTableModel tabla = (DefaultTableModel) vista.getTabla().getModel();
        tabla.setNumRows(0);
        for(Modelo.Pagos i: DB.Sql.ObtenerActualizacionPagos(vista.getBuscar().getText()) ){
            tabla.addRow(new Object[]{i.getNroDeCliente(),i.getVerifNroCliente(),fecha.toString(),i.getCantidad()});          
        }
    }
}