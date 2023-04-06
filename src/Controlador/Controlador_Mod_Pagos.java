package Controlador;

public class Controlador_Mod_Pagos {
    private static Modificaciones.ModificarPagos vista = new Modificaciones.ModificarPagos(); 
    
    public static void Mostrar(){
        vista.setTitle("MODIFICAR PAGOS");
        vista.setVisible(true);
        Personalizacion.Personalizar.Tabla(vista.getTabla(),3);
        DB.Sql.ActualizaPagosModificados(vista.getTabla(),vista.getBuscar().getText());
    }
    public static void Modificar(){
        DB.Sql.ModificarPagos(vista.getBuscar().getText(),vista.getTabla(),vista.getCantidad().getText(),vista.getVerificarNro().getText(),vista.getCliente().getText());
        Limpiar();
    }
    public static void Limpiar(){
        vista.getVerificarNro().setText("");
        vista.getCantidad().setText("");
        vista.getCliente().setText("");
        vista.getBuscar().setText("");
    }
    public static void Validar(){
        if(vista.getVerificarNro().getText().isEmpty()&&vista.getCantidad().getText().isEmpty()){
            javax.swing.JOptionPane.showMessageDialog(null," Antes de modificar seleccione el pago");
        }
    }
}