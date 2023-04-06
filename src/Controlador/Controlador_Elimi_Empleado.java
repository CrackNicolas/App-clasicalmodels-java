package Controlador;

import javax.swing.table.DefaultTableModel;

public class Controlador_Elimi_Empleado {
    private static Eliminaciones.EliminacionEmpleados vista = new Eliminaciones.EliminacionEmpleados(); 
    
    public static void Mostrar(){
        vista.setTitle("ELIMINAR EMPLEADOS");
        vista.setVisible(true);
        Actualizar();
        Personalizacion.Personalizar.Tabla(vista.getTabla(),6);
    }
    public static void Eliminar(){
        DB.Sql.EliminarEmpleado(vista.getIndex());
        Actualizar();
        javax.swing.JOptionPane.showMessageDialog(null,"Empleado eliminado");
    }
    private static void Actualizar(){
        DefaultTableModel tabla = (DefaultTableModel) vista.getTabla().getModel();
        tabla.setNumRows(0);
        for(Modelo.Empleados i: DB.Sql.ObtenerActualizacionEmpleado(vista.getBuscar().getText()) ){
            tabla.addRow(new Object[]{i.getNroEmpleado(),i.getApellido(),i.getNombre(),i.getExtencion(),i.getJefe(),i.getCodOffic(),i.getTituloProf(),i.getEmail()});
        }
    }
}