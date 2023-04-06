package Controlador;

import javax.swing.table.DefaultTableModel;

public class Controlador_Pagos {
    private static double total = 0;
    private static Ventanas.Registrar_Pagos vista = new Ventanas.Registrar_Pagos();
    private static Modelo.Fecha fecha = new Modelo.Fecha();
    private static Modelo.Pagos pago = new Modelo.Pagos();
    
    public static void BotonGuardar(){
        pago.setNroDeCliente(Integer.parseInt(vista.getNroCliente()));
        pago.setVerifNroCliente(vista.getVerificarNro().getText());
        pago.setFecha(fecha.toString());
        MostrarTablaDetalles();
        DB.Sql.AgregarPagos(pago);
        Limpiar();
    }
    public static void Mostrar(){
        vista.setTitle("REGISTRO DE PAGOS");
        vista.setVisible(true);
        CargarClientesRegistrados();
        Bloquear();
        Instanciar();
    }
    public static void Limpiar(){
        vista.getVerificarNro().setText(""); 
        CargarClientesRegistrados();
        Bloquear();
        Instanciar();
    }
    public static void Instanciar(){
        vista.getVerificarNro().setText("Verificar numero del pedido..."); 
    }
    public static void Bloquear(){
        vista.getGuardar().setEnabled(false);
    }
    public static void Desbloquear(){
        vista.getGuardar().setEnabled(true);
    }
    private static void CargarClientesRegistrados(){
        java.util.ArrayList<Integer> elementos = new java.util.ArrayList();
        for(Modelo.Cliente i : DB.Sql.ObtenNroDeClientesDisponiblesAPagar()){
            elementos.add(i.getNroCliente());
        }
        java.util.Set<Integer> eliminar = new java.util.HashSet<>(elementos);
        elementos.clear();
        elementos.addAll(eliminar);
        vista.getNrosDeC().removeAllItems();
        vista.getNrosDeC().addItem("Seleccionar cliente");
        for(int i=0;i<elementos.size();i++){
            vista.getNrosDeC().addItem(elementos.get(i).toString());
        }
        ((javax.swing.JLabel)vista.getNrosDeC().getRenderer()).setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    }
    public static boolean Verificar(){
        return !(vista.getNrosDeC().getSelectedItem().equals("Seleccionar cliente")||vista.getVerificarNro().getText().equals("Verificar numero del pedido..."));        
    }
    private static void MostrarTablaDetalles(){
        total = 0;
        int sacar;
        DefaultTableModel tabla = (DefaultTableModel) vista.getTabla().getModel();
        tabla.setNumRows(0);
        for(Object j: DB.Sql.ObtenerNroDeOrden(pago.getNroDeCliente())){
            sacar = j.hashCode();
            for(Modelo.DetalleDelPedido i: DB.Sql.ObtenerDetallesDelPedido()){
                if(sacar == i.getNroDeOrden()){
                    tabla.addRow(new Object[]{i.getNroDeOrden(),i.getCodProducto(),i.getCantidad(),i.getPrecio(),(double)Math.round((i.getPrecio()*i.getCantidad())*100d)/100});
                    total += (double)Math.round((i.getPrecio()*i.getCantidad())*100d)/100;
                    vista.getTotalP().setText("$"+total);
                    pago.setCantidad(total);
                    DB.Sql.ModificarEstadoDelPedido("Pagado",i.getNroDeOrden());
                }
            }
        }
    }
}