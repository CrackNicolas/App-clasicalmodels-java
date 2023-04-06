package Controlador;

import com.toedter.calendar.JDateChooser;
import java.util.Date;
import java.util.GregorianCalendar;

public class Controlador_Pedidos {
    private static Ventanas.Registrar_Pedidos vista = new Ventanas.Registrar_Pedidos();
    private static java.util.Calendar fecha_actual = new GregorianCalendar();
    
    public static void BotonGuardar(){
        Modelo.Pedidos pedido = new Modelo.Pedidos();
        pedido.setNroDeOrden(Integer.parseInt(vista.getNroDeOrdenes().getText()));
        pedido.setEstado("En proceso");
        pedido.setNroDeCliente(Integer.parseInt(vista.getNroCliente()));
        pedido.setFechaOrden(getFecha(vista.getFechaOrden()));
        pedido.setFechaEnvio(getFecha(vista.getFechaEnvio()));
        pedido.setFechaRequerida(getFecha(vista.getFechaRequerida()));
        pedido.setComentarios(vista.getComentarios().getText());
        DB.Sql.AgregarPedidos(pedido);      
        Limpiar();
    }
    public static void Mostrar(){
        vista.setTitle("REGISTRO DE PEDIDOS");
        vista.setVisible(true);
        CargarClientesRegistrados();
        Bloquear();
        Instanciar();
    }
    public static void Limpiar(){
        vista.getComentarios().setText(""); 
        vista.getNroDeOrdenes().setText("");
        CargarClientesRegistrados();
        Bloquear();
        Instanciar();
        DesbloquearText();
    }
    public static void Instanciar(){
        vista.getComentarios().setText("Ingresar comentarios del pedido..."); 
        vista.getNroDeOrdenes().setText("Ingresar numero de orden del pedido...");
        vista.getFechaOrden().setCalendar(fecha_actual);
        vista.getFechaEnvio().setCalendar(fecha_actual);
        vista.getFechaRequerida().setCalendar(fecha_actual);
    }
    private static void Bloquear(){
        vista.getGuardar().setEnabled(false);
        vista.getLimpiar().setEnabled(false);
    }
    public static void Desbloquear(){
        vista.getGuardar().setEnabled(true);
        vista.getLimpiar().setEnabled(true);
        BloquearText();
    }
    private static Date getFecha(JDateChooser fecha){
        return new Date(fecha.getDate().getTime());
    }
    private static void CargarClientesRegistrados(){
        vista.getNrosDeC().removeAllItems();
        vista.getNrosDeC().addItem("Seleccionar cliente");
        for(Modelo.Cliente i : DB.Sql.ObtenerNroDeClientes()){
            vista.getNrosDeC().addItem(Integer.toString(i.getNroCliente()));
        }
        ((javax.swing.JLabel)vista.getNrosDeC().getRenderer()).setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    }
    public static boolean Verificar(){
        return !(vista.getNrosDeC().getSelectedItem().equals("Seleccionar cliente")||vista.getNroDeOrdenes().getText().equals("Ingresar numero de orden del pedido..."));        
    }
    private static void BloquearText(){
        vista.getComentarios().setEnabled(false);
        vista.getNroDeOrdenes().setEnabled(false);
        vista.getFechaOrden().setEnabled(false);
        vista.getFechaEnvio().setEnabled(false);
        vista.getFechaRequerida().setEnabled(false);
    }
    private static void DesbloquearText(){
        vista.getComentarios().setEnabled(true);
        vista.getNroDeOrdenes().setEnabled(true);
        vista.getFechaOrden().setEnabled(true);
        vista.getFechaEnvio().setEnabled(true);
        vista.getFechaRequerida().setEnabled(true);
    }
    public static void Vaciar(){
        if(vista.getComentarios().getText().equals("Ingresar comentarios del pedido...")){
            vista.getComentarios().setText("");
        }
    }
}