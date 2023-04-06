package Controlador;

import javax.swing.table.DefaultTableModel;

public class Controlador_Elimi_Oficinas {
    private static Eliminaciones.EliminarOficinas vista = new Eliminaciones.EliminarOficinas(); 
    
    public static void Mostrar(){
        vista.setTitle("ELIMINAR OFICINAS");
        vista.setVisible(true);
        Actualizar();
        Personalizacion.Personalizar.Tabla(vista.getTabla(),8);
    }
    public static void Eliminar(){
        DB.Sql.EliminarOficinas(vista.getIndex());
        Actualizar();
        javax.swing.JOptionPane.showMessageDialog(null,"Oficina eliminada");
    }
    private static void Actualizar(){
        DefaultTableModel tabla = (DefaultTableModel) vista.getTabla().getModel();
        tabla.setNumRows(0);
        for(Modelo.Oficinas i: DB.Sql.ObtenerActualizacionOficinas(vista.getBuscar().getText()) ){
            tabla.addRow(new Object[]{i.getCodOffic(),i.getCuidad(),i.getTefefono(),i.getDir1(),i.getDir2(),i.getEstado(),i.getPais(),i.getCodPostal(),i.getTerritorio()});
        }
    }
}
