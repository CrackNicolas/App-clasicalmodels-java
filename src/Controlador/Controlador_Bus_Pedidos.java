package Controlador;

import java.util.Calendar;
import javax.swing.table.DefaultTableModel;

public class Controlador_Bus_Pedidos {
    private static Busquedas.BuscarPedidos vista = new Busquedas.BuscarPedidos(); 
    private static Calendar fecha_actual = new java.util.GregorianCalendar(1,1,1);
    private static DefaultTableModel tabla = (DefaultTableModel) vista.getTabla().getModel();
    
    public static void Mostrar(){
        vista.setTitle("BUSCAR PEDIDOS");
        vista.setVisible(true);
        Personalizacion.Personalizar.Tabla(vista.getTabla(),6);
        vista.getF1().setCalendar(fecha_actual);
    }
    private static void Limpiar(){
        vista.getClientes().setText("");
        vista.getOrden().setText("");
        vista.getEstado().setText("");
        vista.getF1().setCalendar(fecha_actual);
    }
    public static boolean Validar(){
        if(vista.getF1().getCalendarButton().isDefaultButton()&&vista.getClientes().getText().isEmpty()&&vista.getEstado().getText().isEmpty()&&vista.getOrden().getText().isEmpty()){
            javax.swing.JOptionPane.showMessageDialog(null," Coloque un dato para poder realizar la busqueda");
            return false;
        }
        return true;
    }
    private static String TransformarF1(){
        if(vista.getF1().getCalendar().get(Calendar.DAY_OF_MONTH)<=9){
            return vista.getF1().getCalendar().get(Calendar.YEAR)+"-"+(vista.getF1().getCalendar().get(Calendar.MONTH)+1)+"-"+0+vista.getF1().getCalendar().get(Calendar.DAY_OF_MONTH);
        }else{
            return vista.getF1().getCalendar().get(Calendar.YEAR)+"-"+(vista.getF1().getCalendar().get(Calendar.MONTH)+1)+"-"+vista.getF1().getCalendar().get(Calendar.DAY_OF_MONTH);
        }
    }
    public static void Buscar(){
        boolean band = false;
        tabla.setNumRows(0);
        for(Modelo.Pedidos i: DB.Sql.BuscarPedidos(TransformarF1(),vista.getOrden().getText(),vista.getClientes().getText(),vista.getEstado().getText()) ){
            tabla.addRow(new Object[]{i.getNroDeOrden(),i.getFechaOrden(),i.getFechaRequerida(),i.getFechaEnvio(),i.getEstado(),i.getComentarios(),i.getNroDeCliente()});
            band = true;
        }
        Limpiar();
        if(!band){
            javax.swing.JOptionPane.showMessageDialog(null," No se encontraron resultados");
        }
    }
    public static void Actualizar(){
        tabla.setNumRows(0);
        for(Modelo.Pedidos i: DB.Sql.ObtenerPedidos() ){
            tabla.addRow(new Object[]{i.getNroDeOrden(),i.getFechaOrden(),i.getFechaRequerida(),i.getFechaEnvio(),i.getEstado(),i.getComentarios(),i.getNroDeCliente()});
        }
    }
}