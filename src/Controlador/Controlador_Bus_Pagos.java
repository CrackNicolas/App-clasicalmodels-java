package Controlador;

import java.util.Calendar;
import javax.swing.table.DefaultTableModel;

public class Controlador_Bus_Pagos {
    private static Busquedas.BuscarPagos vista = new Busquedas.BuscarPagos(); 
    private static Calendar fecha_actual = new java.util.GregorianCalendar(1,1,1);
    private static DefaultTableModel tabla = (DefaultTableModel) vista.getTabla().getModel();
    
    public static void Mostrar(){
        vista.setTitle("BUSCAR PAGOS");
        vista.setVisible(true);
        Personalizacion.Personalizar.Tabla(vista.getTabla(),3);
        vista.getFecha().setCalendar(fecha_actual);
    }
    private static void Limpiar(){
        vista.getNroCliente().setText("");
        vista.getImport().setText("");
        vista.getFecha().setCalendar(fecha_actual);
    }
    public static boolean Validar(){
        if(vista.getNroCliente().getText().isEmpty()&&vista.getImport().getText().isEmpty()&&vista.getFecha().getCalendarButton().isDefaultButton()){
            javax.swing.JOptionPane.showMessageDialog(null," Coloque un dato para poder realizar la busqueda");
            return false;
        }
        return true;
    }
    private static String TransformarFecha(){
        if(vista.getFecha().getCalendar().get(Calendar.DAY_OF_MONTH)<=9){
            return vista.getFecha().getCalendar().get(Calendar.YEAR)+"-"+(vista.getFecha().getCalendar().get(Calendar.MONTH)+1)+"-"+0+vista.getFecha().getCalendar().get(Calendar.DAY_OF_MONTH);
        }else{
            return vista.getFecha().getCalendar().get(Calendar.YEAR)+"-"+(vista.getFecha().getCalendar().get(Calendar.MONTH)+1)+"-"+vista.getFecha().getCalendar().get(Calendar.DAY_OF_MONTH);
        }
    }
    public static void Buscar(){
        boolean band = false;
        tabla.setNumRows(0);
        for(Modelo.Pagos i: DB.Sql.BuscarPagos(TransformarFecha(),vista.getNroCliente().getText(),vista.getImport().getText())){
            tabla.addRow(new Object[]{i.getNroDeCliente(),i.getVerifNroCliente(),i.getFecha(),i.getCantidad()});
            band = true;
        }
        Limpiar();
        if(!band){
            javax.swing.JOptionPane.showMessageDialog(null," No se encontraron resultados");
        }
    }
    public static void Actualizar(){
        tabla.setNumRows(0);
        for(Modelo.Pagos i: DB.Sql.ObtenerPagos() ){
            tabla.addRow(new Object[]{i.getNroDeCliente(),i.getVerifNroCliente(),i.getFecha(),i.getCantidad()});          
        }
    }
}