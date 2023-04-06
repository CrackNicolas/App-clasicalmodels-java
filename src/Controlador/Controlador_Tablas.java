package Controlador;

import javax.swing.table.DefaultTableModel;

public class Controlador_Tablas {
    private static Ventanas.Menu_Tablas menu = new Ventanas.Menu_Tablas();
    private static Ventanas.TablaClientes cliente = new Ventanas.TablaClientes();
    private static Ventanas.TablaEmpleados empleado = new Ventanas.TablaEmpleados();
    private static Ventanas.TablaOficinas oficinas = new Ventanas.TablaOficinas();
    private static Ventanas.TablaPagos pagos = new Ventanas.TablaPagos();
    private static Ventanas.TablaPedidos pedidos = new Ventanas.TablaPedidos();
    private static Ventanas.TablaDetallesPedido detalles = new Ventanas.TablaDetallesPedido();
    private static Ventanas.TablaLineaDeProductos linea = new Ventanas.TablaLineaDeProductos();
    private static Ventanas.TablaProductos producto = new Ventanas.TablaProductos();
    private static Ventanas.TablaFactura factura = new Ventanas.TablaFactura();
    private static Modelo.Fecha fecha = new Modelo.Fecha();
    private static Ventanas.TablaUsuarios users = new Ventanas.TablaUsuarios();
    
    public static void Mostrar(){
        menu.setVisible(true);
        Controlador.Controlador_MenuPrincipal.Ocultar();
    }
    public static void Ocultar(){
        menu.setVisible(false);
    }
    public static void MostrarTablaUsuarios(){
        DefaultTableModel datos = (DefaultTableModel) users.getTabla().getModel();
        datos.setNumRows(0);
        for(Modelo.Usuarios i : DB.Sql.ObtenerUsuarios()){
            datos.addRow(new Object[]{i.getUsuario(),i.getPassword()});
        }
        users.setVisible(true);
        users.setTitle("TABLA USUARIOS");
    }
    public static void MostrarTablaClientes(){
        DefaultTableModel datos = (DefaultTableModel) cliente.getTabla().getModel();
        datos.setNumRows(0);
        for(Modelo.Cliente i : DB.Sql.ObtenerClientes()){
            datos.addRow(new Object[]{
                i.getNroCliente(),
                i.getNomCliente(),
                i.getContApellid(),
                i.getTefefono(),
                i.getDir1(),
                i.getDir2(),
                i.getCuidad(),
                i.getEstado(),
                i.getCodPostal(),
                i.getPais(),
                i.getNroRepresentDeVent(),
                i.getCreditoLim()
            });
        }
        cliente.setVisible(true);
        cliente.setTitle("TABLA CLIENTES");
    }
    public static void MostrarTablaEmpleados(){
        DefaultTableModel datos = (DefaultTableModel) empleado.getTabla().getModel();
        datos.setNumRows(0);
        for(Modelo.Empleados i : DB.Sql.ObtenerEmpleados() ){
            datos.addRow(new Object[]{
                i.getNroEmpleado(),
                i.getApellido(),
                i.getNombre(),
                i.getExtencion(),
                i.getJefe(),
                i.getCodOffic(),
                i.getTituloProf(),
                i.getEmail()
            });
        }
        empleado.setVisible(true);
        empleado.setTitle("TABLA DE EMPLEADOS");
    }
    public static void MostrarTablaOficinas(){
        DefaultTableModel datos = (DefaultTableModel) oficinas.getTabla().getModel();
        datos.setNumRows(0);
        for(Modelo.Oficinas i : DB.Sql.ObtenerOficinas() ){
            datos.addRow(new Object[]{
                i.getCodOffic(),
                i.getCuidad(),
                i.getTefefono(),
                i.getDir1(),
                i.getDir2(),
                i.getEstado(),
                i.getPais(),
                i.getCodPostal(),
                i.getTerritorio()
            });
        }
        oficinas.setVisible(true);
        oficinas.setTitle("TABLA OFICINAS");
    }
    public static void MostrarTablaPagos(){
        DefaultTableModel datos = (DefaultTableModel) pagos.getTabla().getModel();
        datos.setNumRows(0);
        for(Modelo.Pagos i : DB.Sql.ObtenerPagos() ){
            datos.addRow(new Object[]{i.getNroDeCliente(),i.getVerifNroCliente(),i.getFecha(),i.getCantidad()});          
        }
        pagos.setVisible(true);
        pagos.setTitle("TABLA DE PAGOS");
    }
    public static void MostrarTablaPedidos(){
        DefaultTableModel datos = (DefaultTableModel) pedidos.getTabla().getModel();
        datos.setNumRows(0);
        for(Modelo.Pedidos i : DB.Sql.ObtenerPedidos()){
            datos.addRow(new Object[]{
                i.getNroDeOrden(),
                i.getFechaOrden(),
                i.getFechaRequerida(),
                i.getFechaEnvio(),
                i.getEstado(),
                i.getComentarios(),
                i.getNroDeCliente()
            });
        }
        pedidos.setVisible(true);
        pedidos.setTitle("TABLA DE PEDIDOS");
    }
    public static void MostrarTablaDetalles(){
        DefaultTableModel datos = (DefaultTableModel) detalles.getTabla().getModel();
        datos.setNumRows(0);
        for(Modelo.DetalleDelPedido i : DB.Sql.ObtenerDetallesDelPedido()){          
            datos.addRow(new Object[]{
                i.getNroDeOrden(),
                i.getCodProducto(),
                i.getCantidad(),
                i.getPrecio(),
                (double)Math.round((i.getPrecio()*i.getCantidad())*100d)/100
            });
        }
        detalles.setVisible(true);
        detalles.setTitle("TABLA DETALLES DEL PEDIDO");
    }
    public static void MostrarTablaLinea(){
        DefaultTableModel datos = (DefaultTableModel) linea.getTabla().getModel();
        datos.setNumRows(0);
        for(Modelo.LineaDeProductos i : DB.Sql.ObtenerProductoLinea()){
            datos.addRow(new Object[]{i.getProductLinea(),i.getDescripcion(),i.getDescripcionHtml()});
        }
        linea.setVisible(true);
        linea.setTitle("TABLA LINEA DE PRODUCTOS");
    }
    public static void MostrarTablaProductos(){
        DefaultTableModel datos = (DefaultTableModel) producto.getTabla().getModel();
        datos.setNumRows(0);
        for(Modelo.Producto i : DB.Sql.ObtenerProducto()){
            datos.addRow(new Object[]{
                i.getCodProduct(),
                i.getNombre(),
                i.getEscalaProduct(),
                i.getVendedor(),
                i.getDescripcion(),
                i.getCantStock(),
                i.getPrecio(),
                i.getMSRP(),
                i.getLineaProducto()
            });
        }
        producto.setVisible(true);
        producto.setTitle("TABLA PRODUCTOS");
    }
    public static void ImprimirFacturaDeVenta(){
        DefaultTableModel datos = (DefaultTableModel) factura.getTabla().getModel();
        datos.setNumRows(0);
        for(Modelo.Factura i : DB.Sql.ImprimirFactura()){
            datos.addRow(new Object[]{
                i.getNroOrdenPedido(),
                i.getEstadPedido(),
                i.getLineaProducto(),
                i.getCodProduct(),
                i.getNroEmplead(),
                i.getApeEmplead(),
                fecha.toString(),
                i.getNroCliente(),
                i.getApeCliente(),
                i.getPrecioP(),
                i.getCantidadP(),
                (double)Math.round((i.getPrecioP()*i.getCantidadP())*100d)/100
            });
        }
        factura.setVisible(true);
        factura.setTitle("TABLA FACTURA");
    }
}