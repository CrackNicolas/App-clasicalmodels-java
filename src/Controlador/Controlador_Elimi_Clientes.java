package Controlador;

import javax.swing.table.DefaultTableModel;

public class Controlador_Elimi_Clientes {
    private static Eliminaciones.EliminacionClientes vista = new Eliminaciones.EliminacionClientes(); 
    
    public static void Mostrar(){
        vista.setTitle("ELIMINAR CLIENTES");
        vista.setVisible(true);
        Actualizar();
        Personalizacion.Personalizar.Tabla(vista.getTabla(),11);
    }
    public static void Eliminar(){
        DB.Sql.EliminarClientes(vista.getIndex());
        Actualizar();
        javax.swing.JOptionPane.showMessageDialog(null,"Cliente eliminado");
    }
    private static void Actualizar(){
        DefaultTableModel tabla = (DefaultTableModel) vista.getTabla().getModel();
        tabla.setNumRows(0);
        for(Modelo.Cliente i: DB.Sql.ObtenerActualizacionClientes(vista.getBuscar().getText())){
            tabla.addRow(new Object[]{i.getNroCliente(),i.getNomCliente(),i.getContApellid(),i.getTefefono(),i.getDir1(),i.getDir2(),i.getCuidad(),i.getEstado(),i.getCodPostal(),i.getPais(),i.getNroRepresentDeVent(),i.getCreditoLim()});
        }
    }
}