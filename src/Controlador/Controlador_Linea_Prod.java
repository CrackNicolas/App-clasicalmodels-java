package Controlador;

public class Controlador_Linea_Prod {
    private static Ventanas.CargarProductosEnLinea vista = new Ventanas.CargarProductosEnLinea();
    
    public static void Guardar(){
        Modelo.LineaDeProductos linea_productos = new Modelo.LineaDeProductos();
        linea_productos.setProductLinea(vista.getLinea().getText());
        linea_productos.setDescripcion(vista.getDesc().getText());
        linea_productos.setDescripcionHtml(vista.getHtml().getText());
        DB.Sql.AgregarProductoLinea(linea_productos);
        Limpiar();
    }
    public static void Mostrar(){
        vista.setTitle("REGISTRO DE LINEA DE PRODUCTOS");
        vista.setVisible(true);
        Bloquear();
        Instanciar();
    }
    public static void Limpiar(){
        vista.getLinea().setText("");
        vista.getDesc().setText("");
        vista.getHtml().setText("");
        Bloquear();
        Instanciar();
        DesbloquearText();
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
    private static void Instanciar(){
        vista.getLinea().setText("Ingresar linea producto...");
        vista.getHtml().setText("Ingresar descripcion html producto...");
    }
    public static boolean Verificar(){
        return !vista.getLinea().getText().equals("Ingresar linea producto...");
    }
    public static void Vaciar(){
        if(vista.getHtml().getText().equals("Ingresar descripcion html producto...")){
            vista.getHtml().setText("");
        }
    }
    private static void BloquearText(){
        vista.getLinea().setEnabled(false);
        vista.getDesc().setEnabled(false);
        vista.getHtml().setEnabled(false);
    }
    private static void DesbloquearText(){
        vista.getLinea().setEnabled(true);
        vista.getDesc().setEnabled(true);
        vista.getHtml().setEnabled(true);
    }
}