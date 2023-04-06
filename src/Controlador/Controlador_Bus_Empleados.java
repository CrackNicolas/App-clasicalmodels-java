package Controlador;

import javax.swing.table.DefaultTableModel;

public class Controlador_Bus_Empleados {
    private static Busquedas.BuscarEmpleados vista = new Busquedas.BuscarEmpleados(); 
    private static DefaultTableModel tabla = (DefaultTableModel) vista.getTabla().getModel();
    
    public static void Mostrar(){
        vista.setTitle("BUSCAR EMPLEADOS");
        vista.setVisible(true);
        Personalizacion.Personalizar.Tabla(vista.getTabla(),6);
        CargarOficinas();
    }
    private static void Limpiar(){
        vista.getNombre().setText("");
        vista.getNroEmpleado().setText("");
        vista.getEmail().setText("");
        vista.getTitulo().setText("");
        vista.getApellido().setText("");
        CargarOficinas();
    }
    private static void CargarOficinas(){
        vista.getOf().removeAllItems();
        vista.getOf().addItem("Seleccionar");
        for(Modelo.Oficinas i:DB.Sql.ObtenerNroDeOficinas()) {
            vista.getOf().addItem(i.getCodOffic());
        }
        ((javax.swing.JLabel)vista.getOf().getRenderer()).setHorizontalAlignment(javax.swing.SwingConstants.CENTER);  
    }
    public static boolean Validar(){
        if(vista.getApellido().getText().isEmpty()&&vista.getOf().getItemAt(vista.getOf().getSelectedIndex()).equals("Seleccionar")&&vista.getTitulo().getText().isEmpty()&&vista.getNombre().getText().isEmpty()&&vista.getEmail().getText().isEmpty()&&vista.getNroEmpleado().getText().isEmpty()){
            javax.swing.JOptionPane.showMessageDialog(null," Coloque un dato para poder realizar la busqueda");
            return false;
        }
        return true;
    }
    public static void Buscar(){
        boolean band = false;
        tabla.setNumRows(0);
        for(Modelo.Empleados i: DB.Sql.BuscarEmpleados(vista.getNroEmpleado().getText(),vista.getNombre().getText(),vista.getApellido().getText(),vista.getOficinas(),vista.getEmail().getText(),vista.getTitulo().getText())){
            tabla.addRow(new Object[]{i.getNroEmpleado(),i.getApellido(),i.getNombre(),i.getExtencion(),i.getJefe(),i.getCodOffic(),i.getTituloProf(),i.getEmail()});
            band = true;
        }
        Limpiar();
        if(!band){
            javax.swing.JOptionPane.showMessageDialog(null," No se encontraron resultados");
        }
    }
    public static void Actualizar(){
        tabla.setNumRows(0);
        for(Modelo.Empleados i: DB.Sql.ObtenerEmpleados()){
            tabla.addRow(new Object[]{i.getNroEmpleado(),i.getApellido(),i.getNombre(),i.getExtencion(),i.getJefe(),i.getCodOffic(),i.getTituloProf(),i.getEmail()});
        }
    }
}