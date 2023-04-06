package Controlador;

import javax.swing.table.DefaultTableModel;

public class Controlador_Elimi_Usuarios {
    private static Eliminaciones.EliminacionUsuarios vista = new Eliminaciones.EliminacionUsuarios(); 
    
    public static void Mostrar(){
        vista.setTitle("ELIMINAR USUARIOS");
        vista.setVisible(true);
        Actualizar();
        Personalizacion.Personalizar.Tabla(vista.getTabla(),1);
    }
    public static void Eliminar(){
        DB.Sql.EliminarUsuarios(vista.getIndex());
        Actualizar();
        javax.swing.JOptionPane.showMessageDialog(null,"Usuario eliminado");
    }
    private static void Actualizar(){
        DefaultTableModel tabla = (DefaultTableModel) vista.getTabla().getModel();
        tabla.setNumRows(0);
        for(Modelo.Usuarios i: DB.Sql.ObtenerActualizacionUsuarios(vista.getBuscar().getText()) ){
            tabla.addRow(new Object[]{i.getUsuario(),i.getPassword()});
        }
    }
}
