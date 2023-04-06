package Controlador;

import javax.swing.table.DefaultTableModel;

public class Controlador_Bus_Oficinas {
    private static Busquedas.BuscarOficinas vista = new Busquedas.BuscarOficinas(); 
    private static DefaultTableModel tabla = (DefaultTableModel) vista.getTabla().getModel();
    
    public static void Mostrar(){
        vista.setTitle("BUSCAR OFICINAS");
        vista.setVisible(true);
        Personalizacion.Personalizar.Tabla(vista.getTabla(),8);
    }
    private static void Limpiar(){
        vista.getDireccion().setText("");
        vista.getCiudad().setText("");
        vista.getCodigo().setText("");
        vista.getTerritorio().setText("");
    }
    public static boolean Validar(){
        if(vista.getCodigo().getText().isEmpty() && vista.getCiudad().getText().isEmpty() && vista.getTerritorio().getText().isEmpty()&&vista.getDireccion().getText().isEmpty()){
            javax.swing.JOptionPane.showMessageDialog(null," Coloque un dato para poder realizar la busqueda");
            return false;
        }
        return true;
    }
    public static void Buscar(){
        boolean band = false;
        tabla.setNumRows(0);
        for(Modelo.Oficinas i: DB.Sql.BuscarOficinas(vista.getCodigo().getText(),vista.getCiudad().getText(),vista.getDireccion().getText(),vista.getTerritorio().getText())){
            tabla.addRow(new Object[]{i.getCodOffic(),i.getCuidad(),i.getTefefono(),i.getDir1(),i.getDir2(),i.getEstado(),i.getPais(),i.getCodPostal(),i.getTerritorio()});
            band = true;
        }
        Limpiar();
        if(!band){
            javax.swing.JOptionPane.showMessageDialog(null," No se encontraron resultados");
        }
    }
    public static void Actualizar(){
        tabla.setNumRows(0);
        for(Modelo.Oficinas i: DB.Sql.ObtenerOficinas()){
            tabla.addRow(new Object[]{i.getCodOffic(),i.getCuidad(),i.getTefefono(),i.getDir1(),i.getDir2(),i.getEstado(),i.getPais(),i.getCodPostal(),i.getTerritorio()});
        }
    }
}