package DB;

import Modelo.Cliente;
import Modelo.DetalleDelPedido;
import Modelo.Empleados;
import Modelo.Factura;
import Modelo.LineaDeProductos;
import Modelo.Oficinas;
import Modelo.Pagos;
import Modelo.Pedidos;
import Modelo.Producto;
import Modelo.Usuarios;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Sql {
    public static int band=0;
    private static Connection conexion = Conexion.Conectar();
    private static java.sql.ResultSet r;
    
    public static int AdmitirUsuario(String usuario, String password){
        try{
            r = conexion.createStatement().executeQuery("select *from usuarios where Users = '"+usuario+"' and Pass = '"+password+"' ");
            while(r.next()) return 1;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Se produjo un error inesperado");
        }
        return 0;
    }
    public static int VerificarSuperUsuario(String usuario, String password){
        try{
            r = conexion.createStatement().executeQuery("select *from usuarios where Users = '"+usuario+"' and Pass = '"+password+"'");
            while(r.next()){
                return (usuario.equals(r.getString("Users")) && password.equals(r.getString("Pass")))? 1 : 0;
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Se produjo un error inesperado");
        }
        return 0;
    }
    public static void AgregarUsuarios(Usuarios user){
        try{
            conexion.prepareStatement("insert into usuarios value('"+user.getUsuario()+"','"+user.getPassword()+"','"+user.getNro()+"')").executeUpdate();
            JOptionPane.showMessageDialog(null,"Usuario registrado con exito");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error ya existe un usuario registrado con ese nombre");
        }
    }
    public static int Mayor(){
        try{
            r = conexion.createStatement().executeQuery("select Nro from usuarios order by Nro");
            while(r.next()) return Integer.parseInt(r.getString("Nro"));
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Se produjo un error inesperado");
        }
        return 0;
    }
    public static ArrayList<Usuarios> ObtenerUsuarios(){
        ArrayList<Usuarios> Lista = new ArrayList<>();
        try{
            r = conexion.createStatement().executeQuery("select *from usuarios");
            while(r.next()){
                Lista.add(new Usuarios(r.getString("Users"),r.getString("Pass")));
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Se produjo un error inesperado");
        }
        return Lista;
    }
    public static ArrayList<Usuarios> ModificarUsuarios(javax.swing.JTable m,String n1,String n2,String n){
        ArrayList<Usuarios> Lista = new ArrayList<>();
        try{
            conexion.prepareStatement("update usuarios set Users='"+n1+"',Pass='"+n2+"' where Nro='"+n+"' ").executeUpdate();
            ActualizarUsuariosModificados(m);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Se produjo un error inesperado");
        }
        return Lista;
    }
    public static void ActualizarUsuariosModificados(javax.swing.JTable m){
        try{
            r = conexion.createStatement().executeQuery("select *from usuarios");
            DefaultTableModel datos = (DefaultTableModel) m.getModel();
            datos.setNumRows(0);
            while(r.next()){
                datos.addRow(new Object[]{r.getString("Users"),r.getString("Pass"),r.getString("Nro")});
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Se produjo un error inesperado");
        }
    }
    public static void EliminarUsuarios(String i){
        try{
            conexion.prepareStatement("delete from usuarios where Users='"+i+"' ").executeUpdate();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Se produjo un error inesperado");
        }
    }
    public static ArrayList<Usuarios> ObtenerActualizacionUsuarios(String buscar){
        ArrayList<Usuarios> Lista = new ArrayList<>();
        try{
            if(buscar.isEmpty()){
                r = conexion.createStatement().executeQuery("select *from usuarios");
            }else{
                r = conexion.createStatement().executeQuery("select *from usuarios where Users='"+buscar+"' or Pass='"+buscar+"'");
            }
            while(r.next()){
                Lista.add(new Usuarios(r.getString("Users"),r.getString("Pass")));
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Se produjo un error inesperado");
        }
        return Lista;
    } 
    public static void AgregarProducto(Producto p){
        try{
            conexion.prepareStatement("insert into producto value('"+p.getCodProduct()+"','"+p.getNombre()+"','"+p.getEscalaProduct()+"','"+p.getVendedor()+"','"+p.getDescripcion()+"','"+p.getCantStock()+"','"+p.getPrecio()+"','"+p.getMSRP()+"','"+p.getLineaProducto()+"' )").executeUpdate();
            JOptionPane.showMessageDialog(null,"Producto registrado con exito");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error ya existe un producto con el mismo codigo");
        }
    }
    public static ArrayList<Producto> ObtenerProducto(){
        ArrayList<Producto> Lista = new ArrayList<>();
        try{
            r = conexion.createStatement().executeQuery("select producto.*, lineaproductos.LineaProducto from producto inner join lineaproductos on producto.LineaProducto = lineaproductos.LineaProducto");
            while(r.next()){
                Lista.add(new Producto(
                    r.getString("Codigo"),
                    r.getString("Nombre"),
                    r.getString("Escala"),
                    r.getString("Vendedor"),
                    r.getString("Descripcion"),
                    r.getString("Stock"),
                    r.getDouble("Precio"),
                    r.getDouble("MSRP"),
                    r.getString("LineaProducto")
                ));
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return Lista;
    }
    public static ArrayList<Producto> ObtenerCodProductos(){
        ArrayList<Producto> Lista = new ArrayList<>();
        try{
            r = conexion.createStatement().executeQuery("select Codigo from producto");
            while(r.next()){
                Producto p = new Producto();
                p.setCodProduct(r.getString("Codigo"));
                Lista.add(p);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Se produjo un error inesperado");
        }
        return Lista;
    }
    public static void AgregarProductoLinea(LineaDeProductos l){
        try{
            conexion.prepareStatement("insert into lineaproductos value('"+l.getProductLinea()+"','"+l.getDescripcion()+"','"+l.getDescripcionHtml()+"') ").executeUpdate();
            JOptionPane.showMessageDialog(null,"Linea de productos registrada con exito");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error ya tiene una linea de producto con el mismo nombre");
        }
    }
    public static ArrayList<LineaDeProductos> ObtenerProductoLinea(){
        ArrayList<LineaDeProductos> Lista = new ArrayList<>();
        try{
            r = conexion.createStatement().executeQuery("select *from lineaproductos");
            while(r.next()){
                Lista.add(new LineaDeProductos(r.getString("LineaProducto"),r.getString("Descripcion"),r.getString("DescripcionHtml")));
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Se produjo un error inesperado");
        }
        return Lista;
    }
    public static ArrayList<LineaDeProductos> ObtenerNroDeLineasDeProductos(){
        ArrayList<LineaDeProductos> Lista = new ArrayList<>();
        try{
            r = conexion.createStatement().executeQuery("select LineaProducto from lineaproductos");
            while(r.next()){
                LineaDeProductos l = new LineaDeProductos();
                l.setProductLinea(r.getString("LineaProducto"));
                Lista.add(l);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Se produjo un error inesperado");
        }
        return Lista;
    }
    public static void AgregarOficinas(Oficinas o){
        try{
            conexion.prepareStatement("insert into oficinas value('"+o.getCodOffic()+"','"+o.getCuidad()+"','"+o.getTefefono()+"','"+o.getDir1()+"','"+o.getDir2()+"','"+o.getEstado()+"','"+o.getPais()+"','"+o.getCodPostal()+"','"+o.getTerritorio()+"') ").executeUpdate();
            JOptionPane.showMessageDialog(null,"Oficina registrada con exito");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error ya tienes un oficina con el mismo numero");
        }
    }
    public static ArrayList<Oficinas> ObtenerOficinas(){
        ArrayList<Oficinas> Lista = new ArrayList<>();
        try{
            r = conexion.createStatement().executeQuery("select *from oficinas");
            while(r.next()){
                Lista.add(new Oficinas(
                    r.getString("Codigo"),
                    r.getString("Ciudad"),
                    r.getString("Telefono"),
                    r.getString("Direccion1"),
                    r.getString("Direccion2"),
                    r.getString("Estado"),
                    r.getString("Pais"),
                    r.getString("CodigoPostal"),
                    r.getString("Territorio")
                ));
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Se produjo un error inesperado");
        }
        return Lista;
    }
    public static ArrayList<Oficinas> ObtenerNroDeOficinas(){
        ArrayList<Oficinas> Lista = new ArrayList<>();
        try{
            r = conexion.createStatement().executeQuery("select Codigo from oficinas");
            while(r.next()){
                Oficinas o = new Oficinas();
                o.setCodOffic(r.getString("Codigo"));
                Lista.add(o);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Se produjo un error inesperado");
        }
        return Lista;
    }
    public static void AgregarEmpleados(Empleados em){
        try{                       
            conexion.prepareStatement("insert into empleado value('"+em.getNroEmpleado()+"','"+em.getJefe()+"','"+em.getCodOffic()+"','"+em.getNombre()+"','"+em.getApellido()+"','"+em.getExtencion()+"','"+em.getEmail()+"','"+em.getTituloProf()+"')").executeUpdate();
            JOptionPane.showMessageDialog(null,"Empleado registrado con exito");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error,Posiblemente el nro de oficina que puso no existe o quisas sea que su jefe no esta registrado\n Por favor pruebe de nuevo");
        }
    }
    public static ArrayList<Empleados> ObtenerEmpleados(){
        ArrayList<Empleados> Lista = new ArrayList<>();
        try{
            r = conexion.createStatement().executeQuery("select empleado.*, oficinas.Codigo from empleado inner join oficinas on empleado.CodigoOficina = oficinas.Codigo");
            while(r.next()){
                Lista.add(new Empleados(
                    r.getInt("NroEmpleado"),
                    r.getString("Apellido"),
                    r.getString("Nombre"),
                    r.getString("Extencion"),
                    r.getInt("Reportes"),
                    r.getString("CodigoOficina"),
                    r.getString("Titulo"),
                    r.getString("Email")
                ));
            }
        }catch(SQLException e){
            javax.swing.JOptionPane.showMessageDialog(null,"Se produjo un error inesperado");
        }
        return Lista;
    }
    public static ArrayList<Empleados> ObtenerNroDeEmpleados(){
        ArrayList<Empleados> Lista = new ArrayList<>();
        try{
            r = conexion.createStatement().executeQuery("select NroEmpleado from empleado");
            while(r.next()){
                Empleados e = new Empleados();
                e.setNroEmpleado(r.getInt("NroEmpleado"));
                Lista.add(e);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Se produjo un error inesperado");
        }
        return Lista;
    }
    public static void AgregarClientes(Cliente c){
        try{
            conexion.prepareStatement("insert into cliente value('"+c.getNroCliente()+"','"+c.getNomCliente()+"','"+c.getContApellid()+"','"+c.getTefefono()+"','"+c.getDir1()+"','"+c.getDir2()+"','"+c.getCuidad()+"','"+c.getEstado()+"','"+c.getCodPostal()+"','"+c.getPais()+"','"+c.getNroRepresentDeVent()+"','"+c.getCreditoLim()+"') ").executeUpdate();
            JOptionPane.showMessageDialog(null,"Cliente registrado con exito");
        }catch(java.sql.SQLException e){
            JOptionPane.showMessageDialog(null,"Error el representate de ventas no existe... \n Por favor vuelva a intentar");
        }
    }
    public static ArrayList<Cliente> ObtenerClientes(){
        ArrayList<Cliente> Lista = new ArrayList<>();
        try{
            r = conexion.createStatement().executeQuery("select cliente.*, empleado.NroEmpleado from cliente inner join empleado on cliente.RepDeVentas = empleado.NroEmpleado");
            while(r.next()){
                Lista.add(new Cliente(
                    r.getInt("NroCliente"),
                    r.getString("Nombre"),
                    r.getString("Apellido"),
                    r.getString("Telefono"),
                    r.getString("Direccion1"),
                    r.getString("Direccion2"),
                    r.getString("Ciudad"),
                    r.getString("EstadoCivil"),
                    r.getString("CodigoPostal"),
                    r.getString("Pais"),
                    r.getInt("RepDeVentas"),
                    r.getDouble("CreditoLimite")
                ));
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Se produjo un error inesperado");
        }
        return Lista;
    }
    public static ArrayList<Cliente> ObtenerNroDeClientes(){
        ArrayList<Cliente> Lista = new ArrayList<>();
        try{
            r = conexion.createStatement().executeQuery("select NroCliente from cliente");
            while(r.next()){
                Cliente c = new Cliente();
                c.setNroCliente(r.getInt("NroCliente"));
                Lista.add(c);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Se produjo un error inesperado");
        }
        return Lista;
    }
    public static void AgregarPedidos(Pedidos pp){
        try{
            conexion.prepareStatement("insert into pedidos value('"+pp.getNroDeOrden()+"','"+pp.getFechaOrden()+"','"+pp.getFechaEnvio()+"','"+pp.getFechaRequerida()+"','"+pp.getEstado()+"','"+pp.getComentarios()+"','"+pp.getNroDeCliente()+"')").executeUpdate();
            JOptionPane.showMessageDialog(null,"Pedido registrado con exito");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error el representate de ventas no existe... \n Por favor vuelva a intentar");
        }
    }
    public static ArrayList<Pedidos> ObtenerPedidos(){
        ArrayList<Pedidos> Lista = new ArrayList<>();
        try{
            r = conexion.createStatement().executeQuery("select pedidos.*,cliente.NroCliente from pedidos inner join cliente on pedidos.NroCliente=cliente.NroCliente");
            while(r.next()){
                Lista.add(new Pedidos(
                    r.getInt("NroOrden"),
                    r.getString("Estado"),
                    r.getInt("NroCliente"),
                    r.getString("Comentarios"),
                    r.getDate("FechaOrden"),
                    r.getDate("FechaRequerida"),
                    r.getDate("FechaEnvio")
                ));
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Se produjo un error inesperado");
        }
        return Lista;
    }
    public static ArrayList<Pedidos> ObtenerNroDeOrdenes(){
        ArrayList<Pedidos> Lista = new ArrayList<>();
        try{
            r = conexion.createStatement().executeQuery("select NroOrden from pedidos");
            while(r.next()){
                Pedidos p = new Pedidos();
                p.setNroDeOrden(r.getInt("NroOrden"));
                Lista.add(p);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Se produjo un error inesperado");
        }
        return Lista;
    }
    public static void AgregarDetallesPedido(DetalleDelPedido d){
        try{
            conexion.prepareStatement("insert into detallespedido value('"+d.getNroDeOrden()+"','"+d.getCodProducto()+"','"+d.getCantidad()+"','"+d.getPrecio()+"') ").executeUpdate();
            JOptionPane.showMessageDialog(null,"Detalles del pedido registrado con exito");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Se produjo un error inesperado");
        }
    }
    public static ArrayList<DetalleDelPedido> ObtenerDetallesDelPedido(){
        ArrayList<DetalleDelPedido> Lista = new ArrayList<>();
        try{
            r = conexion.createStatement().executeQuery("select detallespedido.*,pedidos.NroOrden,producto.Codigo from detallespedido inner join pedidos on detallespedido.NroOrden = pedidos.NroOrden inner join producto on producto.Codigo = detallespedido.CodigoProducto;");
            while(r.next()){
                Lista.add(new DetalleDelPedido(
                    r.getInt("NroOrden"),
                    r.getString("CodigoProducto"),
                    r.getInt("CantidadPedida"),
                    r.getDouble("PrecioPorUnidad")
                ));
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Se produjo un error inesperado");
        }
        return Lista;
    }
    public static void AgregarPagos(Pagos p){
        try{
            conexion.prepareStatement("insert into pagos value('"+p.getNroDeCliente()+"','"+p.getVerifNroCliente()+"','"+p.getFecha()+"','"+p.getCantidad()+"')").executeUpdate();
            JOptionPane.showMessageDialog(null,"Pago registrado con exito");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error pago ya registrado");
        }
    }         
    public static ArrayList<Pagos> ObtenerPagos(){
        ArrayList<Pagos> Lista = new ArrayList<>();
        try{
            r = conexion.createStatement().executeQuery("select pagos.*,cliente.NroCliente from pagos inner join cliente on pagos.NroCliente = cliente.NroCliente");
            while(r.next()){
                Lista.add(new Pagos(
                    r.getInt("NroCliente"),
                    r.getString("VerificarNro"),
                    r.getDouble("Importe"),
                    r.getString("FechaPago")
                ));
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Se produjo un error inesperado");
        }
        return Lista;
    }
    public static ArrayList<Cliente> ObtenNroDeClientesDisponiblesAPagar(){
        ArrayList<Cliente> Lista = new ArrayList<>();
        try{
            r = conexion.createStatement().executeQuery("select pedidos.NroOrden,cliente.NroCliente,detallespedido.NroOrden,pedidos.Estado from pedidos inner join cliente on pedidos.NroCliente=cliente.NroCliente inner join detallespedido on pedidos.NroOrden=detallespedido.NroOrden where Estado='En proceso'");
            while(r.next()){
                Cliente c = new Cliente();
                c.setNroCliente(r.getInt("NroCliente"));
                Lista.add(c);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Se produjo un error inesperado");
        }
        return Lista;
    }
    public static ArrayList<Factura> ImprimirFactura(){
        ArrayList<Factura> Lista = new ArrayList<>();
        try{
            r = conexion.createStatement().executeQuery("select \n" +
                "empleado.NroEmpleado,empleado.Apellido,\n" +
                "cliente.Apellido,cliente.NroCliente,\n" +
                "pedidos.Estado,pedidos.NroOrden,\n" +
                "detallespedido.CantidadPedida,detallespedido.PrecioPorUnidad,\n"+ 
                "producto.Codigo,producto.LineaProducto,producto.Nombre\n" +
                "from empleado \n" +
                "inner join cliente on empleado.NroEmpleado = cliente.RepDeVentas\n" +
                "inner join pedidos on cliente.NroCliente = pedidos.NroCliente\n" +
                "inner join detallespedido on pedidos.NroOrden = detallespedido.NroOrden\n" +
                "inner join producto on detallespedido.CodigoProducto = producto.Codigo");
            while(r.next()){
                Lista.add(new Factura(
                    r.getString("Codigo"),
                    r.getString("Nombre"),
                    r.getString("LineaProducto"),
                    r.getInt("NroEmpleado"),
                    r.getInt("CantidadPedida"),
                    r.getString("Apellido"),
                    r.getInt("cliente.NroCliente"),
                    r.getString("cliente.Apellido"),
                    r.getString("Estado"),
                    r.getDouble("PrecioPorUnidad"),
                    r.getInt("pedidos.NroOrden")
                ));
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Se produjo un error inesperado");
        }
        return Lista;
    }
    public static void EliminarLineaP(String i){
        try{
            conexion.prepareStatement("delete from lineaproductos where LineaProducto ='"+i+"' ").executeUpdate();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Se produjo un error inesperado");
        }
    }
    public static ArrayList<LineaDeProductos> ObtenerActualizacionLineaP(String buscar){
        ArrayList<LineaDeProductos> Lista = new ArrayList<>();
        try{
            if(buscar.isEmpty()){
                r = conexion.createStatement().executeQuery("select *from lineaproductos");
            }else{
                r = conexion.createStatement().executeQuery("select *from lineaproductos where LineaProducto='"+buscar+"' or Descripcion='"+buscar+"' or DescripcionHtml='"+buscar+"'");
            }
            while(r.next()){
                Lista.add(new LineaDeProductos(r.getString("LineaProducto"),r.getString("Descripcion"),r.getString("DescripcionHtml")));
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Se produjo un error inesperado");
        }
        return Lista;
    }
    public static void EliminarClientes(String i){
        try{
            conexion.prepareStatement("delete from cliente where NroCliente='"+i+"' ").executeUpdate();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Se produjo un error inesperado");
        }
    }
    public static ArrayList<Cliente> ObtenerActualizacionClientes(String buscar){
        ArrayList<Cliente> Lista = new ArrayList<>();
        try{
            if(buscar.isEmpty()){
                r = conexion.createStatement().executeQuery("select *from cliente");
            }else{
                r = conexion.createStatement().executeQuery("select *from cliente where NroCliente='"+buscar+"' or Apellido='"+buscar+"' or Nombre='"+buscar+"' or Telefono='"+buscar+"' or Direccion1='"+buscar+"' or Ciudad='"+buscar+"' or CodigoPostal='"+buscar+"' or Pais='"+buscar+"'");
            }
            while(r.next()){
                Lista.add(new Cliente(
                    r.getInt("NroCliente"),
                    r.getString("Nombre"),
                    r.getString("Apellido"),
                    r.getString("Telefono"),
                    r.getString("Direccion1"),
                    r.getString("Direccion2"),
                    r.getString("Ciudad"),
                    r.getString("EstadoCivil"),
                    r.getString("CodigoPostal"),
                    r.getString("Pais"),
                    r.getInt("RepDeVentas"),
                    r.getDouble("CreditoLimite")
                ));
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Se produjo un error inesperado");
        }
        return Lista;
    }
    public static void EliminarProducto(String i){
        try{
            conexion.prepareStatement("delete from producto where Codigo='"+i+"' ").executeUpdate();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Se produjo un error inesperado");
        }
    }
    public static ArrayList<Producto> ObtenerActualizacionProducto(String buscar){
        ArrayList<Producto> Lista = new ArrayList<>();
        try{
            if(buscar.isEmpty()){
                r = conexion.createStatement().executeQuery("select *from producto");
            }else{
                r = conexion.createStatement().executeQuery("select *from producto where Codigo='"+buscar+"' or Nombre='"+buscar+"' or Escala='"+buscar+"' or Vendedor='"+buscar+"' or Stock='"+buscar+"' or MSRP='"+buscar+"' or Precio='"+buscar+"' or LineaProducto='"+buscar+"'  ");
            }
            while(r.next()){
                Lista.add(new Producto(
                    r.getString("Codigo"),
                    r.getString("Nombre"),
                    r.getString("Escala"),
                    r.getString("Vendedor"),
                    r.getString("Descripcion"),
                    r.getString("Stock"),
                    r.getDouble("Precio"),
                    r.getDouble("MSRP"),
                    r.getString("LineaProducto")
                ));
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Se produjo un error inesperado");
        }
        return Lista;
    }
    public static void EliminarEmpleado(String i){
        try{
            conexion.prepareStatement("delete from empleado where NroEmpleado='"+i+"' ").executeUpdate();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Se produjo un error inesperado");
        }
    }
    public static ArrayList<Empleados> ObtenerActualizacionEmpleado(String buscar){
        ArrayList<Empleados> Lista = new ArrayList<>();
        try{
            if(buscar.isEmpty()){
                r = conexion.createStatement().executeQuery("select *from empleado");
            }else{
                r = conexion.createStatement().executeQuery("select *from empleado where NroEmpleado='"+buscar+"' or Reportes='"+buscar+"' or CodigoOficina='"+buscar+"' or Nombre='"+buscar+"' or Apellido='"+buscar+"' or Email='"+buscar+"' or Titulo='"+buscar+"' or Extencion='"+buscar+"'");
            }
            while(r.next()){
                Lista.add(new Empleados(
                    r.getInt("NroEmpleado"),
                    r.getString("Apellido"),
                    r.getString("Nombre"),
                    r.getString("Extencion"),
                    r.getInt("Reportes"),
                    r.getString("CodigoOficina"),
                    r.getString("Titulo"),
                    r.getString("Email")
                ));
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Se produjo un error inesperado");
        }
        return Lista;
    }     
    public static void EliminarOficinas(String i){
        try{
            conexion.prepareStatement("delete from oficinas where Codigo='"+i+"' ").executeUpdate();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Se produjo un error inesperado");
        }
    }
    public static ArrayList<Oficinas> ObtenerActualizacionOficinas(String buscar){
        ArrayList<Oficinas> Lista = new ArrayList<>();
        try{
            if(buscar.isEmpty()){
                r = conexion.createStatement().executeQuery("select *from oficinas");
            }else{
                r = conexion.createStatement().executeQuery("select *from oficinas where Codigo='"+buscar+"' or Ciudad='"+buscar+"' or Telefono='"+buscar+"' or Direccion1='"+buscar+"' or Pais='"+buscar+"' or CodigoPostal='"+buscar+"' or Territorio='"+buscar+"'");
            }
            while(r.next()){
                Lista.add(new Oficinas(
                    r.getString("Codigo"),
                    r.getString("Ciudad"),
                    r.getString("Telefono"),
                    r.getString("Direccion1"),
                    r.getString("Direccion2"),
                    r.getString("Estado"),
                    r.getString("Pais"),
                    r.getString("CodigoPostal"),
                    r.getString("Territorio")
                ));
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Se produjo un error inesperado");
        }
        return Lista;
    }  
    public static void EliminarPedidos(String i){
        try{
            conexion.prepareStatement("delete from pedidos where NroOrden='"+i+"' ").executeUpdate();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Se produjo un error inesperado");
        }
    }
    public static ArrayList<Pedidos> ObtenerActualizacionPedidos(String buscar){
        ArrayList<Pedidos> Lista = new ArrayList<>();
        try{
            if(buscar.isEmpty()){
                r = conexion.createStatement().executeQuery("select *from pedidos");
            }else{
                r = conexion.createStatement().executeQuery("select *from pedidos where NroOrden='"+buscar+"' or Estado='"+buscar+"' or NroCliente='"+buscar+"' ");
            }
            while(r.next()){
                Lista.add(new Pedidos(
                    r.getInt("NroOrden"),
                    r.getString("Estado"),                   
                    r.getInt("NroCliente"),
                    r.getString("Comentarios"),
                    r.getDate("FechaOrden"),
                    r.getDate("FechaRequerida"),
                    r.getDate("FechaEnvio")
                ));
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Se produjo un error inesperado");
        }
        return Lista;
    }
    public static void EliminarDetallesPedido(String n1,String n2,String n3,String n4){
        try{
            conexion.prepareStatement("delete from detallespedido where NroOrden='"+n1+"' and CodigoProducto='"+n2+"' and CantidadPedida='"+n3+"' and PrecioPorUnidad='"+n4+"' ").executeUpdate();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Se produjo un error inesperado");
        }
    }
    public static ArrayList<DetalleDelPedido> ObtenerActualizacionDetallesP(String buscar){
        ArrayList<DetalleDelPedido> Lista = new ArrayList<>();
        try{
            if(buscar.isEmpty()){
                r = conexion.createStatement().executeQuery("select *from detallespedido");
            }else{
                r = conexion.createStatement().executeQuery("select *from detallespedido where NroOrden='"+buscar+"' or CodigoProducto='"+buscar+"' or CantidadPedida='"+buscar+"' or PrecioPorUnidad='"+buscar+"' ");
            }
            while(r.next()){
                Lista.add(new DetalleDelPedido(
                    r.getInt("NroOrden"),
                    r.getString("CodigoProducto"),
                    r.getInt("CantidadPedida"),
                    r.getDouble("PrecioPorUnidad")
                ));
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Se produjo un error inesperado");
        }
        return Lista;
    }  
    public static void EliminarPagos(String x,String y,String z){
        try{
            conexion.prepareStatement("delete from pagos where NroCliente='"+x+"' and VerificarNro='"+y+"' and Importe='"+z+"'  ").executeUpdate();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Se produjo un error inesperado");
        }
    }
    public static ArrayList<Pagos> ObtenerActualizacionPagos(String buscar){
        ArrayList<Pagos> Lista = new ArrayList<>();
        try{
            if(buscar.isEmpty()){
                r = conexion.createStatement().executeQuery("select *from pagos");
            }else{
                r = conexion.createStatement().executeQuery("select *from pagos where VerificarNro='"+buscar+"' or NroCliente='"+buscar+"' or Importe='"+buscar+"' ");
            }
            while(r.next()){
                Lista.add(new Pagos(
                    r.getInt("NroCliente"),
                    r.getString("VerificarNro"),
                    r.getDouble("Importe"),
                    r.getString("FechaPago")
                ));
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Se produjo un error inesperado");
        }
        return Lista;
    }
    public static ArrayList<Cliente> BuscarClientes(String n1,String n2,String n3,String n4,String n5,String n6,String n7){
        ArrayList<Cliente> Lista = new ArrayList<>();
        try{
            r = conexion.createStatement().executeQuery("select *from cliente where Nombre='"+n1+"' or Apellido='"+n2+"' or Direccion1='"+n3+"' or Ciudad='"+n4+"' or Pais='"+n5+"' or NroCliente='"+n6+"' or RepDeVentas='"+n7+"' ");
            while(r.next()){
                Lista.add(new Cliente(
                    r.getInt("NroCliente"),
                    r.getString("Nombre"),
                    r.getString("Apellido"),
                    r.getString("Telefono"),
                    r.getString("Direccion1"),
                    r.getString("Direccion2"),
                    r.getString("Ciudad"),
                    r.getString("EstadoCivil"),
                    r.getString("CodigoPostal"),
                    r.getString("Pais"),
                    r.getInt("RepDeVentas"),
                    r.getDouble("CreditoLimite")
                ));
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Se produjo un error inesperado");
        }
        return Lista;
    }
    public static ArrayList<Empleados> BuscarEmpleados(String n1,String n2,String n3,String n4,String n5,String n6){
        ArrayList<Empleados> Lista = new ArrayList<>();
        try{
            r = conexion.createStatement().executeQuery("select *from empleado where NroEmpleado='"+n1+"' or Nombre='"+n2+"' or Apellido='"+n3+"' or CodigoOficina='"+n4+"' or Email='"+n5+"' or Titulo='"+n6+"' ");
            while(r.next()){
                Lista.add(new Empleados(
                    r.getInt("NroEmpleado"),
                    r.getString("Apellido"),
                    r.getString("Nombre"),
                    r.getString("Extencion"),
                    r.getInt("Reportes"),
                    r.getString("CodigoOficina"),
                    r.getString("Titulo"),
                    r.getString("Email")
                ));
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Se produjo un error inesperado");
        }
        return Lista;
    } 
    public static ArrayList<Producto> BuscarProducto(String n1,String n2,String n3,String n4){
        ArrayList<Producto> Lista = new ArrayList<>();
        try{
            r = conexion.createStatement().executeQuery("select *from producto where Codigo='"+n1+"' or Precio='"+n2+"' or Nombre='"+n3+"' or LineaProducto='"+n4+"' ");
            while(r.next()){
                Lista.add(new Producto(
                    r.getString("Codigo"),
                    r.getString("Nombre"),
                    r.getString("Escala"),
                    r.getString("Vendedor"),
                    r.getString("Descripcion"),
                    r.getString("Stock"),
                    r.getDouble("Precio"),
                    r.getDouble("MSRP"),
                    r.getString("LineaProducto")
                ));
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Se produjo un error inesperado");
        }
        return Lista;
    } 
    public static ArrayList<Pedidos> BuscarPedidos(String n1,String n2,String n3,String n4){
        ArrayList<Pedidos> Lista = new ArrayList<>();
        try{
            r = conexion.createStatement().executeQuery("select *from pedidos where FechaOrden='"+n1+"' or NroOrden='"+n2+"' or NroCliente='"+n3+"' or Estado='"+n4+"' ");
            while(r.next()){
                Lista.add(new Pedidos(
                    r.getInt("NroOrden"),
                    r.getString("Estado"),
                    r.getInt("NroCliente"),
                    r.getString("Comentarios"),
                    r.getDate("FechaOrden"),
                    r.getDate("FechaRequerida"),
                    r.getDate("FechaEnvio")
                ));
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Se produjo un error inesperado");
        }
        return Lista;
    } 
    public static ArrayList<Oficinas> BuscarOficinas(String n1,String n2,String n3,String n4){
        ArrayList<Oficinas> Lista = new ArrayList<>();
        try{
            r = conexion.createStatement().executeQuery("select *from oficinas where Codigo='"+n1+"' or Ciudad='"+n2+"' or Direccion1='"+n3+"' or Territorio='"+n4+"' ");
            while(r.next()){
                Lista.add(new Oficinas(
                    r.getString("Codigo"),
                    r.getString("Ciudad"),
                    r.getString("Telefono"),
                    r.getString("Direccion1"),
                    r.getString("Direccion2"),
                    r.getString("Estado"),
                    r.getString("Pais"),
                    r.getString("CodigoPostal"),
                    r.getString("Territorio")
                ));
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Se produjo un error inesperado");
        }
        return Lista;
    } 
    public static ArrayList<LineaDeProductos> BuscarLineaProductos(String n1,String n2){
        ArrayList<LineaDeProductos> Lista = new ArrayList<>();
        try{
            r = conexion.createStatement().executeQuery("select *from lineaproductos where LineaProducto='"+n1+"' or DescripcionHtml='"+n2+"'  ");
            while(r.next()){
                Lista.add(new LineaDeProductos(
                    r.getString("LineaProducto"),
                    r.getString("Descripcion"),
                    r.getString("DescripcionHtml")
                ));
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Se produjo un error inesperado");
        }
        return Lista;
    }  
    public static ArrayList<DetalleDelPedido> BuscarDetallesP(String n1,String n2,String n3,String n4){
        ArrayList<DetalleDelPedido> Lista = new ArrayList<>();
        try{
            r = conexion.createStatement().executeQuery("select *from detallespedido where NroOrden='"+n1+"' or CodigoProducto='"+n2+"' or CantidadPedida='"+n3+"' or PrecioPorUnidad='"+n4+"' ");
            while(r.next()){
                Lista.add(new DetalleDelPedido(
                    r.getInt("NroOrden"),
                    r.getString("CodigoProducto"),
                    r.getInt("CantidadPedida"),
                    r.getDouble("PrecioPorUnidad")
                ));
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Se produjo un error inesperado");
        }
        return Lista;
    }
    public static ArrayList<Pagos> BuscarPagos(String n,String n1,String n2){
        ArrayList<Pagos> Lista = new ArrayList<>();
        try{
            r = conexion.createStatement().executeQuery("select *from pagos where FechaPago='"+n+"' or NroCliente='"+n1+"' or Importe='"+n2+"' ");
            while(r.next()){
                Lista.add(new Pagos(
                    r.getInt("NroCliente"),
                    r.getString("VerificarNro"),
                    r.getDouble("Importe"),
                    r.getString("FechaPago")
                ));
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Se produjo un error inesperado");
        }
        return Lista;
    }
    public static ArrayList<LineaDeProductos> ModificarLineaProductos(String buscar,javax.swing.JTable m,String n1,String n2,String n3){
        ArrayList<LineaDeProductos> Lista = new ArrayList<>();
        try{
            conexion.prepareStatement("update lineaproductos set Descripcion='"+n2+"',DescripcionHtml='"+n3+"' where LineaProducto='"+n1+"' ").executeUpdate();
            ActualizarDatosModificados(m,buscar);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Se produjo un error inesperado");
        }
        return Lista;
    }
    public static void ActualizarDatosModificados(javax.swing.JTable m,String buscar){
        try{
            if(buscar.isEmpty()){
                r = conexion.createStatement().executeQuery("select *from lineaproductos");
            }else{
                r = conexion.createStatement().executeQuery("select *from lineaproductos where LineaProducto='"+buscar+"' or Descripcion='"+buscar+"' or DescripcionHtml='"+buscar+"'");
            }
            DefaultTableModel datos = (DefaultTableModel) m.getModel();
            datos.setNumRows(0);
            while(r.next()){ 
                datos.addRow(new Object[]{r.getString("LineaProducto"),r.getString("Descripcion"),r.getString("DescripcionHtml")});
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Se produjo un error inesperado");
        }
    }
    public static ArrayList<Producto> ModificarProductos(String buscar,javax.swing.JTable m,String n1,String n2,String n3,String n4,String n5,String n6,String n7,String n8,String n9){
        ArrayList<Producto> Lista = new ArrayList<>();
        try{
            conexion.prepareStatement("update producto set LineaProducto='"+n1+"', Escala='"+n2+"',MSRP='"+n3+"' ,Vendedor='"+n4+"', Nombre='"+n5+"', Descripcion='"+n6+"', Precio='"+n7+"', Stock='"+n8+"' where Codigo='"+n9+"' ").executeUpdate();
            ActualizaProductosModificados(m,buscar);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Se produjo un error inesperado");
        }
        return Lista;
    }
    public static void ActualizaProductosModificados(javax.swing.JTable m,String buscar){
        try{
            if(buscar.isEmpty()){
                r = conexion.createStatement().executeQuery("select *from producto");
            }else{
                r = conexion.createStatement().executeQuery("select *from producto where Codigo='"+buscar+"' or Nombre='"+buscar+"' or Escala='"+buscar+"' or Vendedor='"+buscar+"' or Stock='"+buscar+"' or MSRP='"+buscar+"' or Precio='"+buscar+"' or LineaProducto='"+buscar+"'  ");
            }
            DefaultTableModel datos = (DefaultTableModel) m.getModel();
            datos.setNumRows(0);
            while(r.next()){
                datos.addRow(new Object[]{
                    r.getString("Codigo"),
                    r.getString("Nombre"),
                    r.getString("Escala"),
                    r.getString("Vendedor"),
                    r.getString("Descripcion"),
                    r.getString("Stock"),
                    r.getDouble("Precio"),
                    r.getDouble("MSRP"),
                    r.getString("LineaProducto")
                });
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Se produjo un error inesperado");
        }
    }
    public static ArrayList<Cliente> ModificarCliente(String buscar,javax.swing.JTable m,String n1,String n2,String n3,String n4,String n5,String n6,String n7,String n8,String n9,String n10,String n11,String n12){
        ArrayList<Cliente> Lista = new ArrayList<>();
        try{
            conexion.prepareStatement("update cliente set RepDeVentas='"+n1+"',Pais='"+n2+"',EstadoCivil='"+n3+"',CreditoLimite='"+n4+"',CodigoPostal='"+n5+"',Ciudad='"+n6+"',Direccion1='"+n7+"',Direccion2='"+n8+"' ,Telefono='"+n9+"',Nombre='"+n10+"' , Apellido='"+n11+"' where NroCliente='"+n12+"' ").executeUpdate();
            ActualizaClientesModificados(m,buscar);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Se produjo un error inesperado");
        }
        return Lista;
    }
    public static void ActualizaClientesModificados(javax.swing.JTable m,String buscar){
        try{
            if(buscar.isEmpty()){
                r = conexion.createStatement().executeQuery("select *from cliente");
            }else{
                r = conexion.createStatement().executeQuery("select *from cliente where NroCliente='"+buscar+"' or Apellido='"+buscar+"' or Nombre='"+buscar+"' or Telefono='"+buscar+"' or Direccion1='"+buscar+"' or Ciudad='"+buscar+"' or CodigoPostal='"+buscar+"' or Pais='"+buscar+"'");
            }
            DefaultTableModel datos = (DefaultTableModel) m.getModel();
            datos.setNumRows(0);
            while(r.next()){
                datos.addRow(new Object[]{
                    r.getInt("NroCliente"),
                    r.getString("Nombre"),
                    r.getString("Apellido"),
                    r.getString("Telefono"),
                    r.getString("Direccion1"),
                    r.getString("Direccion2"),
                    r.getString("Ciudad"),
                    r.getString("EstadoCivil"),               
                    r.getString("CodigoPostal"),               
                    r.getString("Pais"),
                    r.getInt("RepDeVentas"),
                    r.getDouble("CreditoLimite")
                });
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Se produjo un error inesperado");
        }
    }  
    public static ArrayList<Empleados> ModificarEmpleado(String buscar,javax.swing.JTable m,String n1,String n2,String n3,String n4,String n5,String n6,String n7,String n8){
        ArrayList<Empleados> Lista = new ArrayList<>();
        try{
            conexion.prepareStatement("update empleado set Apellido='"+n1+"', Nombre='"+n2+"',Extencion='"+n3+"',Reportes='"+n4+"', CodigoOficina='"+n5+"',Titulo='"+n6+"',Email='"+n7+"' where NroEmpleado='"+n8+"' ").executeUpdate();
            ActualizaEmpleadosModificados(m,buscar);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Se produjo un error inesperado");
        }
        return Lista;
    }
    public static void ActualizaEmpleadosModificados(javax.swing.JTable m,String buscar){
        try{
            if(buscar.isEmpty()){
                r = conexion.createStatement().executeQuery("select *from empleado");
            }else{
                r = conexion.createStatement().executeQuery("select *from empleado where NroEmpleado='"+buscar+"' or Reportes='"+buscar+"' or CodigoOficina='"+buscar+"' or Nombre='"+buscar+"' or Apellido='"+buscar+"' or Email='"+buscar+"' or Titulo='"+buscar+"' or Extencion='"+buscar+"'");
            }
            DefaultTableModel datos = (DefaultTableModel) m.getModel();
            datos.setNumRows(0);
            while(r.next()){
                datos.addRow(new Object[]{
                    r.getInt("NroEmpleado"),
                    r.getString("Apellido"),
                    r.getString("Nombre"),
                    r.getString("Extencion"),
                    r.getInt("Reportes"),
                    r.getString("CodigoOficina"),
                    r.getString("Titulo"),
                    r.getString("Email")
                });
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Se produjo un error inesperado");
        }
    }
    public static ArrayList<Oficinas> ModificarOficinas(String buscar,javax.swing.JTable m,String n1,String n2,String n3,String n4,String n5,String n6,String n7,String n8,String n9){
        ArrayList<Oficinas> Lista = new ArrayList<>();
        try{
            conexion.prepareStatement("update oficinas set Territorio='"+n1+"',Pais='"+n2+"',CodigoPostal='"+n3+"',Estado='"+n4+"',Direccion1='"+n5+"',Direccion2='"+n6+"' ,Ciudad='"+n7+"',Telefono='"+n8+"'where Codigo='"+n9+"' ").executeUpdate();
            ActualizaOficinasModificados(m,buscar);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Se produjo un error inesperado");
        }
        return Lista;
    }
    public static void ActualizaOficinasModificados(javax.swing.JTable m,String buscar){
        try{
            if(buscar.isEmpty()){
                r = conexion.createStatement().executeQuery("select *from oficinas");
            }else{
                r = conexion.createStatement().executeQuery("select *from oficinas where Codigo='"+buscar+"' or Ciudad='"+buscar+"' or Telefono='"+buscar+"' or Direccion1='"+buscar+"' or Pais='"+buscar+"' or CodigoPostal='"+buscar+"' or Territorio='"+buscar+"'");
            }
            DefaultTableModel datos = (DefaultTableModel) m.getModel();
            datos.setNumRows(0);
            while(r.next()){
                datos.addRow(new Object[]{
                    r.getString("Codigo"),
                    r.getString("Ciudad"),
                    r.getString("Telefono"),
                    r.getString("Direccion1"),
                    r.getString("Direccion2"),
                    r.getString("Estado"),
                    r.getString("Pais"),
                    r.getString("CodigoPostal"),
                    r.getString("Territorio")
                });
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Se produjo un error inesperado");
        }
    }
    public static ArrayList<Pedidos> ModificarPedidos(String buscar,javax.swing.JTable m,String n1,String n2,String n3,String n4){
        ArrayList<Pedidos> Lista = new ArrayList<>();
        try{
            conexion.prepareStatement("update pedidos set NroCliente='"+n1+"',Comentarios='"+n2+"',Estado='"+n3+"'where NroOrden='"+n4+"' ").executeUpdate();
            ActualizaPedidosModificados(m,buscar);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Se produjo un error inesperado");
        }
        return Lista;
    }
    public static void ActualizaPedidosModificados(javax.swing.JTable m,String buscar){
        try{
            if(buscar.isEmpty()){
                r = conexion.createStatement().executeQuery("select *from pedidos");
            }else{
                r = conexion.createStatement().executeQuery("select *from pedidos where NroOrden='"+buscar+"' or Estado='"+buscar+"' or NroCliente='"+buscar+"' ");
            }
            DefaultTableModel datos = (DefaultTableModel) m.getModel();
            datos.setNumRows(0);
            while(r.next()){
                datos.addRow(new Object[]{
                    r.getInt("NroOrden"),
                    r.getDate("FechaOrden"),
                    r.getDate("FechaRequerida"),
                    r.getDate("FechaEnvio"),
                    r.getString("Estado"),
                    r.getString("Comentarios"),
                    r.getInt("NroCliente")
                });
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Se produjo un error inesperado");
        }
    }
    public static ArrayList<Pedidos> ModificarEstadoDelPedido(String n1,int n2){
        ArrayList<Pedidos> Lista = new ArrayList<>();
        try{
            conexion.prepareStatement("update pedidos set Estado='"+n1+"'where NroOrden='"+n2+"' ").executeUpdate();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Se produjo un error inesperado");
        }
        return Lista;
    }
    public static ArrayList<Pagos> ModificarPagos(String buscar,javax.swing.JTable m,String n1,String n2,String n3){
        ArrayList<Pagos> Lista = new ArrayList<>();
        try{
            conexion.prepareStatement("update pagos set Importe='"+n1+"' where NroCliente='"+n3+"' and VerificarNro='"+n2+"' ").executeUpdate();
            ActualizaPagosModificados(m,buscar);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Se produjo un error inesperado");
        }
        return Lista;
    }
    public static void ActualizaPagosModificados(javax.swing.JTable m,String buscar){
        try{
            if(buscar.isEmpty()){
                r = conexion.createStatement().executeQuery("select *from pagos");
            }else{
                r = conexion.createStatement().executeQuery("select *from pagos where VerificarNro='"+buscar+"' or NroCliente='"+buscar+"' or Importe='"+buscar+"' ");
            }
            DefaultTableModel datos = (DefaultTableModel) m.getModel();
            datos.setNumRows(0);
            while(r.next()){
                datos.addRow(new Object[]{
                    r.getInt("NroCliente"),
                    r.getString("VerificarNro"),
                    r.getDate("FechaPago"),
                    r.getDouble("Importe")
                });
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Se produjo un error inesperado");
        }
    }
    public static ArrayList<DetalleDelPedido> ModificarDetallesPedidos(String buscar,javax.swing.JTable m,String n1,String n2,String n3,String n5){
        ArrayList<DetalleDelPedido> Lista = new ArrayList<>();
        try{
            conexion.prepareStatement("update detallespedido set CodigoProducto='"+n1+"',CantidadPedida='"+n2+"',PrecioPorUnidad='"+n3+"' where NroOrden='"+n5+"' ").executeUpdate();
            ActualizaDetallesPedModificados(m,buscar);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Se produjo un error inesperado");
        }
        return Lista;
    }
    public static void ActualizaDetallesPedModificados(javax.swing.JTable m,String buscar){
        try{
            if(buscar.isEmpty()){
                r = conexion.createStatement().executeQuery("select *from detallespedido");
            }else{
                r = conexion.createStatement().executeQuery("select *from detallespedido where NroOrden='"+buscar+"' or CodigoProducto='"+buscar+"' or CantidadPedida='"+buscar+"' or PrecioPorUnidad='"+buscar+"' ");
            }
            DefaultTableModel datos = (DefaultTableModel) m.getModel();
            datos.setNumRows(0);
            while(r.next()){
                datos.addRow(new Object[]{
                    r.getInt("NroOrden"),
                    r.getString("CodigoProducto"), 
                    r.getInt("CantidadPedida"),
                    r.getDouble("PrecioPorUnidad")
                });
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Se produjo un error inesperado");
        }
    }
    public static ArrayList<Object> ObtenerNroDeOrden(int nro){
        ArrayList<Object> vector = new  ArrayList<>();
        try{
            r = conexion.createStatement().executeQuery("select *from pedidos where NroCliente='"+nro+"' ");
            while(r.next()){
                vector.add(r.getInt("NroOrden"));
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Se produjo un error inesperado");
        }
        return vector;
    }
    public static ArrayList<DetalleDelPedido> ObtenerTablaParaPago(int nro){
        ArrayList<DetalleDelPedido> Lista = new ArrayList<>();
        try{
            r = conexion.createStatement().executeQuery("select *from detallespedido where NroOrden='"+nro+"'");
            while(r.next()){
                Lista.add(new DetalleDelPedido(
                    r.getInt("NroOrden"),
                    r.getString("CodigoProducto"),
                    r.getInt("CantidadPedida"),
                    r.getDouble("PrecioPorUnidad")
                ));
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Se produjo un error inesperado");
        }
        return Lista;
    }
    public static double TraerPrecioProd(String cod){
        try{
            r = conexion.createStatement().executeQuery("select *from producto where Codigo='"+cod+"'");
            while(r.next()){
                return r.getDouble("Precio");
            }
        }catch(java.sql.SQLException e){
            System.out.println(e.getMessage());
        }
        return 0;
    }
}