package Controlador;
public class Controlado_Detalles_Ped {
    private static Ventanas.CargarDetallesPedido vista = new Ventanas.CargarDetallesPedido();
    
    public static void Registrar(){
        Modelo.DetalleDelPedido detalle_del_pedido = new Modelo.DetalleDelPedido();
        detalle_del_pedido.setNroDeOrden(Integer.parseInt(vista.getNroDeOrden()));
        detalle_del_pedido.setCodProducto(vista.getCodigo());
        detalle_del_pedido.setCantidad(Integer.parseInt(vista.getCantidadP().getText()));
        detalle_del_pedido.setPrecio(CargarPrecio());
        DB.Sql.AgregarDetallesPedido(detalle_del_pedido);
        Limpiar();
    }
    public static void Mostrar(){
        vista.setTitle("REGISTRO DE DETALLES DEL PEDIDO");
        vista.setVisible(true);
        CargarNroDeOrdenes();
        CargarCodigos();
        Bloquear();
        Instanciar();
    }
    public static void Limpiar(){
        vista.getCantidadP().setText("");
        CargarNroDeOrdenes();
        CargarCodigos();
        Bloquear();
        Instanciar();
        DesbloquearText();
    }
    private static void Instanciar(){
        vista.getCantidadP().setText("Ingresar cantidad del pedido..."); 
    }
    public static void Bloquear(){
        vista.getGuardar().setEnabled(false);
        vista.getLimpiar().setEnabled(false);
    }
    public static void Desbloquear(){
        vista.getGuardar().setEnabled(true);
        vista.getLimpiar().setEnabled(true);
        BloquearText();
    }
    private static void CargarNroDeOrdenes(){    
        vista.getNroDeOrdenes().removeAllItems();
        vista.getNroDeOrdenes().addItem("Seleccionar numero de orden");
        for(Modelo.Pedidos i: DB.Sql.ObtenerNroDeOrdenes()) {
            vista.getNroDeOrdenes().addItem(Integer.toString(i.getNroDeOrden()));
        }
        ((javax.swing.JLabel)vista.getNroDeOrdenes().getRenderer()).setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    }
    private static void CargarCodigos(){
        vista.getCodigosProductos().removeAllItems();
        vista.getCodigosProductos().addItem("Seleccionar codigo producto");
        for(Modelo.Producto i:DB.Sql.ObtenerCodProductos()) {
            vista.getCodigosProductos().addItem(i.getCodProduct());
        }
        ((javax.swing.JLabel)vista.getCodigosProductos().getRenderer()).setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    }
    public static boolean Verificar(){
        return !(vista.getCodigosProductos().getSelectedItem().equals("Seleccionar codigo producto")||vista.getNroDeOrdenes().getSelectedItem().equals("Seleccionar numero de orden")||vista.getCantidadP().getText().equals("Ingresar cantidad del pedido..."));        
    } 
    private static void BloquearText(){
        vista.getCantidadP().setEnabled(false);
    }
    private static void DesbloquearText(){
        vista.getCantidadP().setEnabled(true);
    }
    public static double CargarPrecio(){
        return DB.Sql.TraerPrecioProd(vista.getCodigosProductos().getSelectedItem().toString());
    }
}