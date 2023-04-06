package Controlador;

public class Controlador_Productos {
    private static Ventanas.CargarProductos vista = new Ventanas.CargarProductos();
    
    public static void BotonGuardar(){
        Modelo.Producto producto = new Modelo.Producto();
        producto.setCodProduct(vista.getCod().getText());
        producto.setNombre(vista.getNom().getText());
        producto.setEscalaProduct(vista.getEscala().getText());
        producto.setVendedor(vista.getVendedor().getText());
        producto.setDescripcion(vista.getDesc().getText());
        producto.setCantStock(vista.getStock().getText());
        producto.setPrecio(Double.parseDouble(vista.getPrecio().getText()));
        producto.setMSRP(Double.parseDouble(vista.getMSRP().getText()));
        producto.setLineaProducto(vista.getItem());
        DB.Sql.AgregarProducto(producto);
        Limpiar();
    }
    public static void Mostrar(){
        vista.setTitle("REGISTRO DE PRODUCTOS");
        vista.setVisible(true);
        CargarListas();
        Instanciar();
    }
    public static void Limpiar(){
        vista.getVendedor().setText(""); 
        vista.getEscala().setText("");
        vista.getMSRP().setText("");
        vista.getStock().setText(""); 
        vista.getCod().setText(""); 
        vista.getDesc().setText(""); 
        vista.getPrecio().setText(""); 
        vista.getNom().setText("");
        CargarListas();
        Instanciar();
        Bloquear();
        DesbloquearText();
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
    public static boolean Verificar(){
        return !(vista.getLista().getSelectedItem().equals("Seleccionar linea producto")||vista.getVendedor().getText().equals("Ingresa nombre del vendedor...")||vista.getNom().getText().equals("Ingresa nombre del producto...")||vista.getPrecio().getText().equals("Ingresa precio del producto...")||vista.getDesc().getText().equals("Ingresa descripcion del producto...")||vista.getCod().getText().equals("Ingresa codigo del producto...")||vista.getStock().getText().equals("Ingresa cantidad de stock...")||vista.getMSRP().getText().equals("Ingresa msrp del produtco...")||vista.getEscala().getText().equals("Ingresa escala del producto..."));        
    }
    private static void CargarListas(){
        vista.getLista().removeAllItems();
        vista.getLista().addItem("Seleccionar linea producto");
        for(Modelo.LineaDeProductos i : DB.Sql.ObtenerNroDeLineasDeProductos()) {
            vista.getLista().addItem(i.getProductLinea());
        }
        ((javax.swing.JLabel)vista.getLista().getRenderer()).setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    }
    private static void Instanciar(){
        vista.getVendedor().setText("Ingresa nombre del vendedor..."); 
        vista.getEscala().setText("Ingresa escala del producto...");
        vista.getMSRP().setText("Ingresa msrp del produtco...");
        vista.getStock().setText("Ingresa cantidad de stock..."); 
        vista.getCod().setText("Ingresa codigo del producto..."); 
        vista.getDesc().setText("Ingresa descripcion del producto..."); 
        vista.getPrecio().setText("Ingresa precio del producto..."); 
        vista.getNom().setText("Ingresa nombre del producto...");
    }
    private static void BloquearText(){
        vista.getVendedor().setEnabled(false);
        vista.getEscala().setEnabled(false);
        vista.getMSRP().setEnabled(false);
        vista.getStock().setEnabled(false);
        vista.getCod().setEnabled(false);
        vista.getDesc().setEnabled(false);
        vista.getPrecio().setEnabled(false);
        vista.getNom().setEnabled(false);
    }
    private static void DesbloquearText(){
        vista.getVendedor().setEnabled(true);
        vista.getEscala().setEnabled(true);
        vista.getMSRP().setEnabled(true);
        vista.getStock().setEnabled(true);
        vista.getCod().setEnabled(true);
        vista.getDesc().setEnabled(true);
        vista.getPrecio().setEnabled(true);
        vista.getNom().setEnabled(true);
    }
}